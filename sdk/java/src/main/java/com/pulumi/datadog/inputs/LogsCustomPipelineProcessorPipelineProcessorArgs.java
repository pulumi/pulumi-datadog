// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorArithmeticProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorAttributeRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorDateRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorGrokParserArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorMessageRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorReferenceTableLookupProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorServiceRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorStatusRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorStringBuilderProcessorArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorTraceIdRemapperArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorUrlParserArgs;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineProcessorUserAgentParserArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsCustomPipelineProcessorPipelineProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorPipelineProcessorArgs Empty = new LogsCustomPipelineProcessorPipelineProcessorArgs();

    /**
     * Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
     * 
     */
    @Import(name="arithmeticProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorArithmeticProcessorArgs> arithmeticProcessor;

    /**
     * @return Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorArithmeticProcessorArgs>> arithmeticProcessor() {
        return Optional.ofNullable(this.arithmeticProcessor);
    }

    /**
     * Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
     * 
     */
    @Import(name="attributeRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorAttributeRemapperArgs> attributeRemapper;

    /**
     * @return Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorAttributeRemapperArgs>> attributeRemapper() {
        return Optional.ofNullable(this.attributeRemapper);
    }

    /**
     * Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
     * 
     */
    @Import(name="categoryProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs> categoryProcessor;

    /**
     * @return Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs>> categoryProcessor() {
        return Optional.ofNullable(this.categoryProcessor);
    }

    /**
     * Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
     * 
     */
    @Import(name="dateRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorDateRemapperArgs> dateRemapper;

    /**
     * @return Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorDateRemapperArgs>> dateRemapper() {
        return Optional.ofNullable(this.dateRemapper);
    }

    /**
     * Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
     * 
     */
    @Import(name="geoIpParser")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs> geoIpParser;

    /**
     * @return Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs>> geoIpParser() {
        return Optional.ofNullable(this.geoIpParser);
    }

    /**
     * Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
     * 
     */
    @Import(name="grokParser")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorGrokParserArgs> grokParser;

    /**
     * @return Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorGrokParserArgs>> grokParser() {
        return Optional.ofNullable(this.grokParser);
    }

    /**
     * Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    @Import(name="lookupProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs> lookupProcessor;

    /**
     * @return Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs>> lookupProcessor() {
        return Optional.ofNullable(this.lookupProcessor);
    }

    /**
     * Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
     * 
     */
    @Import(name="messageRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorMessageRemapperArgs> messageRemapper;

    /**
     * @return Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorMessageRemapperArgs>> messageRemapper() {
        return Optional.ofNullable(this.messageRemapper);
    }

    /**
     * Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    @Import(name="referenceTableLookupProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorReferenceTableLookupProcessorArgs> referenceTableLookupProcessor;

    /**
     * @return Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorReferenceTableLookupProcessorArgs>> referenceTableLookupProcessor() {
        return Optional.ofNullable(this.referenceTableLookupProcessor);
    }

    /**
     * Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
     * 
     */
    @Import(name="serviceRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorServiceRemapperArgs> serviceRemapper;

    /**
     * @return Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorServiceRemapperArgs>> serviceRemapper() {
        return Optional.ofNullable(this.serviceRemapper);
    }

    /**
     * Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
     * 
     */
    @Import(name="statusRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorStatusRemapperArgs> statusRemapper;

    /**
     * @return Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorStatusRemapperArgs>> statusRemapper() {
        return Optional.ofNullable(this.statusRemapper);
    }

    /**
     * String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
     * 
     */
    @Import(name="stringBuilderProcessor")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorStringBuilderProcessorArgs> stringBuilderProcessor;

    /**
     * @return String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorStringBuilderProcessorArgs>> stringBuilderProcessor() {
        return Optional.ofNullable(this.stringBuilderProcessor);
    }

    /**
     * Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
     * 
     */
    @Import(name="traceIdRemapper")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorTraceIdRemapperArgs> traceIdRemapper;

    /**
     * @return Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorTraceIdRemapperArgs>> traceIdRemapper() {
        return Optional.ofNullable(this.traceIdRemapper);
    }

    /**
     * URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
     * 
     */
    @Import(name="urlParser")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorUrlParserArgs> urlParser;

    /**
     * @return URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorUrlParserArgs>> urlParser() {
        return Optional.ofNullable(this.urlParser);
    }

    /**
     * User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
     * 
     */
    @Import(name="userAgentParser")
    private @Nullable Output<LogsCustomPipelineProcessorPipelineProcessorUserAgentParserArgs> userAgentParser;

    /**
     * @return User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
     * 
     */
    public Optional<Output<LogsCustomPipelineProcessorPipelineProcessorUserAgentParserArgs>> userAgentParser() {
        return Optional.ofNullable(this.userAgentParser);
    }

    private LogsCustomPipelineProcessorPipelineProcessorArgs() {}

    private LogsCustomPipelineProcessorPipelineProcessorArgs(LogsCustomPipelineProcessorPipelineProcessorArgs $) {
        this.arithmeticProcessor = $.arithmeticProcessor;
        this.attributeRemapper = $.attributeRemapper;
        this.categoryProcessor = $.categoryProcessor;
        this.dateRemapper = $.dateRemapper;
        this.geoIpParser = $.geoIpParser;
        this.grokParser = $.grokParser;
        this.lookupProcessor = $.lookupProcessor;
        this.messageRemapper = $.messageRemapper;
        this.referenceTableLookupProcessor = $.referenceTableLookupProcessor;
        this.serviceRemapper = $.serviceRemapper;
        this.statusRemapper = $.statusRemapper;
        this.stringBuilderProcessor = $.stringBuilderProcessor;
        this.traceIdRemapper = $.traceIdRemapper;
        this.urlParser = $.urlParser;
        this.userAgentParser = $.userAgentParser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomPipelineProcessorPipelineProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomPipelineProcessorPipelineProcessorArgs $;

        public Builder() {
            $ = new LogsCustomPipelineProcessorPipelineProcessorArgs();
        }

        public Builder(LogsCustomPipelineProcessorPipelineProcessorArgs defaults) {
            $ = new LogsCustomPipelineProcessorPipelineProcessorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arithmeticProcessor Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
         * 
         * @return builder
         * 
         */
        public Builder arithmeticProcessor(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorArithmeticProcessorArgs> arithmeticProcessor) {
            $.arithmeticProcessor = arithmeticProcessor;
            return this;
        }

        /**
         * @param arithmeticProcessor Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
         * 
         * @return builder
         * 
         */
        public Builder arithmeticProcessor(LogsCustomPipelineProcessorPipelineProcessorArithmeticProcessorArgs arithmeticProcessor) {
            return arithmeticProcessor(Output.of(arithmeticProcessor));
        }

        /**
         * @param attributeRemapper Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
         * 
         * @return builder
         * 
         */
        public Builder attributeRemapper(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorAttributeRemapperArgs> attributeRemapper) {
            $.attributeRemapper = attributeRemapper;
            return this;
        }

        /**
         * @param attributeRemapper Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
         * 
         * @return builder
         * 
         */
        public Builder attributeRemapper(LogsCustomPipelineProcessorPipelineProcessorAttributeRemapperArgs attributeRemapper) {
            return attributeRemapper(Output.of(attributeRemapper));
        }

        /**
         * @param categoryProcessor Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
         * 
         * @return builder
         * 
         */
        public Builder categoryProcessor(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs> categoryProcessor) {
            $.categoryProcessor = categoryProcessor;
            return this;
        }

        /**
         * @param categoryProcessor Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
         * 
         * @return builder
         * 
         */
        public Builder categoryProcessor(LogsCustomPipelineProcessorPipelineProcessorCategoryProcessorArgs categoryProcessor) {
            return categoryProcessor(Output.of(categoryProcessor));
        }

        /**
         * @param dateRemapper Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
         * 
         * @return builder
         * 
         */
        public Builder dateRemapper(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorDateRemapperArgs> dateRemapper) {
            $.dateRemapper = dateRemapper;
            return this;
        }

        /**
         * @param dateRemapper Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
         * 
         * @return builder
         * 
         */
        public Builder dateRemapper(LogsCustomPipelineProcessorPipelineProcessorDateRemapperArgs dateRemapper) {
            return dateRemapper(Output.of(dateRemapper));
        }

        /**
         * @param geoIpParser Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
         * 
         * @return builder
         * 
         */
        public Builder geoIpParser(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs> geoIpParser) {
            $.geoIpParser = geoIpParser;
            return this;
        }

        /**
         * @param geoIpParser Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
         * 
         * @return builder
         * 
         */
        public Builder geoIpParser(LogsCustomPipelineProcessorPipelineProcessorGeoIpParserArgs geoIpParser) {
            return geoIpParser(Output.of(geoIpParser));
        }

        /**
         * @param grokParser Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
         * 
         * @return builder
         * 
         */
        public Builder grokParser(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorGrokParserArgs> grokParser) {
            $.grokParser = grokParser;
            return this;
        }

        /**
         * @param grokParser Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
         * 
         * @return builder
         * 
         */
        public Builder grokParser(LogsCustomPipelineProcessorPipelineProcessorGrokParserArgs grokParser) {
            return grokParser(Output.of(grokParser));
        }

        /**
         * @param lookupProcessor Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder lookupProcessor(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs> lookupProcessor) {
            $.lookupProcessor = lookupProcessor;
            return this;
        }

        /**
         * @param lookupProcessor Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder lookupProcessor(LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs lookupProcessor) {
            return lookupProcessor(Output.of(lookupProcessor));
        }

        /**
         * @param messageRemapper Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
         * 
         * @return builder
         * 
         */
        public Builder messageRemapper(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorMessageRemapperArgs> messageRemapper) {
            $.messageRemapper = messageRemapper;
            return this;
        }

        /**
         * @param messageRemapper Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
         * 
         * @return builder
         * 
         */
        public Builder messageRemapper(LogsCustomPipelineProcessorPipelineProcessorMessageRemapperArgs messageRemapper) {
            return messageRemapper(Output.of(messageRemapper));
        }

        /**
         * @param referenceTableLookupProcessor Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder referenceTableLookupProcessor(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorReferenceTableLookupProcessorArgs> referenceTableLookupProcessor) {
            $.referenceTableLookupProcessor = referenceTableLookupProcessor;
            return this;
        }

        /**
         * @param referenceTableLookupProcessor Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
         * 
         * @return builder
         * 
         */
        public Builder referenceTableLookupProcessor(LogsCustomPipelineProcessorPipelineProcessorReferenceTableLookupProcessorArgs referenceTableLookupProcessor) {
            return referenceTableLookupProcessor(Output.of(referenceTableLookupProcessor));
        }

        /**
         * @param serviceRemapper Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
         * 
         * @return builder
         * 
         */
        public Builder serviceRemapper(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorServiceRemapperArgs> serviceRemapper) {
            $.serviceRemapper = serviceRemapper;
            return this;
        }

        /**
         * @param serviceRemapper Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
         * 
         * @return builder
         * 
         */
        public Builder serviceRemapper(LogsCustomPipelineProcessorPipelineProcessorServiceRemapperArgs serviceRemapper) {
            return serviceRemapper(Output.of(serviceRemapper));
        }

        /**
         * @param statusRemapper Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
         * 
         * @return builder
         * 
         */
        public Builder statusRemapper(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorStatusRemapperArgs> statusRemapper) {
            $.statusRemapper = statusRemapper;
            return this;
        }

        /**
         * @param statusRemapper Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
         * 
         * @return builder
         * 
         */
        public Builder statusRemapper(LogsCustomPipelineProcessorPipelineProcessorStatusRemapperArgs statusRemapper) {
            return statusRemapper(Output.of(statusRemapper));
        }

        /**
         * @param stringBuilderProcessor String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
         * 
         * @return builder
         * 
         */
        public Builder stringBuilderProcessor(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorStringBuilderProcessorArgs> stringBuilderProcessor) {
            $.stringBuilderProcessor = stringBuilderProcessor;
            return this;
        }

        /**
         * @param stringBuilderProcessor String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
         * 
         * @return builder
         * 
         */
        public Builder stringBuilderProcessor(LogsCustomPipelineProcessorPipelineProcessorStringBuilderProcessorArgs stringBuilderProcessor) {
            return stringBuilderProcessor(Output.of(stringBuilderProcessor));
        }

        /**
         * @param traceIdRemapper Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
         * 
         * @return builder
         * 
         */
        public Builder traceIdRemapper(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorTraceIdRemapperArgs> traceIdRemapper) {
            $.traceIdRemapper = traceIdRemapper;
            return this;
        }

        /**
         * @param traceIdRemapper Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
         * 
         * @return builder
         * 
         */
        public Builder traceIdRemapper(LogsCustomPipelineProcessorPipelineProcessorTraceIdRemapperArgs traceIdRemapper) {
            return traceIdRemapper(Output.of(traceIdRemapper));
        }

        /**
         * @param urlParser URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
         * 
         * @return builder
         * 
         */
        public Builder urlParser(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorUrlParserArgs> urlParser) {
            $.urlParser = urlParser;
            return this;
        }

        /**
         * @param urlParser URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
         * 
         * @return builder
         * 
         */
        public Builder urlParser(LogsCustomPipelineProcessorPipelineProcessorUrlParserArgs urlParser) {
            return urlParser(Output.of(urlParser));
        }

        /**
         * @param userAgentParser User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
         * 
         * @return builder
         * 
         */
        public Builder userAgentParser(@Nullable Output<LogsCustomPipelineProcessorPipelineProcessorUserAgentParserArgs> userAgentParser) {
            $.userAgentParser = userAgentParser;
            return this;
        }

        /**
         * @param userAgentParser User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
         * 
         * @return builder
         * 
         */
        public Builder userAgentParser(LogsCustomPipelineProcessorPipelineProcessorUserAgentParserArgs userAgentParser) {
            return userAgentParser(Output.of(userAgentParser));
        }

        public LogsCustomPipelineProcessorPipelineProcessorArgs build() {
            return $;
        }
    }

}