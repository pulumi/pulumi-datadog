// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ApplicationKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationKeyArgs Empty = new ApplicationKeyArgs();

    /**
     * Name for Application Key.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name for Application Key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ApplicationKeyArgs() {}

    private ApplicationKeyArgs(ApplicationKeyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationKeyArgs $;

        public Builder() {
            $ = new ApplicationKeyArgs();
        }

        public Builder(ApplicationKeyArgs defaults) {
            $ = new ApplicationKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name for Application Key.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for Application Key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApplicationKeyArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ApplicationKeyArgs", "name");
            }
            return $;
        }
    }

}
