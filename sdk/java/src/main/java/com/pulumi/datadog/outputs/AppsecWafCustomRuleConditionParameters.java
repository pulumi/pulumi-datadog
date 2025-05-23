// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.AppsecWafCustomRuleConditionParametersInput;
import com.pulumi.datadog.outputs.AppsecWafCustomRuleConditionParametersOptions;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppsecWafCustomRuleConditionParameters {
    /**
     * @return Identifier of a list of data from the denylist. Can only be used as substitution from the list parameter.
     * 
     */
    private @Nullable String data;
    private @Nullable List<AppsecWafCustomRuleConditionParametersInput> inputs;
    /**
     * @return List of value to use with the condition. Only used with the phrase*match, !phrase*match, exact*match and !exact*match operator.
     * 
     */
    private @Nullable List<String> lists;
    private @Nullable AppsecWafCustomRuleConditionParametersOptions options;
    /**
     * @return Regex to use with the condition. Only used with match*regex and !match*regex operator.
     * 
     */
    private @Nullable String regex;
    /**
     * @return Store the captured value in the specified tag name. Only used with the capture_data operator.
     * 
     */
    private @Nullable String value;

    private AppsecWafCustomRuleConditionParameters() {}
    /**
     * @return Identifier of a list of data from the denylist. Can only be used as substitution from the list parameter.
     * 
     */
    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    public List<AppsecWafCustomRuleConditionParametersInput> inputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    /**
     * @return List of value to use with the condition. Only used with the phrase*match, !phrase*match, exact*match and !exact*match operator.
     * 
     */
    public List<String> lists() {
        return this.lists == null ? List.of() : this.lists;
    }
    public Optional<AppsecWafCustomRuleConditionParametersOptions> options() {
        return Optional.ofNullable(this.options);
    }
    /**
     * @return Regex to use with the condition. Only used with match*regex and !match*regex operator.
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * @return Store the captured value in the specified tag name. Only used with the capture_data operator.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppsecWafCustomRuleConditionParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String data;
        private @Nullable List<AppsecWafCustomRuleConditionParametersInput> inputs;
        private @Nullable List<String> lists;
        private @Nullable AppsecWafCustomRuleConditionParametersOptions options;
        private @Nullable String regex;
        private @Nullable String value;
        public Builder() {}
        public Builder(AppsecWafCustomRuleConditionParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.inputs = defaults.inputs;
    	      this.lists = defaults.lists;
    	      this.options = defaults.options;
    	      this.regex = defaults.regex;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder data(@Nullable String data) {

            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder inputs(@Nullable List<AppsecWafCustomRuleConditionParametersInput> inputs) {

            this.inputs = inputs;
            return this;
        }
        public Builder inputs(AppsecWafCustomRuleConditionParametersInput... inputs) {
            return inputs(List.of(inputs));
        }
        @CustomType.Setter
        public Builder lists(@Nullable List<String> lists) {

            this.lists = lists;
            return this;
        }
        public Builder lists(String... lists) {
            return lists(List.of(lists));
        }
        @CustomType.Setter
        public Builder options(@Nullable AppsecWafCustomRuleConditionParametersOptions options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder regex(@Nullable String regex) {

            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public AppsecWafCustomRuleConditionParameters build() {
            final var _resultValue = new AppsecWafCustomRuleConditionParameters();
            _resultValue.data = data;
            _resultValue.inputs = inputs;
            _resultValue.lists = lists;
            _resultValue.options = options;
            _resultValue.regex = regex;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
