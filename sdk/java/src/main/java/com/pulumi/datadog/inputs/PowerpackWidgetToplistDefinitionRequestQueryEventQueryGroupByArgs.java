// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs Empty = new PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs();

    /**
     * The event facet.
     * 
     */
    @Import(name="facet", required=true)
    private Output<String> facet;

    /**
     * @return The event facet.
     * 
     */
    public Output<String> facet() {
        return this.facet;
    }

    /**
     * The number of groups to return.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return The number of groups to return.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * The options for sorting group by results.
     * 
     */
    @Import(name="sort")
    private @Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs> sort;

    /**
     * @return The options for sorting group by results.
     * 
     */
    public Optional<Output<PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    private PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs() {}

    private PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs(PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs $;

        public Builder() {
            $ = new PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs();
        }

        public Builder(PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs defaults) {
            $ = new PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facet The event facet.
         * 
         * @return builder
         * 
         */
        public Builder facet(Output<String> facet) {
            $.facet = facet;
            return this;
        }

        /**
         * @param facet The event facet.
         * 
         * @return builder
         * 
         */
        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        /**
         * @param limit The number of groups to return.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The number of groups to return.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param sort The options for sorting group by results.
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable Output<PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort The options for sorting group by results.
         * 
         * @return builder
         * 
         */
        public Builder sort(PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs sort) {
            return sort(Output.of(sort));
        }

        public PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs build() {
            if ($.facet == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs", "facet");
            }
            return $;
        }
    }

}