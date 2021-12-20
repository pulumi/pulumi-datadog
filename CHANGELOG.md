CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v3.7.0 of the DataDog Terraform Provider
* Upgrade to v3.13.0 of the Pulumi Terraform Bridge
* Upgrade to v3.19.0 of the Pulumi SDK

---

## 4.4.0 (2021-11-18)
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0

## 4.3.0 (2021-10-29)
* Upgrade to v3.5.0 of the datadog Terraform Provider

## 4.2.0 (2021-09-27)
* Upgrade to v3.4.0 of the datadog Terraform Provider

## 4.1.0 (2021-09-03)
* Upgrade to v3.3.0 of the datadog Terraform Provider

## 4.0.0 (2021-07-12)
* Upgrade to v3.1.2 of the datadog Terraform Provider  
  **PLEASE NOTE the following breaking changes:**  
  * `datadog.TimeBoard` and `datadog.Screenboard` resources have been removed as they were previously deprecated.
  * `datadog.Monitor` has had `threshold`, `thresholdWindows` and `silenced` parameters removed
  * `datadog.User` has had `handle`, `isAdmin`, `accessRole` and `role` parameters removed
  * `datadog.syntheticsTest` has had `request`, `assertions`, `options`, `step` and `variable` parameters removed
  * `datadog.logsArchive` has had `s3`, `azure`, and `gcp` parameters removed
  * `datadog.serviceLevelObjective` has had `monitorSearch` parameter removed
  * `datadog.PagerDuty.Integration` has had `services` parameter removed
  * `datadog.dashboard` has had `layout`, `time`, `logset`, `count`, `start`, `compute` and `search` parameters removed

## 3.3.0 (2021-05-27)
* Upgrade to v3.2.1 of the pulumi-terraform-bridge

## 3.2.1 (2021-05-27)
* Upgrade to v2.26.1 of the datadog Terraform Provider

## 3.2.0 (2021-05-21)
* Upgrade to v2.26.0 of the datadog Terraform Provider

## 3.1.0 (2021-05-12)
* Upgrade to v2.25.0 of the datadog Terraform Provider

## 3.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 2.18.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 2.17.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.17.0 (2021-03-15)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.16.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.16.0 (2021-01-29)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.15.0 (2021-01-21)
* Upgrade to v2.20.0 of the datadog Terraform Provider

## 2.14.1 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.14.0 (2021-01-08)
* Upgrade to v2.19.1 of the datadog Terraform Provider

## 2.13.0 (2020-12-10)
* Upgrade to v2.18.1.0 of the datadog Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.15.3

## 2.12.0 (2020-12-08)
* Upgrade to v2.17.0 of the datadog Terraform Provider

## 2.11.0 (2020-11-24)
* Upgrade to v2.16.0 of the datadog Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.10.0 (2020-10-28)
* Upgrade to v2.14.0 of the datadog Terraform Provider

## 2.9.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.8.0 (2020-09-21)
* Upgrade to v2.13.0 of the datadog Terraform Provider
* Upgrade to Pulumi v2.10.0
* Upgrade to pulumi-terraform-bridge v2.8.0

## 2.7.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.6.0 (2020-07-23)
* Upgrade to v2.12.0 of the datadog Terraform Provider

## 2.5.0 (2020-06-30)
* Upgrade to v2.11.0 of the datadog Terraform Provider

## 2.4.0 (2020-06-26)
* Upgrade to v2.10.0 of the datadog Terraform Provider

## 2.3.0 (2020-06-23)
* Upgrade to v2.9.0 of the datadog Terraform Provider

## 2.2.0 (2020-06-16)
* Upgrade to v2.8.0 of the datadog Terraform provider.
* Switch to GitHub actions for build

## 2.1.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.1.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.1.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.0.0 (2020-04-17)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.4.0 (2020-04-14)
* Upgrade to Pulumi v1.13.1
* Upgrade to pulumi-terraform-bridge v1.8.4
* Refactor layout to support Go modules

## 1.3.0 (2020-03-23)
* Namespace names in .NET SDK are adjusted to PascalCase
([#33](https://github.com/pulumi/pulumi-datadog/pull/33)).
* Upgrade to v2.7.0 of the datadog Terraform provider.
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.2.0 (2019-12-04)
* Upgrade to support go 1.13.x
* Upgrade to pulumi-terraform@dotnet

## 1.1.0 (2019-11-15)
* Add support for DotNet SDK Generation

## 1.0.0 (2019-10-23)
* Regenerate SDK based on tf2pulumi 0.6.0
* Upgrade to v2.5.0 of the datadog Terraform provider.

## 0.18.11 (2019-09-11)
* Upgrade to v2.4.0 of the datadog Terraform provider.

## 0.18.10 (2019-09-05)
* Upgrade to Pulumi v1.0.0

## 0.18.9 (2019-08-30)
* Upgrade to v2.3.0 of the datadog Terraform provider.

## 0.18.8 (2019-08-29)
* Upgrade to v2.2.0 of the datadog Terraform provider.
* Upgrade pulumi-terraform to 3f206601e7

## 0.18.7 (2019-08-20)
* Depend on latest pulumi package

## 0.18.6 (2019-08-09)
* Upgrade to pulumi-terraform@9db2fc93cd

## 0.18.5 (2019-08-08)
* Update to pulumi-terraform@013b95b1c8

## 0.18.4 (2019-07-30)
* Upgrade to pulumi-terraform 6bcafb609d
* Upgrade to v2.1.0 of the datadog Terraform provider.

## 0.18.3 (2019-07-09)
* Fix detailed diffs with nested computed values.

## 0.18.2 (2019-07-08)
* Communicate detailed information about the difference between a resource's desired and actual state during a Pulumi update

## 0.18.1 (2019-06-24)
* Update to version 2.0.1 of the datadog Terraform provider

## 0.18.0 (2019-06-24)
* Initial release of the provider against 1.9.0 of the Terraform provider
