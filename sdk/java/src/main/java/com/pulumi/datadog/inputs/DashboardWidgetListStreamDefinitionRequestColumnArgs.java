// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetListStreamDefinitionRequestColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetListStreamDefinitionRequestColumnArgs Empty = new DashboardWidgetListStreamDefinitionRequestColumnArgs();

    @Import(name="field", required=true)
    private Output<String> field;

    public Output<String> field() {
        return this.field;
    }

    @Import(name="width", required=true)
    private Output<String> width;

    public Output<String> width() {
        return this.width;
    }

    private DashboardWidgetListStreamDefinitionRequestColumnArgs() {}

    private DashboardWidgetListStreamDefinitionRequestColumnArgs(DashboardWidgetListStreamDefinitionRequestColumnArgs $) {
        this.field = $.field;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetListStreamDefinitionRequestColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetListStreamDefinitionRequestColumnArgs $;

        public Builder() {
            $ = new DashboardWidgetListStreamDefinitionRequestColumnArgs();
        }

        public Builder(DashboardWidgetListStreamDefinitionRequestColumnArgs defaults) {
            $ = new DashboardWidgetListStreamDefinitionRequestColumnArgs(Objects.requireNonNull(defaults));
        }

        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        public Builder field(String field) {
            return field(Output.of(field));
        }

        public Builder width(Output<String> width) {
            $.width = width;
            return this;
        }

        public Builder width(String width) {
            return width(Output.of(width));
        }

        public DashboardWidgetListStreamDefinitionRequestColumnArgs build() {
            $.field = Objects.requireNonNull($.field, "expected parameter 'field' to be non-null");
            $.width = Objects.requireNonNull($.width, "expected parameter 'width' to be non-null");
            return $;
        }
    }

}