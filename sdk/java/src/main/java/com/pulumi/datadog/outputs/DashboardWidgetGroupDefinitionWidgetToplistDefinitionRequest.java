// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest {
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery apmQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery auditQuery;
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats;
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas;
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery logQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery processQuery;
    private @Nullable String q;
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries;
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery rumQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery securityQuery;
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle style;

    private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest() {}
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery> auditQuery() {
        return Optional.ofNullable(this.auditQuery);
    }
    public List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats() {
        return this.conditionalFormats == null ? List.of() : this.conditionalFormats;
    }
    public List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    public List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle> style() {
        return Optional.ofNullable(this.style);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery apmQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery auditQuery;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery logQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery rumQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery securityQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle style;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmQuery = defaults.apmQuery;
    	      this.auditQuery = defaults.auditQuery;
    	      this.conditionalFormats = defaults.conditionalFormats;
    	      this.formulas = defaults.formulas;
    	      this.logQuery = defaults.logQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.queries = defaults.queries;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
    	      this.style = defaults.style;
        }

        @CustomType.Setter
        public Builder apmQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery apmQuery) {
            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder auditQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery auditQuery) {
            this.auditQuery = auditQuery;
            return this;
        }
        @CustomType.Setter
        public Builder conditionalFormats(@Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats) {
            this.conditionalFormats = conditionalFormats;
            return this;
        }
        public Builder conditionalFormats(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }
        @CustomType.Setter
        public Builder formulas(@Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas) {
            this.formulas = formulas;
            return this;
        }
        public Builder formulas(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery logQuery) {
            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery processQuery) {
            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {
            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries) {
            this.queries = queries;
            return this;
        }
        public Builder queries(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery... queries) {
            return queries(List.of(queries));
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery rumQuery) {
            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery securityQuery) {
            this.securityQuery = securityQuery;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle style) {
            this.style = style;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest build() {
            final var o = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest();
            o.apmQuery = apmQuery;
            o.auditQuery = auditQuery;
            o.conditionalFormats = conditionalFormats;
            o.formulas = formulas;
            o.logQuery = logQuery;
            o.processQuery = processQuery;
            o.q = q;
            o.queries = queries;
            o.rumQuery = rumQuery;
            o.securityQuery = securityQuery;
            o.style = style;
            return o;
        }
    }
}