// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetTraceServiceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetTraceServiceDefinitionArgs Empty = new DashboardWidgetTraceServiceDefinitionArgs();

    @Import(name="displayFormat")
    private @Nullable Output<String> displayFormat;

    public Optional<Output<String>> displayFormat() {
        return Optional.ofNullable(this.displayFormat);
    }

    @Import(name="env", required=true)
    private Output<String> env;

    public Output<String> env() {
        return this.env;
    }

    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }

    @Import(name="service", required=true)
    private Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    @Import(name="showBreakdown")
    private @Nullable Output<Boolean> showBreakdown;

    public Optional<Output<Boolean>> showBreakdown() {
        return Optional.ofNullable(this.showBreakdown);
    }

    @Import(name="showDistribution")
    private @Nullable Output<Boolean> showDistribution;

    public Optional<Output<Boolean>> showDistribution() {
        return Optional.ofNullable(this.showDistribution);
    }

    @Import(name="showErrors")
    private @Nullable Output<Boolean> showErrors;

    public Optional<Output<Boolean>> showErrors() {
        return Optional.ofNullable(this.showErrors);
    }

    @Import(name="showHits")
    private @Nullable Output<Boolean> showHits;

    public Optional<Output<Boolean>> showHits() {
        return Optional.ofNullable(this.showHits);
    }

    @Import(name="showLatency")
    private @Nullable Output<Boolean> showLatency;

    public Optional<Output<Boolean>> showLatency() {
        return Optional.ofNullable(this.showLatency);
    }

    @Import(name="showResourceList")
    private @Nullable Output<Boolean> showResourceList;

    public Optional<Output<Boolean>> showResourceList() {
        return Optional.ofNullable(this.showResourceList);
    }

    @Import(name="sizeFormat")
    private @Nullable Output<String> sizeFormat;

    public Optional<Output<String>> sizeFormat() {
        return Optional.ofNullable(this.sizeFormat);
    }

    @Import(name="spanName", required=true)
    private Output<String> spanName;

    public Output<String> spanName() {
        return this.spanName;
    }

    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="titleAlign")
    private @Nullable Output<String> titleAlign;

    public Optional<Output<String>> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }

    @Import(name="titleSize")
    private @Nullable Output<String> titleSize;

    public Optional<Output<String>> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    private DashboardWidgetTraceServiceDefinitionArgs() {}

    private DashboardWidgetTraceServiceDefinitionArgs(DashboardWidgetTraceServiceDefinitionArgs $) {
        this.displayFormat = $.displayFormat;
        this.env = $.env;
        this.liveSpan = $.liveSpan;
        this.service = $.service;
        this.showBreakdown = $.showBreakdown;
        this.showDistribution = $.showDistribution;
        this.showErrors = $.showErrors;
        this.showHits = $.showHits;
        this.showLatency = $.showLatency;
        this.showResourceList = $.showResourceList;
        this.sizeFormat = $.sizeFormat;
        this.spanName = $.spanName;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetTraceServiceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetTraceServiceDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetTraceServiceDefinitionArgs();
        }

        public Builder(DashboardWidgetTraceServiceDefinitionArgs defaults) {
            $ = new DashboardWidgetTraceServiceDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayFormat(@Nullable Output<String> displayFormat) {
            $.displayFormat = displayFormat;
            return this;
        }

        public Builder displayFormat(String displayFormat) {
            return displayFormat(Output.of(displayFormat));
        }

        public Builder env(Output<String> env) {
            $.env = env;
            return this;
        }

        public Builder env(String env) {
            return env(Output.of(env));
        }

        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
        }

        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public Builder showBreakdown(@Nullable Output<Boolean> showBreakdown) {
            $.showBreakdown = showBreakdown;
            return this;
        }

        public Builder showBreakdown(Boolean showBreakdown) {
            return showBreakdown(Output.of(showBreakdown));
        }

        public Builder showDistribution(@Nullable Output<Boolean> showDistribution) {
            $.showDistribution = showDistribution;
            return this;
        }

        public Builder showDistribution(Boolean showDistribution) {
            return showDistribution(Output.of(showDistribution));
        }

        public Builder showErrors(@Nullable Output<Boolean> showErrors) {
            $.showErrors = showErrors;
            return this;
        }

        public Builder showErrors(Boolean showErrors) {
            return showErrors(Output.of(showErrors));
        }

        public Builder showHits(@Nullable Output<Boolean> showHits) {
            $.showHits = showHits;
            return this;
        }

        public Builder showHits(Boolean showHits) {
            return showHits(Output.of(showHits));
        }

        public Builder showLatency(@Nullable Output<Boolean> showLatency) {
            $.showLatency = showLatency;
            return this;
        }

        public Builder showLatency(Boolean showLatency) {
            return showLatency(Output.of(showLatency));
        }

        public Builder showResourceList(@Nullable Output<Boolean> showResourceList) {
            $.showResourceList = showResourceList;
            return this;
        }

        public Builder showResourceList(Boolean showResourceList) {
            return showResourceList(Output.of(showResourceList));
        }

        public Builder sizeFormat(@Nullable Output<String> sizeFormat) {
            $.sizeFormat = sizeFormat;
            return this;
        }

        public Builder sizeFormat(String sizeFormat) {
            return sizeFormat(Output.of(sizeFormat));
        }

        public Builder spanName(Output<String> spanName) {
            $.spanName = spanName;
            return this;
        }

        public Builder spanName(String spanName) {
            return spanName(Output.of(spanName));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Builder titleAlign(@Nullable Output<String> titleAlign) {
            $.titleAlign = titleAlign;
            return this;
        }

        public Builder titleAlign(String titleAlign) {
            return titleAlign(Output.of(titleAlign));
        }

        public Builder titleSize(@Nullable Output<String> titleSize) {
            $.titleSize = titleSize;
            return this;
        }

        public Builder titleSize(String titleSize) {
            return titleSize(Output.of(titleSize));
        }

        public DashboardWidgetTraceServiceDefinitionArgs build() {
            $.env = Objects.requireNonNull($.env, "expected parameter 'env' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            $.spanName = Objects.requireNonNull($.spanName, "expected parameter 'spanName' to be non-null");
            return $;
        }
    }

}