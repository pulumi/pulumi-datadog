// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetActionConnectionHttpTokenAuthToken extends com.pulumi.resources.InvokeArgs {

    public static final GetActionConnectionHttpTokenAuthToken Empty = new GetActionConnectionHttpTokenAuthToken();

    /**
     * Token name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Token name
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Token type
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Token type
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Token value
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Token value
     * 
     */
    public String value() {
        return this.value;
    }

    private GetActionConnectionHttpTokenAuthToken() {}

    private GetActionConnectionHttpTokenAuthToken(GetActionConnectionHttpTokenAuthToken $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActionConnectionHttpTokenAuthToken defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActionConnectionHttpTokenAuthToken $;

        public Builder() {
            $ = new GetActionConnectionHttpTokenAuthToken();
        }

        public Builder(GetActionConnectionHttpTokenAuthToken defaults) {
            $ = new GetActionConnectionHttpTokenAuthToken(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Token name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type Token type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param value Token value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetActionConnectionHttpTokenAuthToken build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetActionConnectionHttpTokenAuthToken", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetActionConnectionHttpTokenAuthToken", "type");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetActionConnectionHttpTokenAuthToken", "value");
            }
            return $;
        }
    }

}
