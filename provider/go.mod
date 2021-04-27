module github.com/pulumi/pulumi-datadog/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
	github.com/terraform-providers/terraform-provider-datadog v1.9.1
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/pulumi/pulumi-terraform-bridge/v3 => github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.1-0.20210427173902-f46ca43eac93
	github.com/terraform-providers/terraform-provider-datadog => github.com/DataDog/terraform-provider-datadog v1.9.1-0.20210427160521-e026c5fa9d48
)
