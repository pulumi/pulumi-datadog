// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityMonitoringRulesRuleSignalQuery {
    private @Nullable String aggregation;
    private @Nullable List<String> correlatedByFields;
    private @Nullable String correlatedQueryIndex;
    private @Nullable String defaultRuleId;
    private @Nullable String name;
    private String ruleId;

    private GetSecurityMonitoringRulesRuleSignalQuery() {}
    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    public List<String> correlatedByFields() {
        return this.correlatedByFields == null ? List.of() : this.correlatedByFields;
    }
    public Optional<String> correlatedQueryIndex() {
        return Optional.ofNullable(this.correlatedQueryIndex);
    }
    public Optional<String> defaultRuleId() {
        return Optional.ofNullable(this.defaultRuleId);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String ruleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityMonitoringRulesRuleSignalQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregation;
        private @Nullable List<String> correlatedByFields;
        private @Nullable String correlatedQueryIndex;
        private @Nullable String defaultRuleId;
        private @Nullable String name;
        private String ruleId;
        public Builder() {}
        public Builder(GetSecurityMonitoringRulesRuleSignalQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.correlatedByFields = defaults.correlatedByFields;
    	      this.correlatedQueryIndex = defaults.correlatedQueryIndex;
    	      this.defaultRuleId = defaults.defaultRuleId;
    	      this.name = defaults.name;
    	      this.ruleId = defaults.ruleId;
        }

        @CustomType.Setter
        public Builder aggregation(@Nullable String aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder correlatedByFields(@Nullable List<String> correlatedByFields) {
            this.correlatedByFields = correlatedByFields;
            return this;
        }
        public Builder correlatedByFields(String... correlatedByFields) {
            return correlatedByFields(List.of(correlatedByFields));
        }
        @CustomType.Setter
        public Builder correlatedQueryIndex(@Nullable String correlatedQueryIndex) {
            this.correlatedQueryIndex = correlatedQueryIndex;
            return this;
        }
        @CustomType.Setter
        public Builder defaultRuleId(@Nullable String defaultRuleId) {
            this.defaultRuleId = defaultRuleId;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public GetSecurityMonitoringRulesRuleSignalQuery build() {
            final var o = new GetSecurityMonitoringRulesRuleSignalQuery();
            o.aggregation = aggregation;
            o.correlatedByFields = correlatedByFields;
            o.correlatedQueryIndex = correlatedQueryIndex;
            o.defaultRuleId = defaultRuleId;
            o.name = name;
            o.ruleId = ruleId;
            return o;
        }
    }
}