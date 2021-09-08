/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.lang.yang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import com.intellij.lang.yang.icons.YangIcons;

public class YangFileType extends LanguageFileType {
    public static final YangFileType INSTANCE = new YangFileType();

    private YangFileType() {
        super(YangLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Yang file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "YANG is a data modeling language used to model configuration and\n" +
                "state data manipulated by the Network Configuration Protocol\n" +
                "(NETCONF), NETCONF remote procedure calls, and NETCONF notifications.\n";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "yang";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return YangIcons.FILE;
    }
}