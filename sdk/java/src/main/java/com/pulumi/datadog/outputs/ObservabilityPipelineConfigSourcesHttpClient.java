// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigSourcesHttpClientTls;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObservabilityPipelineConfigSourcesHttpClient {
    /**
     * @return Optional authentication strategy for HTTP requests.
     * 
     */
    private @Nullable String authStrategy;
    /**
     * @return The decoding format used to interpret incoming logs.
     * 
     */
    private String decoding;
    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    private String id;
    /**
     * @return The interval (in seconds) between HTTP scrape requests.
     * 
     */
    private @Nullable Integer scrapeIntervalSecs;
    /**
     * @return The timeout (in seconds) for each scrape request.
     * 
     */
    private @Nullable Integer scrapeTimeoutSecs;
    /**
     * @return Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    private @Nullable ObservabilityPipelineConfigSourcesHttpClientTls tls;

    private ObservabilityPipelineConfigSourcesHttpClient() {}
    /**
     * @return Optional authentication strategy for HTTP requests.
     * 
     */
    public Optional<String> authStrategy() {
        return Optional.ofNullable(this.authStrategy);
    }
    /**
     * @return The decoding format used to interpret incoming logs.
     * 
     */
    public String decoding() {
        return this.decoding;
    }
    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The interval (in seconds) between HTTP scrape requests.
     * 
     */
    public Optional<Integer> scrapeIntervalSecs() {
        return Optional.ofNullable(this.scrapeIntervalSecs);
    }
    /**
     * @return The timeout (in seconds) for each scrape request.
     * 
     */
    public Optional<Integer> scrapeTimeoutSecs() {
        return Optional.ofNullable(this.scrapeTimeoutSecs);
    }
    /**
     * @return Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    public Optional<ObservabilityPipelineConfigSourcesHttpClientTls> tls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigSourcesHttpClient defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authStrategy;
        private String decoding;
        private String id;
        private @Nullable Integer scrapeIntervalSecs;
        private @Nullable Integer scrapeTimeoutSecs;
        private @Nullable ObservabilityPipelineConfigSourcesHttpClientTls tls;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigSourcesHttpClient defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authStrategy = defaults.authStrategy;
    	      this.decoding = defaults.decoding;
    	      this.id = defaults.id;
    	      this.scrapeIntervalSecs = defaults.scrapeIntervalSecs;
    	      this.scrapeTimeoutSecs = defaults.scrapeTimeoutSecs;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder authStrategy(@Nullable String authStrategy) {

            this.authStrategy = authStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder decoding(String decoding) {
            if (decoding == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigSourcesHttpClient", "decoding");
            }
            this.decoding = decoding;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigSourcesHttpClient", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder scrapeIntervalSecs(@Nullable Integer scrapeIntervalSecs) {

            this.scrapeIntervalSecs = scrapeIntervalSecs;
            return this;
        }
        @CustomType.Setter
        public Builder scrapeTimeoutSecs(@Nullable Integer scrapeTimeoutSecs) {

            this.scrapeTimeoutSecs = scrapeTimeoutSecs;
            return this;
        }
        @CustomType.Setter
        public Builder tls(@Nullable ObservabilityPipelineConfigSourcesHttpClientTls tls) {

            this.tls = tls;
            return this;
        }
        public ObservabilityPipelineConfigSourcesHttpClient build() {
            final var _resultValue = new ObservabilityPipelineConfigSourcesHttpClient();
            _resultValue.authStrategy = authStrategy;
            _resultValue.decoding = decoding;
            _resultValue.id = id;
            _resultValue.scrapeIntervalSecs = scrapeIntervalSecs;
            _resultValue.scrapeTimeoutSecs = scrapeTimeoutSecs;
            _resultValue.tls = tls;
            return _resultValue;
        }
    }
}
