// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigSourcesSyslogNgTls;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObservabilityPipelineConfigSourcesSyslogNg {
    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    private String id;
    /**
     * @return Protocol used by the syslog source to receive messages.
     * 
     */
    private @Nullable String mode;
    /**
     * @return Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    private @Nullable ObservabilityPipelineConfigSourcesSyslogNgTls tls;

    private ObservabilityPipelineConfigSourcesSyslogNg() {}
    /**
     * @return The unique identifier for this component. Used to reference this component in other parts of the pipeline (e.g., as input to downstream components).
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Protocol used by the syslog source to receive messages.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Configuration for enabling TLS encryption between the pipeline component and external services.
     * 
     */
    public Optional<ObservabilityPipelineConfigSourcesSyslogNgTls> tls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigSourcesSyslogNg defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String mode;
        private @Nullable ObservabilityPipelineConfigSourcesSyslogNgTls tls;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigSourcesSyslogNg defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigSourcesSyslogNg", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder tls(@Nullable ObservabilityPipelineConfigSourcesSyslogNgTls tls) {

            this.tls = tls;
            return this;
        }
        public ObservabilityPipelineConfigSourcesSyslogNg build() {
            final var _resultValue = new ObservabilityPipelineConfigSourcesSyslogNg();
            _resultValue.id = id;
            _resultValue.mode = mode;
            _resultValue.tls = tls;
            return _resultValue;
        }
    }
}
