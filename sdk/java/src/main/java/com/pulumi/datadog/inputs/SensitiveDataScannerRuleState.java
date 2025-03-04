// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SensitiveDataScannerRuleIncludedKeywordConfigurationArgs;
import com.pulumi.datadog.inputs.SensitiveDataScannerRuleTextReplacementArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensitiveDataScannerRuleState extends com.pulumi.resources.ResourceArgs {

    public static final SensitiveDataScannerRuleState Empty = new SensitiveDataScannerRuleState();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Attributes excluded from the scan. If namespaces is provided, it has to be a sub-path of the namespaces array.
     * 
     */
    @Import(name="excludedNamespaces")
    private @Nullable Output<List<String>> excludedNamespaces;

    /**
     * @return Attributes excluded from the scan. If namespaces is provided, it has to be a sub-path of the namespaces array.
     * 
     */
    public Optional<Output<List<String>>> excludedNamespaces() {
        return Optional.ofNullable(this.excludedNamespaces);
    }

    /**
     * Id of the scanning group the rule belongs to.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return Id of the scanning group the rule belongs to.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Object defining a set of keywords and a number of characters that help reduce noise. You can provide a list of keywords you would like to check within a defined proximity of the matching pattern. If any of the keywords are found within the proximity check then the match is kept. If none are found, the match is discarded. If the rule has the `standard_pattern_id` field, then discarding this field will apply the recommended keywords. Setting the `create_before_destroy` lifecycle Meta-argument to `true` is highly recommended if modifying this field to avoid unexpectedly disabling Sensitive Data Scanner groups.
     * 
     */
    @Import(name="includedKeywordConfiguration")
    private @Nullable Output<SensitiveDataScannerRuleIncludedKeywordConfigurationArgs> includedKeywordConfiguration;

    /**
     * @return Object defining a set of keywords and a number of characters that help reduce noise. You can provide a list of keywords you would like to check within a defined proximity of the matching pattern. If any of the keywords are found within the proximity check then the match is kept. If none are found, the match is discarded. If the rule has the `standard_pattern_id` field, then discarding this field will apply the recommended keywords. Setting the `create_before_destroy` lifecycle Meta-argument to `true` is highly recommended if modifying this field to avoid unexpectedly disabling Sensitive Data Scanner groups.
     * 
     */
    public Optional<Output<SensitiveDataScannerRuleIncludedKeywordConfigurationArgs>> includedKeywordConfiguration() {
        return Optional.ofNullable(this.includedKeywordConfiguration);
    }

    /**
     * Whether or not the rule is enabled.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Whether or not the rule is enabled.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Name of the rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Attributes included in the scan. If namespaces is empty or missing, all attributes except excluded_namespaces are scanned. If both are missing the whole event is scanned.
     * 
     */
    @Import(name="namespaces")
    private @Nullable Output<List<String>> namespaces;

    /**
     * @return Attributes included in the scan. If namespaces is empty or missing, all attributes except excluded_namespaces are scanned. If both are missing the whole event is scanned.
     * 
     */
    public Optional<Output<List<String>>> namespaces() {
        return Optional.ofNullable(this.namespaces);
    }

    /**
     * Not included if there is a relationship to a standard pattern.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return Not included if there is a relationship to a standard pattern.
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * Priority level of the rule (optional). Used to order sensitive data discovered in the sds summary page. It must be between 1 and 5 (1 being the most important).
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority level of the rule (optional). Used to order sensitive data discovered in the sds summary page. It must be between 1 and 5 (1 being the most important).
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Id of the standard pattern the rule refers to. If provided, then pattern must not be provided.
     * 
     */
    @Import(name="standardPatternId")
    private @Nullable Output<String> standardPatternId;

    /**
     * @return Id of the standard pattern the rule refers to. If provided, then pattern must not be provided.
     * 
     */
    public Optional<Output<String>> standardPatternId() {
        return Optional.ofNullable(this.standardPatternId);
    }

    /**
     * List of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return List of tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Object describing how the scanned event will be replaced. Defaults to `type: none`
     * 
     */
    @Import(name="textReplacement")
    private @Nullable Output<SensitiveDataScannerRuleTextReplacementArgs> textReplacement;

    /**
     * @return Object describing how the scanned event will be replaced. Defaults to `type: none`
     * 
     */
    public Optional<Output<SensitiveDataScannerRuleTextReplacementArgs>> textReplacement() {
        return Optional.ofNullable(this.textReplacement);
    }

    private SensitiveDataScannerRuleState() {}

    private SensitiveDataScannerRuleState(SensitiveDataScannerRuleState $) {
        this.description = $.description;
        this.excludedNamespaces = $.excludedNamespaces;
        this.groupId = $.groupId;
        this.includedKeywordConfiguration = $.includedKeywordConfiguration;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.namespaces = $.namespaces;
        this.pattern = $.pattern;
        this.priority = $.priority;
        this.standardPatternId = $.standardPatternId;
        this.tags = $.tags;
        this.textReplacement = $.textReplacement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensitiveDataScannerRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensitiveDataScannerRuleState $;

        public Builder() {
            $ = new SensitiveDataScannerRuleState();
        }

        public Builder(SensitiveDataScannerRuleState defaults) {
            $ = new SensitiveDataScannerRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param excludedNamespaces Attributes excluded from the scan. If namespaces is provided, it has to be a sub-path of the namespaces array.
         * 
         * @return builder
         * 
         */
        public Builder excludedNamespaces(@Nullable Output<List<String>> excludedNamespaces) {
            $.excludedNamespaces = excludedNamespaces;
            return this;
        }

        /**
         * @param excludedNamespaces Attributes excluded from the scan. If namespaces is provided, it has to be a sub-path of the namespaces array.
         * 
         * @return builder
         * 
         */
        public Builder excludedNamespaces(List<String> excludedNamespaces) {
            return excludedNamespaces(Output.of(excludedNamespaces));
        }

        /**
         * @param excludedNamespaces Attributes excluded from the scan. If namespaces is provided, it has to be a sub-path of the namespaces array.
         * 
         * @return builder
         * 
         */
        public Builder excludedNamespaces(String... excludedNamespaces) {
            return excludedNamespaces(List.of(excludedNamespaces));
        }

        /**
         * @param groupId Id of the scanning group the rule belongs to.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Id of the scanning group the rule belongs to.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param includedKeywordConfiguration Object defining a set of keywords and a number of characters that help reduce noise. You can provide a list of keywords you would like to check within a defined proximity of the matching pattern. If any of the keywords are found within the proximity check then the match is kept. If none are found, the match is discarded. If the rule has the `standard_pattern_id` field, then discarding this field will apply the recommended keywords. Setting the `create_before_destroy` lifecycle Meta-argument to `true` is highly recommended if modifying this field to avoid unexpectedly disabling Sensitive Data Scanner groups.
         * 
         * @return builder
         * 
         */
        public Builder includedKeywordConfiguration(@Nullable Output<SensitiveDataScannerRuleIncludedKeywordConfigurationArgs> includedKeywordConfiguration) {
            $.includedKeywordConfiguration = includedKeywordConfiguration;
            return this;
        }

        /**
         * @param includedKeywordConfiguration Object defining a set of keywords and a number of characters that help reduce noise. You can provide a list of keywords you would like to check within a defined proximity of the matching pattern. If any of the keywords are found within the proximity check then the match is kept. If none are found, the match is discarded. If the rule has the `standard_pattern_id` field, then discarding this field will apply the recommended keywords. Setting the `create_before_destroy` lifecycle Meta-argument to `true` is highly recommended if modifying this field to avoid unexpectedly disabling Sensitive Data Scanner groups.
         * 
         * @return builder
         * 
         */
        public Builder includedKeywordConfiguration(SensitiveDataScannerRuleIncludedKeywordConfigurationArgs includedKeywordConfiguration) {
            return includedKeywordConfiguration(Output.of(includedKeywordConfiguration));
        }

        /**
         * @param isEnabled Whether or not the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Whether or not the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param name Name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaces Attributes included in the scan. If namespaces is empty or missing, all attributes except excluded_namespaces are scanned. If both are missing the whole event is scanned.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(@Nullable Output<List<String>> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        /**
         * @param namespaces Attributes included in the scan. If namespaces is empty or missing, all attributes except excluded_namespaces are scanned. If both are missing the whole event is scanned.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(List<String> namespaces) {
            return namespaces(Output.of(namespaces));
        }

        /**
         * @param namespaces Attributes included in the scan. If namespaces is empty or missing, all attributes except excluded_namespaces are scanned. If both are missing the whole event is scanned.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }

        /**
         * @param pattern Not included if there is a relationship to a standard pattern.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern Not included if there is a relationship to a standard pattern.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param priority Priority level of the rule (optional). Used to order sensitive data discovered in the sds summary page. It must be between 1 and 5 (1 being the most important).
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority level of the rule (optional). Used to order sensitive data discovered in the sds summary page. It must be between 1 and 5 (1 being the most important).
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param standardPatternId Id of the standard pattern the rule refers to. If provided, then pattern must not be provided.
         * 
         * @return builder
         * 
         */
        public Builder standardPatternId(@Nullable Output<String> standardPatternId) {
            $.standardPatternId = standardPatternId;
            return this;
        }

        /**
         * @param standardPatternId Id of the standard pattern the rule refers to. If provided, then pattern must not be provided.
         * 
         * @return builder
         * 
         */
        public Builder standardPatternId(String standardPatternId) {
            return standardPatternId(Output.of(standardPatternId));
        }

        /**
         * @param tags List of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags List of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags List of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param textReplacement Object describing how the scanned event will be replaced. Defaults to `type: none`
         * 
         * @return builder
         * 
         */
        public Builder textReplacement(@Nullable Output<SensitiveDataScannerRuleTextReplacementArgs> textReplacement) {
            $.textReplacement = textReplacement;
            return this;
        }

        /**
         * @param textReplacement Object describing how the scanned event will be replaced. Defaults to `type: none`
         * 
         * @return builder
         * 
         */
        public Builder textReplacement(SensitiveDataScannerRuleTextReplacementArgs textReplacement) {
            return textReplacement(Output.of(textReplacement));
        }

        public SensitiveDataScannerRuleState build() {
            return $;
        }
    }

}
