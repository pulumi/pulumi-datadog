// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SyntheticsTestApiStepArgs;
import com.pulumi.datadog.inputs.SyntheticsTestAssertionArgs;
import com.pulumi.datadog.inputs.SyntheticsTestBrowserStepArgs;
import com.pulumi.datadog.inputs.SyntheticsTestBrowserVariableArgs;
import com.pulumi.datadog.inputs.SyntheticsTestConfigVariableArgs;
import com.pulumi.datadog.inputs.SyntheticsTestOptionsListArgs;
import com.pulumi.datadog.inputs.SyntheticsTestRequestBasicauthArgs;
import com.pulumi.datadog.inputs.SyntheticsTestRequestClientCertificateArgs;
import com.pulumi.datadog.inputs.SyntheticsTestRequestDefinitionArgs;
import com.pulumi.datadog.inputs.SyntheticsTestRequestProxyArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestArgs Empty = new SyntheticsTestArgs();

    /**
     * Steps for multistep api tests
     * 
     */
    @Import(name="apiSteps")
    private @Nullable Output<List<SyntheticsTestApiStepArgs>> apiSteps;

    /**
     * @return Steps for multistep api tests
     * 
     */
    public Optional<Output<List<SyntheticsTestApiStepArgs>>> apiSteps() {
        return Optional.ofNullable(this.apiSteps);
    }

    /**
     * Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
     * 
     */
    @Import(name="assertions")
    private @Nullable Output<List<SyntheticsTestAssertionArgs>> assertions;

    /**
     * @return Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
     * 
     */
    public Optional<Output<List<SyntheticsTestAssertionArgs>>> assertions() {
        return Optional.ofNullable(this.assertions);
    }

    /**
     * Steps for browser tests.
     * 
     */
    @Import(name="browserSteps")
    private @Nullable Output<List<SyntheticsTestBrowserStepArgs>> browserSteps;

    /**
     * @return Steps for browser tests.
     * 
     */
    public Optional<Output<List<SyntheticsTestBrowserStepArgs>>> browserSteps() {
        return Optional.ofNullable(this.browserSteps);
    }

    /**
     * Variables used for a browser test steps. Multiple `variable` blocks are allowed with the structure below.
     * 
     */
    @Import(name="browserVariables")
    private @Nullable Output<List<SyntheticsTestBrowserVariableArgs>> browserVariables;

    /**
     * @return Variables used for a browser test steps. Multiple `variable` blocks are allowed with the structure below.
     * 
     */
    public Optional<Output<List<SyntheticsTestBrowserVariableArgs>>> browserVariables() {
        return Optional.ofNullable(this.browserVariables);
    }

    /**
     * Variables used for the test configuration. Multiple `config_variable` blocks are allowed with the structure below.
     * 
     */
    @Import(name="configVariables")
    private @Nullable Output<List<SyntheticsTestConfigVariableArgs>> configVariables;

    /**
     * @return Variables used for the test configuration. Multiple `config_variable` blocks are allowed with the structure below.
     * 
     */
    public Optional<Output<List<SyntheticsTestConfigVariableArgs>>> configVariables() {
        return Optional.ofNullable(this.configVariables);
    }

    /**
     * Required if `type = &#34;browser&#34;`. Array with the different device IDs used to run the test.
     * 
     */
    @Import(name="deviceIds")
    private @Nullable Output<List<String>> deviceIds;

    /**
     * @return Required if `type = &#34;browser&#34;`. Array with the different device IDs used to run the test.
     * 
     */
    public Optional<Output<List<String>>> deviceIds() {
        return Optional.ofNullable(this.deviceIds);
    }

    /**
     * Array of locations used to run the test. Refer to [the Datadog Synthetics location data
     * source](https://registry.terraform.io/providers/DataDog/datadog/latest/docs/data-sources/synthetics_locations) to
     * retrieve the list of locations.
     * 
     */
    @Import(name="locations", required=true)
    private Output<List<String>> locations;

    /**
     * @return Array of locations used to run the test. Refer to [the Datadog Synthetics location data
     * source](https://registry.terraform.io/providers/DataDog/datadog/latest/docs/data-sources/synthetics_locations) to
     * retrieve the list of locations.
     * 
     */
    public Output<List<String>> locations() {
        return this.locations;
    }

    /**
     * A message to include with notifications for this synthetics test. Email notifications can be sent to specific users by
     * using the same `@username` notation as events.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A message to include with notifications for this synthetics test. Email notifications can be sent to specific users by
     * using the same `@username` notation as events.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Name of Datadog synthetics test.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of Datadog synthetics test.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="optionsList")
    private @Nullable Output<SyntheticsTestOptionsListArgs> optionsList;

    public Optional<Output<SyntheticsTestOptionsListArgs>> optionsList() {
        return Optional.ofNullable(this.optionsList);
    }

    /**
     * The HTTP basic authentication credentials. Exactly one nested block is allowed with the structure below.
     * 
     */
    @Import(name="requestBasicauth")
    private @Nullable Output<SyntheticsTestRequestBasicauthArgs> requestBasicauth;

    /**
     * @return The HTTP basic authentication credentials. Exactly one nested block is allowed with the structure below.
     * 
     */
    public Optional<Output<SyntheticsTestRequestBasicauthArgs>> requestBasicauth() {
        return Optional.ofNullable(this.requestBasicauth);
    }

    /**
     * Client certificate to use when performing the test request. Exactly one nested block is allowed with the structure
     * below.
     * 
     */
    @Import(name="requestClientCertificate")
    private @Nullable Output<SyntheticsTestRequestClientCertificateArgs> requestClientCertificate;

    /**
     * @return Client certificate to use when performing the test request. Exactly one nested block is allowed with the structure
     * below.
     * 
     */
    public Optional<Output<SyntheticsTestRequestClientCertificateArgs>> requestClientCertificate() {
        return Optional.ofNullable(this.requestClientCertificate);
    }

    /**
     * Required if `type = &#34;api&#34;`. The synthetics test request.
     * 
     */
    @Import(name="requestDefinition")
    private @Nullable Output<SyntheticsTestRequestDefinitionArgs> requestDefinition;

    /**
     * @return Required if `type = &#34;api&#34;`. The synthetics test request.
     * 
     */
    public Optional<Output<SyntheticsTestRequestDefinitionArgs>> requestDefinition() {
        return Optional.ofNullable(this.requestDefinition);
    }

    /**
     * Header name and value map.
     * 
     */
    @Import(name="requestHeaders")
    private @Nullable Output<Map<String,Object>> requestHeaders;

    /**
     * @return Header name and value map.
     * 
     */
    public Optional<Output<Map<String,Object>>> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }

    /**
     * The proxy to perform the test.
     * 
     */
    @Import(name="requestProxy")
    private @Nullable Output<SyntheticsTestRequestProxyArgs> requestProxy;

    /**
     * @return The proxy to perform the test.
     * 
     */
    public Optional<Output<SyntheticsTestRequestProxyArgs>> requestProxy() {
        return Optional.ofNullable(this.requestProxy);
    }

    /**
     * Query arguments name and value map.
     * 
     */
    @Import(name="requestQuery")
    private @Nullable Output<Map<String,Object>> requestQuery;

    /**
     * @return Query arguments name and value map.
     * 
     */
    public Optional<Output<Map<String,Object>>> requestQuery() {
        return Optional.ofNullable(this.requestQuery);
    }

    /**
     * Cookies to be used for a browser test request, using the
     * [Set-Cookie](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie) syntax.
     * 
     */
    @Import(name="setCookie")
    private @Nullable Output<String> setCookie;

    /**
     * @return Cookies to be used for a browser test request, using the
     * [Set-Cookie](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie) syntax.
     * 
     */
    public Optional<Output<String>> setCookie() {
        return Optional.ofNullable(this.setCookie);
    }

    /**
     * Define whether you want to start (`live`) or pause (`paused`) a Synthetic test.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return Define whether you want to start (`live`) or pause (`paused`) a Synthetic test.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * The subtype of the Synthetic API test. Defaults to `http`.
     * 
     */
    @Import(name="subtype")
    private @Nullable Output<String> subtype;

    /**
     * @return The subtype of the Synthetic API test. Defaults to `http`.
     * 
     */
    public Optional<Output<String>> subtype() {
        return Optional.ofNullable(this.subtype);
    }

    /**
     * A list of tags to associate with your synthetics test. This can help you categorize and filter tests in the manage
     * synthetics page of the UI. Default is an empty list (`[]`).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags to associate with your synthetics test. This can help you categorize and filter tests in the manage
     * synthetics page of the UI. Default is an empty list (`[]`).
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Synthetics test type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Synthetics test type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SyntheticsTestArgs() {}

    private SyntheticsTestArgs(SyntheticsTestArgs $) {
        this.apiSteps = $.apiSteps;
        this.assertions = $.assertions;
        this.browserSteps = $.browserSteps;
        this.browserVariables = $.browserVariables;
        this.configVariables = $.configVariables;
        this.deviceIds = $.deviceIds;
        this.locations = $.locations;
        this.message = $.message;
        this.name = $.name;
        this.optionsList = $.optionsList;
        this.requestBasicauth = $.requestBasicauth;
        this.requestClientCertificate = $.requestClientCertificate;
        this.requestDefinition = $.requestDefinition;
        this.requestHeaders = $.requestHeaders;
        this.requestProxy = $.requestProxy;
        this.requestQuery = $.requestQuery;
        this.setCookie = $.setCookie;
        this.status = $.status;
        this.subtype = $.subtype;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestArgs $;

        public Builder() {
            $ = new SyntheticsTestArgs();
        }

        public Builder(SyntheticsTestArgs defaults) {
            $ = new SyntheticsTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiSteps Steps for multistep api tests
         * 
         * @return builder
         * 
         */
        public Builder apiSteps(@Nullable Output<List<SyntheticsTestApiStepArgs>> apiSteps) {
            $.apiSteps = apiSteps;
            return this;
        }

        /**
         * @param apiSteps Steps for multistep api tests
         * 
         * @return builder
         * 
         */
        public Builder apiSteps(List<SyntheticsTestApiStepArgs> apiSteps) {
            return apiSteps(Output.of(apiSteps));
        }

        /**
         * @param apiSteps Steps for multistep api tests
         * 
         * @return builder
         * 
         */
        public Builder apiSteps(SyntheticsTestApiStepArgs... apiSteps) {
            return apiSteps(List.of(apiSteps));
        }

        /**
         * @param assertions Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder assertions(@Nullable Output<List<SyntheticsTestAssertionArgs>> assertions) {
            $.assertions = assertions;
            return this;
        }

        /**
         * @param assertions Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder assertions(List<SyntheticsTestAssertionArgs> assertions) {
            return assertions(Output.of(assertions));
        }

        /**
         * @param assertions Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder assertions(SyntheticsTestAssertionArgs... assertions) {
            return assertions(List.of(assertions));
        }

        /**
         * @param browserSteps Steps for browser tests.
         * 
         * @return builder
         * 
         */
        public Builder browserSteps(@Nullable Output<List<SyntheticsTestBrowserStepArgs>> browserSteps) {
            $.browserSteps = browserSteps;
            return this;
        }

        /**
         * @param browserSteps Steps for browser tests.
         * 
         * @return builder
         * 
         */
        public Builder browserSteps(List<SyntheticsTestBrowserStepArgs> browserSteps) {
            return browserSteps(Output.of(browserSteps));
        }

        /**
         * @param browserSteps Steps for browser tests.
         * 
         * @return builder
         * 
         */
        public Builder browserSteps(SyntheticsTestBrowserStepArgs... browserSteps) {
            return browserSteps(List.of(browserSteps));
        }

        /**
         * @param browserVariables Variables used for a browser test steps. Multiple `variable` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder browserVariables(@Nullable Output<List<SyntheticsTestBrowserVariableArgs>> browserVariables) {
            $.browserVariables = browserVariables;
            return this;
        }

        /**
         * @param browserVariables Variables used for a browser test steps. Multiple `variable` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder browserVariables(List<SyntheticsTestBrowserVariableArgs> browserVariables) {
            return browserVariables(Output.of(browserVariables));
        }

        /**
         * @param browserVariables Variables used for a browser test steps. Multiple `variable` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder browserVariables(SyntheticsTestBrowserVariableArgs... browserVariables) {
            return browserVariables(List.of(browserVariables));
        }

        /**
         * @param configVariables Variables used for the test configuration. Multiple `config_variable` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder configVariables(@Nullable Output<List<SyntheticsTestConfigVariableArgs>> configVariables) {
            $.configVariables = configVariables;
            return this;
        }

        /**
         * @param configVariables Variables used for the test configuration. Multiple `config_variable` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder configVariables(List<SyntheticsTestConfigVariableArgs> configVariables) {
            return configVariables(Output.of(configVariables));
        }

        /**
         * @param configVariables Variables used for the test configuration. Multiple `config_variable` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder configVariables(SyntheticsTestConfigVariableArgs... configVariables) {
            return configVariables(List.of(configVariables));
        }

        /**
         * @param deviceIds Required if `type = &#34;browser&#34;`. Array with the different device IDs used to run the test.
         * 
         * @return builder
         * 
         */
        public Builder deviceIds(@Nullable Output<List<String>> deviceIds) {
            $.deviceIds = deviceIds;
            return this;
        }

        /**
         * @param deviceIds Required if `type = &#34;browser&#34;`. Array with the different device IDs used to run the test.
         * 
         * @return builder
         * 
         */
        public Builder deviceIds(List<String> deviceIds) {
            return deviceIds(Output.of(deviceIds));
        }

        /**
         * @param deviceIds Required if `type = &#34;browser&#34;`. Array with the different device IDs used to run the test.
         * 
         * @return builder
         * 
         */
        public Builder deviceIds(String... deviceIds) {
            return deviceIds(List.of(deviceIds));
        }

        /**
         * @param locations Array of locations used to run the test. Refer to [the Datadog Synthetics location data
         * source](https://registry.terraform.io/providers/DataDog/datadog/latest/docs/data-sources/synthetics_locations) to
         * retrieve the list of locations.
         * 
         * @return builder
         * 
         */
        public Builder locations(Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations Array of locations used to run the test. Refer to [the Datadog Synthetics location data
         * source](https://registry.terraform.io/providers/DataDog/datadog/latest/docs/data-sources/synthetics_locations) to
         * retrieve the list of locations.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations Array of locations used to run the test. Refer to [the Datadog Synthetics location data
         * source](https://registry.terraform.io/providers/DataDog/datadog/latest/docs/data-sources/synthetics_locations) to
         * retrieve the list of locations.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param message A message to include with notifications for this synthetics test. Email notifications can be sent to specific users by
         * using the same `@username` notation as events.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A message to include with notifications for this synthetics test. Email notifications can be sent to specific users by
         * using the same `@username` notation as events.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param name Name of Datadog synthetics test.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Datadog synthetics test.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder optionsList(@Nullable Output<SyntheticsTestOptionsListArgs> optionsList) {
            $.optionsList = optionsList;
            return this;
        }

        public Builder optionsList(SyntheticsTestOptionsListArgs optionsList) {
            return optionsList(Output.of(optionsList));
        }

        /**
         * @param requestBasicauth The HTTP basic authentication credentials. Exactly one nested block is allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder requestBasicauth(@Nullable Output<SyntheticsTestRequestBasicauthArgs> requestBasicauth) {
            $.requestBasicauth = requestBasicauth;
            return this;
        }

        /**
         * @param requestBasicauth The HTTP basic authentication credentials. Exactly one nested block is allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder requestBasicauth(SyntheticsTestRequestBasicauthArgs requestBasicauth) {
            return requestBasicauth(Output.of(requestBasicauth));
        }

        /**
         * @param requestClientCertificate Client certificate to use when performing the test request. Exactly one nested block is allowed with the structure
         * below.
         * 
         * @return builder
         * 
         */
        public Builder requestClientCertificate(@Nullable Output<SyntheticsTestRequestClientCertificateArgs> requestClientCertificate) {
            $.requestClientCertificate = requestClientCertificate;
            return this;
        }

        /**
         * @param requestClientCertificate Client certificate to use when performing the test request. Exactly one nested block is allowed with the structure
         * below.
         * 
         * @return builder
         * 
         */
        public Builder requestClientCertificate(SyntheticsTestRequestClientCertificateArgs requestClientCertificate) {
            return requestClientCertificate(Output.of(requestClientCertificate));
        }

        /**
         * @param requestDefinition Required if `type = &#34;api&#34;`. The synthetics test request.
         * 
         * @return builder
         * 
         */
        public Builder requestDefinition(@Nullable Output<SyntheticsTestRequestDefinitionArgs> requestDefinition) {
            $.requestDefinition = requestDefinition;
            return this;
        }

        /**
         * @param requestDefinition Required if `type = &#34;api&#34;`. The synthetics test request.
         * 
         * @return builder
         * 
         */
        public Builder requestDefinition(SyntheticsTestRequestDefinitionArgs requestDefinition) {
            return requestDefinition(Output.of(requestDefinition));
        }

        /**
         * @param requestHeaders Header name and value map.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(@Nullable Output<Map<String,Object>> requestHeaders) {
            $.requestHeaders = requestHeaders;
            return this;
        }

        /**
         * @param requestHeaders Header name and value map.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(Map<String,Object> requestHeaders) {
            return requestHeaders(Output.of(requestHeaders));
        }

        /**
         * @param requestProxy The proxy to perform the test.
         * 
         * @return builder
         * 
         */
        public Builder requestProxy(@Nullable Output<SyntheticsTestRequestProxyArgs> requestProxy) {
            $.requestProxy = requestProxy;
            return this;
        }

        /**
         * @param requestProxy The proxy to perform the test.
         * 
         * @return builder
         * 
         */
        public Builder requestProxy(SyntheticsTestRequestProxyArgs requestProxy) {
            return requestProxy(Output.of(requestProxy));
        }

        /**
         * @param requestQuery Query arguments name and value map.
         * 
         * @return builder
         * 
         */
        public Builder requestQuery(@Nullable Output<Map<String,Object>> requestQuery) {
            $.requestQuery = requestQuery;
            return this;
        }

        /**
         * @param requestQuery Query arguments name and value map.
         * 
         * @return builder
         * 
         */
        public Builder requestQuery(Map<String,Object> requestQuery) {
            return requestQuery(Output.of(requestQuery));
        }

        /**
         * @param setCookie Cookies to be used for a browser test request, using the
         * [Set-Cookie](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie) syntax.
         * 
         * @return builder
         * 
         */
        public Builder setCookie(@Nullable Output<String> setCookie) {
            $.setCookie = setCookie;
            return this;
        }

        /**
         * @param setCookie Cookies to be used for a browser test request, using the
         * [Set-Cookie](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie) syntax.
         * 
         * @return builder
         * 
         */
        public Builder setCookie(String setCookie) {
            return setCookie(Output.of(setCookie));
        }

        /**
         * @param status Define whether you want to start (`live`) or pause (`paused`) a Synthetic test.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Define whether you want to start (`live`) or pause (`paused`) a Synthetic test.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param subtype The subtype of the Synthetic API test. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder subtype(@Nullable Output<String> subtype) {
            $.subtype = subtype;
            return this;
        }

        /**
         * @param subtype The subtype of the Synthetic API test. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder subtype(String subtype) {
            return subtype(Output.of(subtype));
        }

        /**
         * @param tags A list of tags to associate with your synthetics test. This can help you categorize and filter tests in the manage
         * synthetics page of the UI. Default is an empty list (`[]`).
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to associate with your synthetics test. This can help you categorize and filter tests in the manage
         * synthetics page of the UI. Default is an empty list (`[]`).
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to associate with your synthetics test. This can help you categorize and filter tests in the manage
         * synthetics page of the UI. Default is an empty list (`[]`).
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type Synthetics test type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Synthetics test type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SyntheticsTestArgs build() {
            $.locations = Objects.requireNonNull($.locations, "expected parameter 'locations' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}