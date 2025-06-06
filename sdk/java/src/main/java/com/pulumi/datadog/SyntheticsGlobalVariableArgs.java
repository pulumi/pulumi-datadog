// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SyntheticsGlobalVariableOptionsArgs;
import com.pulumi.datadog.inputs.SyntheticsGlobalVariableParseTestOptionsArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsGlobalVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsGlobalVariableArgs Empty = new SyntheticsGlobalVariableArgs();

    /**
     * Description of the global variable. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the global variable. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If set to true, the global variable is a FIDO variable. Defaults to `false`.
     * 
     */
    @Import(name="isFido")
    private @Nullable Output<Boolean> isFido;

    /**
     * @return If set to true, the global variable is a FIDO variable. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> isFido() {
        return Optional.ofNullable(this.isFido);
    }

    /**
     * If set to true, the global variable is a TOTP variable. Defaults to `false`.
     * 
     */
    @Import(name="isTotp")
    private @Nullable Output<Boolean> isTotp;

    /**
     * @return If set to true, the global variable is a TOTP variable. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> isTotp() {
        return Optional.ofNullable(this.isTotp);
    }

    /**
     * Synthetics global variable name. Must be all uppercase with underscores.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Synthetics global variable name. Must be all uppercase with underscores.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Additional options for the variable, such as a MFA token.
     * 
     */
    @Import(name="options")
    private @Nullable Output<SyntheticsGlobalVariableOptionsArgs> options;

    /**
     * @return Additional options for the variable, such as a MFA token.
     * 
     */
    public Optional<Output<SyntheticsGlobalVariableOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Id of the Synthetics test to use for a variable from test.
     * 
     */
    @Import(name="parseTestId")
    private @Nullable Output<String> parseTestId;

    /**
     * @return Id of the Synthetics test to use for a variable from test.
     * 
     */
    public Optional<Output<String>> parseTestId() {
        return Optional.ofNullable(this.parseTestId);
    }

    /**
     * ID of the Synthetics test to use a source of the global variable value.
     * 
     */
    @Import(name="parseTestOptions")
    private @Nullable Output<SyntheticsGlobalVariableParseTestOptionsArgs> parseTestOptions;

    /**
     * @return ID of the Synthetics test to use a source of the global variable value.
     * 
     */
    public Optional<Output<SyntheticsGlobalVariableParseTestOptionsArgs>> parseTestOptions() {
        return Optional.ofNullable(this.parseTestOptions);
    }

    /**
     * A list of role identifiers to associate with the Synthetics global variable. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     * @deprecated
     * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     */
    @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
    @Import(name="restrictedRoles")
    private @Nullable Output<List<String>> restrictedRoles;

    /**
     * @return A list of role identifiers to associate with the Synthetics global variable. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     * @deprecated
     * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
     * 
     */
    @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
    public Optional<Output<List<String>>> restrictedRoles() {
        return Optional.ofNullable(this.restrictedRoles);
    }

    /**
     * If set to true, the value of the global variable is hidden. This setting is automatically set to `true` if `is_totp` or `is_fido` is set to `true`. Defaults to `false`.
     * 
     */
    @Import(name="secure")
    private @Nullable Output<Boolean> secure;

    /**
     * @return If set to true, the value of the global variable is hidden. This setting is automatically set to `true` if `is_totp` or `is_fido` is set to `true`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> secure() {
        return Optional.ofNullable(this.secure);
    }

    /**
     * A list of tags to associate with your synthetics global variable.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags to associate with your synthetics global variable.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The value of the global variable. Required unless `is_fido` is set to `true`.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the global variable. Required unless `is_fido` is set to `true`.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SyntheticsGlobalVariableArgs() {}

    private SyntheticsGlobalVariableArgs(SyntheticsGlobalVariableArgs $) {
        this.description = $.description;
        this.isFido = $.isFido;
        this.isTotp = $.isTotp;
        this.name = $.name;
        this.options = $.options;
        this.parseTestId = $.parseTestId;
        this.parseTestOptions = $.parseTestOptions;
        this.restrictedRoles = $.restrictedRoles;
        this.secure = $.secure;
        this.tags = $.tags;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsGlobalVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsGlobalVariableArgs $;

        public Builder() {
            $ = new SyntheticsGlobalVariableArgs();
        }

        public Builder(SyntheticsGlobalVariableArgs defaults) {
            $ = new SyntheticsGlobalVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the global variable. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the global variable. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param isFido If set to true, the global variable is a FIDO variable. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isFido(@Nullable Output<Boolean> isFido) {
            $.isFido = isFido;
            return this;
        }

        /**
         * @param isFido If set to true, the global variable is a FIDO variable. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isFido(Boolean isFido) {
            return isFido(Output.of(isFido));
        }

        /**
         * @param isTotp If set to true, the global variable is a TOTP variable. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isTotp(@Nullable Output<Boolean> isTotp) {
            $.isTotp = isTotp;
            return this;
        }

        /**
         * @param isTotp If set to true, the global variable is a TOTP variable. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isTotp(Boolean isTotp) {
            return isTotp(Output.of(isTotp));
        }

        /**
         * @param name Synthetics global variable name. Must be all uppercase with underscores.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Synthetics global variable name. Must be all uppercase with underscores.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options Additional options for the variable, such as a MFA token.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<SyntheticsGlobalVariableOptionsArgs> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Additional options for the variable, such as a MFA token.
         * 
         * @return builder
         * 
         */
        public Builder options(SyntheticsGlobalVariableOptionsArgs options) {
            return options(Output.of(options));
        }

        /**
         * @param parseTestId Id of the Synthetics test to use for a variable from test.
         * 
         * @return builder
         * 
         */
        public Builder parseTestId(@Nullable Output<String> parseTestId) {
            $.parseTestId = parseTestId;
            return this;
        }

        /**
         * @param parseTestId Id of the Synthetics test to use for a variable from test.
         * 
         * @return builder
         * 
         */
        public Builder parseTestId(String parseTestId) {
            return parseTestId(Output.of(parseTestId));
        }

        /**
         * @param parseTestOptions ID of the Synthetics test to use a source of the global variable value.
         * 
         * @return builder
         * 
         */
        public Builder parseTestOptions(@Nullable Output<SyntheticsGlobalVariableParseTestOptionsArgs> parseTestOptions) {
            $.parseTestOptions = parseTestOptions;
            return this;
        }

        /**
         * @param parseTestOptions ID of the Synthetics test to use a source of the global variable value.
         * 
         * @return builder
         * 
         */
        public Builder parseTestOptions(SyntheticsGlobalVariableParseTestOptionsArgs parseTestOptions) {
            return parseTestOptions(Output.of(parseTestOptions));
        }

        /**
         * @param restrictedRoles A list of role identifiers to associate with the Synthetics global variable. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         */
        @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
        public Builder restrictedRoles(@Nullable Output<List<String>> restrictedRoles) {
            $.restrictedRoles = restrictedRoles;
            return this;
        }

        /**
         * @param restrictedRoles A list of role identifiers to associate with the Synthetics global variable. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         */
        @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
        public Builder restrictedRoles(List<String> restrictedRoles) {
            return restrictedRoles(Output.of(restrictedRoles));
        }

        /**
         * @param restrictedRoles A list of role identifiers to associate with the Synthetics global variable. **Deprecated.** This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead.
         * 
         */
        @Deprecated /* This field is no longer supported by the Datadog API. Please use `datadog.RestrictionPolicy` instead. */
        public Builder restrictedRoles(String... restrictedRoles) {
            return restrictedRoles(List.of(restrictedRoles));
        }

        /**
         * @param secure If set to true, the value of the global variable is hidden. This setting is automatically set to `true` if `is_totp` or `is_fido` is set to `true`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder secure(@Nullable Output<Boolean> secure) {
            $.secure = secure;
            return this;
        }

        /**
         * @param secure If set to true, the value of the global variable is hidden. This setting is automatically set to `true` if `is_totp` or `is_fido` is set to `true`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder secure(Boolean secure) {
            return secure(Output.of(secure));
        }

        /**
         * @param tags A list of tags to associate with your synthetics global variable.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to associate with your synthetics global variable.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to associate with your synthetics global variable.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param value The value of the global variable. Required unless `is_fido` is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the global variable. Required unless `is_fido` is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SyntheticsGlobalVariableArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("SyntheticsGlobalVariableArgs", "name");
            }
            return $;
        }
    }

}
