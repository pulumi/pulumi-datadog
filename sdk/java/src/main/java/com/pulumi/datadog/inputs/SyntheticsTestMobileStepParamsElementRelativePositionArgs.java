// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestMobileStepParamsElementRelativePositionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestMobileStepParamsElementRelativePositionArgs Empty = new SyntheticsTestMobileStepParamsElementRelativePositionArgs();

    @Import(name="x")
    private @Nullable Output<Double> x;

    public Optional<Output<Double>> x() {
        return Optional.ofNullable(this.x);
    }

    @Import(name="y")
    private @Nullable Output<Double> y;

    public Optional<Output<Double>> y() {
        return Optional.ofNullable(this.y);
    }

    private SyntheticsTestMobileStepParamsElementRelativePositionArgs() {}

    private SyntheticsTestMobileStepParamsElementRelativePositionArgs(SyntheticsTestMobileStepParamsElementRelativePositionArgs $) {
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestMobileStepParamsElementRelativePositionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestMobileStepParamsElementRelativePositionArgs $;

        public Builder() {
            $ = new SyntheticsTestMobileStepParamsElementRelativePositionArgs();
        }

        public Builder(SyntheticsTestMobileStepParamsElementRelativePositionArgs defaults) {
            $ = new SyntheticsTestMobileStepParamsElementRelativePositionArgs(Objects.requireNonNull(defaults));
        }

        public Builder x(@Nullable Output<Double> x) {
            $.x = x;
            return this;
        }

        public Builder x(Double x) {
            return x(Output.of(x));
        }

        public Builder y(@Nullable Output<Double> y) {
            $.y = y;
            return this;
        }

        public Builder y(Double y) {
            return y(Output.of(y));
        }

        public SyntheticsTestMobileStepParamsElementRelativePositionArgs build() {
            return $;
        }
    }

}