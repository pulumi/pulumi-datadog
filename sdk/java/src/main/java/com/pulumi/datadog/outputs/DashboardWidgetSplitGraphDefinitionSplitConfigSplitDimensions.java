// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions {
    /**
     * @return The system interprets this attribute differently depending on the data source of the query being split. For metrics, it&#39;s a tag. For the events platform, it&#39;s an attribute or tag.
     * 
     */
    private String oneGraphPer;

    private DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions() {}
    /**
     * @return The system interprets this attribute differently depending on the data source of the query being split. For metrics, it&#39;s a tag. For the events platform, it&#39;s an attribute or tag.
     * 
     */
    public String oneGraphPer() {
        return this.oneGraphPer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String oneGraphPer;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oneGraphPer = defaults.oneGraphPer;
        }

        @CustomType.Setter
        public Builder oneGraphPer(String oneGraphPer) {
            if (oneGraphPer == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions", "oneGraphPer");
            }
            this.oneGraphPer = oneGraphPer;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSplitConfigSplitDimensions();
            _resultValue.oneGraphPer = oneGraphPer;
            return _resultValue;
        }
    }
}