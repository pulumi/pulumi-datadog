// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestMobileStepParamsPositionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestMobileStepParamsPositionArgs Empty = new SyntheticsTestMobileStepParamsPositionArgs();

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

    private SyntheticsTestMobileStepParamsPositionArgs() {}

    private SyntheticsTestMobileStepParamsPositionArgs(SyntheticsTestMobileStepParamsPositionArgs $) {
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestMobileStepParamsPositionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestMobileStepParamsPositionArgs $;

        public Builder() {
            $ = new SyntheticsTestMobileStepParamsPositionArgs();
        }

        public Builder(SyntheticsTestMobileStepParamsPositionArgs defaults) {
            $ = new SyntheticsTestMobileStepParamsPositionArgs(Objects.requireNonNull(defaults));
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

        public SyntheticsTestMobileStepParamsPositionArgs build() {
            return $;
        }
    }

}