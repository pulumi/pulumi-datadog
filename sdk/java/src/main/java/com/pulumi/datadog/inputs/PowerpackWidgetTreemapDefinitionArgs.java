// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetTreemapDefinitionRequestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetTreemapDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetTreemapDefinitionArgs Empty = new PowerpackWidgetTreemapDefinitionArgs();

    /**
     * A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    @Import(name="requests")
    private @Nullable Output<List<PowerpackWidgetTreemapDefinitionRequestArgs>> requests;

    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public Optional<Output<List<PowerpackWidgetTreemapDefinitionRequestArgs>>> requests() {
        return Optional.ofNullable(this.requests);
    }

    /**
     * The title of the widget.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the widget.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private PowerpackWidgetTreemapDefinitionArgs() {}

    private PowerpackWidgetTreemapDefinitionArgs(PowerpackWidgetTreemapDefinitionArgs $) {
        this.requests = $.requests;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetTreemapDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetTreemapDefinitionArgs $;

        public Builder() {
            $ = new PowerpackWidgetTreemapDefinitionArgs();
        }

        public Builder(PowerpackWidgetTreemapDefinitionArgs defaults) {
            $ = new PowerpackWidgetTreemapDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder requests(@Nullable Output<List<PowerpackWidgetTreemapDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder requests(List<PowerpackWidgetTreemapDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder requests(PowerpackWidgetTreemapDefinitionRequestArgs... requests) {
            return requests(List.of(requests));
        }

        /**
         * @param title The title of the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public PowerpackWidgetTreemapDefinitionArgs build() {
            return $;
        }
    }

}