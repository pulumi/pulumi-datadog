// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class ObservabilityPipelineConfigProcessorsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("addEnvVars")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsAddEnvVarGetArgs>? _addEnvVars;

        /// <summary>
        /// The `add_env_vars` processor adds environment variable values to log events.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsAddEnvVarGetArgs> AddEnvVars
        {
            get => _addEnvVars ?? (_addEnvVars = new InputList<Inputs.ObservabilityPipelineConfigProcessorsAddEnvVarGetArgs>());
            set => _addEnvVars = value;
        }

        [Input("addFields")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsAddFieldGetArgs>? _addFields;

        /// <summary>
        /// The `add_fields` processor adds static key-value fields to logs.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsAddFieldGetArgs> AddFields
        {
            get => _addFields ?? (_addFields = new InputList<Inputs.ObservabilityPipelineConfigProcessorsAddFieldGetArgs>());
            set => _addFields = value;
        }

        [Input("dedupes")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsDedupeGetArgs>? _dedupes;

        /// <summary>
        /// The `dedupe` processor removes duplicate fields in log events.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsDedupeGetArgs> Dedupes
        {
            get => _dedupes ?? (_dedupes = new InputList<Inputs.ObservabilityPipelineConfigProcessorsDedupeGetArgs>());
            set => _dedupes = value;
        }

        [Input("enrichmentTables")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsEnrichmentTableGetArgs>? _enrichmentTables;

        /// <summary>
        /// The `enrichment_table` processor enriches logs using a static CSV file or GeoIP database.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsEnrichmentTableGetArgs> EnrichmentTables
        {
            get => _enrichmentTables ?? (_enrichmentTables = new InputList<Inputs.ObservabilityPipelineConfigProcessorsEnrichmentTableGetArgs>());
            set => _enrichmentTables = value;
        }

        [Input("filters")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsFilterGetArgs>? _filters;

        /// <summary>
        /// The `filter` processor allows conditional processing of logs based on a Datadog search query. Logs that match the `include` query are passed through; others are discarded.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.ObservabilityPipelineConfigProcessorsFilterGetArgs>());
            set => _filters = value;
        }

        [Input("generateDatadogMetrics")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsGenerateDatadogMetricGetArgs>? _generateDatadogMetrics;

        /// <summary>
        /// The `generate_datadog_metrics` processor creates custom metrics from logs. Metrics can be counters, gauges, or distributions and optionally grouped by log fields.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsGenerateDatadogMetricGetArgs> GenerateDatadogMetrics
        {
            get => _generateDatadogMetrics ?? (_generateDatadogMetrics = new InputList<Inputs.ObservabilityPipelineConfigProcessorsGenerateDatadogMetricGetArgs>());
            set => _generateDatadogMetrics = value;
        }

        [Input("ocsfMappers")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsOcsfMapperGetArgs>? _ocsfMappers;

        /// <summary>
        /// The `ocsf_mapper` processor transforms logs into the OCSF schema using predefined library mappings.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsOcsfMapperGetArgs> OcsfMappers
        {
            get => _ocsfMappers ?? (_ocsfMappers = new InputList<Inputs.ObservabilityPipelineConfigProcessorsOcsfMapperGetArgs>());
            set => _ocsfMappers = value;
        }

        [Input("parseGroks")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsParseGrokGetArgs>? _parseGroks;

        /// <summary>
        /// The `parse_grok` processor extracts structured fields from unstructured log messages using Grok patterns.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsParseGrokGetArgs> ParseGroks
        {
            get => _parseGroks ?? (_parseGroks = new InputList<Inputs.ObservabilityPipelineConfigProcessorsParseGrokGetArgs>());
            set => _parseGroks = value;
        }

        [Input("parseJsons")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsParseJsonGetArgs>? _parseJsons;

        /// <summary>
        /// The `parse_json` processor extracts JSON from a specified field and flattens it into the event. This is useful when logs contain embedded JSON as a string.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsParseJsonGetArgs> ParseJsons
        {
            get => _parseJsons ?? (_parseJsons = new InputList<Inputs.ObservabilityPipelineConfigProcessorsParseJsonGetArgs>());
            set => _parseJsons = value;
        }

        [Input("quotas")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsQuotaGetArgs>? _quotas;

        /// <summary>
        /// The `quota` measures logging traffic for logs that match a specified filter. When the configured daily quota is met, the processor can drop or alert.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsQuotaGetArgs> Quotas
        {
            get => _quotas ?? (_quotas = new InputList<Inputs.ObservabilityPipelineConfigProcessorsQuotaGetArgs>());
            set => _quotas = value;
        }

        [Input("reduces")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsReduceGetArgs>? _reduces;

        /// <summary>
        /// The `reduce` processor aggregates and merges logs based on matching keys and merge strategies.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsReduceGetArgs> Reduces
        {
            get => _reduces ?? (_reduces = new InputList<Inputs.ObservabilityPipelineConfigProcessorsReduceGetArgs>());
            set => _reduces = value;
        }

        [Input("removeFields")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsRemoveFieldGetArgs>? _removeFields;

        /// <summary>
        /// The `remove_fields` processor deletes specified fields from logs.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsRemoveFieldGetArgs> RemoveFields
        {
            get => _removeFields ?? (_removeFields = new InputList<Inputs.ObservabilityPipelineConfigProcessorsRemoveFieldGetArgs>());
            set => _removeFields = value;
        }

        [Input("renameFields")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsRenameFieldGetArgs>? _renameFields;

        /// <summary>
        /// The `rename_fields` processor changes field names.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsRenameFieldGetArgs> RenameFields
        {
            get => _renameFields ?? (_renameFields = new InputList<Inputs.ObservabilityPipelineConfigProcessorsRenameFieldGetArgs>());
            set => _renameFields = value;
        }

        [Input("samples")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsSampleGetArgs>? _samples;

        /// <summary>
        /// The `sample` processor allows probabilistic sampling of logs at a fixed rate.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsSampleGetArgs> Samples
        {
            get => _samples ?? (_samples = new InputList<Inputs.ObservabilityPipelineConfigProcessorsSampleGetArgs>());
            set => _samples = value;
        }

        [Input("sensitiveDataScanners")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsSensitiveDataScannerGetArgs>? _sensitiveDataScanners;

        /// <summary>
        /// The `sensitive_data_scanner` processor detects and optionally redacts sensitive data in log events.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsSensitiveDataScannerGetArgs> SensitiveDataScanners
        {
            get => _sensitiveDataScanners ?? (_sensitiveDataScanners = new InputList<Inputs.ObservabilityPipelineConfigProcessorsSensitiveDataScannerGetArgs>());
            set => _sensitiveDataScanners = value;
        }

        [Input("throttles")]
        private InputList<Inputs.ObservabilityPipelineConfigProcessorsThrottleGetArgs>? _throttles;

        /// <summary>
        /// The `throttle` processor limits the number of events that pass through over a given time window.
        /// </summary>
        public InputList<Inputs.ObservabilityPipelineConfigProcessorsThrottleGetArgs> Throttles
        {
            get => _throttles ?? (_throttles = new InputList<Inputs.ObservabilityPipelineConfigProcessorsThrottleGetArgs>());
            set => _throttles = value;
        }

        public ObservabilityPipelineConfigProcessorsGetArgs()
        {
        }
        public static new ObservabilityPipelineConfigProcessorsGetArgs Empty => new ObservabilityPipelineConfigProcessorsGetArgs();
    }
}
