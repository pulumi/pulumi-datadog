// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetListStreamDefinitionRequest;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetListStreamDefinition {
    private List<DashboardWidgetListStreamDefinitionRequest> requests;
    private @Nullable String title;
    private @Nullable String titleAlign;
    private @Nullable String titleSize;

    private DashboardWidgetListStreamDefinition() {}
    public List<DashboardWidgetListStreamDefinitionRequest> requests() {
        return this.requests;
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    public Optional<String> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }
    public Optional<String> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetListStreamDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<DashboardWidgetListStreamDefinitionRequest> requests;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        public Builder() {}
        public Builder(DashboardWidgetListStreamDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requests = defaults.requests;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
        }

        @CustomType.Setter
        public Builder requests(List<DashboardWidgetListStreamDefinitionRequest> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }
        public Builder requests(DashboardWidgetListStreamDefinitionRequest... requests) {
            return requests(List.of(requests));
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder titleAlign(@Nullable String titleAlign) {
            this.titleAlign = titleAlign;
            return this;
        }
        @CustomType.Setter
        public Builder titleSize(@Nullable String titleSize) {
            this.titleSize = titleSize;
            return this;
        }
        public DashboardWidgetListStreamDefinition build() {
            final var o = new DashboardWidgetListStreamDefinition();
            o.requests = requests;
            o.title = title;
            o.titleAlign = titleAlign;
            o.titleSize = titleSize;
            return o;
        }
    }
}