// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.SyntheticsTestMobileStepParams;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestMobileStep {
    /**
     * @return A boolean set to allow this step to fail.
     * 
     */
    private @Nullable Boolean allowFailure;
    /**
     * @return A boolean set to determine if the step has a new step element.
     * 
     */
    private @Nullable Boolean hasNewStepElement;
    /**
     * @return A boolean to use in addition to `allowFailure` to determine if the test should be marked as failed when the step fails.
     * 
     */
    private @Nullable Boolean isCritical;
    /**
     * @return The name of the step.
     * 
     */
    private String name;
    /**
     * @return A boolean set to not take a screenshot for the step.
     * 
     */
    private @Nullable Boolean noScreenshot;
    /**
     * @return Parameters for the step.
     * 
     */
    private SyntheticsTestMobileStepParams params;
    /**
     * @return The public ID of the step.
     * 
     */
    private @Nullable String publicId;
    /**
     * @return The time before declaring a step failed.
     * 
     */
    private @Nullable Integer timeout;
    /**
     * @return The type of the step. Valid values are `assertElementContent`, `assertScreenContains`, `assertScreenLacks`, `doubleTap`, `extractVariable`, `flick`, `openDeeplink`, `playSubTest`, `pressBack`, `restartApplication`, `rotate`, `scroll`, `scrollToElement`, `tap`, `toggleWiFi`, `typeText`, `wait`.
     * 
     */
    private String type;

    private SyntheticsTestMobileStep() {}
    /**
     * @return A boolean set to allow this step to fail.
     * 
     */
    public Optional<Boolean> allowFailure() {
        return Optional.ofNullable(this.allowFailure);
    }
    /**
     * @return A boolean set to determine if the step has a new step element.
     * 
     */
    public Optional<Boolean> hasNewStepElement() {
        return Optional.ofNullable(this.hasNewStepElement);
    }
    /**
     * @return A boolean to use in addition to `allowFailure` to determine if the test should be marked as failed when the step fails.
     * 
     */
    public Optional<Boolean> isCritical() {
        return Optional.ofNullable(this.isCritical);
    }
    /**
     * @return The name of the step.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A boolean set to not take a screenshot for the step.
     * 
     */
    public Optional<Boolean> noScreenshot() {
        return Optional.ofNullable(this.noScreenshot);
    }
    /**
     * @return Parameters for the step.
     * 
     */
    public SyntheticsTestMobileStepParams params() {
        return this.params;
    }
    /**
     * @return The public ID of the step.
     * 
     */
    public Optional<String> publicId() {
        return Optional.ofNullable(this.publicId);
    }
    /**
     * @return The time before declaring a step failed.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return The type of the step. Valid values are `assertElementContent`, `assertScreenContains`, `assertScreenLacks`, `doubleTap`, `extractVariable`, `flick`, `openDeeplink`, `playSubTest`, `pressBack`, `restartApplication`, `rotate`, `scroll`, `scrollToElement`, `tap`, `toggleWiFi`, `typeText`, `wait`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestMobileStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowFailure;
        private @Nullable Boolean hasNewStepElement;
        private @Nullable Boolean isCritical;
        private String name;
        private @Nullable Boolean noScreenshot;
        private SyntheticsTestMobileStepParams params;
        private @Nullable String publicId;
        private @Nullable Integer timeout;
        private String type;
        public Builder() {}
        public Builder(SyntheticsTestMobileStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowFailure = defaults.allowFailure;
    	      this.hasNewStepElement = defaults.hasNewStepElement;
    	      this.isCritical = defaults.isCritical;
    	      this.name = defaults.name;
    	      this.noScreenshot = defaults.noScreenshot;
    	      this.params = defaults.params;
    	      this.publicId = defaults.publicId;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder allowFailure(@Nullable Boolean allowFailure) {

            this.allowFailure = allowFailure;
            return this;
        }
        @CustomType.Setter
        public Builder hasNewStepElement(@Nullable Boolean hasNewStepElement) {

            this.hasNewStepElement = hasNewStepElement;
            return this;
        }
        @CustomType.Setter
        public Builder isCritical(@Nullable Boolean isCritical) {

            this.isCritical = isCritical;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestMobileStep", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder noScreenshot(@Nullable Boolean noScreenshot) {

            this.noScreenshot = noScreenshot;
            return this;
        }
        @CustomType.Setter
        public Builder params(SyntheticsTestMobileStepParams params) {
            if (params == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestMobileStep", "params");
            }
            this.params = params;
            return this;
        }
        @CustomType.Setter
        public Builder publicId(@Nullable String publicId) {

            this.publicId = publicId;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestMobileStep", "type");
            }
            this.type = type;
            return this;
        }
        public SyntheticsTestMobileStep build() {
            final var _resultValue = new SyntheticsTestMobileStep();
            _resultValue.allowFailure = allowFailure;
            _resultValue.hasNewStepElement = hasNewStepElement;
            _resultValue.isCritical = isCritical;
            _resultValue.name = name;
            _resultValue.noScreenshot = noScreenshot;
            _resultValue.params = params;
            _resultValue.publicId = publicId;
            _resultValue.timeout = timeout;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}