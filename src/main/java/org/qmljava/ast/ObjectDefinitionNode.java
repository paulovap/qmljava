package org.qmljava.ast;/*
BSD License

Copyright (c) 2018, Paulo Pinheiro
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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectDefinitionNode {

    final public String type;
    //@TODO: add id
    final public String id = "";
    final public List<ObjectDefinitionNode> children = new ArrayList<>();
    final public List<PropertyNode> declaredProperties = new ArrayList<>();

    ObjectDefinitionNode(@NotNull String type, @Nullable List<ObjectDefinitionNode> children, @Nullable List<PropertyNode> declaredProperties) {
        this.type = type;
        if (children != null) {
           this.children.addAll(children);
        }

        if (declaredProperties != null) {
            this.declaredProperties.addAll(declaredProperties);
        }
    }

    @Override
    public String toString() {
        return "ObjectDefinition(" +
                "    type: " + type +
                "\n" +
                "    children: " + children.toString() +
                "\n" +
                "    properties: " + declaredProperties.toString() +
                ")";
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this ||
                obj instanceof ObjectDefinitionNode &&
                        Objects.equals(this.type, ((ObjectDefinitionNode) obj).type) &&
                        Objects.equals(this.children, ((ObjectDefinitionNode) obj).children) &&
                        Objects.equals(this.declaredProperties, ((ObjectDefinitionNode) obj).declaredProperties);

    }
}
