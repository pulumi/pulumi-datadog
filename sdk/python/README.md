[![Actions Status](https://github.com/pulumi/pulumi-datadog/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-datadog/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fdatadog.svg)](https://www.npmjs.com/package/@pulumi/datadog)
[![Python version](https://badge.fury.io/py/pulumi-datadog.svg)](https://pypi.org/project/pulumi-datadog)
[![NuGet version](https://badge.fury.io/nu/pulumi.datadog.svg)](https://badge.fury.io/nu/pulumi.datadog)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-datadog/sdk/v2/go)](https://pkg.go.dev/github.com/pulumi/pulumi-datadog/sdk/v2/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-datadog/blob/master/LICENSE)

# Datadog Provider

The Datadog resource provider for Pulumi lets you configure Datadog resources in your cloud programs.  To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/datadog

or `yarn`:

    $ yarn add @pulumi/datadog

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_datadog

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-datadog/sdk/v2/go/datadog/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Datadog

## Configuration

The following configuration points are available:

* apiKey (Required) - Datadog API key. This can also be set via the `DATADOG_API_KEY` environment variable.
* appKey (Required) - Datadog APP key. This can also be set via the `DATADOG_APP_KEY` environment variable.
* apiUrl (Optional) - The API Url. This can be also be set via the DATADOG_HOST environment variable.
  Note that this URL must not end with the `/api/` path. For example, `https://api.datadoghq.com/` is a correct value, 
  while `https://api.datadoghq.com/api/` is not.


## Reference


For further information, please visit [the Datadog provider docs](https://www.pulumi.com/docs/intro/cloud-providers/datadog) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/datadog).
