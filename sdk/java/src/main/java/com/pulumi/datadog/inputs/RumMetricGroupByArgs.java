// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RumMetricGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final RumMetricGroupByArgs Empty = new RumMetricGroupByArgs();

    /**
     * The path to the value the RUM-based metric will be aggregated over.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to the value the RUM-based metric will be aggregated over.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Name of the tag that gets created. By default, `path` is used as the tag name.
     * 
     */
    @Import(name="tagName")
    private @Nullable Output<String> tagName;

    /**
     * @return Name of the tag that gets created. By default, `path` is used as the tag name.
     * 
     */
    public Optional<Output<String>> tagName() {
        return Optional.ofNullable(this.tagName);
    }

    private RumMetricGroupByArgs() {}

    private RumMetricGroupByArgs(RumMetricGroupByArgs $) {
        this.path = $.path;
        this.tagName = $.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RumMetricGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RumMetricGroupByArgs $;

        public Builder() {
            $ = new RumMetricGroupByArgs();
        }

        public Builder(RumMetricGroupByArgs defaults) {
            $ = new RumMetricGroupByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The path to the value the RUM-based metric will be aggregated over.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to the value the RUM-based metric will be aggregated over.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param tagName Name of the tag that gets created. By default, `path` is used as the tag name.
         * 
         * @return builder
         * 
         */
        public Builder tagName(@Nullable Output<String> tagName) {
            $.tagName = tagName;
            return this;
        }

        /**
         * @param tagName Name of the tag that gets created. By default, `path` is used as the tag name.
         * 
         * @return builder
         * 
         */
        public Builder tagName(String tagName) {
            return tagName(Output.of(tagName));
        }

        public RumMetricGroupByArgs build() {
            return $;
        }
    }

}