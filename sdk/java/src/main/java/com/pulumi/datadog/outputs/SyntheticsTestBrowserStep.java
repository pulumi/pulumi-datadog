// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.SyntheticsTestBrowserStepParams;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestBrowserStep {
    /**
     * @return Determines if the step should be allowed to fail.
     * 
     */
    private @Nullable Boolean allowFailure;
    /**
     * @return Determines whether or not to always execute this step even if the previous step failed or was skipped.
     * 
     */
    private @Nullable Boolean alwaysExecute;
    /**
     * @return Determines whether or not to exit the test if the step succeeds.
     * 
     */
    private @Nullable Boolean exitIfSucceed;
    /**
     * @return Force update of the &#34;element&#34; parameter for the step
     * 
     */
    private @Nullable Boolean forceElementUpdate;
    /**
     * @return Determines whether or not to consider the entire test as failed if this step fails. Can be used only if `allow_failure` is `true`.
     * 
     */
    private @Nullable Boolean isCritical;
    /**
     * @return A unique identifier used to track steps after reordering.
     * 
     */
    private @Nullable String localKey;
    /**
     * @return Name of the step.
     * 
     */
    private String name;
    /**
     * @return Prevents saving screenshots of the step.
     * 
     */
    private @Nullable Boolean noScreenshot;
    /**
     * @return Parameters for the step.
     * 
     */
    private SyntheticsTestBrowserStepParams params;
    /**
     * @return The identifier of the step on the backend.
     * 
     */
    private @Nullable String publicId;
    /**
     * @return Used to override the default timeout of a step.
     * 
     */
    private @Nullable Integer timeout;
    /**
     * @return Type of the step. Valid values are `assertCurrentUrl`, `assertElementAttribute`, `assertElementContent`, `assertElementPresent`, `assertEmail`, `assertFileDownload`, `assertFromJavascript`, `assertPageContains`, `assertPageLacks`, `assertRequests`, `click`, `extractFromJavascript`, `extractFromEmailBody`, `extractVariable`, `goToEmailLink`, `goToUrl`, `goToUrlAndMeasureTti`, `hover`, `playSubTest`, `pressKey`, `refresh`, `runApiTest`, `scroll`, `selectOption`, `typeText`, `uploadFiles`, `wait`.
     * 
     */
    private String type;

    private SyntheticsTestBrowserStep() {}
    /**
     * @return Determines if the step should be allowed to fail.
     * 
     */
    public Optional<Boolean> allowFailure() {
        return Optional.ofNullable(this.allowFailure);
    }
    /**
     * @return Determines whether or not to always execute this step even if the previous step failed or was skipped.
     * 
     */
    public Optional<Boolean> alwaysExecute() {
        return Optional.ofNullable(this.alwaysExecute);
    }
    /**
     * @return Determines whether or not to exit the test if the step succeeds.
     * 
     */
    public Optional<Boolean> exitIfSucceed() {
        return Optional.ofNullable(this.exitIfSucceed);
    }
    /**
     * @return Force update of the &#34;element&#34; parameter for the step
     * 
     */
    public Optional<Boolean> forceElementUpdate() {
        return Optional.ofNullable(this.forceElementUpdate);
    }
    /**
     * @return Determines whether or not to consider the entire test as failed if this step fails. Can be used only if `allow_failure` is `true`.
     * 
     */
    public Optional<Boolean> isCritical() {
        return Optional.ofNullable(this.isCritical);
    }
    /**
     * @return A unique identifier used to track steps after reordering.
     * 
     */
    public Optional<String> localKey() {
        return Optional.ofNullable(this.localKey);
    }
    /**
     * @return Name of the step.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Prevents saving screenshots of the step.
     * 
     */
    public Optional<Boolean> noScreenshot() {
        return Optional.ofNullable(this.noScreenshot);
    }
    /**
     * @return Parameters for the step.
     * 
     */
    public SyntheticsTestBrowserStepParams params() {
        return this.params;
    }
    /**
     * @return The identifier of the step on the backend.
     * 
     */
    public Optional<String> publicId() {
        return Optional.ofNullable(this.publicId);
    }
    /**
     * @return Used to override the default timeout of a step.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return Type of the step. Valid values are `assertCurrentUrl`, `assertElementAttribute`, `assertElementContent`, `assertElementPresent`, `assertEmail`, `assertFileDownload`, `assertFromJavascript`, `assertPageContains`, `assertPageLacks`, `assertRequests`, `click`, `extractFromJavascript`, `extractFromEmailBody`, `extractVariable`, `goToEmailLink`, `goToUrl`, `goToUrlAndMeasureTti`, `hover`, `playSubTest`, `pressKey`, `refresh`, `runApiTest`, `scroll`, `selectOption`, `typeText`, `uploadFiles`, `wait`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestBrowserStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowFailure;
        private @Nullable Boolean alwaysExecute;
        private @Nullable Boolean exitIfSucceed;
        private @Nullable Boolean forceElementUpdate;
        private @Nullable Boolean isCritical;
        private @Nullable String localKey;
        private String name;
        private @Nullable Boolean noScreenshot;
        private SyntheticsTestBrowserStepParams params;
        private @Nullable String publicId;
        private @Nullable Integer timeout;
        private String type;
        public Builder() {}
        public Builder(SyntheticsTestBrowserStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowFailure = defaults.allowFailure;
    	      this.alwaysExecute = defaults.alwaysExecute;
    	      this.exitIfSucceed = defaults.exitIfSucceed;
    	      this.forceElementUpdate = defaults.forceElementUpdate;
    	      this.isCritical = defaults.isCritical;
    	      this.localKey = defaults.localKey;
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
        public Builder alwaysExecute(@Nullable Boolean alwaysExecute) {

            this.alwaysExecute = alwaysExecute;
            return this;
        }
        @CustomType.Setter
        public Builder exitIfSucceed(@Nullable Boolean exitIfSucceed) {

            this.exitIfSucceed = exitIfSucceed;
            return this;
        }
        @CustomType.Setter
        public Builder forceElementUpdate(@Nullable Boolean forceElementUpdate) {

            this.forceElementUpdate = forceElementUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder isCritical(@Nullable Boolean isCritical) {

            this.isCritical = isCritical;
            return this;
        }
        @CustomType.Setter
        public Builder localKey(@Nullable String localKey) {

            this.localKey = localKey;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestBrowserStep", "name");
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
        public Builder params(SyntheticsTestBrowserStepParams params) {
            if (params == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestBrowserStep", "params");
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
              throw new MissingRequiredPropertyException("SyntheticsTestBrowserStep", "type");
            }
            this.type = type;
            return this;
        }
        public SyntheticsTestBrowserStep build() {
            final var _resultValue = new SyntheticsTestBrowserStep();
            _resultValue.allowFailure = allowFailure;
            _resultValue.alwaysExecute = alwaysExecute;
            _resultValue.exitIfSucceed = exitIfSucceed;
            _resultValue.forceElementUpdate = forceElementUpdate;
            _resultValue.isCritical = isCritical;
            _resultValue.localKey = localKey;
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
