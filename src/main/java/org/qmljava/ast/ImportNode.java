package org.qmljava.ast;
/*
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


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

class ImportNode {
    public final String identifier;
    public final String alias;
    public final double version;

    public ImportNode(@NotNull String importName, double version, @Nullable String alias) {
        this.identifier = importName;
        this.version = version;
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "(" +
                " identifier: " + identifier +
                ", version: " + version +
                ", alias: " + alias +
                ")";
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this &&
               obj instanceof ImportNode &&
               Objects.equals(this.identifier, ((ImportNode) obj).identifier) &&
               Objects.equals(this.version , ((ImportNode) obj).version) &&
               Objects.equals(this.alias, ((ImportNode) obj).alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, version, alias);
    }
}
