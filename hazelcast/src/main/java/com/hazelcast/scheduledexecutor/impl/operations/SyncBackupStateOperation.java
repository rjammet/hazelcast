/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.scheduledexecutor.impl.operations;

import com.hazelcast.scheduledexecutor.impl.ScheduledExecutorDataSerializerHook;
import com.hazelcast.scheduledexecutor.impl.ScheduledTaskResult;
import com.hazelcast.scheduledexecutor.impl.ScheduledTaskStatisticsImpl;

import java.util.Map;

public class SyncBackupStateOperation
        extends SyncStateOperation {

    public SyncBackupStateOperation() {
    }

    public SyncBackupStateOperation(String schedulerName, String taskName, Map state, ScheduledTaskStatisticsImpl stats,
                                    ScheduledTaskResult result) {
        super(schedulerName, taskName, state, stats, result);
    }

    @Override
    public void run()
            throws Exception {
        getContainer().syncState(taskName, state, stats, result);
    }

    @Override
    public int getId() {
        return ScheduledExecutorDataSerializerHook.SYNC_BACKUP_STATE_OP;
    }

}
