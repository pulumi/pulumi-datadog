// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaConditionalFormatArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaLimitArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs Empty = new DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs();

    @Import(name="alias")
    private @Nullable Output<String> alias;

    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    @Import(name="cellDisplayMode")
    private @Nullable Output<String> cellDisplayMode;

    public Optional<Output<String>> cellDisplayMode() {
        return Optional.ofNullable(this.cellDisplayMode);
    }

    @Import(name="conditionalFormats")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaConditionalFormatArgs>>> conditionalFormats() {
        return Optional.ofNullable(this.conditionalFormats);
    }

    @Import(name="formulaExpression", required=true)
    private Output<String> formulaExpression;

    public Output<String> formulaExpression() {
        return this.formulaExpression;
    }

    @Import(name="limit")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaLimitArgs> limit;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaLimitArgs>> limit() {
        return Optional.ofNullable(this.limit);
    }

    private DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs() {}

    private DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs(DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs $) {
        this.alias = $.alias;
        this.cellDisplayMode = $.cellDisplayMode;
        this.conditionalFormats = $.conditionalFormats;
        this.formulaExpression = $.formulaExpression;
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs(Objects.requireNonNull(defaults));
        }

        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        public Builder cellDisplayMode(@Nullable Output<String> cellDisplayMode) {
            $.cellDisplayMode = cellDisplayMode;
            return this;
        }

        public Builder cellDisplayMode(String cellDisplayMode) {
            return cellDisplayMode(Output.of(cellDisplayMode));
        }

        public Builder conditionalFormats(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        public Builder conditionalFormats(List<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        public Builder conditionalFormats(DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaConditionalFormatArgs... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }

        public Builder formulaExpression(Output<String> formulaExpression) {
            $.formulaExpression = formulaExpression;
            return this;
        }

        public Builder formulaExpression(String formulaExpression) {
            return formulaExpression(Output.of(formulaExpression));
        }

        public Builder limit(@Nullable Output<DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaLimitArgs> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaLimitArgs limit) {
            return limit(Output.of(limit));
        }

        public DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestFormulaArgs build() {
            $.formulaExpression = Objects.requireNonNull($.formulaExpression, "expected parameter 'formulaExpression' to be non-null");
            return $;
        }
    }

}