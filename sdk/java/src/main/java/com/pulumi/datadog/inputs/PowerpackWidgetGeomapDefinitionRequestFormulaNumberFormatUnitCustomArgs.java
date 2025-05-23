// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs Empty = new PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs();

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

    private PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs() {}

    private PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs(PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs $) {
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs $;

        public Builder() {
            $ = new PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs();
        }

        public Builder(PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs defaults) {
            $ = new PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs(Objects.requireNonNull(defaults));
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

        public PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetGeomapDefinitionRequestFormulaNumberFormatUnitCustomArgs", "label");
            }
            return $;
        }
    }

}
