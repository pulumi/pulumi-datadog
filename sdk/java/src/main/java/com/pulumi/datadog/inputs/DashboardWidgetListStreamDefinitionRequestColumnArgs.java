// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetListStreamDefinitionRequestColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetListStreamDefinitionRequestColumnArgs Empty = new DashboardWidgetListStreamDefinitionRequestColumnArgs();

    /**
     * Widget column field.
     * 
     */
    @Import(name="field", required=true)
    private Output<String> field;

    /**
     * @return Widget column field.
     * 
     */
    public Output<String> field() {
        return this.field;
    }

    /**
     * Widget column width. Valid values are `auto`, `compact`, `full`.
     * 
     */
    @Import(name="width", required=true)
    private Output<String> width;

    /**
     * @return Widget column width. Valid values are `auto`, `compact`, `full`.
     * 
     */
    public Output<String> width() {
        return this.width;
    }

    private DashboardWidgetListStreamDefinitionRequestColumnArgs() {}

    private DashboardWidgetListStreamDefinitionRequestColumnArgs(DashboardWidgetListStreamDefinitionRequestColumnArgs $) {
        this.field = $.field;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetListStreamDefinitionRequestColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetListStreamDefinitionRequestColumnArgs $;

        public Builder() {
            $ = new DashboardWidgetListStreamDefinitionRequestColumnArgs();
        }

        public Builder(DashboardWidgetListStreamDefinitionRequestColumnArgs defaults) {
            $ = new DashboardWidgetListStreamDefinitionRequestColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param field Widget column field.
         * 
         * @return builder
         * 
         */
        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Widget column field.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param width Widget column width. Valid values are `auto`, `compact`, `full`.
         * 
         * @return builder
         * 
         */
        public Builder width(Output<String> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width Widget column width. Valid values are `auto`, `compact`, `full`.
         * 
         * @return builder
         * 
         */
        public Builder width(String width) {
            return width(Output.of(width));
        }

        public DashboardWidgetListStreamDefinitionRequestColumnArgs build() {
            if ($.field == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetListStreamDefinitionRequestColumnArgs", "field");
            }
            if ($.width == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetListStreamDefinitionRequestColumnArgs", "width");
            }
            return $;
        }
    }

}
