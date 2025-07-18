// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCostBudgetEntryTagFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetCostBudgetEntryTagFilter Empty = new GetCostBudgetEntryTagFilter();

    @Import(name="tagKey", required=true)
    private String tagKey;

    public String tagKey() {
        return this.tagKey;
    }

    @Import(name="tagValue", required=true)
    private String tagValue;

    public String tagValue() {
        return this.tagValue;
    }

    private GetCostBudgetEntryTagFilter() {}

    private GetCostBudgetEntryTagFilter(GetCostBudgetEntryTagFilter $) {
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCostBudgetEntryTagFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCostBudgetEntryTagFilter $;

        public Builder() {
            $ = new GetCostBudgetEntryTagFilter();
        }

        public Builder(GetCostBudgetEntryTagFilter defaults) {
            $ = new GetCostBudgetEntryTagFilter(Objects.requireNonNull(defaults));
        }

        public Builder tagKey(String tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        public Builder tagValue(String tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        public GetCostBudgetEntryTagFilter build() {
            if ($.tagKey == null) {
                throw new MissingRequiredPropertyException("GetCostBudgetEntryTagFilter", "tagKey");
            }
            if ($.tagValue == null) {
                throw new MissingRequiredPropertyException("GetCostBudgetEntryTagFilter", "tagValue");
            }
            return $;
        }
    }

}
