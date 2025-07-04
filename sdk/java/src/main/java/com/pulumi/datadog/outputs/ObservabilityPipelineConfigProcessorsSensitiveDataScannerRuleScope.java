// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeExclude;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeInclude;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScope {
    /**
     * @return Scan all fields.
     * 
     */
    private @Nullable Boolean all;
    /**
     * @return Explicitly exclude these fields from scanning.
     * 
     */
    private @Nullable ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeExclude exclude;
    /**
     * @return Explicitly include these fields for scanning.
     * 
     */
    private @Nullable ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeInclude include;

    private ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScope() {}
    /**
     * @return Scan all fields.
     * 
     */
    public Optional<Boolean> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * @return Explicitly exclude these fields from scanning.
     * 
     */
    public Optional<ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeExclude> exclude() {
        return Optional.ofNullable(this.exclude);
    }
    /**
     * @return Explicitly include these fields for scanning.
     * 
     */
    public Optional<ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeInclude> include() {
        return Optional.ofNullable(this.include);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean all;
        private @Nullable ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeExclude exclude;
        private @Nullable ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeInclude include;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclude = defaults.exclude;
    	      this.include = defaults.include;
        }

        @CustomType.Setter
        public Builder all(@Nullable Boolean all) {

            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder exclude(@Nullable ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeExclude exclude) {

            this.exclude = exclude;
            return this;
        }
        @CustomType.Setter
        public Builder include(@Nullable ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScopeInclude include) {

            this.include = include;
            return this;
        }
        public ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScope build() {
            final var _resultValue = new ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleScope();
            _resultValue.all = all;
            _resultValue.exclude = exclude;
            _resultValue.include = include;
            return _resultValue;
        }
    }
}
