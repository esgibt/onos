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

package org.onosproject.yang.gen.v1.ne.bgpcomm.type.rev20141225;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Represents the implementation of neBgpcommTypeManager.
 */

@Component (immediate = true)
@Service
public class NeBgpcommTypeManager implements NeBgpcommTypeService {

    private final Logger log = getLogger(getClass());

    @Activate
    public void activate() {
        //TODO: YANG utils generated code
        log.info("Started");
    }

    @Deactivate
    public void deactivate() {
        //TODO: YANG utils generated code
        log.info("Stopped");
    }
}