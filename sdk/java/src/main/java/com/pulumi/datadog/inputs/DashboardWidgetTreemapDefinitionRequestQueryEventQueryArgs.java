// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryEventQueryComputeArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryEventQueryGroupByArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryEventQuerySearchArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs Empty = new DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs();

    /**
     * The compute options.
     * 
     */
    @Import(name="computes", required=true)
    private Output<List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryComputeArgs>> computes;

    /**
     * @return The compute options.
     * 
     */
    public Output<List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryComputeArgs>> computes() {
        return this.computes;
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
     * The data source for event platform-based queries. Valid values are `logs`, `spans`, `network`, `rum`, `security_signals`, `profiles`, `audit`, `events`, `ci_tests`, `ci_pipelines`, `incident_analytics`.
     * 
     */
    @Import(name="dataSource", required=true)
    private Output<String> dataSource;

    /**
     * @return The data source for event platform-based queries. Valid values are `logs`, `spans`, `network`, `rum`, `security_signals`, `profiles`, `audit`, `events`, `ci_tests`, `ci_pipelines`, `incident_analytics`.
     * 
     */
    public Output<String> dataSource() {
        return this.dataSource;
    }

    /**
     * Group by options.
     * 
     */
    @Import(name="groupBies")
    private @Nullable Output<List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryGroupByArgs>> groupBies;

    /**
     * @return Group by options.
     * 
     */
    public Optional<Output<List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    /**
     * An array of index names to query in the stream.
     * 
     */
    @Import(name="indexes")
    private @Nullable Output<List<String>> indexes;

    /**
     * @return An array of index names to query in the stream.
     * 
     */
    public Optional<Output<List<String>>> indexes() {
        return Optional.ofNullable(this.indexes);
    }

    /**
     * The name of query for use in formulas.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of query for use in formulas.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The search options.
     * 
     */
    @Import(name="search")
    private @Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryEventQuerySearchArgs> search;

    /**
     * @return The search options.
     * 
     */
    public Optional<Output<DashboardWidgetTreemapDefinitionRequestQueryEventQuerySearchArgs>> search() {
        return Optional.ofNullable(this.search);
    }

    /**
     * Storage location (private beta).
     * 
     */
    @Import(name="storage")
    private @Nullable Output<String> storage;

    /**
     * @return Storage location (private beta).
     * 
     */
    public Optional<Output<String>> storage() {
        return Optional.ofNullable(this.storage);
    }

    private DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs() {}

    private DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs(DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs $) {
        this.computes = $.computes;
        this.crossOrgUuids = $.crossOrgUuids;
        this.dataSource = $.dataSource;
        this.groupBies = $.groupBies;
        this.indexes = $.indexes;
        this.name = $.name;
        this.search = $.search;
        this.storage = $.storage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs();
        }

        public Builder(DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs defaults) {
            $ = new DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computes The compute options.
         * 
         * @return builder
         * 
         */
        public Builder computes(Output<List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryComputeArgs>> computes) {
            $.computes = computes;
            return this;
        }

        /**
         * @param computes The compute options.
         * 
         * @return builder
         * 
         */
        public Builder computes(List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryComputeArgs> computes) {
            return computes(Output.of(computes));
        }

        /**
         * @param computes The compute options.
         * 
         * @return builder
         * 
         */
        public Builder computes(DashboardWidgetTreemapDefinitionRequestQueryEventQueryComputeArgs... computes) {
            return computes(List.of(computes));
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
         * @param dataSource The data source for event platform-based queries. Valid values are `logs`, `spans`, `network`, `rum`, `security_signals`, `profiles`, `audit`, `events`, `ci_tests`, `ci_pipelines`, `incident_analytics`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(Output<String> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource The data source for event platform-based queries. Valid values are `logs`, `spans`, `network`, `rum`, `security_signals`, `profiles`, `audit`, `events`, `ci_tests`, `ci_pipelines`, `incident_analytics`.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(String dataSource) {
            return dataSource(Output.of(dataSource));
        }

        /**
         * @param groupBies Group by options.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(@Nullable Output<List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        /**
         * @param groupBies Group by options.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(List<DashboardWidgetTreemapDefinitionRequestQueryEventQueryGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        /**
         * @param groupBies Group by options.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(DashboardWidgetTreemapDefinitionRequestQueryEventQueryGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        /**
         * @param indexes An array of index names to query in the stream.
         * 
         * @return builder
         * 
         */
        public Builder indexes(@Nullable Output<List<String>> indexes) {
            $.indexes = indexes;
            return this;
        }

        /**
         * @param indexes An array of index names to query in the stream.
         * 
         * @return builder
         * 
         */
        public Builder indexes(List<String> indexes) {
            return indexes(Output.of(indexes));
        }

        /**
         * @param indexes An array of index names to query in the stream.
         * 
         * @return builder
         * 
         */
        public Builder indexes(String... indexes) {
            return indexes(List.of(indexes));
        }

        /**
         * @param name The name of query for use in formulas.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
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
         * @param search The search options.
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryEventQuerySearchArgs> search) {
            $.search = search;
            return this;
        }

        /**
         * @param search The search options.
         * 
         * @return builder
         * 
         */
        public Builder search(DashboardWidgetTreemapDefinitionRequestQueryEventQuerySearchArgs search) {
            return search(Output.of(search));
        }

        /**
         * @param storage Storage location (private beta).
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<String> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage Storage location (private beta).
         * 
         * @return builder
         * 
         */
        public Builder storage(String storage) {
            return storage(Output.of(storage));
        }

        public DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs build() {
            if ($.computes == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs", "computes");
            }
            if ($.dataSource == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs", "dataSource");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs", "name");
            }
            return $;
        }
    }

}
