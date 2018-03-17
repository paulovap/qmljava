package org.qmljava.core;/*
BSD License

Copyright (c) 2018, ${user}
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

import java.util.concurrent.ConcurrentHashMap;

public class QMLObject {

    private ConcurrentHashMap<String, QMLProperty> dynamicProp = new ConcurrentHashMap<>();

    public <T> void createDynamicProperty(String propertyName) {
        assert (propertyName != null);

        if (dynamicProp.containsKey(propertyName)) {
            throw new RuntimeException("Property " + propertyName + " already created");
        }

        dynamicProp.put(propertyName, new QMLProperty<T>());
    }

    public void destroyDynamicProperty(String propertyName) {
        QMLProperty prop = dynamicProp.remove(propertyName);
        prop.signal.disconnectAll();
    }

    public <T> T getProperty(String propertyName) {

        return (T) dynamicProp.get(propertyName).get();
    }

    public <T> void setProperty(String propertyName, T value) {
        QMLProperty prop = dynamicProp.get(propertyName);
        T oldVal = (T) prop.get();
        if (!value.equals(oldVal)) {
            // @TODO: emit
            prop.set(value);
            prop.signal.emit();
        }
    }

    public void connect(String propertyName, Runnable slot) {
        QMLProperty p  = dynamicProp.get(propertyName);
        p.signal.connect(slot);
    }

    public void disconnect(String propertyName, Runnable slot) {
        QMLProperty p  = dynamicProp.get(propertyName);
        p.signal.disconnect(slot);
    }
}
