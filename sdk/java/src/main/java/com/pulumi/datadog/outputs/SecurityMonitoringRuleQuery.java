// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.SecurityMonitoringRuleQueryAgentRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityMonitoringRuleQuery {
    /**
     * @deprecated
     * `agent_rule` has been deprecated in favor of new Agent Rule resource.
     * 
     */
    @Deprecated /* `agent_rule` has been deprecated in favor of new Agent Rule resource. */
    private @Nullable List<SecurityMonitoringRuleQueryAgentRule> agentRules;
    private @Nullable String aggregation;
    private @Nullable List<String> distinctFields;
    private @Nullable List<String> groupByFields;
    private @Nullable String metric;
    private @Nullable List<String> metrics;
    private @Nullable String name;
    private String query;

    private SecurityMonitoringRuleQuery() {}
    /**
     * @deprecated
     * `agent_rule` has been deprecated in favor of new Agent Rule resource.
     * 
     */
    @Deprecated /* `agent_rule` has been deprecated in favor of new Agent Rule resource. */
    public List<SecurityMonitoringRuleQueryAgentRule> agentRules() {
        return this.agentRules == null ? List.of() : this.agentRules;
    }
    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    public List<String> distinctFields() {
        return this.distinctFields == null ? List.of() : this.distinctFields;
    }
    public List<String> groupByFields() {
        return this.groupByFields == null ? List.of() : this.groupByFields;
    }
    public Optional<String> metric() {
        return Optional.ofNullable(this.metric);
    }
    public List<String> metrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityMonitoringRuleQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<SecurityMonitoringRuleQueryAgentRule> agentRules;
        private @Nullable String aggregation;
        private @Nullable List<String> distinctFields;
        private @Nullable List<String> groupByFields;
        private @Nullable String metric;
        private @Nullable List<String> metrics;
        private @Nullable String name;
        private String query;
        public Builder() {}
        public Builder(SecurityMonitoringRuleQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentRules = defaults.agentRules;
    	      this.aggregation = defaults.aggregation;
    	      this.distinctFields = defaults.distinctFields;
    	      this.groupByFields = defaults.groupByFields;
    	      this.metric = defaults.metric;
    	      this.metrics = defaults.metrics;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder agentRules(@Nullable List<SecurityMonitoringRuleQueryAgentRule> agentRules) {
            this.agentRules = agentRules;
            return this;
        }
        public Builder agentRules(SecurityMonitoringRuleQueryAgentRule... agentRules) {
            return agentRules(List.of(agentRules));
        }
        @CustomType.Setter
        public Builder aggregation(@Nullable String aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder distinctFields(@Nullable List<String> distinctFields) {
            this.distinctFields = distinctFields;
            return this;
        }
        public Builder distinctFields(String... distinctFields) {
            return distinctFields(List.of(distinctFields));
        }
        @CustomType.Setter
        public Builder groupByFields(@Nullable List<String> groupByFields) {
            this.groupByFields = groupByFields;
            return this;
        }
        public Builder groupByFields(String... groupByFields) {
            return groupByFields(List.of(groupByFields));
        }
        @CustomType.Setter
        public Builder metric(@Nullable String metric) {
            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder metrics(@Nullable List<String> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public SecurityMonitoringRuleQuery build() {
            final var o = new SecurityMonitoringRuleQuery();
            o.agentRules = agentRules;
            o.aggregation = aggregation;
            o.distinctFields = distinctFields;
            o.groupByFields = groupByFields;
            o.metric = metric;
            o.metrics = metrics;
            o.name = name;
            o.query = query;
            return o;
        }
    }
}