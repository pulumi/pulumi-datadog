// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SyntheticsTestMobileStepParamsElementArgs;
import com.pulumi.datadog.inputs.SyntheticsTestMobileStepParamsPositionArgs;
import com.pulumi.datadog.inputs.SyntheticsTestMobileStepParamsVariableArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestMobileStepParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestMobileStepParamsArgs Empty = new SyntheticsTestMobileStepParamsArgs();

    /**
     * Check type to use for an assertion step. Valid values are `equals`, `notEquals`, `contains`, `notContains`, `startsWith`, `notStartsWith`, `greater`, `lower`, `greaterEquals`, `lowerEquals`, `matchRegex`, `between`, `isEmpty`, `notIsEmpty`.
     * 
     */
    @Import(name="check")
    private @Nullable Output<String> check;

    /**
     * @return Check type to use for an assertion step. Valid values are `equals`, `notEquals`, `contains`, `notContains`, `startsWith`, `notStartsWith`, `greater`, `lower`, `greaterEquals`, `lowerEquals`, `matchRegex`, `between`, `isEmpty`, `notIsEmpty`.
     * 
     */
    public Optional<Output<String>> check() {
        return Optional.ofNullable(this.check);
    }

    /**
     * Delay between each key stroke for a &#34;type test&#34; step.
     * 
     */
    @Import(name="delay")
    private @Nullable Output<Integer> delay;

    /**
     * @return Delay between each key stroke for a &#34;type test&#34; step.
     * 
     */
    public Optional<Output<Integer>> delay() {
        return Optional.ofNullable(this.delay);
    }

    /**
     * Valid values are `up`, `down`, `left`, `right`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Valid values are `up`, `down`, `left`, `right`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Element to use for the step, JSON encoded string.
     * 
     */
    @Import(name="element")
    private @Nullable Output<SyntheticsTestMobileStepParamsElementArgs> element;

    /**
     * @return Element to use for the step, JSON encoded string.
     * 
     */
    public Optional<Output<SyntheticsTestMobileStepParamsElementArgs>> element() {
        return Optional.ofNullable(this.element);
    }

    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    @Import(name="maxScrolls")
    private @Nullable Output<Integer> maxScrolls;

    public Optional<Output<Integer>> maxScrolls() {
        return Optional.ofNullable(this.maxScrolls);
    }

    @Import(name="positions")
    private @Nullable Output<List<SyntheticsTestMobileStepParamsPositionArgs>> positions;

    public Optional<Output<List<SyntheticsTestMobileStepParamsPositionArgs>>> positions() {
        return Optional.ofNullable(this.positions);
    }

    /**
     * ID of the Synthetics test to use as subtest.
     * 
     */
    @Import(name="subtestPublicId")
    private @Nullable Output<String> subtestPublicId;

    /**
     * @return ID of the Synthetics test to use as subtest.
     * 
     */
    public Optional<Output<String>> subtestPublicId() {
        return Optional.ofNullable(this.subtestPublicId);
    }

    /**
     * Value of the step.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the step.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Details of the variable to extract.
     * 
     */
    @Import(name="variable")
    private @Nullable Output<SyntheticsTestMobileStepParamsVariableArgs> variable;

    /**
     * @return Details of the variable to extract.
     * 
     */
    public Optional<Output<SyntheticsTestMobileStepParamsVariableArgs>> variable() {
        return Optional.ofNullable(this.variable);
    }

    @Import(name="withEnter")
    private @Nullable Output<Boolean> withEnter;

    public Optional<Output<Boolean>> withEnter() {
        return Optional.ofNullable(this.withEnter);
    }

    /**
     * X coordinates for a &#34;scroll step&#34;.
     * 
     */
    @Import(name="x")
    private @Nullable Output<Double> x;

    /**
     * @return X coordinates for a &#34;scroll step&#34;.
     * 
     */
    public Optional<Output<Double>> x() {
        return Optional.ofNullable(this.x);
    }

    /**
     * Y coordinates for a &#34;scroll step&#34;.
     * 
     */
    @Import(name="y")
    private @Nullable Output<Double> y;

    /**
     * @return Y coordinates for a &#34;scroll step&#34;.
     * 
     */
    public Optional<Output<Double>> y() {
        return Optional.ofNullable(this.y);
    }

    private SyntheticsTestMobileStepParamsArgs() {}

    private SyntheticsTestMobileStepParamsArgs(SyntheticsTestMobileStepParamsArgs $) {
        this.check = $.check;
        this.delay = $.delay;
        this.direction = $.direction;
        this.element = $.element;
        this.enable = $.enable;
        this.maxScrolls = $.maxScrolls;
        this.positions = $.positions;
        this.subtestPublicId = $.subtestPublicId;
        this.value = $.value;
        this.variable = $.variable;
        this.withEnter = $.withEnter;
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestMobileStepParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestMobileStepParamsArgs $;

        public Builder() {
            $ = new SyntheticsTestMobileStepParamsArgs();
        }

        public Builder(SyntheticsTestMobileStepParamsArgs defaults) {
            $ = new SyntheticsTestMobileStepParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param check Check type to use for an assertion step. Valid values are `equals`, `notEquals`, `contains`, `notContains`, `startsWith`, `notStartsWith`, `greater`, `lower`, `greaterEquals`, `lowerEquals`, `matchRegex`, `between`, `isEmpty`, `notIsEmpty`.
         * 
         * @return builder
         * 
         */
        public Builder check(@Nullable Output<String> check) {
            $.check = check;
            return this;
        }

        /**
         * @param check Check type to use for an assertion step. Valid values are `equals`, `notEquals`, `contains`, `notContains`, `startsWith`, `notStartsWith`, `greater`, `lower`, `greaterEquals`, `lowerEquals`, `matchRegex`, `between`, `isEmpty`, `notIsEmpty`.
         * 
         * @return builder
         * 
         */
        public Builder check(String check) {
            return check(Output.of(check));
        }

        /**
         * @param delay Delay between each key stroke for a &#34;type test&#34; step.
         * 
         * @return builder
         * 
         */
        public Builder delay(@Nullable Output<Integer> delay) {
            $.delay = delay;
            return this;
        }

        /**
         * @param delay Delay between each key stroke for a &#34;type test&#34; step.
         * 
         * @return builder
         * 
         */
        public Builder delay(Integer delay) {
            return delay(Output.of(delay));
        }

        /**
         * @param direction Valid values are `up`, `down`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Valid values are `up`, `down`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param element Element to use for the step, JSON encoded string.
         * 
         * @return builder
         * 
         */
        public Builder element(@Nullable Output<SyntheticsTestMobileStepParamsElementArgs> element) {
            $.element = element;
            return this;
        }

        /**
         * @param element Element to use for the step, JSON encoded string.
         * 
         * @return builder
         * 
         */
        public Builder element(SyntheticsTestMobileStepParamsElementArgs element) {
            return element(Output.of(element));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder maxScrolls(@Nullable Output<Integer> maxScrolls) {
            $.maxScrolls = maxScrolls;
            return this;
        }

        public Builder maxScrolls(Integer maxScrolls) {
            return maxScrolls(Output.of(maxScrolls));
        }

        public Builder positions(@Nullable Output<List<SyntheticsTestMobileStepParamsPositionArgs>> positions) {
            $.positions = positions;
            return this;
        }

        public Builder positions(List<SyntheticsTestMobileStepParamsPositionArgs> positions) {
            return positions(Output.of(positions));
        }

        public Builder positions(SyntheticsTestMobileStepParamsPositionArgs... positions) {
            return positions(List.of(positions));
        }

        /**
         * @param subtestPublicId ID of the Synthetics test to use as subtest.
         * 
         * @return builder
         * 
         */
        public Builder subtestPublicId(@Nullable Output<String> subtestPublicId) {
            $.subtestPublicId = subtestPublicId;
            return this;
        }

        /**
         * @param subtestPublicId ID of the Synthetics test to use as subtest.
         * 
         * @return builder
         * 
         */
        public Builder subtestPublicId(String subtestPublicId) {
            return subtestPublicId(Output.of(subtestPublicId));
        }

        /**
         * @param value Value of the step.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the step.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param variable Details of the variable to extract.
         * 
         * @return builder
         * 
         */
        public Builder variable(@Nullable Output<SyntheticsTestMobileStepParamsVariableArgs> variable) {
            $.variable = variable;
            return this;
        }

        /**
         * @param variable Details of the variable to extract.
         * 
         * @return builder
         * 
         */
        public Builder variable(SyntheticsTestMobileStepParamsVariableArgs variable) {
            return variable(Output.of(variable));
        }

        public Builder withEnter(@Nullable Output<Boolean> withEnter) {
            $.withEnter = withEnter;
            return this;
        }

        public Builder withEnter(Boolean withEnter) {
            return withEnter(Output.of(withEnter));
        }

        /**
         * @param x X coordinates for a &#34;scroll step&#34;.
         * 
         * @return builder
         * 
         */
        public Builder x(@Nullable Output<Double> x) {
            $.x = x;
            return this;
        }

        /**
         * @param x X coordinates for a &#34;scroll step&#34;.
         * 
         * @return builder
         * 
         */
        public Builder x(Double x) {
            return x(Output.of(x));
        }

        /**
         * @param y Y coordinates for a &#34;scroll step&#34;.
         * 
         * @return builder
         * 
         */
        public Builder y(@Nullable Output<Double> y) {
            $.y = y;
            return this;
        }

        /**
         * @param y Y coordinates for a &#34;scroll step&#34;.
         * 
         * @return builder
         * 
         */
        public Builder y(Double y) {
            return y(Output.of(y));
        }

        public SyntheticsTestMobileStepParamsArgs build() {
            return $;
        }
    }

}