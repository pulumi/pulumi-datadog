// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetHostmapDefinitionRequestFill;
import com.pulumi.datadog.outputs.DashboardWidgetHostmapDefinitionRequestSize;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetHostmapDefinitionRequest {
    /**
     * @return The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    private @Nullable List<DashboardWidgetHostmapDefinitionRequestFill> fills;
    /**
     * @return The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    private @Nullable List<DashboardWidgetHostmapDefinitionRequestSize> sizes;

    private DashboardWidgetHostmapDefinitionRequest() {}
    /**
     * @return The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public List<DashboardWidgetHostmapDefinitionRequestFill> fills() {
        return this.fills == null ? List.of() : this.fills;
    }
    /**
     * @return The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public List<DashboardWidgetHostmapDefinitionRequestSize> sizes() {
        return this.sizes == null ? List.of() : this.sizes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetHostmapDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardWidgetHostmapDefinitionRequestFill> fills;
        private @Nullable List<DashboardWidgetHostmapDefinitionRequestSize> sizes;
        public Builder() {}
        public Builder(DashboardWidgetHostmapDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fills = defaults.fills;
    	      this.sizes = defaults.sizes;
        }

        @CustomType.Setter
        public Builder fills(@Nullable List<DashboardWidgetHostmapDefinitionRequestFill> fills) {

            this.fills = fills;
            return this;
        }
        public Builder fills(DashboardWidgetHostmapDefinitionRequestFill... fills) {
            return fills(List.of(fills));
        }
        @CustomType.Setter
        public Builder sizes(@Nullable List<DashboardWidgetHostmapDefinitionRequestSize> sizes) {

            this.sizes = sizes;
            return this;
        }
        public Builder sizes(DashboardWidgetHostmapDefinitionRequestSize... sizes) {
            return sizes(List.of(sizes));
        }
        public DashboardWidgetHostmapDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetHostmapDefinitionRequest();
            _resultValue.fills = fills;
            _resultValue.sizes = sizes;
            return _resultValue;
        }
    }
}
