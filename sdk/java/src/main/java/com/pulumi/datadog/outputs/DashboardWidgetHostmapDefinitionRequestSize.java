// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetApmQuery;
import com.pulumi.datadog.outputs.DashboardWidgetHostmapDefinitionRequestSizeProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetLogQuery;
import com.pulumi.datadog.outputs.DashboardWidgetRumQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSecurityQuery;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetHostmapDefinitionRequestSize {
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetApmQuery apmQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetLogQuery logQuery;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable DashboardWidgetHostmapDefinitionRequestSizeProcessQuery processQuery;
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private @Nullable String q;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetRumQuery rumQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetSecurityQuery securityQuery;

    private DashboardWidgetHostmapDefinitionRequestSize() {}
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<DashboardWidgetHostmapDefinitionRequestSizeProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetHostmapDefinitionRequestSize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetApmQuery apmQuery;
        private @Nullable DashboardWidgetLogQuery logQuery;
        private @Nullable DashboardWidgetHostmapDefinitionRequestSizeProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable DashboardWidgetRumQuery rumQuery;
        private @Nullable DashboardWidgetSecurityQuery securityQuery;
        public Builder() {}
        public Builder(DashboardWidgetHostmapDefinitionRequestSize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmQuery = defaults.apmQuery;
    	      this.logQuery = defaults.logQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
        }

        @CustomType.Setter
        public Builder apmQuery(@Nullable DashboardWidgetApmQuery apmQuery) {

            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable DashboardWidgetLogQuery logQuery) {

            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetHostmapDefinitionRequestSizeProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {

            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable DashboardWidgetRumQuery rumQuery) {

            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable DashboardWidgetSecurityQuery securityQuery) {

            this.securityQuery = securityQuery;
            return this;
        }
        public DashboardWidgetHostmapDefinitionRequestSize build() {
            final var _resultValue = new DashboardWidgetHostmapDefinitionRequestSize();
            _resultValue.apmQuery = apmQuery;
            _resultValue.logQuery = logQuery;
            _resultValue.processQuery = processQuery;
            _resultValue.q = q;
            _resultValue.rumQuery = rumQuery;
            _resultValue.securityQuery = securityQuery;
            return _resultValue;
        }
    }
}
