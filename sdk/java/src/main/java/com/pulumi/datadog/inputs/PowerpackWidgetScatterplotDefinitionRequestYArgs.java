// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetScatterplotDefinitionRequestYApmQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetScatterplotDefinitionRequestYLogQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetScatterplotDefinitionRequestYProcessQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetScatterplotDefinitionRequestYRumQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetScatterplotDefinitionRequestYSecurityQueryArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetScatterplotDefinitionRequestYArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetScatterplotDefinitionRequestYArgs Empty = new PowerpackWidgetScatterplotDefinitionRequestYArgs();

    /**
     * Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    @Import(name="aggregator")
    private @Nullable Output<String> aggregator;

    /**
     * @return Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    public Optional<Output<String>> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="apmQuery")
    private @Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYApmQueryArgs> apmQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetScatterplotDefinitionRequestYApmQueryArgs>> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="logQuery")
    private @Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYLogQueryArgs> logQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetScatterplotDefinitionRequestYLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }

    /**
     * The process query to use in the widget. The structure of this block is described below.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYProcessQueryArgs> processQuery;

    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<Output<PowerpackWidgetScatterplotDefinitionRequestYProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    /**
     * The metric query to use for this widget.
     * 
     */
    @Import(name="q")
    private @Nullable Output<String> q;

    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<Output<String>> q() {
        return Optional.ofNullable(this.q);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="rumQuery")
    private @Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYRumQueryArgs> rumQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetScatterplotDefinitionRequestYRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="securityQuery")
    private @Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYSecurityQueryArgs> securityQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetScatterplotDefinitionRequestYSecurityQueryArgs>> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    private PowerpackWidgetScatterplotDefinitionRequestYArgs() {}

    private PowerpackWidgetScatterplotDefinitionRequestYArgs(PowerpackWidgetScatterplotDefinitionRequestYArgs $) {
        this.aggregator = $.aggregator;
        this.apmQuery = $.apmQuery;
        this.logQuery = $.logQuery;
        this.processQuery = $.processQuery;
        this.q = $.q;
        this.rumQuery = $.rumQuery;
        this.securityQuery = $.securityQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetScatterplotDefinitionRequestYArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetScatterplotDefinitionRequestYArgs $;

        public Builder() {
            $ = new PowerpackWidgetScatterplotDefinitionRequestYArgs();
        }

        public Builder(PowerpackWidgetScatterplotDefinitionRequestYArgs defaults) {
            $ = new PowerpackWidgetScatterplotDefinitionRequestYArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregator Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(@Nullable Output<String> aggregator) {
            $.aggregator = aggregator;
            return this;
        }

        /**
         * @param aggregator Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(String aggregator) {
            return aggregator(Output.of(aggregator));
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(@Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYApmQueryArgs> apmQuery) {
            $.apmQuery = apmQuery;
            return this;
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(PowerpackWidgetScatterplotDefinitionRequestYApmQueryArgs apmQuery) {
            return apmQuery(Output.of(apmQuery));
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(@Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(PowerpackWidgetScatterplotDefinitionRequestYLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(PowerpackWidgetScatterplotDefinitionRequestYProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        /**
         * @param q The metric query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder q(@Nullable Output<String> q) {
            $.q = q;
            return this;
        }

        /**
         * @param q The metric query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder q(String q) {
            return q(Output.of(q));
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(@Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(PowerpackWidgetScatterplotDefinitionRequestYRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(@Nullable Output<PowerpackWidgetScatterplotDefinitionRequestYSecurityQueryArgs> securityQuery) {
            $.securityQuery = securityQuery;
            return this;
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(PowerpackWidgetScatterplotDefinitionRequestYSecurityQueryArgs securityQuery) {
            return securityQuery(Output.of(securityQuery));
        }

        public PowerpackWidgetScatterplotDefinitionRequestYArgs build() {
            return $;
        }
    }

}