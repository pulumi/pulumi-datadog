// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsCustomPipelineProcessorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Arithmetic Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#arithmetic-processor)
        /// </summary>
        [Input("arithmeticProcessor")]
        public Input<Inputs.LogsCustomPipelineProcessorArithmeticProcessorArgs>? ArithmeticProcessor { get; set; }

        /// <summary>
        /// Attribute Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#remapper)
        /// </summary>
        [Input("attributeRemapper")]
        public Input<Inputs.LogsCustomPipelineProcessorAttributeRemapperArgs>? AttributeRemapper { get; set; }

        /// <summary>
        /// Category Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#category-processor)
        /// </summary>
        [Input("categoryProcessor")]
        public Input<Inputs.LogsCustomPipelineProcessorCategoryProcessorArgs>? CategoryProcessor { get; set; }

        /// <summary>
        /// Date Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-date-remapper)
        /// </summary>
        [Input("dateRemapper")]
        public Input<Inputs.LogsCustomPipelineProcessorDateRemapperArgs>? DateRemapper { get; set; }

        /// <summary>
        /// Date GeoIP Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#geoip-parser)
        /// </summary>
        [Input("geoIpParser")]
        public Input<Inputs.LogsCustomPipelineProcessorGeoIpParserArgs>? GeoIpParser { get; set; }

        /// <summary>
        /// Grok Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#grok-parser)
        /// </summary>
        [Input("grokParser")]
        public Input<Inputs.LogsCustomPipelineProcessorGrokParserArgs>? GrokParser { get; set; }

        /// <summary>
        /// Lookup Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
        /// </summary>
        [Input("lookupProcessor")]
        public Input<Inputs.LogsCustomPipelineProcessorLookupProcessorArgs>? LookupProcessor { get; set; }

        /// <summary>
        /// Message Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-message-remapper)
        /// </summary>
        [Input("messageRemapper")]
        public Input<Inputs.LogsCustomPipelineProcessorMessageRemapperArgs>? MessageRemapper { get; set; }

        [Input("pipeline")]
        public Input<Inputs.LogsCustomPipelineProcessorPipelineArgs>? Pipeline { get; set; }

        /// <summary>
        /// Reference Table Lookup Processor. Reference Tables are in public beta. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#lookup-processor)
        /// </summary>
        [Input("referenceTableLookupProcessor")]
        public Input<Inputs.LogsCustomPipelineProcessorReferenceTableLookupProcessorArgs>? ReferenceTableLookupProcessor { get; set; }

        /// <summary>
        /// Service Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#service-remapper)
        /// </summary>
        [Input("serviceRemapper")]
        public Input<Inputs.LogsCustomPipelineProcessorServiceRemapperArgs>? ServiceRemapper { get; set; }

        /// <summary>
        /// Span ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/log_configuration/processors/?tab=ui#span-remapper)
        /// </summary>
        [Input("spanIdRemapper")]
        public Input<Inputs.LogsCustomPipelineProcessorSpanIdRemapperArgs>? SpanIdRemapper { get; set; }

        /// <summary>
        /// Status Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#log-status-remapper)
        /// </summary>
        [Input("statusRemapper")]
        public Input<Inputs.LogsCustomPipelineProcessorStatusRemapperArgs>? StatusRemapper { get; set; }

        /// <summary>
        /// String Builder Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#string-builder-processor)
        /// </summary>
        [Input("stringBuilderProcessor")]
        public Input<Inputs.LogsCustomPipelineProcessorStringBuilderProcessorArgs>? StringBuilderProcessor { get; set; }

        /// <summary>
        /// Trace ID Remapper Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#trace-remapper)
        /// </summary>
        [Input("traceIdRemapper")]
        public Input<Inputs.LogsCustomPipelineProcessorTraceIdRemapperArgs>? TraceIdRemapper { get; set; }

        /// <summary>
        /// URL Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#url-parser)
        /// </summary>
        [Input("urlParser")]
        public Input<Inputs.LogsCustomPipelineProcessorUrlParserArgs>? UrlParser { get; set; }

        /// <summary>
        /// User-Agent Parser Processor. More information can be found in the [official docs](https://docs.datadoghq.com/logs/processing/processors/?tab=ui#user-agent-parser)
        /// </summary>
        [Input("userAgentParser")]
        public Input<Inputs.LogsCustomPipelineProcessorUserAgentParserArgs>? UserAgentParser { get; set; }

        public LogsCustomPipelineProcessorArgs()
        {
        }
        public static new LogsCustomPipelineProcessorArgs Empty => new LogsCustomPipelineProcessorArgs();
    }
}
