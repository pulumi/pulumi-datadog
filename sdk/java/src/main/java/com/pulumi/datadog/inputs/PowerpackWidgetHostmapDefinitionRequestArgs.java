// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetHostmapDefinitionRequestFillArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetHostmapDefinitionRequestSizeArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetHostmapDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetHostmapDefinitionRequestArgs Empty = new PowerpackWidgetHostmapDefinitionRequestArgs();

    /**
     * The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    @Import(name="fills")
    private @Nullable Output<List<PowerpackWidgetHostmapDefinitionRequestFillArgs>> fills;

    /**
     * @return The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public Optional<Output<List<PowerpackWidgetHostmapDefinitionRequestFillArgs>>> fills() {
        return Optional.ofNullable(this.fills);
    }

    /**
     * The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    @Import(name="sizes")
    private @Nullable Output<List<PowerpackWidgetHostmapDefinitionRequestSizeArgs>> sizes;

    /**
     * @return The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public Optional<Output<List<PowerpackWidgetHostmapDefinitionRequestSizeArgs>>> sizes() {
        return Optional.ofNullable(this.sizes);
    }

    private PowerpackWidgetHostmapDefinitionRequestArgs() {}

    private PowerpackWidgetHostmapDefinitionRequestArgs(PowerpackWidgetHostmapDefinitionRequestArgs $) {
        this.fills = $.fills;
        this.sizes = $.sizes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetHostmapDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetHostmapDefinitionRequestArgs $;

        public Builder() {
            $ = new PowerpackWidgetHostmapDefinitionRequestArgs();
        }

        public Builder(PowerpackWidgetHostmapDefinitionRequestArgs defaults) {
            $ = new PowerpackWidgetHostmapDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fills The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder fills(@Nullable Output<List<PowerpackWidgetHostmapDefinitionRequestFillArgs>> fills) {
            $.fills = fills;
            return this;
        }

        /**
         * @param fills The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder fills(List<PowerpackWidgetHostmapDefinitionRequestFillArgs> fills) {
            return fills(Output.of(fills));
        }

        /**
         * @param fills The query used to fill the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder fills(PowerpackWidgetHostmapDefinitionRequestFillArgs... fills) {
            return fills(List.of(fills));
        }

        /**
         * @param sizes The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder sizes(@Nullable Output<List<PowerpackWidgetHostmapDefinitionRequestSizeArgs>> sizes) {
            $.sizes = sizes;
            return this;
        }

        /**
         * @param sizes The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder sizes(List<PowerpackWidgetHostmapDefinitionRequestSizeArgs> sizes) {
            return sizes(Output.of(sizes));
        }

        /**
         * @param sizes The query used to size the map. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder sizes(PowerpackWidgetHostmapDefinitionRequestSizeArgs... sizes) {
            return sizes(List.of(sizes));
        }

        public PowerpackWidgetHostmapDefinitionRequestArgs build() {
            return $;
        }
    }

}