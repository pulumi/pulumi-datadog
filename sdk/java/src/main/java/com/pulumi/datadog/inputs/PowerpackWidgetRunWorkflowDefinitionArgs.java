// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetRunWorkflowDefinitionInputArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetRunWorkflowDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetRunWorkflowDefinitionArgs Empty = new PowerpackWidgetRunWorkflowDefinitionArgs();

    /**
     * A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    @Import(name="customLinks")
    private @Nullable Output<List<PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs>> customLinks;

    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    /**
     * Array of workflow inputs to map to dashboard template variables.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<PowerpackWidgetRunWorkflowDefinitionInputArgs>> inputs;

    /**
     * @return Array of workflow inputs to map to dashboard template variables.
     * 
     */
    public Optional<Output<List<PowerpackWidgetRunWorkflowDefinitionInputArgs>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
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

    /**
     * The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    @Import(name="titleAlign")
    private @Nullable Output<String> titleAlign;

    /**
     * @return The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<Output<String>> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }

    /**
     * The size of the widget&#39;s title (defaults to 16).
     * 
     */
    @Import(name="titleSize")
    private @Nullable Output<String> titleSize;

    /**
     * @return The size of the widget&#39;s title (defaults to 16).
     * 
     */
    public Optional<Output<String>> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    /**
     * Workflow ID
     * 
     */
    @Import(name="workflowId", required=true)
    private Output<String> workflowId;

    /**
     * @return Workflow ID
     * 
     */
    public Output<String> workflowId() {
        return this.workflowId;
    }

    private PowerpackWidgetRunWorkflowDefinitionArgs() {}

    private PowerpackWidgetRunWorkflowDefinitionArgs(PowerpackWidgetRunWorkflowDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.inputs = $.inputs;
        this.liveSpan = $.liveSpan;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
        this.workflowId = $.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetRunWorkflowDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetRunWorkflowDefinitionArgs $;

        public Builder() {
            $ = new PowerpackWidgetRunWorkflowDefinitionArgs();
        }

        public Builder(PowerpackWidgetRunWorkflowDefinitionArgs defaults) {
            $ = new PowerpackWidgetRunWorkflowDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(@Nullable Output<List<PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(List<PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(PowerpackWidgetRunWorkflowDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        /**
         * @param inputs Array of workflow inputs to map to dashboard template variables.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<PowerpackWidgetRunWorkflowDefinitionInputArgs>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs Array of workflow inputs to map to dashboard template variables.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<PowerpackWidgetRunWorkflowDefinitionInputArgs> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs Array of workflow inputs to map to dashboard template variables.
         * 
         * @return builder
         * 
         */
        public Builder inputs(PowerpackWidgetRunWorkflowDefinitionInputArgs... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param liveSpan The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
         * 
         * @return builder
         * 
         */
        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        /**
         * @param liveSpan The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
         * 
         * @return builder
         * 
         */
        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
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

        /**
         * @param titleAlign The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder titleAlign(@Nullable Output<String> titleAlign) {
            $.titleAlign = titleAlign;
            return this;
        }

        /**
         * @param titleAlign The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder titleAlign(String titleAlign) {
            return titleAlign(Output.of(titleAlign));
        }

        /**
         * @param titleSize The size of the widget&#39;s title (defaults to 16).
         * 
         * @return builder
         * 
         */
        public Builder titleSize(@Nullable Output<String> titleSize) {
            $.titleSize = titleSize;
            return this;
        }

        /**
         * @param titleSize The size of the widget&#39;s title (defaults to 16).
         * 
         * @return builder
         * 
         */
        public Builder titleSize(String titleSize) {
            return titleSize(Output.of(titleSize));
        }

        /**
         * @param workflowId Workflow ID
         * 
         * @return builder
         * 
         */
        public Builder workflowId(Output<String> workflowId) {
            $.workflowId = workflowId;
            return this;
        }

        /**
         * @param workflowId Workflow ID
         * 
         * @return builder
         * 
         */
        public Builder workflowId(String workflowId) {
            return workflowId(Output.of(workflowId));
        }

        public PowerpackWidgetRunWorkflowDefinitionArgs build() {
            if ($.workflowId == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetRunWorkflowDefinitionArgs", "workflowId");
            }
            return $;
        }
    }

}
