// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceLevelObjectivesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLevelObjectivesArgs Empty = new GetServiceLevelObjectivesArgs();

    /**
     * Throw an error if no results are found. Defaults to `true`.
     * 
     */
    @Import(name="errorOnEmptyResult")
    private @Nullable Output<Boolean> errorOnEmptyResult;

    /**
     * @return Throw an error if no results are found. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> errorOnEmptyResult() {
        return Optional.ofNullable(this.errorOnEmptyResult);
    }

    /**
     * An array of SLO IDs to limit the search.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return An array of SLO IDs to limit the search.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Filter results based on SLO numerator and denominator.
     * 
     */
    @Import(name="metricsQuery")
    private @Nullable Output<String> metricsQuery;

    /**
     * @return Filter results based on SLO numerator and denominator.
     * 
     */
    public Optional<Output<String>> metricsQuery() {
        return Optional.ofNullable(this.metricsQuery);
    }

    /**
     * Filter results based on SLO names.
     * 
     */
    @Import(name="nameQuery")
    private @Nullable Output<String> nameQuery;

    /**
     * @return Filter results based on SLO names.
     * 
     */
    public Optional<Output<String>> nameQuery() {
        return Optional.ofNullable(this.nameQuery);
    }

    /**
     * The query string to filter results based on SLO names. Some examples of queries include service:\n\n and \n\n.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return The query string to filter results based on SLO names. Some examples of queries include service:\n\n and \n\n.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Filter results based on a single SLO tag.
     * 
     */
    @Import(name="tagsQuery")
    private @Nullable Output<String> tagsQuery;

    /**
     * @return Filter results based on a single SLO tag.
     * 
     */
    public Optional<Output<String>> tagsQuery() {
        return Optional.ofNullable(this.tagsQuery);
    }

    private GetServiceLevelObjectivesArgs() {}

    private GetServiceLevelObjectivesArgs(GetServiceLevelObjectivesArgs $) {
        this.errorOnEmptyResult = $.errorOnEmptyResult;
        this.ids = $.ids;
        this.metricsQuery = $.metricsQuery;
        this.nameQuery = $.nameQuery;
        this.query = $.query;
        this.tagsQuery = $.tagsQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLevelObjectivesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLevelObjectivesArgs $;

        public Builder() {
            $ = new GetServiceLevelObjectivesArgs();
        }

        public Builder(GetServiceLevelObjectivesArgs defaults) {
            $ = new GetServiceLevelObjectivesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param errorOnEmptyResult Throw an error if no results are found. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder errorOnEmptyResult(@Nullable Output<Boolean> errorOnEmptyResult) {
            $.errorOnEmptyResult = errorOnEmptyResult;
            return this;
        }

        /**
         * @param errorOnEmptyResult Throw an error if no results are found. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder errorOnEmptyResult(Boolean errorOnEmptyResult) {
            return errorOnEmptyResult(Output.of(errorOnEmptyResult));
        }

        /**
         * @param ids An array of SLO IDs to limit the search.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids An array of SLO IDs to limit the search.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids An array of SLO IDs to limit the search.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param metricsQuery Filter results based on SLO numerator and denominator.
         * 
         * @return builder
         * 
         */
        public Builder metricsQuery(@Nullable Output<String> metricsQuery) {
            $.metricsQuery = metricsQuery;
            return this;
        }

        /**
         * @param metricsQuery Filter results based on SLO numerator and denominator.
         * 
         * @return builder
         * 
         */
        public Builder metricsQuery(String metricsQuery) {
            return metricsQuery(Output.of(metricsQuery));
        }

        /**
         * @param nameQuery Filter results based on SLO names.
         * 
         * @return builder
         * 
         */
        public Builder nameQuery(@Nullable Output<String> nameQuery) {
            $.nameQuery = nameQuery;
            return this;
        }

        /**
         * @param nameQuery Filter results based on SLO names.
         * 
         * @return builder
         * 
         */
        public Builder nameQuery(String nameQuery) {
            return nameQuery(Output.of(nameQuery));
        }

        /**
         * @param query The query string to filter results based on SLO names. Some examples of queries include service:\n\n and \n\n.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The query string to filter results based on SLO names. Some examples of queries include service:\n\n and \n\n.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param tagsQuery Filter results based on a single SLO tag.
         * 
         * @return builder
         * 
         */
        public Builder tagsQuery(@Nullable Output<String> tagsQuery) {
            $.tagsQuery = tagsQuery;
            return this;
        }

        /**
         * @param tagsQuery Filter results based on a single SLO tag.
         * 
         * @return builder
         * 
         */
        public Builder tagsQuery(String tagsQuery) {
            return tagsQuery(Output.of(tagsQuery));
        }

        public GetServiceLevelObjectivesArgs build() {
            return $;
        }
    }

}