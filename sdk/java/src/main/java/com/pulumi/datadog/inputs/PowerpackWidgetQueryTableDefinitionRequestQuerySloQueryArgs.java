// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs Empty = new PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs();

    /**
     * Additional filters applied to the SLO query.
     * 
     */
    @Import(name="additionalQueryFilters")
    private @Nullable Output<String> additionalQueryFilters;

    /**
     * @return Additional filters applied to the SLO query.
     * 
     */
    public Optional<Output<String>> additionalQueryFilters() {
        return Optional.ofNullable(this.additionalQueryFilters);
    }

    /**
     * The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    @Import(name="crossOrgUuids")
    private @Nullable Output<String> crossOrgUuids;

    /**
     * @return The source organization UUID for cross organization queries. Feature in Private Beta.
     * 
     */
    public Optional<Output<String>> crossOrgUuids() {
        return Optional.ofNullable(this.crossOrgUuids);
    }

    /**
     * The data source for SLO queries. Valid values are `slo`.
     * 
     */
    @Import(name="dataSource", required=true)
    private Output<String> dataSource;

    /**
     * @return The data source for SLO queries. Valid values are `slo`.
     * 
     */
    public Output<String> dataSource() {
        return this.dataSource;
    }

    /**
     * Group mode to query measures. Valid values are `overall`, `components`. Defaults to `&#34;overall&#34;`.
     * 
     */
    @Import(name="groupMode")
    private @Nullable Output<String> groupMode;

    /**
     * @return Group mode to query measures. Valid values are `overall`, `components`. Defaults to `&#34;overall&#34;`.
     * 
     */
    public Optional<Output<String>> groupMode() {
        return Optional.ofNullable(this.groupMode);
    }

    /**
     * SLO measures queries. Valid values are `good_events`, `bad_events`, `good_minutes`, `bad_minutes`, `slo_status`, `error_budget_remaining`, `burn_rate`, `error_budget_burndown`.
     * 
     */
    @Import(name="measure", required=true)
    private Output<String> measure;

    /**
     * @return SLO measures queries. Valid values are `good_events`, `bad_events`, `good_minutes`, `bad_minutes`, `slo_status`, `error_budget_remaining`, `burn_rate`, `error_budget_burndown`.
     * 
     */
    public Output<String> measure() {
        return this.measure;
    }

    /**
     * The name of query for use in formulas.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of query for use in formulas.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of an SLO to query.
     * 
     */
    @Import(name="sloId", required=true)
    private Output<String> sloId;

    /**
     * @return ID of an SLO to query.
     * 
     */
    public Output<String> sloId() {
        return this.sloId;
    }

    /**
     * type of the SLO to query. Valid values are `metric`, `monitor`, `time_slice`. Defaults to `&#34;metric&#34;`.
     * 
     */
    @Import(name="sloQueryType")
    private @Nullable Output<String> sloQueryType;

    /**
     * @return type of the SLO to query. Valid values are `metric`, `monitor`, `time_slice`. Defaults to `&#34;metric&#34;`.
     * 
     */
    public Optional<Output<String>> sloQueryType() {
        return Optional.ofNullable(this.sloQueryType);
    }

    private PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs() {}

    private PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs(PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs $) {
        this.additionalQueryFilters = $.additionalQueryFilters;
        this.crossOrgUuids = $.crossOrgUuids;
        this.dataSource = $.dataSource;
        this.groupMode = $.groupMode;
        this.measure = $.measure;
        this.name = $.name;
        this.sloId = $.sloId;
        this.sloQueryType = $.sloQueryType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs $;

        public Builder() {
            $ = new PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs();
        }

        public Builder(PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs defaults) {
            $ = new PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalQueryFilters Additional filters applied to the SLO query.
         * 
         * @return builder
         * 
         */
        public Builder additionalQueryFilters(@Nullable Output<String> additionalQueryFilters) {
            $.additionalQueryFilters = additionalQueryFilters;
            return this;
        }

        /**
         * @param additionalQueryFilters Additional filters applied to the SLO query.
         * 
         * @return builder
         * 
         */
        public Builder additionalQueryFilters(String additionalQueryFilters) {
            return additionalQueryFilters(Output.of(additionalQueryFilters));
        }

        /**
         * @param crossOrgUuids The source organization UUID for cross organization queries. Feature in Private Beta.
         * 
         * @return builder
         * 
         */
        public Builder crossOrgUuids(@Nullable Output<String> crossOrgUuids) {
            $.crossOrgUuids = crossOrgUuids;
            return this;
        }

        /**
         * @param crossOrgUuids The source organization UUID for cross organization queries. Feature in Private Beta.
         * 
         * @return builder
         * 
         */
        public Builder crossOrgUuids(String crossOrgUuids) {
            return crossOrgUuids(Output.of(crossOrgUuids));
        }

        /**
         * @param dataSource The data source for SLO queries. Valid values are `slo`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(Output<String> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource The data source for SLO queries. Valid values are `slo`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(String dataSource) {
            return dataSource(Output.of(dataSource));
        }

        /**
         * @param groupMode Group mode to query measures. Valid values are `overall`, `components`. Defaults to `&#34;overall&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder groupMode(@Nullable Output<String> groupMode) {
            $.groupMode = groupMode;
            return this;
        }

        /**
         * @param groupMode Group mode to query measures. Valid values are `overall`, `components`. Defaults to `&#34;overall&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder groupMode(String groupMode) {
            return groupMode(Output.of(groupMode));
        }

        /**
         * @param measure SLO measures queries. Valid values are `good_events`, `bad_events`, `good_minutes`, `bad_minutes`, `slo_status`, `error_budget_remaining`, `burn_rate`, `error_budget_burndown`.
         * 
         * @return builder
         * 
         */
        public Builder measure(Output<String> measure) {
            $.measure = measure;
            return this;
        }

        /**
         * @param measure SLO measures queries. Valid values are `good_events`, `bad_events`, `good_minutes`, `bad_minutes`, `slo_status`, `error_budget_remaining`, `burn_rate`, `error_budget_burndown`.
         * 
         * @return builder
         * 
         */
        public Builder measure(String measure) {
            return measure(Output.of(measure));
        }

        /**
         * @param name The name of query for use in formulas.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of query for use in formulas.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sloId ID of an SLO to query.
         * 
         * @return builder
         * 
         */
        public Builder sloId(Output<String> sloId) {
            $.sloId = sloId;
            return this;
        }

        /**
         * @param sloId ID of an SLO to query.
         * 
         * @return builder
         * 
         */
        public Builder sloId(String sloId) {
            return sloId(Output.of(sloId));
        }

        /**
         * @param sloQueryType type of the SLO to query. Valid values are `metric`, `monitor`, `time_slice`. Defaults to `&#34;metric&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder sloQueryType(@Nullable Output<String> sloQueryType) {
            $.sloQueryType = sloQueryType;
            return this;
        }

        /**
         * @param sloQueryType type of the SLO to query. Valid values are `metric`, `monitor`, `time_slice`. Defaults to `&#34;metric&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder sloQueryType(String sloQueryType) {
            return sloQueryType(Output.of(sloQueryType));
        }

        public PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs build() {
            if ($.dataSource == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs", "dataSource");
            }
            if ($.measure == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs", "measure");
            }
            if ($.sloId == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetQueryTableDefinitionRequestQuerySloQueryArgs", "sloId");
            }
            return $;
        }
    }

}
