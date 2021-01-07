module github.com/pulumi/pulumi-datadog/provider/v2

go 1.15

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.15.3
	github.com/pulumi/pulumi/sdk/v2 v2.15.1-0.20201202214525-260620430c4c
	github.com/terraform-providers/terraform-provider-datadog v1.9.1-0.20200722132015-43f01ca20637
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-datadog => github.com/pulumi/terraform-provider-datadog v1.9.1-0.20210107155503-1e66dec2a2cc
)
