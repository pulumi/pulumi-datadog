#!/usr/bin/env bash

set -euo pipefail

upgrade-provider pulumi/pulumi-datadog --kind=provider --target-version v3.67.0
