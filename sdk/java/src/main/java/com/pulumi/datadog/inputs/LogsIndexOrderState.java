// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsIndexOrderState extends com.pulumi.resources.ResourceArgs {

    public static final LogsIndexOrderState Empty = new LogsIndexOrderState();

    /**
     * The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
     * 
     */
    @Import(name="indexes")
    private @Nullable Output<List<String>> indexes;

    /**
     * @return The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
     * 
     */
    public Optional<Output<List<String>>> indexes() {
        return Optional.ofNullable(this.indexes);
    }

    /**
     * The unique name of the index order resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the index order resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LogsIndexOrderState() {}

    private LogsIndexOrderState(LogsIndexOrderState $) {
        this.indexes = $.indexes;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsIndexOrderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsIndexOrderState $;

        public Builder() {
            $ = new LogsIndexOrderState();
        }

        public Builder(LogsIndexOrderState defaults) {
            $ = new LogsIndexOrderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param indexes The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
         * 
         * @return builder
         * 
         */
        public Builder indexes(@Nullable Output<List<String>> indexes) {
            $.indexes = indexes;
            return this;
        }

        /**
         * @param indexes The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
         * 
         * @return builder
         * 
         */
        public Builder indexes(List<String> indexes) {
            return indexes(Output.of(indexes));
        }

        /**
         * @param indexes The index resource list. Logs are tested against the query filter of each index one by one following the order of the list.
         * 
         * @return builder
         * 
         */
        public Builder indexes(String... indexes) {
            return indexes(List.of(indexes));
        }

        /**
         * @param name The unique name of the index order resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the index order resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LogsIndexOrderState build() {
            return $;
        }
    }

}
