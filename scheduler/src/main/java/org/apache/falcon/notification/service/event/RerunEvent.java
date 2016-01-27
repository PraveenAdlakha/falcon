/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.falcon.notification.service.event;

import org.apache.falcon.state.ID;
import org.apache.falcon.state.InstanceID;
import org.joda.time.DateTime;

/**
 * Rerun Event used while rerunning an instance.
 */
public class RerunEvent extends Event {
    private DateTime instanceTime;
    private final InstanceID callbackID;

    public DateTime getInstanceTime() {
        return instanceTime;
    }

    public RerunEvent(InstanceID callbackID, DateTime instanceTime) {
        this.callbackID = callbackID;
        this.instanceTime = instanceTime;
        this.type = EventType.RE_RUN;
    }

    @Override
    public ID getTarget() {
        return callbackID;
    }
}
