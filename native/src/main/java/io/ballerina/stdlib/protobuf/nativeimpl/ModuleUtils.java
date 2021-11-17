/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.stdlib.protobuf.nativeimpl;

import io.ballerina.runtime.api.Environment;
import io.ballerina.runtime.api.Module;

/**
 * APIs to set and get module-level details.
 *
 * @since 1.0.1
 */
public class ModuleUtils {

    /**
     * Package ID of the protobuf.types.'any sub-module.
     */
    private static Module protoTypesAnyModule = null;

    private ModuleUtils() {

    }

    public static void setProtoTypesAnyModule(Environment env) {

        protoTypesAnyModule = env.getCurrentModule();
    }

    public static Module getProtoTypesAnyModule() {

        return protoTypesAnyModule;
    }
}