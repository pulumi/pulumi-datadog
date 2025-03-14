// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetActionConnectionHttpTokenAuthUrlParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetActionConnectionHttpTokenAuthUrlParameterArgs Empty = new GetActionConnectionHttpTokenAuthUrlParameterArgs();

    /**
     * URL parameter name
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return URL parameter name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * URL parameter value
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return URL parameter value
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private GetActionConnectionHttpTokenAuthUrlParameterArgs() {}

    private GetActionConnectionHttpTokenAuthUrlParameterArgs(GetActionConnectionHttpTokenAuthUrlParameterArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActionConnectionHttpTokenAuthUrlParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActionConnectionHttpTokenAuthUrlParameterArgs $;

        public Builder() {
            $ = new GetActionConnectionHttpTokenAuthUrlParameterArgs();
        }

        public Builder(GetActionConnectionHttpTokenAuthUrlParameterArgs defaults) {
            $ = new GetActionConnectionHttpTokenAuthUrlParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name URL parameter name
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name URL parameter name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value URL parameter value
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value URL parameter value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetActionConnectionHttpTokenAuthUrlParameterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetActionConnectionHttpTokenAuthUrlParameterArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetActionConnectionHttpTokenAuthUrlParameterArgs", "value");
            }
            return $;
        }
    }

}
