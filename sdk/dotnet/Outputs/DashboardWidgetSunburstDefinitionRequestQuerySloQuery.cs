// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class DashboardWidgetSunburstDefinitionRequestQuerySloQuery
    {
        public readonly string? AdditionalQueryFilters;
        public readonly string DataSource;
        public readonly string? GroupMode;
        public readonly string Measure;
        public readonly string? Name;
        public readonly string SloId;
        public readonly string? SloQueryType;

        [OutputConstructor]
        private DashboardWidgetSunburstDefinitionRequestQuerySloQuery(
            string? additionalQueryFilters,

            string dataSource,

            string? groupMode,

            string measure,

            string? name,

            string sloId,

            string? sloQueryType)
        {
            AdditionalQueryFilters = additionalQueryFilters;
            DataSource = dataSource;
            GroupMode = groupMode;
            Measure = measure;
            Name = name;
            SloId = sloId;
            SloQueryType = sloQueryType;
        }
    }
}