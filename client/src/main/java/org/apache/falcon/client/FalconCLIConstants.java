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

package org.apache.falcon.client;

/**
* FalconCLI Constants.
*/
 public interface FalconCLIConstants {
    
      String ENV_FALCON_DEBUG = "FALCON_DEBUG";
      String DEFINITION_OPT = "definition";
      String LOOKUP_OPT = "lookup";
      String SLA_MISS_ALERT_OPT = "slaAlert";
      String TOUCH_OPT = "touch";
      String ADMIN_CMD = "admin";
      String HELP_CMD = "help";
      String METADATA_CMD = "metadata";
      String ENTITY_CMD = "entity";
      String INSTANCE_CMD = "instance";
      String EXTENSION_CMD = "extension";
      String SAFE_MODE_OPT = "setsafemode";
      String VERSION_OPT = "version";
      String SUBMIT_OPT = "submit";
      String SUBMIT_ONLY_OPT = "submitOnly";
      String UPDATE_OPT = "update";
      String UPDATE_CLUSTER_DEPENDENTS_OPT = "updateClusterDependents";
      String DELETE_OPT = "delete";
      String SCHEDULE_OPT = "schedule";
      String CURRENT_COLO = "current.colo";
      String CLIENT_PROPERTIES = "/client.properties";
      String RELATIONS_OPT = "relations";
      String PIPELINE_OPT = "pipeline";
      String NAME_OPT = "name";
      String VERSION_OPT_DESCRIPTION = "show Falcon server build version";
      String STACK_OPTION_DESCRIPTION = "show the thread stack dump";
      String FALCON_URL = "FALCON_URL";
      String STACK_OPTION = "stack";
      String SUBMIT_OPT_DESCRIPTION = "Submits an entity xml to Falcon";
      String UPDATE_OPT_DESCRIPTION = "Updates an existing entity";
      String DELETE_OPT_DESCRIPTION = "Deletes an entity in Falcon, and kills its instance from "
            + "workflow engine";
      String SUBMIT_AND_SCHEDULE_OPT = "submitAndSchedule";
      String SUBMIT_AND_SCHEDULE_OPT_DESCRIPTION = "Submits an entity to Falcon and "
            + "schedules it immediately";
      String VALIDATE_OPT = "validate";
      String VALIDATE_OPT_DESCRIPTION = "Validates an entity based on the entity type";
      String DEFINITION_OPT_DESCRIPTION = "Gets the Definition of entity";
      String SLA_MISS_ALERT_OPT_DESCRIPTION = "Get missing feed instances which missed SLA";


      String LOOKUP_OPT_DESCRIPTION = "Lookup a feed given its instance's path";
      String PATH_OPT = "path";
      String PATH_OPT_DESCRIPTION = "Path for a feed's instance";
      String TOUCH_OPT_DESCRIPTION = "Force update the entity in workflow engine"
            + "(even without any changes to entity)";
      String PROPS_OPT = "properties";
      String PROPS_OPT_DESCRIPTION = "User supplied comma separated key value properties";
      String FIELDS_OPT = "fields";
      String FIELDS_OPT_DESCRIPTION = "Entity fields to show for a request";
      String TAGS_OPT = "tags";
      String TAGS_OPT_DESCRIPTION = "Filter returned entities by the specified tags";
      String NUM_INSTANCES_OPT = "numInstances";
      String NUM_INSTANCES_OPT_DESCRIPTION = "Number of instances to return per entity "
            + "summary request";
      String NAMESEQ_OPT = "nameseq";
      String NAMESEQ_OPT_DESCRIPTION = "Subsequence of entity name";
      String TAGKEYS_OPT = "tagkeys";
      String TAGKEYS_OPT_DESCRIPTION = "Keywords in tags";
      String SHOWSCHEDULER_OPT = "showScheduler";
      String SHOWSCHEDULER_OPT_DESCRIPTION = "To return the scheduler "
            + "on which the entity is scheduled.";

      String DEBUG_OPTION = "debug";
      String URL_OPTION = "url";
      String TYPE_OPT = "type";
      String COLO_OPT = "colo";
      String CLUSTER_OPT = "cluster";
      String FEED_OPT = "feed";
      String PROCESS_OPT = "process";
      String ENTITY_NAME_OPT = "name";
      String FILE_PATH_OPT = "file";
      String SUSPEND_OPT = "suspend";
      String RESUME_OPT = "resume";
      String STATUS_OPT = "status";
      String SUMMARY_OPT = "summary";
      String DEPENDENCY_OPT = "dependency";
      String SKIPDRYRUN_OPT = "skipDryRun";
      String FILTER_BY_OPT = "filterBy";
      String ORDER_BY_OPT = "orderBy";
      String SORT_ORDER_OPT = "sortOrder";
      String OFFSET_OPT = "offset";
      String NUM_RESULTS_OPT = "numResults";
      String START_OPT = "start";
      String END_OPT = "end";
      String DO_AS_OPT = "doAs";
      String RUNNING_OPT_DESCRIPTION = "Gets running process instances for a given process";
      String LIST_OPT_DESCRIPTION = "Gets all instances for a given entity in the range start "
            + "time and optional end time";
      String STATUS_OPT_DESCRIPTION = "Gets status of process instances for a given process in"
            + " the range start time and optional end time";
      String SUMMARY_OPT_DESCRIPTION = "Gets summary of instances for a given process in the"
            + " range start time and optional end time";
      String KILL_OPT_DESCRIPTION = "Kills active process instances for a given process in the"
            + " range start time and optional end time";
      String SUSPEND_OPT_DESCRIPTION = "Suspends active process instances for a given process in"
            + " the range start time and optional end time";
      String RESUME_OPT_DESCRIPTION = "Resumes suspended process instances for a given"
            + " process in the range start time and optional end time";
      String RERUN_OPT_DESCRIPTION = "Reruns process instances for a given process in the"
            + " range start time and optional end time and overrides properties present in job.properties file";
      String LOG_OPT_DESCRIPTION = "Logs print the logs for process instances for a given"
            + " process in the range start time and optional end time";
      String PARARMS_OPT_DESCRIPTION = "Displays the workflow parameters for a given instance"
            + " of specified nominal time start time represents nominal time and end time is not considered";
      String LISTING_OPT_DESCRIPTION = "Displays feed listing and their status between a"
            + " start and end time range.";
      String DEPENDENCY_OPT_DESCRIPTION = "Displays dependent instances for a specified"
            + " instance.";
      String TRIAGE_OPT_DESCRIPTION = "Triage a feed or process instance and find the failures"
            + " in it's lineage.";
      String URL_OPTION_DESCRIPTION = "Falcon URL";
      String START_OPT_DESCRIPTION = "Start time is required for commands, status, kill, "
            + "suspend, resume and re-runand it is nominal time while displaying workflow params";
      String END_OPT_DESCRIPTION = "End time is optional for commands, status, kill, suspend, "
            + "resume and re-run; if not specified then current time is considered as end time";
      String RUNID_OPT_DESCRIPTION = "Instance runid  is optional and user can specify the "
            + "runid, defaults to 0";
      String CLUSTERS_OPT_DESCRIPTION = "clusters is optional for commands kill, suspend and "
            + "resume, should not be specified for other commands";
      String SOURCECLUSTER_OPT_DESCRIPTION = " source cluster is optional for commands kill, "
            + "suspend and resume, should not be specified for other commands (required for only feed)";
      String FILE_PATH_OPT_DESCRIPTION = "Path to job.properties file is required for rerun "
            + "command, it should contain name=value pair for properties to override for rerun";
      String TYPE_OPT_DESCRIPTION = "Entity type, can be feed or process xml";
      String ENTITY_NAME_OPT_DESCRIPTION = "Entity name, can be feed or process name";
      String COLO_OPT_DESCRIPTION = "Colo on which the cmd has to be executed";
      String LIFECYCLE_OPT_DESCRIPTION = "describes life cycle of entity , for feed it can be "
            + "replication/retention and for process it can be execution";
      String FILTER_BY_OPT_DESCRIPTION = "Filter returned instances by the specified fields";
      String ORDER_BY_OPT_DESCRIPTION = "Order returned instances by this field";
      String SORT_ORDER_OPT_DESCRIPTION = "asc or desc order for results";
      String OFFSET_OPT_DESCRIPTION = "Start returning instances from this offset";
      String FORCE_RERUN_FLAG_DESCRIPTION = "Flag to forcefully rerun entire workflow "
            + "of an instance";
      String DO_AS_OPT_DESCRIPTION = "doAs user";
      String INSTANCE_TIME_OPT_DESCRIPTION = "Time for an instance";
      String ALL_ATTEMPTS_DESCRIPTION = "To get all attempts of corresponding instances";
      String FORCE_RERUN_FLAG = "force";
      String INSTANCE_TIME_OPT = "instanceTime";
      String RUNNING_OPT = "running";
      String KILL_OPT = "kill";
      String RERUN_OPT = "rerun";
      String LOG_OPT = "logs";
      String CLUSTERS_OPT = "clusters";
      String SOURCECLUSTER_OPT = "sourceClusters";
      String LIFECYCLE_OPT = "lifecycle";
      String PARARMS_OPT = "params";
      String LISTING_OPT = "listing";
      String TRIAGE_OPT = "triage";
      String SKIPDRYRUN_OPT_DESCRIPTION = "skip dry run in workflow engine";
      String SCHEDULE_OPT_DESCRIPTION = "Schedules a submited entity in Falcon";
      String ALL_ATTEMPTS = "allAttempts";
      String RUNID_OPT = "runid";
      String INSTANCE_STATUS_OPT = "instanceStatus";
      String SEARCH_OPT = "search";


    // Discovery Commands
      String DISCOVERY_OPT = "discovery";
      String LIST_OPT = "list";

    // Lineage Commands
      String LINEAGE_OPT = "lineage";
      String VERTEX_CMD = "vertex";
      String VERTICES_CMD = "vertices";
      String VERTEX_EDGES_CMD = "edges";
      String EDGE_CMD = "edge";
      String ID_OPT = "id";
      String KEY_OPT = "key";
      String VALUE_OPT = "value";
      String DIRECTION_OPT = "direction";

      String DISCOVERY_OPT_DESCRIPTION = "Discover falcon metadata relations";
      String LINEAGE_OPT_DESCRIPTION = "Get falcon metadata lineage information";
      String PIPELINE_OPT_DESCRIPTION = "Get lineage graph for the entities in a pipeline";
      String RELATIONS_OPT_DESCRIPTION = "List all relations for a dimension";
      String NAME_OPT_DESCRIPTION = "Dimension name";
      String CLUSTER_OPT_DESCRIPTION = "Cluster name";
      String FEED_OPT_DESCRIPTION = "Feed Entity name";
      String PROCESS_OPT_DESCRIPTION = "Process Entity name";
      String NUM_RESULTS_OPT_DESCRIPTION = "Number of results to return per request";
      String VERTEX_CMD_DESCRIPTION = "show the vertices";
      String VERTICES_CMD_DESCRIPTION = "show the vertices";
      String VERTEX_EDGES_CMD_DESCRIPTION = "show the edges for a given vertex";
      String EDGE_CMD_DESCRIPTION = "show the edges";
      String ID_OPT_DESCRIPTION = "vertex or edge id";
      String KEY_OPT_DESCRIPTION = "key property";
      String VALUE_OPT_DESCRIPTION = "value property";
      String DIRECTION_OPT_DESCRIPTION = "edge direction property";
      String DEBUG_OPTION_DESCRIPTION = "Use debug mode to see debugging statements on stdout";
      String DO_AS_DESCRIPTION = "doAs user";
}
