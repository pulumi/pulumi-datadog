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
    public sealed class LogsArchiveS3
    {
        /// <summary>
        /// Your AWS account id.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Name of your gcs bucket.
        /// </summary>
        public readonly string Bucket;
        /// <summary>
        /// Your client email.
        /// </summary>
        public readonly string ClientEmail;
        /// <summary>
        /// The path where the archive will be stored.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// Your project id.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Your AWS role name.
        /// </summary>
        public readonly string RoleName;

        [OutputConstructor]
        private LogsArchiveS3(
            string accountId,

            string bucket,

            string clientEmail,

            string path,

            string projectId,

            string roleName)
        {
            AccountId = accountId;
            Bucket = bucket;
            ClientEmail = clientEmail;
            Path = path;
            ProjectId = projectId;
            RoleName = roleName;
        }
    }
}