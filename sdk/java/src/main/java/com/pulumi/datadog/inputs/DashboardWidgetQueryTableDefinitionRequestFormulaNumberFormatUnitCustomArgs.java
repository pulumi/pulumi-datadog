// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs Empty = new DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs();

    /**
     * Unit label
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return Unit label
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    private DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs() {}

    private DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs(DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs $) {
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs $;

        public Builder() {
            $ = new DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs();
        }

        public Builder(DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs defaults) {
            $ = new DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label Unit label
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Unit label
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetQueryTableDefinitionRequestFormulaNumberFormatUnitCustomArgs", "label");
            }
            return $;
        }
    }

}
