// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestApmQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestApmStatsQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestConditionalFormat;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestFormula;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestLogQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestProcessQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestRumQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestSecurityQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryTableDefinitionRequestTextFormat;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetQueryTableDefinitionRequest {
    /**
     * @return The aggregator to use for time aggregation. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    private @Nullable String aggregator;
    /**
     * @return The alias for the column name (defaults to metric name).
     * 
     */
    private @Nullable String alias;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetQueryTableDefinitionRequestApmQuery apmQuery;
    private @Nullable PowerpackWidgetQueryTableDefinitionRequestApmStatsQuery apmStatsQuery;
    /**
     * @return A list of display modes for each table cell. List items one of `number`, `bar`. Valid values are `number`, `bar`.
     * 
     */
    private @Nullable List<String> cellDisplayModes;
    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestConditionalFormat> conditionalFormats;
    private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestFormula> formulas;
    /**
     * @return The number of lines to show in the table.
     * 
     */
    private @Nullable Integer limit;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetQueryTableDefinitionRequestLogQuery logQuery;
    /**
     * @return The sort order for the rows. Valid values are `asc`, `desc`.
     * 
     */
    private @Nullable String order;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable PowerpackWidgetQueryTableDefinitionRequestProcessQuery processQuery;
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private @Nullable String q;
    private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestQuery> queries;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetQueryTableDefinitionRequestRumQuery rumQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetQueryTableDefinitionRequestSecurityQuery securityQuery;
    /**
     * @return Text formats define how to format text in table widget content. Multiple `text_formats` blocks are allowed using the structure below. This resource is in beta and is subject to change.
     * 
     */
    private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestTextFormat> textFormats;

    private PowerpackWidgetQueryTableDefinitionRequest() {}
    /**
     * @return The aggregator to use for time aggregation. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    public Optional<String> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }
    /**
     * @return The alias for the column name (defaults to metric name).
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<PowerpackWidgetQueryTableDefinitionRequestApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    public Optional<PowerpackWidgetQueryTableDefinitionRequestApmStatsQuery> apmStatsQuery() {
        return Optional.ofNullable(this.apmStatsQuery);
    }
    /**
     * @return A list of display modes for each table cell. List items one of `number`, `bar`. Valid values are `number`, `bar`.
     * 
     */
    public List<String> cellDisplayModes() {
        return this.cellDisplayModes == null ? List.of() : this.cellDisplayModes;
    }
    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetQueryTableDefinitionRequestConditionalFormat> conditionalFormats() {
        return this.conditionalFormats == null ? List.of() : this.conditionalFormats;
    }
    public List<PowerpackWidgetQueryTableDefinitionRequestFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    /**
     * @return The number of lines to show in the table.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<PowerpackWidgetQueryTableDefinitionRequestLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    /**
     * @return The sort order for the rows. Valid values are `asc`, `desc`.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<PowerpackWidgetQueryTableDefinitionRequestProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    public List<PowerpackWidgetQueryTableDefinitionRequestQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<PowerpackWidgetQueryTableDefinitionRequestRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<PowerpackWidgetQueryTableDefinitionRequestSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }
    /**
     * @return Text formats define how to format text in table widget content. Multiple `text_formats` blocks are allowed using the structure below. This resource is in beta and is subject to change.
     * 
     */
    public List<PowerpackWidgetQueryTableDefinitionRequestTextFormat> textFormats() {
        return this.textFormats == null ? List.of() : this.textFormats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetQueryTableDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregator;
        private @Nullable String alias;
        private @Nullable PowerpackWidgetQueryTableDefinitionRequestApmQuery apmQuery;
        private @Nullable PowerpackWidgetQueryTableDefinitionRequestApmStatsQuery apmStatsQuery;
        private @Nullable List<String> cellDisplayModes;
        private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestConditionalFormat> conditionalFormats;
        private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestFormula> formulas;
        private @Nullable Integer limit;
        private @Nullable PowerpackWidgetQueryTableDefinitionRequestLogQuery logQuery;
        private @Nullable String order;
        private @Nullable PowerpackWidgetQueryTableDefinitionRequestProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestQuery> queries;
        private @Nullable PowerpackWidgetQueryTableDefinitionRequestRumQuery rumQuery;
        private @Nullable PowerpackWidgetQueryTableDefinitionRequestSecurityQuery securityQuery;
        private @Nullable List<PowerpackWidgetQueryTableDefinitionRequestTextFormat> textFormats;
        public Builder() {}
        public Builder(PowerpackWidgetQueryTableDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregator = defaults.aggregator;
    	      this.alias = defaults.alias;
    	      this.apmQuery = defaults.apmQuery;
    	      this.apmStatsQuery = defaults.apmStatsQuery;
    	      this.cellDisplayModes = defaults.cellDisplayModes;
    	      this.conditionalFormats = defaults.conditionalFormats;
    	      this.formulas = defaults.formulas;
    	      this.limit = defaults.limit;
    	      this.logQuery = defaults.logQuery;
    	      this.order = defaults.order;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.queries = defaults.queries;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
    	      this.textFormats = defaults.textFormats;
        }

        @CustomType.Setter
        public Builder aggregator(@Nullable String aggregator) {

            this.aggregator = aggregator;
            return this;
        }
        @CustomType.Setter
        public Builder alias(@Nullable String alias) {

            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder apmQuery(@Nullable PowerpackWidgetQueryTableDefinitionRequestApmQuery apmQuery) {

            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmStatsQuery(@Nullable PowerpackWidgetQueryTableDefinitionRequestApmStatsQuery apmStatsQuery) {

            this.apmStatsQuery = apmStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder cellDisplayModes(@Nullable List<String> cellDisplayModes) {

            this.cellDisplayModes = cellDisplayModes;
            return this;
        }
        public Builder cellDisplayModes(String... cellDisplayModes) {
            return cellDisplayModes(List.of(cellDisplayModes));
        }
        @CustomType.Setter
        public Builder conditionalFormats(@Nullable List<PowerpackWidgetQueryTableDefinitionRequestConditionalFormat> conditionalFormats) {

            this.conditionalFormats = conditionalFormats;
            return this;
        }
        public Builder conditionalFormats(PowerpackWidgetQueryTableDefinitionRequestConditionalFormat... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }
        @CustomType.Setter
        public Builder formulas(@Nullable List<PowerpackWidgetQueryTableDefinitionRequestFormula> formulas) {

            this.formulas = formulas;
            return this;
        }
        public Builder formulas(PowerpackWidgetQueryTableDefinitionRequestFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable PowerpackWidgetQueryTableDefinitionRequestLogQuery logQuery) {

            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable PowerpackWidgetQueryTableDefinitionRequestProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {

            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<PowerpackWidgetQueryTableDefinitionRequestQuery> queries) {

            this.queries = queries;
            return this;
        }
        public Builder queries(PowerpackWidgetQueryTableDefinitionRequestQuery... queries) {
            return queries(List.of(queries));
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable PowerpackWidgetQueryTableDefinitionRequestRumQuery rumQuery) {

            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable PowerpackWidgetQueryTableDefinitionRequestSecurityQuery securityQuery) {

            this.securityQuery = securityQuery;
            return this;
        }
        @CustomType.Setter
        public Builder textFormats(@Nullable List<PowerpackWidgetQueryTableDefinitionRequestTextFormat> textFormats) {

            this.textFormats = textFormats;
            return this;
        }
        public Builder textFormats(PowerpackWidgetQueryTableDefinitionRequestTextFormat... textFormats) {
            return textFormats(List.of(textFormats));
        }
        public PowerpackWidgetQueryTableDefinitionRequest build() {
            final var _resultValue = new PowerpackWidgetQueryTableDefinitionRequest();
            _resultValue.aggregator = aggregator;
            _resultValue.alias = alias;
            _resultValue.apmQuery = apmQuery;
            _resultValue.apmStatsQuery = apmStatsQuery;
            _resultValue.cellDisplayModes = cellDisplayModes;
            _resultValue.conditionalFormats = conditionalFormats;
            _resultValue.formulas = formulas;
            _resultValue.limit = limit;
            _resultValue.logQuery = logQuery;
            _resultValue.order = order;
            _resultValue.processQuery = processQuery;
            _resultValue.q = q;
            _resultValue.queries = queries;
            _resultValue.rumQuery = rumQuery;
            _resultValue.securityQuery = securityQuery;
            _resultValue.textFormats = textFormats;
            return _resultValue;
        }
    }
}