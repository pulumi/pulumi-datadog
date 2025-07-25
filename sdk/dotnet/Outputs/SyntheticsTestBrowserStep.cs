// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class SyntheticsTestBrowserStep
    {
        /// <summary>
        /// Determines if the step should be allowed to fail.
        /// </summary>
        public readonly bool? AllowFailure;
        /// <summary>
        /// Determines whether or not to always execute this step even if the previous step failed or was skipped.
        /// </summary>
        public readonly bool? AlwaysExecute;
        /// <summary>
        /// Determines whether or not to exit the test if the step succeeds.
        /// </summary>
        public readonly bool? ExitIfSucceed;
        /// <summary>
        /// Force update of the "element" parameter for the step
        /// </summary>
        public readonly bool? ForceElementUpdate;
        /// <summary>
        /// Determines whether or not to consider the entire test as failed if this step fails. Can be used only if `allow_failure` is `true`.
        /// </summary>
        public readonly bool? IsCritical;
        /// <summary>
        /// A unique identifier used to track steps after reordering.
        /// </summary>
        public readonly string? LocalKey;
        /// <summary>
        /// Name of the step.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Prevents saving screenshots of the step.
        /// </summary>
        public readonly bool? NoScreenshot;
        /// <summary>
        /// Parameters for the step.
        /// </summary>
        public readonly Outputs.SyntheticsTestBrowserStepParams Params;
        /// <summary>
        /// The identifier of the step on the backend.
        /// </summary>
        public readonly string? PublicId;
        /// <summary>
        /// Used to override the default timeout of a step.
        /// </summary>
        public readonly int? Timeout;
        /// <summary>
        /// Type of the step. Valid values are `assertCurrentUrl`, `assertElementAttribute`, `assertElementContent`, `assertElementPresent`, `assertEmail`, `assertFileDownload`, `assertFromJavascript`, `assertPageContains`, `assertPageLacks`, `assertRequests`, `click`, `extractFromJavascript`, `extractFromEmailBody`, `extractVariable`, `goToEmailLink`, `goToUrl`, `goToUrlAndMeasureTti`, `hover`, `playSubTest`, `pressKey`, `refresh`, `runApiTest`, `scroll`, `selectOption`, `typeText`, `uploadFiles`, `wait`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private SyntheticsTestBrowserStep(
            bool? allowFailure,

            bool? alwaysExecute,

            bool? exitIfSucceed,

            bool? forceElementUpdate,

            bool? isCritical,

            string? localKey,

            string name,

            bool? noScreenshot,

            Outputs.SyntheticsTestBrowserStepParams @params,

            string? publicId,

            int? timeout,

            string type)
        {
            AllowFailure = allowFailure;
            AlwaysExecute = alwaysExecute;
            ExitIfSucceed = exitIfSucceed;
            ForceElementUpdate = forceElementUpdate;
            IsCritical = isCritical;
            LocalKey = localKey;
            Name = name;
            NoScreenshot = noScreenshot;
            Params = @params;
            PublicId = publicId;
            Timeout = timeout;
            Type = type;
        }
    }
}
