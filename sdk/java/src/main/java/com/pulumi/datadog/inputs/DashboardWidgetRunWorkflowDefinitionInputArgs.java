// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetRunWorkflowDefinitionInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetRunWorkflowDefinitionInputArgs Empty = new DashboardWidgetRunWorkflowDefinitionInputArgs();

    /**
     * Name of the workflow input.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the workflow input.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Dashboard template variable. Can be suffixed with `.value` or `.key`.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Dashboard template variable. Can be suffixed with `.value` or `.key`.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DashboardWidgetRunWorkflowDefinitionInputArgs() {}

    private DashboardWidgetRunWorkflowDefinitionInputArgs(DashboardWidgetRunWorkflowDefinitionInputArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetRunWorkflowDefinitionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetRunWorkflowDefinitionInputArgs $;

        public Builder() {
            $ = new DashboardWidgetRunWorkflowDefinitionInputArgs();
        }

        public Builder(DashboardWidgetRunWorkflowDefinitionInputArgs defaults) {
            $ = new DashboardWidgetRunWorkflowDefinitionInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the workflow input.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the workflow input.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Dashboard template variable. Can be suffixed with `.value` or `.key`.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Dashboard template variable. Can be suffixed with `.value` or `.key`.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DashboardWidgetRunWorkflowDefinitionInputArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetRunWorkflowDefinitionInputArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetRunWorkflowDefinitionInputArgs", "value");
            }
            return $;
        }
    }

}