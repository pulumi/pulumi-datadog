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
public final class SyntheticsTestMobileStepParamsVariable {
    /**
     * @return Example of the extracted variable. Defaults to `&#34;&#34;`.
     * 
     */
    private @Nullable String example;
    /**
     * @return Name of the extracted variable.
     * 
     */
    private String name;

    private SyntheticsTestMobileStepParamsVariable() {}
    /**
     * @return Example of the extracted variable. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<String> example() {
        return Optional.ofNullable(this.example);
    }
    /**
     * @return Name of the extracted variable.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestMobileStepParamsVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String example;
        private String name;
        public Builder() {}
        public Builder(SyntheticsTestMobileStepParamsVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.example = defaults.example;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder example(@Nullable String example) {

            this.example = example;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestMobileStepParamsVariable", "name");
            }
            this.name = name;
            return this;
        }
        public SyntheticsTestMobileStepParamsVariable build() {
            final var _resultValue = new SyntheticsTestMobileStepParamsVariable();
            _resultValue.example = example;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
