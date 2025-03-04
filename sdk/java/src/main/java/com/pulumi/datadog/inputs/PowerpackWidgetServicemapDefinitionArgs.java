// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetServicemapDefinitionCustomLinkArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetServicemapDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetServicemapDefinitionArgs Empty = new PowerpackWidgetServicemapDefinitionArgs();

    /**
     * A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    @Import(name="customLinks")
    private @Nullable Output<List<PowerpackWidgetServicemapDefinitionCustomLinkArgs>> customLinks;

    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<PowerpackWidgetServicemapDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    /**
     * Your environment and primary tag (or `*` if enabled for your account).
     * 
     */
    @Import(name="filters", required=true)
    private Output<List<String>> filters;

    /**
     * @return Your environment and primary tag (or `*` if enabled for your account).
     * 
     */
    public Output<List<String>> filters() {
        return this.filters;
    }

    /**
     * The ID of the service to map.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The ID of the service to map.
     * 
     */
    public Output<String> service() {
        return this.service;
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

    private PowerpackWidgetServicemapDefinitionArgs() {}

    private PowerpackWidgetServicemapDefinitionArgs(PowerpackWidgetServicemapDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.filters = $.filters;
        this.service = $.service;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetServicemapDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetServicemapDefinitionArgs $;

        public Builder() {
            $ = new PowerpackWidgetServicemapDefinitionArgs();
        }

        public Builder(PowerpackWidgetServicemapDefinitionArgs defaults) {
            $ = new PowerpackWidgetServicemapDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(@Nullable Output<List<PowerpackWidgetServicemapDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(List<PowerpackWidgetServicemapDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(PowerpackWidgetServicemapDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        /**
         * @param filters Your environment and primary tag (or `*` if enabled for your account).
         * 
         * @return builder
         * 
         */
        public Builder filters(Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Your environment and primary tag (or `*` if enabled for your account).
         * 
         * @return builder
         * 
         */
        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Your environment and primary tag (or `*` if enabled for your account).
         * 
         * @return builder
         * 
         */
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param service The ID of the service to map.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The ID of the service to map.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
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

        public PowerpackWidgetServicemapDefinitionArgs build() {
            if ($.filters == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetServicemapDefinitionArgs", "filters");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetServicemapDefinitionArgs", "service");
            }
            return $;
        }
    }

}
