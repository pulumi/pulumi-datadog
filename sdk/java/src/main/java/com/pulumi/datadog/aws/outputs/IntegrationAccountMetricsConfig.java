// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.aws.outputs.IntegrationAccountMetricsConfigNamespaceFilters;
import com.pulumi.datadog.aws.outputs.IntegrationAccountMetricsConfigTagFilter;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationAccountMetricsConfig {
    /**
     * @return Enable EC2 automute for AWS metrics Defaults to `true`.
     * 
     */
    private @Nullable Boolean automuteEnabled;
    /**
     * @return Enable CloudWatch alarms collection Defaults to `false`.
     * 
     */
    private @Nullable Boolean collectCloudwatchAlarms;
    /**
     * @return Enable custom metrics collection Defaults to `false`.
     * 
     */
    private @Nullable Boolean collectCustomMetrics;
    /**
     * @return Enable AWS metrics collection Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return AWS metrics namespace filters. Defaults to a pre-set `exclude_only` list if block is empty.
     * 
     */
    private @Nullable IntegrationAccountMetricsConfigNamespaceFilters namespaceFilters;
    /**
     * @return AWS Metrics Collection tag filters list. The array of custom AWS resource tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from a specified service. Wildcards, such as `?` (match a single character) and `*` (match multiple characters), and exclusion using `!` before the tag are supported. For EC2, only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. For example, `env:production,instance-type:c?.*,!region:us-east-1`.
     * 
     */
    private @Nullable List<IntegrationAccountMetricsConfigTagFilter> tagFilters;

    private IntegrationAccountMetricsConfig() {}
    /**
     * @return Enable EC2 automute for AWS metrics Defaults to `true`.
     * 
     */
    public Optional<Boolean> automuteEnabled() {
        return Optional.ofNullable(this.automuteEnabled);
    }
    /**
     * @return Enable CloudWatch alarms collection Defaults to `false`.
     * 
     */
    public Optional<Boolean> collectCloudwatchAlarms() {
        return Optional.ofNullable(this.collectCloudwatchAlarms);
    }
    /**
     * @return Enable custom metrics collection Defaults to `false`.
     * 
     */
    public Optional<Boolean> collectCustomMetrics() {
        return Optional.ofNullable(this.collectCustomMetrics);
    }
    /**
     * @return Enable AWS metrics collection Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return AWS metrics namespace filters. Defaults to a pre-set `exclude_only` list if block is empty.
     * 
     */
    public Optional<IntegrationAccountMetricsConfigNamespaceFilters> namespaceFilters() {
        return Optional.ofNullable(this.namespaceFilters);
    }
    /**
     * @return AWS Metrics Collection tag filters list. The array of custom AWS resource tags (in the form `key:value`) defines a filter that Datadog uses when collecting metrics from a specified service. Wildcards, such as `?` (match a single character) and `*` (match multiple characters), and exclusion using `!` before the tag are supported. For EC2, only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. For example, `env:production,instance-type:c?.*,!region:us-east-1`.
     * 
     */
    public List<IntegrationAccountMetricsConfigTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountMetricsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean automuteEnabled;
        private @Nullable Boolean collectCloudwatchAlarms;
        private @Nullable Boolean collectCustomMetrics;
        private @Nullable Boolean enabled;
        private @Nullable IntegrationAccountMetricsConfigNamespaceFilters namespaceFilters;
        private @Nullable List<IntegrationAccountMetricsConfigTagFilter> tagFilters;
        public Builder() {}
        public Builder(IntegrationAccountMetricsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automuteEnabled = defaults.automuteEnabled;
    	      this.collectCloudwatchAlarms = defaults.collectCloudwatchAlarms;
    	      this.collectCustomMetrics = defaults.collectCustomMetrics;
    	      this.enabled = defaults.enabled;
    	      this.namespaceFilters = defaults.namespaceFilters;
    	      this.tagFilters = defaults.tagFilters;
        }

        @CustomType.Setter
        public Builder automuteEnabled(@Nullable Boolean automuteEnabled) {

            this.automuteEnabled = automuteEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder collectCloudwatchAlarms(@Nullable Boolean collectCloudwatchAlarms) {

            this.collectCloudwatchAlarms = collectCloudwatchAlarms;
            return this;
        }
        @CustomType.Setter
        public Builder collectCustomMetrics(@Nullable Boolean collectCustomMetrics) {

            this.collectCustomMetrics = collectCustomMetrics;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceFilters(@Nullable IntegrationAccountMetricsConfigNamespaceFilters namespaceFilters) {

            this.namespaceFilters = namespaceFilters;
            return this;
        }
        @CustomType.Setter
        public Builder tagFilters(@Nullable List<IntegrationAccountMetricsConfigTagFilter> tagFilters) {

            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(IntegrationAccountMetricsConfigTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }
        public IntegrationAccountMetricsConfig build() {
            final var _resultValue = new IntegrationAccountMetricsConfig();
            _resultValue.automuteEnabled = automuteEnabled;
            _resultValue.collectCloudwatchAlarms = collectCloudwatchAlarms;
            _resultValue.collectCustomMetrics = collectCustomMetrics;
            _resultValue.enabled = enabled;
            _resultValue.namespaceFilters = namespaceFilters;
            _resultValue.tagFilters = tagFilters;
            return _resultValue;
        }
    }
}
