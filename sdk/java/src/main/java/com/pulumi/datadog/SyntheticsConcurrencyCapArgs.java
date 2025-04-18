// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class SyntheticsConcurrencyCapArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsConcurrencyCapArgs Empty = new SyntheticsConcurrencyCapArgs();

    /**
     * Value of the on-demand concurrency cap, customizing the number of Synthetic tests run in parallel. Value must be at least 1.
     * 
     */
    @Import(name="onDemandConcurrencyCap", required=true)
    private Output<Integer> onDemandConcurrencyCap;

    /**
     * @return Value of the on-demand concurrency cap, customizing the number of Synthetic tests run in parallel. Value must be at least 1.
     * 
     */
    public Output<Integer> onDemandConcurrencyCap() {
        return this.onDemandConcurrencyCap;
    }

    private SyntheticsConcurrencyCapArgs() {}

    private SyntheticsConcurrencyCapArgs(SyntheticsConcurrencyCapArgs $) {
        this.onDemandConcurrencyCap = $.onDemandConcurrencyCap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsConcurrencyCapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsConcurrencyCapArgs $;

        public Builder() {
            $ = new SyntheticsConcurrencyCapArgs();
        }

        public Builder(SyntheticsConcurrencyCapArgs defaults) {
            $ = new SyntheticsConcurrencyCapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onDemandConcurrencyCap Value of the on-demand concurrency cap, customizing the number of Synthetic tests run in parallel. Value must be at least 1.
         * 
         * @return builder
         * 
         */
        public Builder onDemandConcurrencyCap(Output<Integer> onDemandConcurrencyCap) {
            $.onDemandConcurrencyCap = onDemandConcurrencyCap;
            return this;
        }

        /**
         * @param onDemandConcurrencyCap Value of the on-demand concurrency cap, customizing the number of Synthetic tests run in parallel. Value must be at least 1.
         * 
         * @return builder
         * 
         */
        public Builder onDemandConcurrencyCap(Integer onDemandConcurrencyCap) {
            return onDemandConcurrencyCap(Output.of(onDemandConcurrencyCap));
        }

        public SyntheticsConcurrencyCapArgs build() {
            if ($.onDemandConcurrencyCap == null) {
                throw new MissingRequiredPropertyException("SyntheticsConcurrencyCapArgs", "onDemandConcurrencyCap");
            }
            return $;
        }
    }

}
