// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceObjectState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceObjectState Empty = new ServiceObjectState();

    /**
     * Your Service name associated service key in PagerDuty. Note: Since the Datadog API never returns service keys, it is
     * impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
     * to solve a drift is to manually mark the Service Object resource with [terraform
     * taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
     * 
     */
    @Import(name="serviceKey")
    private @Nullable Output<String> serviceKey;

    /**
     * @return Your Service name associated service key in PagerDuty. Note: Since the Datadog API never returns service keys, it is
     * impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
     * to solve a drift is to manually mark the Service Object resource with [terraform
     * taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
     * 
     */
    public Optional<Output<String>> serviceKey() {
        return Optional.ofNullable(this.serviceKey);
    }

    /**
     * Your Service name in PagerDuty.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Your Service name in PagerDuty.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private ServiceObjectState() {}

    private ServiceObjectState(ServiceObjectState $) {
        this.serviceKey = $.serviceKey;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceObjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceObjectState $;

        public Builder() {
            $ = new ServiceObjectState();
        }

        public Builder(ServiceObjectState defaults) {
            $ = new ServiceObjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceKey Your Service name associated service key in PagerDuty. Note: Since the Datadog API never returns service keys, it is
         * impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
         * to solve a drift is to manually mark the Service Object resource with [terraform
         * taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(@Nullable Output<String> serviceKey) {
            $.serviceKey = serviceKey;
            return this;
        }

        /**
         * @param serviceKey Your Service name associated service key in PagerDuty. Note: Since the Datadog API never returns service keys, it is
         * impossible to detect [drifts](https://www.hashicorp.com/blog/detecting-and-managing-drift-with-terraform). The best way
         * to solve a drift is to manually mark the Service Object resource with [terraform
         * taint](https://www.terraform.io/docs/commands/taint.html) to have it destroyed and recreated.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(String serviceKey) {
            return serviceKey(Output.of(serviceKey));
        }

        /**
         * @param serviceName Your Service name in PagerDuty.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Your Service name in PagerDuty.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServiceObjectState build() {
            return $;
        }
    }

}