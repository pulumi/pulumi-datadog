// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetTreemapDefinitionRequest;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetTreemapDefinition {
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    private @Nullable List<PowerpackWidgetTreemapDefinitionRequest> requests;
    /**
     * @return The title of the widget.
     * 
     */
    private @Nullable String title;

    private PowerpackWidgetTreemapDefinition() {}
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public List<PowerpackWidgetTreemapDefinitionRequest> requests() {
        return this.requests == null ? List.of() : this.requests;
    }
    /**
     * @return The title of the widget.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetTreemapDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PowerpackWidgetTreemapDefinitionRequest> requests;
        private @Nullable String title;
        public Builder() {}
        public Builder(PowerpackWidgetTreemapDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requests = defaults.requests;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder requests(@Nullable List<PowerpackWidgetTreemapDefinitionRequest> requests) {

            this.requests = requests;
            return this;
        }
        public Builder requests(PowerpackWidgetTreemapDefinitionRequest... requests) {
            return requests(List.of(requests));
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        public PowerpackWidgetTreemapDefinition build() {
            final var _resultValue = new PowerpackWidgetTreemapDefinition();
            _resultValue.requests = requests;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}