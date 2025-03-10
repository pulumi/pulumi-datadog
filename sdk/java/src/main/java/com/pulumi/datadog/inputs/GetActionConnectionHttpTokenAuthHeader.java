// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetActionConnectionHttpTokenAuthHeader extends com.pulumi.resources.InvokeArgs {

    public static final GetActionConnectionHttpTokenAuthHeader Empty = new GetActionConnectionHttpTokenAuthHeader();

    /**
     * Header name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Header name
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetActionConnectionHttpTokenAuthHeader() {}

    private GetActionConnectionHttpTokenAuthHeader(GetActionConnectionHttpTokenAuthHeader $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActionConnectionHttpTokenAuthHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActionConnectionHttpTokenAuthHeader $;

        public Builder() {
            $ = new GetActionConnectionHttpTokenAuthHeader();
        }

        public Builder(GetActionConnectionHttpTokenAuthHeader defaults) {
            $ = new GetActionConnectionHttpTokenAuthHeader(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Header name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetActionConnectionHttpTokenAuthHeader build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetActionConnectionHttpTokenAuthHeader", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetActionConnectionHttpTokenAuthHeader", "value");
            }
            return $;
        }
    }

}
