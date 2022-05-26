module github.com/pulumi/pulumi-datadog/provider/v4

go 1.16

require (
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.24.1
	github.com/pulumi/pulumi/sdk/v3 v3.33.1
	github.com/terraform-providers/terraform-provider-datadog v1.9.1-0.20200722132015-43f01ca20637
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20220505215311-795430389fa7
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-datadog => github.com/pulumi/terraform-provider-datadog v1.9.1-0.20220526113637-a5d798dd66fd
)
