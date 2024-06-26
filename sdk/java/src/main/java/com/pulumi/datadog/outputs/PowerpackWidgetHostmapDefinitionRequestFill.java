// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetHostmapDefinitionRequestFillApmQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetHostmapDefinitionRequestFillLogQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetHostmapDefinitionRequestFillProcessQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetHostmapDefinitionRequestFillRumQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetHostmapDefinitionRequestFillSecurityQuery;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetHostmapDefinitionRequestFill {
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetHostmapDefinitionRequestFillApmQuery apmQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetHostmapDefinitionRequestFillLogQuery logQuery;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable PowerpackWidgetHostmapDefinitionRequestFillProcessQuery processQuery;
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private @Nullable String q;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetHostmapDefinitionRequestFillRumQuery rumQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable PowerpackWidgetHostmapDefinitionRequestFillSecurityQuery securityQuery;

    private PowerpackWidgetHostmapDefinitionRequestFill() {}
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<PowerpackWidgetHostmapDefinitionRequestFillApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<PowerpackWidgetHostmapDefinitionRequestFillLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<PowerpackWidgetHostmapDefinitionRequestFillProcessQuery> processQuery() {
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
    public Optional<PowerpackWidgetHostmapDefinitionRequestFillRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<PowerpackWidgetHostmapDefinitionRequestFillSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetHostmapDefinitionRequestFill defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PowerpackWidgetHostmapDefinitionRequestFillApmQuery apmQuery;
        private @Nullable PowerpackWidgetHostmapDefinitionRequestFillLogQuery logQuery;
        private @Nullable PowerpackWidgetHostmapDefinitionRequestFillProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable PowerpackWidgetHostmapDefinitionRequestFillRumQuery rumQuery;
        private @Nullable PowerpackWidgetHostmapDefinitionRequestFillSecurityQuery securityQuery;
        public Builder() {}
        public Builder(PowerpackWidgetHostmapDefinitionRequestFill defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmQuery = defaults.apmQuery;
    	      this.logQuery = defaults.logQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
        }

        @CustomType.Setter
        public Builder apmQuery(@Nullable PowerpackWidgetHostmapDefinitionRequestFillApmQuery apmQuery) {

            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable PowerpackWidgetHostmapDefinitionRequestFillLogQuery logQuery) {

            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable PowerpackWidgetHostmapDefinitionRequestFillProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {

            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable PowerpackWidgetHostmapDefinitionRequestFillRumQuery rumQuery) {

            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable PowerpackWidgetHostmapDefinitionRequestFillSecurityQuery securityQuery) {

            this.securityQuery = securityQuery;
            return this;
        }
        public PowerpackWidgetHostmapDefinitionRequestFill build() {
            final var _resultValue = new PowerpackWidgetHostmapDefinitionRequestFill();
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
