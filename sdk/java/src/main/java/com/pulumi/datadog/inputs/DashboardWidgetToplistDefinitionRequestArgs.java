// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetApmQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetLogQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetRumQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSecurityQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestAuditQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestConditionalFormatArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestFormulaArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetToplistDefinitionRequestStyleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetToplistDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetToplistDefinitionRequestArgs Empty = new DashboardWidgetToplistDefinitionRequestArgs();

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="apmQuery")
    private @Nullable Output<DashboardWidgetApmQueryArgs> apmQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetApmQueryArgs>> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="auditQuery")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestAuditQueryArgs> auditQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetToplistDefinitionRequestAuditQueryArgs>> auditQuery() {
        return Optional.ofNullable(this.auditQuery);
    }

    /**
     * Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    @Import(name="conditionalFormats")
    private @Nullable Output<List<DashboardWidgetToplistDefinitionRequestConditionalFormatArgs>> conditionalFormats;

    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetToplistDefinitionRequestConditionalFormatArgs>>> conditionalFormats() {
        return Optional.ofNullable(this.conditionalFormats);
    }

    @Import(name="formulas")
    private @Nullable Output<List<DashboardWidgetToplistDefinitionRequestFormulaArgs>> formulas;

    public Optional<Output<List<DashboardWidgetToplistDefinitionRequestFormulaArgs>>> formulas() {
        return Optional.ofNullable(this.formulas);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="logQuery")
    private @Nullable Output<DashboardWidgetLogQueryArgs> logQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }

    /**
     * The process query to use in the widget. The structure of this block is described below.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestProcessQueryArgs> processQuery;

    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<Output<DashboardWidgetToplistDefinitionRequestProcessQueryArgs>> processQuery() {
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

    @Import(name="queries")
    private @Nullable Output<List<DashboardWidgetToplistDefinitionRequestQueryArgs>> queries;

    public Optional<Output<List<DashboardWidgetToplistDefinitionRequestQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="rumQuery")
    private @Nullable Output<DashboardWidgetRumQueryArgs> rumQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="securityQuery")
    private @Nullable Output<DashboardWidgetSecurityQueryArgs> securityQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetSecurityQueryArgs>> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    /**
     * Define request for the widget&#39;s style.
     * 
     */
    @Import(name="style")
    private @Nullable Output<DashboardWidgetToplistDefinitionRequestStyleArgs> style;

    /**
     * @return Define request for the widget&#39;s style.
     * 
     */
    public Optional<Output<DashboardWidgetToplistDefinitionRequestStyleArgs>> style() {
        return Optional.ofNullable(this.style);
    }

    private DashboardWidgetToplistDefinitionRequestArgs() {}

    private DashboardWidgetToplistDefinitionRequestArgs(DashboardWidgetToplistDefinitionRequestArgs $) {
        this.apmQuery = $.apmQuery;
        this.auditQuery = $.auditQuery;
        this.conditionalFormats = $.conditionalFormats;
        this.formulas = $.formulas;
        this.logQuery = $.logQuery;
        this.processQuery = $.processQuery;
        this.q = $.q;
        this.queries = $.queries;
        this.rumQuery = $.rumQuery;
        this.securityQuery = $.securityQuery;
        this.style = $.style;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetToplistDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetToplistDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetToplistDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetToplistDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetToplistDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(@Nullable Output<DashboardWidgetApmQueryArgs> apmQuery) {
            $.apmQuery = apmQuery;
            return this;
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(DashboardWidgetApmQueryArgs apmQuery) {
            return apmQuery(Output.of(apmQuery));
        }

        /**
         * @param auditQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder auditQuery(@Nullable Output<DashboardWidgetToplistDefinitionRequestAuditQueryArgs> auditQuery) {
            $.auditQuery = auditQuery;
            return this;
        }

        /**
         * @param auditQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder auditQuery(DashboardWidgetToplistDefinitionRequestAuditQueryArgs auditQuery) {
            return auditQuery(Output.of(auditQuery));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(@Nullable Output<List<DashboardWidgetToplistDefinitionRequestConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(List<DashboardWidgetToplistDefinitionRequestConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(DashboardWidgetToplistDefinitionRequestConditionalFormatArgs... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }

        public Builder formulas(@Nullable Output<List<DashboardWidgetToplistDefinitionRequestFormulaArgs>> formulas) {
            $.formulas = formulas;
            return this;
        }

        public Builder formulas(List<DashboardWidgetToplistDefinitionRequestFormulaArgs> formulas) {
            return formulas(Output.of(formulas));
        }

        public Builder formulas(DashboardWidgetToplistDefinitionRequestFormulaArgs... formulas) {
            return formulas(List.of(formulas));
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(@Nullable Output<DashboardWidgetLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(DashboardWidgetLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<DashboardWidgetToplistDefinitionRequestProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(DashboardWidgetToplistDefinitionRequestProcessQueryArgs processQuery) {
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

        public Builder queries(@Nullable Output<List<DashboardWidgetToplistDefinitionRequestQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DashboardWidgetToplistDefinitionRequestQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DashboardWidgetToplistDefinitionRequestQueryArgs... queries) {
            return queries(List.of(queries));
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(@Nullable Output<DashboardWidgetRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(DashboardWidgetRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(@Nullable Output<DashboardWidgetSecurityQueryArgs> securityQuery) {
            $.securityQuery = securityQuery;
            return this;
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(DashboardWidgetSecurityQueryArgs securityQuery) {
            return securityQuery(Output.of(securityQuery));
        }

        /**
         * @param style Define request for the widget&#39;s style.
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable Output<DashboardWidgetToplistDefinitionRequestStyleArgs> style) {
            $.style = style;
            return this;
        }

        /**
         * @param style Define request for the widget&#39;s style.
         * 
         * @return builder
         * 
         */
        public Builder style(DashboardWidgetToplistDefinitionRequestStyleArgs style) {
            return style(Output.of(style));
        }

        public DashboardWidgetToplistDefinitionRequestArgs build() {
            return $;
        }
    }

}