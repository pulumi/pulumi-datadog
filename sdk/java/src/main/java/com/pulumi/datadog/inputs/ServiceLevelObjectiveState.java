// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.ServiceLevelObjectiveQueryArgs;
import com.pulumi.datadog.inputs.ServiceLevelObjectiveThresholdArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLevelObjectiveState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLevelObjectiveState Empty = new ServiceLevelObjectiveState();

    /**
     * A description of this service level objective.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this service level objective.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. dashboards).
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<Boolean> forceDelete;

    /**
     * @return A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. dashboards).
     * 
     */
    public Optional<Output<Boolean>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    /**
     * A static set of groups to filter monitor-based SLOs
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return A static set of groups to filter monitor-based SLOs
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * A static set of monitor IDs to use as part of the SLO
     * 
     */
    @Import(name="monitorIds")
    private @Nullable Output<List<Integer>> monitorIds;

    /**
     * @return A static set of monitor IDs to use as part of the SLO
     * 
     */
    public Optional<Output<List<Integer>>> monitorIds() {
        return Optional.ofNullable(this.monitorIds);
    }

    /**
     * Name of Datadog service level objective
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of Datadog service level objective
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The metric query of good / total events
     * 
     */
    @Import(name="query")
    private @Nullable Output<ServiceLevelObjectiveQueryArgs> query;

    /**
     * @return The metric query of good / total events
     * 
     */
    public Optional<Output<ServiceLevelObjectiveQueryArgs>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * A list of tags to associate with your service level objective. This can help you categorize and filter service level
     * objectives in the service level objectives page of the UI. Note: it&#39;s not currently possible to filter by these tags
     * when querying via the API
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags to associate with your service level objective. This can help you categorize and filter service level
     * objectives in the service level objectives page of the UI. Note: it&#39;s not currently possible to filter by these tags
     * when querying via the API
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of thresholds and targets that define the service level objectives from the provided SLIs.
     * 
     */
    @Import(name="thresholds")
    private @Nullable Output<List<ServiceLevelObjectiveThresholdArgs>> thresholds;

    /**
     * @return A list of thresholds and targets that define the service level objectives from the provided SLIs.
     * 
     */
    public Optional<Output<List<ServiceLevelObjectiveThresholdArgs>>> thresholds() {
        return Optional.ofNullable(this.thresholds);
    }

    /**
     * The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be
     * found in the Datadog API [documentation
     * page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be
     * found in the Datadog API [documentation
     * page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Whether or not to validate the SLO.
     * 
     */
    @Import(name="validate")
    private @Nullable Output<Boolean> validate;

    /**
     * @return Whether or not to validate the SLO.
     * 
     */
    public Optional<Output<Boolean>> validate() {
        return Optional.ofNullable(this.validate);
    }

    private ServiceLevelObjectiveState() {}

    private ServiceLevelObjectiveState(ServiceLevelObjectiveState $) {
        this.description = $.description;
        this.forceDelete = $.forceDelete;
        this.groups = $.groups;
        this.monitorIds = $.monitorIds;
        this.name = $.name;
        this.query = $.query;
        this.tags = $.tags;
        this.thresholds = $.thresholds;
        this.type = $.type;
        this.validate = $.validate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLevelObjectiveState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLevelObjectiveState $;

        public Builder() {
            $ = new ServiceLevelObjectiveState();
        }

        public Builder(ServiceLevelObjectiveState defaults) {
            $ = new ServiceLevelObjectiveState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of this service level objective.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this service level objective.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param forceDelete A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. dashboards).
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        /**
         * @param forceDelete A boolean indicating whether this monitor can be deleted even if it’s referenced by other resources (e.g. dashboards).
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(Boolean forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        /**
         * @param groups A static set of groups to filter monitor-based SLOs
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups A static set of groups to filter monitor-based SLOs
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups A static set of groups to filter monitor-based SLOs
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param monitorIds A static set of monitor IDs to use as part of the SLO
         * 
         * @return builder
         * 
         */
        public Builder monitorIds(@Nullable Output<List<Integer>> monitorIds) {
            $.monitorIds = monitorIds;
            return this;
        }

        /**
         * @param monitorIds A static set of monitor IDs to use as part of the SLO
         * 
         * @return builder
         * 
         */
        public Builder monitorIds(List<Integer> monitorIds) {
            return monitorIds(Output.of(monitorIds));
        }

        /**
         * @param monitorIds A static set of monitor IDs to use as part of the SLO
         * 
         * @return builder
         * 
         */
        public Builder monitorIds(Integer... monitorIds) {
            return monitorIds(List.of(monitorIds));
        }

        /**
         * @param name Name of Datadog service level objective
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Datadog service level objective
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param query The metric query of good / total events
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<ServiceLevelObjectiveQueryArgs> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The metric query of good / total events
         * 
         * @return builder
         * 
         */
        public Builder query(ServiceLevelObjectiveQueryArgs query) {
            return query(Output.of(query));
        }

        /**
         * @param tags A list of tags to associate with your service level objective. This can help you categorize and filter service level
         * objectives in the service level objectives page of the UI. Note: it&#39;s not currently possible to filter by these tags
         * when querying via the API
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to associate with your service level objective. This can help you categorize and filter service level
         * objectives in the service level objectives page of the UI. Note: it&#39;s not currently possible to filter by these tags
         * when querying via the API
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to associate with your service level objective. This can help you categorize and filter service level
         * objectives in the service level objectives page of the UI. Note: it&#39;s not currently possible to filter by these tags
         * when querying via the API
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param thresholds A list of thresholds and targets that define the service level objectives from the provided SLIs.
         * 
         * @return builder
         * 
         */
        public Builder thresholds(@Nullable Output<List<ServiceLevelObjectiveThresholdArgs>> thresholds) {
            $.thresholds = thresholds;
            return this;
        }

        /**
         * @param thresholds A list of thresholds and targets that define the service level objectives from the provided SLIs.
         * 
         * @return builder
         * 
         */
        public Builder thresholds(List<ServiceLevelObjectiveThresholdArgs> thresholds) {
            return thresholds(Output.of(thresholds));
        }

        /**
         * @param thresholds A list of thresholds and targets that define the service level objectives from the provided SLIs.
         * 
         * @return builder
         * 
         */
        public Builder thresholds(ServiceLevelObjectiveThresholdArgs... thresholds) {
            return thresholds(List.of(thresholds));
        }

        /**
         * @param type The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be
         * found in the Datadog API [documentation
         * page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be
         * found in the Datadog API [documentation
         * page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param validate Whether or not to validate the SLO.
         * 
         * @return builder
         * 
         */
        public Builder validate(@Nullable Output<Boolean> validate) {
            $.validate = validate;
            return this;
        }

        /**
         * @param validate Whether or not to validate the SLO.
         * 
         * @return builder
         * 
         */
        public Builder validate(Boolean validate) {
            return validate(Output.of(validate));
        }

        public ServiceLevelObjectiveState build() {
            return $;
        }
    }

}