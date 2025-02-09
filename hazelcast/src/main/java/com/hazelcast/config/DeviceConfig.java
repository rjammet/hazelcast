/*
 * Copyright (c) 2008-2021, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.config;

/**
 * Device configuration for the Tiered-Store
 *
 * @since 5.1
 */
public interface DeviceConfig extends NamedConfig {
    /**
     * Returns {@code true} if the device configuration is for a local device,
     * otherwise, returns {@code false} if this configuration is for a remote device.
     */
    boolean isLocal();
}
