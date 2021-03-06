/*
 * Copyright 2016-present Open Networking Laboratory
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
package org.onosproject.netl3vpn.entity;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Immutable representation of a web l2 access.
 */
public final class WebL2Access {
    private final L2AccessType accessType;
    private final WebPort port;

    /**
     * WebL2Access constructor.
     *
     * @param accessType access type
     * @param port port
     */
    public WebL2Access(L2AccessType accessType, WebPort port) {
        checkNotNull(accessType, "accessType cannot be null");
        checkNotNull(port, "port cannot be null");
        this.accessType = accessType;
        this.port = port;
    }

    /**
     * The enumeration of l2 access type.
     */
    public enum L2AccessType {
        Untag(0), Port(1), Dot1q(2), Qing(3), Transport(4), Vxlan(5);

        int value;

        private L2AccessType(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * Returns the WebL2Access address type.
     *
     * @return l2 access type
     */
    public L2AccessType getAccessType() {
        return accessType;
    }

    /**
     * Returns the WebL2Access port.
     *
     * @return port
     */
    public WebPort getPort() {
        return port;
    }
}
