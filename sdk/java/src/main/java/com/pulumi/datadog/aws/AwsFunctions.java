// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.aws.outputs.GetIntegrationAvailableLogsServicesResult;
import com.pulumi.datadog.aws.outputs.GetIntegrationAvailableNamespacesResult;
import com.pulumi.datadog.aws.outputs.GetIntegrationLogsServicesResult;
import com.pulumi.datadog.aws.outputs.GetIntegrationNamespaceRulesResult;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class AwsFunctions {
    /**
     * Use this data source to retrieve all AWS log ready services. This is the list of allowed values for `logs_config.lambda_forwarder.sources` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableLogsServicesResult> getIntegrationAvailableLogsServices() {
        return getIntegrationAvailableLogsServices(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services. This is the list of allowed values for `logs_config.lambda_forwarder.sources` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static CompletableFuture<GetIntegrationAvailableLogsServicesResult> getIntegrationAvailableLogsServicesPlain() {
        return getIntegrationAvailableLogsServicesPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services. This is the list of allowed values for `logs_config.lambda_forwarder.sources` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableLogsServicesResult> getIntegrationAvailableLogsServices(InvokeArgs args) {
        return getIntegrationAvailableLogsServices(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services. This is the list of allowed values for `logs_config.lambda_forwarder.sources` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static CompletableFuture<GetIntegrationAvailableLogsServicesResult> getIntegrationAvailableLogsServicesPlain(InvokeArgs args) {
        return getIntegrationAvailableLogsServicesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services. This is the list of allowed values for `logs_config.lambda_forwarder.sources` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableLogsServicesResult> getIntegrationAvailableLogsServices(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationAvailableLogsServices:getIntegrationAvailableLogsServices", TypeShape.of(GetIntegrationAvailableLogsServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all AWS log ready services. This is the list of allowed values for `logs_config.lambda_forwarder.sources` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableLogsServicesResult> getIntegrationAvailableLogsServices(InvokeArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationAvailableLogsServices:getIntegrationAvailableLogsServices", TypeShape.of(GetIntegrationAvailableLogsServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all AWS log ready services. This is the list of allowed values for `logs_config.lambda_forwarder.sources` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static CompletableFuture<GetIntegrationAvailableLogsServicesResult> getIntegrationAvailableLogsServicesPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("datadog:aws/getIntegrationAvailableLogsServices:getIntegrationAvailableLogsServices", TypeShape.of(GetIntegrationAvailableLogsServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableNamespacesResult> getIntegrationAvailableNamespaces() {
        return getIntegrationAvailableNamespaces(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static CompletableFuture<GetIntegrationAvailableNamespacesResult> getIntegrationAvailableNamespacesPlain() {
        return getIntegrationAvailableNamespacesPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableNamespacesResult> getIntegrationAvailableNamespaces(InvokeArgs args) {
        return getIntegrationAvailableNamespaces(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static CompletableFuture<GetIntegrationAvailableNamespacesResult> getIntegrationAvailableNamespacesPlain(InvokeArgs args) {
        return getIntegrationAvailableNamespacesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableNamespacesResult> getIntegrationAvailableNamespaces(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", TypeShape.of(GetIntegrationAvailableNamespacesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static Output<GetIntegrationAvailableNamespacesResult> getIntegrationAvailableNamespaces(InvokeArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", TypeShape.of(GetIntegrationAvailableNamespacesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all available AWS namespaces. This is the list of allowed values for `metrics_config.namespace_filters` `include_only` or `exclude_only` in `datadog.aws.IntegrationAccount` resource.
     * 
     */
    public static CompletableFuture<GetIntegrationAvailableNamespacesResult> getIntegrationAvailableNamespacesPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("datadog:aws/getIntegrationAvailableNamespaces:getIntegrationAvailableNamespaces", TypeShape.of(GetIntegrationAvailableNamespacesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all AWS log ready services.
     * 
     */
    public static Output<GetIntegrationLogsServicesResult> getIntegrationLogsServices() {
        return getIntegrationLogsServices(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services.
     * 
     */
    public static CompletableFuture<GetIntegrationLogsServicesResult> getIntegrationLogsServicesPlain() {
        return getIntegrationLogsServicesPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services.
     * 
     */
    public static Output<GetIntegrationLogsServicesResult> getIntegrationLogsServices(InvokeArgs args) {
        return getIntegrationLogsServices(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services.
     * 
     */
    public static CompletableFuture<GetIntegrationLogsServicesResult> getIntegrationLogsServicesPlain(InvokeArgs args) {
        return getIntegrationLogsServicesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve all AWS log ready services.
     * 
     */
    public static Output<GetIntegrationLogsServicesResult> getIntegrationLogsServices(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationLogsServices:getIntegrationLogsServices", TypeShape.of(GetIntegrationLogsServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all AWS log ready services.
     * 
     */
    public static Output<GetIntegrationLogsServicesResult> getIntegrationLogsServices(InvokeArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationLogsServices:getIntegrationLogsServices", TypeShape.of(GetIntegrationLogsServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve all AWS log ready services.
     * 
     */
    public static CompletableFuture<GetIntegrationLogsServicesResult> getIntegrationLogsServicesPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("datadog:aws/getIntegrationLogsServices:getIntegrationLogsServices", TypeShape.of(GetIntegrationLogsServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.datadog.aws.AwsFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var rules = AwsFunctions.getIntegrationNamespaceRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetIntegrationNamespaceRulesResult> getIntegrationNamespaceRules() {
        return getIntegrationNamespaceRules(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.datadog.aws.AwsFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var rules = AwsFunctions.getIntegrationNamespaceRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetIntegrationNamespaceRulesResult> getIntegrationNamespaceRulesPlain() {
        return getIntegrationNamespaceRulesPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.datadog.aws.AwsFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var rules = AwsFunctions.getIntegrationNamespaceRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetIntegrationNamespaceRulesResult> getIntegrationNamespaceRules(InvokeArgs args) {
        return getIntegrationNamespaceRules(args, InvokeOptions.Empty);
    }
    /**
     * Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.datadog.aws.AwsFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var rules = AwsFunctions.getIntegrationNamespaceRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetIntegrationNamespaceRulesResult> getIntegrationNamespaceRulesPlain(InvokeArgs args) {
        return getIntegrationNamespaceRulesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.datadog.aws.AwsFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var rules = AwsFunctions.getIntegrationNamespaceRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetIntegrationNamespaceRulesResult> getIntegrationNamespaceRules(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationNamespaceRules:getIntegrationNamespaceRules", TypeShape.of(GetIntegrationNamespaceRulesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.datadog.aws.AwsFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var rules = AwsFunctions.getIntegrationNamespaceRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetIntegrationNamespaceRulesResult> getIntegrationNamespaceRules(InvokeArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("datadog:aws/getIntegrationNamespaceRules:getIntegrationNamespaceRules", TypeShape.of(GetIntegrationNamespaceRulesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides a Datadog AWS Integration Namespace Rules data source. This can be used to retrieve all available namespace rules for a Datadog-AWS integration.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.datadog.aws.AwsFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var rules = AwsFunctions.getIntegrationNamespaceRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetIntegrationNamespaceRulesResult> getIntegrationNamespaceRulesPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("datadog:aws/getIntegrationNamespaceRules:getIntegrationNamespaceRules", TypeShape.of(GetIntegrationNamespaceRulesResult.class), args, Utilities.withVersion(options));
    }
}
