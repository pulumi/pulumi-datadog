// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetTimeseriesDefinitionEvent {
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private String q;
    /**
     * @return The execution method for multi-value filters, options: `and` or `or`.
     * 
     */
    private @Nullable String tagsExecution;

    private PowerpackWidgetTimeseriesDefinitionEvent() {}
    /**
     * @return The metric query to use for this widget.
     * 
     */
    public String q() {
        return this.q;
    }
    /**
     * @return The execution method for multi-value filters, options: `and` or `or`.
     * 
     */
    public Optional<String> tagsExecution() {
        return Optional.ofNullable(this.tagsExecution);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetTimeseriesDefinitionEvent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String q;
        private @Nullable String tagsExecution;
        public Builder() {}
        public Builder(PowerpackWidgetTimeseriesDefinitionEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.q = defaults.q;
    	      this.tagsExecution = defaults.tagsExecution;
        }

        @CustomType.Setter
        public Builder q(String q) {
            if (q == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetTimeseriesDefinitionEvent", "q");
            }
            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder tagsExecution(@Nullable String tagsExecution) {

            this.tagsExecution = tagsExecution;
            return this;
        }
        public PowerpackWidgetTimeseriesDefinitionEvent build() {
            final var _resultValue = new PowerpackWidgetTimeseriesDefinitionEvent();
            _resultValue.q = q;
            _resultValue.tagsExecution = tagsExecution;
            return _resultValue;
        }
    }
}