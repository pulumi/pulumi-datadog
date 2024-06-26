// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpack;
import com.pulumi.datadog.outputs.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternally;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetPowerpackDefinitionTemplateVariables {
    /**
     * @return Template variables controlled at the powerpack level.
     * 
     */
    private @Nullable List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpack> controlledByPowerpacks;
    /**
     * @return Template variables controlled by the external resource, such as the dashboard this powerpack is on.
     * 
     */
    private @Nullable List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternally> controlledExternallies;

    private DashboardWidgetPowerpackDefinitionTemplateVariables() {}
    /**
     * @return Template variables controlled at the powerpack level.
     * 
     */
    public List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpack> controlledByPowerpacks() {
        return this.controlledByPowerpacks == null ? List.of() : this.controlledByPowerpacks;
    }
    /**
     * @return Template variables controlled by the external resource, such as the dashboard this powerpack is on.
     * 
     */
    public List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternally> controlledExternallies() {
        return this.controlledExternallies == null ? List.of() : this.controlledExternallies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetPowerpackDefinitionTemplateVariables defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpack> controlledByPowerpacks;
        private @Nullable List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternally> controlledExternallies;
        public Builder() {}
        public Builder(DashboardWidgetPowerpackDefinitionTemplateVariables defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlledByPowerpacks = defaults.controlledByPowerpacks;
    	      this.controlledExternallies = defaults.controlledExternallies;
        }

        @CustomType.Setter
        public Builder controlledByPowerpacks(@Nullable List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpack> controlledByPowerpacks) {

            this.controlledByPowerpacks = controlledByPowerpacks;
            return this;
        }
        public Builder controlledByPowerpacks(DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpack... controlledByPowerpacks) {
            return controlledByPowerpacks(List.of(controlledByPowerpacks));
        }
        @CustomType.Setter
        public Builder controlledExternallies(@Nullable List<DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternally> controlledExternallies) {

            this.controlledExternallies = controlledExternallies;
            return this;
        }
        public Builder controlledExternallies(DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternally... controlledExternallies) {
            return controlledExternallies(List.of(controlledExternallies));
        }
        public DashboardWidgetPowerpackDefinitionTemplateVariables build() {
            final var _resultValue = new DashboardWidgetPowerpackDefinitionTemplateVariables();
            _resultValue.controlledByPowerpacks = controlledByPowerpacks;
            _resultValue.controlledExternallies = controlledExternallies;
            return _resultValue;
        }
    }
}
