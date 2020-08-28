module github.com/pulumi/pulumi-datadog/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.10.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.7.3
	github.com/pulumi/pulumi/sdk/v2 v2.9.1-0.20200825190708-910aa96016cd
	github.com/terraform-providers/terraform-provider-datadog v1.9.1-0.20200722132015-43f01ca20637
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-datadog => github.com/pulumi/terraform-provider-datadog v1.9.1-0.20200722180124-ee90fe5472ca
)
