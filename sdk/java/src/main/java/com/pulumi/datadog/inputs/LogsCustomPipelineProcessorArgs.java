// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorArithmeticProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorAttributeRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorCategoryProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorDateRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorGeoIpParserArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorGrokParserArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorLookupProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorMessageRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorReferenceTableLookupProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorServiceRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorSpanIdRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorStatusRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorStringBuilderProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorTraceIdRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorUrlParserArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorUserAgentParserArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsCustomPipelineProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorArgs Empty = new LogsCustomPipelineProcessorArgs();

    /**
     * Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
     * 
     */
    @Import(name="arithmeticProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorArithmeticProcessorArgs> arithmeticProcessor;

    /**
     * @return Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorArithmeticProcessorArgs>> arithmeticProcessor() {
        return Optional.ofNullable(this.arithmeticProcessor);
    }

    /**
     * Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
     * 
     */
    @Import(name="attributeRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorAttributeRemapperArgs> attributeRemapper;

    /**
     * @return Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorAttributeRemapperArgs>> attributeRemapper() {
        return Optional.ofNullable(this.attributeRemapper);
    }

    /**
     * Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
     * 
     */
    @Import(name="categoryProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorCategoryProcessorArgs> categoryProcessor;

    /**
     * @return Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorCategoryProcessorArgs>> categoryProcessor() {
        return Optional.ofNullable(this.categoryProcessor);
    }

    /**
     * Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
     * 
     */
    @Import(name="dateRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorDateRemapperArgs> dateRemapper;

    /**
     * @return Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorDateRemapperArgs>> dateRemapper() {
        return Optional.ofNullable(this.dateRemapper);
    }

    /**
     * Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
     * 
     */
    @Import(name="geoIpParser")
    private @Nullable Output<LogsCustomPipelineProcessorGeoIpParserArgs> geoIpParser;

    /**
     * @return Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorGeoIpParserArgs>> geoIpParser() {
        return Optional.ofNullable(this.geoIpParser);
    }

    /**
     * Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
     * 
     */
    @Import(name="grokParser")
    private @Nullable Output<LogsCustomPipelineProcessorGrokParserArgs> grokParser;

    /**
     * @return Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorGrokParserArgs>> grokParser() {
        return Optional.ofNullable(this.grokParser);
    }

    /**
     * Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    @Import(name="lookupProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorLookupProcessorArgs> lookupProcessor;

    /**
     * @return Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorLookupProcessorArgs>> lookupProcessor() {
        return Optional.ofNullable(this.lookupProcessor);
    }

    /**
     * Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
     * 
     */
    @Import(name="messageRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorMessageRemapperArgs> messageRemapper;

    /**
     * @return Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorMessageRemapperArgs>> messageRemapper() {
        return Optional.ofNullable(this.messageRemapper);
    }

    @Import(name="pipeline")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineArgs> pipeline;

    public Optional<Output<LogsCustomPipelineProcessorPipelineArgs>> pipeline() {
        return Optional.ofNullable(this.pipeline);
    }

    /**
     * Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    @Import(name="referenceTableLookupProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorReferenceTableLookupProcessorArgs> referenceTableLookupProcessor;

    /**
     * @return Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorReferenceTableLookupProcessorArgs>> referenceTableLookupProcessor() {
        return Optional.ofNullable(this.referenceTableLookupProcessor);
    }

    /**
     * Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
     * 
     */
    @Import(name="serviceRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorServiceRemapperArgs> serviceRemapper;

    /**
     * @return Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorServiceRemapperArgs>> serviceRemapper() {
        return Optional.ofNullable(this.serviceRemapper);
    }

    /**
     * Span ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/log_configuration/processors/?tab=ui#span-remapper)
     * 
     */
    @Import(name="spanIdRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorSpanIdRemapperArgs> spanIdRemapper;

    /**
     * @return Span ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/log_configuration/processors/?tab=ui#span-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorSpanIdRemapperArgs>> spanIdRemapper() {
        return Optional.ofNullable(this.spanIdRemapper);
    }

    /**
     * Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
     * 
     */
    @Import(name="statusRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorStatusRemapperArgs> statusRemapper;

    /**
     * @return Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorStatusRemapperArgs>> statusRemapper() {
        return Optional.ofNullable(this.statusRemapper);
    }

    /**
     * String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
     * 
     */
    @Import(name="stringBuilderProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorStringBuilderProcessorArgs> stringBuilderProcessor;

    /**
     * @return String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorStringBuilderProcessorArgs>> stringBuilderProcessor() {
        return Optional.ofNullable(this.stringBuilderProcessor);
    }

    /**
     * Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
     * 
     */
    @Import(name="traceIdRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorTraceIdRemapperArgs> traceIdRemapper;

    /**
     * @return Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorTraceIdRemapperArgs>> traceIdRemapper() {
        return Optional.ofNullable(this.traceIdRemapper);
    }

    /**
     * URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
     * 
     */
    @Import(name="urlParser")
    private @Nullable Output<LogsCustomPipelineProcessorUrlParserArgs> urlParser;

    /**
     * @return URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorUrlParserArgs>> urlParser() {
        return Optional.ofNullable(this.urlParser);
    }

    /**
     * User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
     * 
     */
    @Import(name="userAgentParser")
    private @Nullable Output<LogsCustomPipelineProcessorUserAgentParserArgs> userAgentParser;

    /**
     * @return User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorUserAgentParserArgs>> userAgentParser() {
        return Optional.ofNullable(this.userAgentParser);
    }

    private LogsCustomPipelineProcessorArgs() {}

    private LogsCustomPipelineProcessorArgs(LogsCustomPipelineProcessorArgs $) {
        this.arithmeticProcessor = $.arithmeticProcessor;
        this.attributeRemapper = $.attributeRemapper;
        this.categoryProcessor = $.categoryProcessor;
        this.dateRemapper = $.dateRemapper;
        this.geoIpParser = $.geoIpParser;
        this.grokParser = $.grokParser;
        this.lookupProcessor = $.lookupProcessor;
        this.messageRemapper = $.messageRemapper;
        this.pipeline = $.pipeline;
        this.referenceTableLookupProcessor = $.referenceTableLookupProcessor;
        this.serviceRemapper = $.serviceRemapper;
        this.spanIdRemapper = $.spanIdRemapper;
        this.statusRemapper = $.statusRemapper;
        this.stringBuilderProcessor = $.stringBuilderProcessor;
        this.traceIdRemapper = $.traceIdRemapper;
        this.urlParser = $.urlParser;
        this.userAgentParser = $.userAgentParser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomPipelineProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomPipelineProcessorArgs $;

        public Builder() {
            $ = new LogsCustomPipelineProcessorArgs();
        }

        public Builder(LogsCustomPipelineProcessorArgs defaults) {
            $ = new LogsCustomPipelineProcessorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arithmeticProcessor Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
         * 
         * @return builder
         * 
         */
        public Builder arithmeticProcessor(@Nullable Output<LogsCustomPipelineProcessorArithmeticProcessorArgs> arithmeticProcessor) {
            $.arithmeticProcessor = arithmeticProcessor;
            return this;
        }

        /**
         * @param arithmeticProcessor Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
         * 
         * @return builder
         * 
         */
        public Builder arithmeticProcessor(LogsCustomPipelineProcessorArithmeticProcessorArgs arithmeticProcessor) {
            return arithmeticProcessor(Output.of(arithmeticProcessor));
        }

        /**
         * @param attributeRemapper Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
         * 
         * @return builder
         * 
         */
        public Builder attributeRemapper(@Nullable Output<LogsCustomPipelineProcessorAttributeRemapperArgs> attributeRemapper) {
            $.attributeRemapper = attributeRemapper;
            return this;
        }

        /**
         * @param attributeRemapper Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
         * 
         * @return builder
         * 
         */
        public Builder attributeRemapper(LogsCustomPipelineProcessorAttributeRemapperArgs attributeRemapper) {
            return attributeRemapper(Output.of(attributeRemapper));
        }

        /**
         * @param categoryProcessor Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
         * 
         * @return builder
         * 
         */
        public Builder categoryProcessor(@Nullable Output<LogsCustomPipelineProcessorCategoryProcessorArgs> categoryProcessor) {
            $.categoryProcessor = categoryProcessor;
            return this;
        }

        /**
         * @param categoryProcessor Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
         * 
         * @return builder
         * 
         */
        public Builder categoryProcessor(LogsCustomPipelineProcessorCategoryProcessorArgs categoryProcessor) {
            return categoryProcessor(Output.of(categoryProcessor));
        }

        /**
         * @param dateRemapper Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
         * 
         * @return builder
         * 
         */
        public Builder dateRemapper(@Nullable Output<LogsCustomPipelineProcessorDateRemapperArgs> dateRemapper) {
            $.dateRemapper = dateRemapper;
            return this;
        }

        /**
         * @param dateRemapper Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
         * 
         * @return builder
         * 
         */
        public Builder dateRemapper(LogsCustomPipelineProcessorDateRemapperArgs dateRemapper) {
            return dateRemapper(Output.of(dateRemapper));
        }

        /**
         * @param geoIpParser Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
         * 
         * @return builder
         * 
         */
        public Builder geoIpParser(@Nullable Output<LogsCustomPipelineProcessorGeoIpParserArgs> geoIpParser) {
            $.geoIpParser = geoIpParser;
            return this;
        }

        /**
         * @param geoIpParser Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
         * 
         * @return builder
         * 
         */
        public Builder geoIpParser(LogsCustomPipelineProcessorGeoIpParserArgs geoIpParser) {
            return geoIpParser(Output.of(geoIpParser));
        }

        /**
         * @param grokParser Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
         * 
         * @return builder
         * 
         */
        public Builder grokParser(@Nullable Output<LogsCustomPipelineProcessorGrokParserArgs> grokParser) {
            $.grokParser = grokParser;
            return this;
        }

        /**
         * @param grokParser Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
         * 
         * @return builder
         * 
         */
        public Builder grokParser(LogsCustomPipelineProcessorGrokParserArgs grokParser) {
            return grokParser(Output.of(grokParser));
        }

        /**
         * @param lookupProcessor Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder lookupProcessor(@Nullable Output<LogsCustomPipelineProcessorLookupProcessorArgs> lookupProcessor) {
            $.lookupProcessor = lookupProcessor;
            return this;
        }

        /**
         * @param lookupProcessor Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder lookupProcessor(LogsCustomPipelineProcessorLookupProcessorArgs lookupProcessor) {
            return lookupProcessor(Output.of(lookupProcessor));
        }

        /**
         * @param messageRemapper Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
         * 
         * @return builder
         * 
         */
        public Builder messageRemapper(@Nullable Output<LogsCustomPipelineProcessorMessageRemapperArgs> messageRemapper) {
            $.messageRemapper = messageRemapper;
            return this;
        }

        /**
         * @param messageRemapper Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
         * 
         * @return builder
         * 
         */
        public Builder messageRemapper(LogsCustomPipelineProcessorMessageRemapperArgs messageRemapper) {
            return messageRemapper(Output.of(messageRemapper));
        }

        public Builder pipeline(@Nullable Output<LogsCustomPipelineProcessorPipelineArgs> pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        public Builder pipeline(LogsCustomPipelineProcessorPipelineArgs pipeline) {
            return pipeline(Output.of(pipeline));
        }

        /**
         * @param referenceTableLookupProcessor Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder referenceTableLookupProcessor(@Nullable Output<LogsCustomPipelineProcessorReferenceTableLookupProcessorArgs> referenceTableLookupProcessor) {
            $.referenceTableLookupProcessor = referenceTableLookupProcessor;
            return this;
        }

        /**
         * @param referenceTableLookupProcessor Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder referenceTableLookupProcessor(LogsCustomPipelineProcessorReferenceTableLookupProcessorArgs referenceTableLookupProcessor) {
            return referenceTableLookupProcessor(Output.of(referenceTableLookupProcessor));
        }

        /**
         * @param serviceRemapper Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
         * 
         * @return builder
         * 
         */
        public Builder serviceRemapper(@Nullable Output<LogsCustomPipelineProcessorServiceRemapperArgs> serviceRemapper) {
            $.serviceRemapper = serviceRemapper;
            return this;
        }

        /**
         * @param serviceRemapper Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
         * 
         * @return builder
         * 
         */
        public Builder serviceRemapper(LogsCustomPipelineProcessorServiceRemapperArgs serviceRemapper) {
            return serviceRemapper(Output.of(serviceRemapper));
        }

        /**
         * @param spanIdRemapper Span ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/log_configuration/processors/?tab=ui#span-remapper)
         * 
         * @return builder
         * 
         */
        public Builder spanIdRemapper(@Nullable Output<LogsCustomPipelineProcessorSpanIdRemapperArgs> spanIdRemapper) {
            $.spanIdRemapper = spanIdRemapper;
            return this;
        }

        /**
         * @param spanIdRemapper Span ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/log_configuration/processors/?tab=ui#span-remapper)
         * 
         * @return builder
         * 
         */
        public Builder spanIdRemapper(LogsCustomPipelineProcessorSpanIdRemapperArgs spanIdRemapper) {
            return spanIdRemapper(Output.of(spanIdRemapper));
        }

        /**
         * @param statusRemapper Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
         * 
         * @return builder
         * 
         */
        public Builder statusRemapper(@Nullable Output<LogsCustomPipelineProcessorStatusRemapperArgs> statusRemapper) {
            $.statusRemapper = statusRemapper;
            return this;
        }

        /**
         * @param statusRemapper Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
         * 
         * @return builder
         * 
         */
        public Builder statusRemapper(LogsCustomPipelineProcessorStatusRemapperArgs statusRemapper) {
            return statusRemapper(Output.of(statusRemapper));
        }

        /**
         * @param stringBuilderProcessor String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
         * 
         * @return builder
         * 
         */
        public Builder stringBuilderProcessor(@Nullable Output<LogsCustomPipelineProcessorStringBuilderProcessorArgs> stringBuilderProcessor) {
            $.stringBuilderProcessor = stringBuilderProcessor;
            return this;
        }

        /**
         * @param stringBuilderProcessor String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
         * 
         * @return builder
         * 
         */
        public Builder stringBuilderProcessor(LogsCustomPipelineProcessorStringBuilderProcessorArgs stringBuilderProcessor) {
            return stringBuilderProcessor(Output.of(stringBuilderProcessor));
        }

        /**
         * @param traceIdRemapper Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
         * 
         * @return builder
         * 
         */
        public Builder traceIdRemapper(@Nullable Output<LogsCustomPipelineProcessorTraceIdRemapperArgs> traceIdRemapper) {
            $.traceIdRemapper = traceIdRemapper;
            return this;
        }

        /**
         * @param traceIdRemapper Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
         * 
         * @return builder
         * 
         */
        public Builder traceIdRemapper(LogsCustomPipelineProcessorTraceIdRemapperArgs traceIdRemapper) {
            return traceIdRemapper(Output.of(traceIdRemapper));
        }

        /**
         * @param urlParser URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
         * 
         * @return builder
         * 
         */
        public Builder urlParser(@Nullable Output<LogsCustomPipelineProcessorUrlParserArgs> urlParser) {
            $.urlParser = urlParser;
            return this;
        }

        /**
         * @param urlParser URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
         * 
         * @return builder
         * 
         */
        public Builder urlParser(LogsCustomPipelineProcessorUrlParserArgs urlParser) {
            return urlParser(Output.of(urlParser));
        }

        /**
         * @param userAgentParser User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
         * 
         * @return builder
         * 
         */
        public Builder userAgentParser(@Nullable Output<LogsCustomPipelineProcessorUserAgentParserArgs> userAgentParser) {
            $.userAgentParser = userAgentParser;
            return this;
        }

        /**
         * @param userAgentParser User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
         * 
         * @return builder
         * 
         */
        public Builder userAgentParser(LogsCustomPipelineProcessorUserAgentParserArgs userAgentParser) {
            return userAgentParser(Output.of(userAgentParser));
        }

        public LogsCustomPipelineProcessorArgs build() {
            return $;
        }
    }

}
