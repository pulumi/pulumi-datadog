module github.com/pulumi/pulumi-datadog

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.6.0
	github.com/pkg/errors v0.9.1
	github.com/pulumi/pulumi v1.12.2-0.20200313044354-8111d33438b9
	github.com/pulumi/pulumi-terraform-bridge v1.8.2
	github.com/terraform-providers/terraform-provider-datadog v1.9.1-0.20200210163259-e1f6b31c5a1d
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
