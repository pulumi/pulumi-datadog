module github.com/pulumi/pulumi-datadog

go 1.13

replace (
	github.com/Azure/azure-sdk-for-go => github.com/Azure/azure-sdk-for-go v31.1.0+incompatible
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	cloud.google.com/go/logging v1.0.0 // indirect
	github.com/apparentlymart/go-cidr v1.0.1 // indirect
	github.com/hashicorp/go-getter v1.4.0 // indirect
	github.com/hashicorp/terraform v0.12.7
	github.com/mitchellh/reflectwalk v1.0.1 // indirect
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.9.1
	github.com/pulumi/pulumi-terraform v0.18.4-0.20191202134852-87cfb4dc8ae1
	github.com/spf13/afero v1.2.2 // indirect
	github.com/spf13/cobra v0.0.5 // indirect
	github.com/terraform-providers/terraform-provider-datadog v1.9.1-0.20200121205624-f258e14a2210
	github.com/zclconf/go-cty v1.1.0 // indirect
	golang.org/x/crypto v0.0.0-20190820162420-60c769a6c586 // indirect
	golang.org/x/net v0.0.0-20190926025831-c00fd9afed17 // indirect
	google.golang.org/grpc v1.24.0 // indirect
)
