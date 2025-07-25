// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedact {
    /**
     * @return Number of characters to keep.
     * 
     */
    private @Nullable Integer characters;
    /**
     * @return Direction from which to keep characters: `first` or `last`.
     * 
     */
    private @Nullable String direction;

    private ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedact() {}
    /**
     * @return Number of characters to keep.
     * 
     */
    public Optional<Integer> characters() {
        return Optional.ofNullable(this.characters);
    }
    /**
     * @return Direction from which to keep characters: `first` or `last`.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedact defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer characters;
        private @Nullable String direction;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characters = defaults.characters;
    	      this.direction = defaults.direction;
        }

        @CustomType.Setter
        public Builder characters(@Nullable Integer characters) {

            this.characters = characters;
            return this;
        }
        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        public ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedact build() {
            final var _resultValue = new ObservabilityPipelineConfigProcessorsSensitiveDataScannerRuleOnMatchPartialRedact();
            _resultValue.characters = characters;
            _resultValue.direction = direction;
            return _resultValue;
        }
    }
}
