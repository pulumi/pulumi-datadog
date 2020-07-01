module github.com/pulumi/pulumi-datadog/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.10.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.5.2
	github.com/pulumi/pulumi/sdk/v2 v2.5.1-0.20200630091945-bb358c4d2173
	github.com/terraform-providers/terraform-provider-datadog v1.9.1-0.20200610172201-eb8a8c540942
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-datadog => github.com/pulumi/terraform-provider-datadog v1.9.1-0.20200629141745-4b4c7cca8af6
)
