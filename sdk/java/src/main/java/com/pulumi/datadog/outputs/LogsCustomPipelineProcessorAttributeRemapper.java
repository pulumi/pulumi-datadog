// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsCustomPipelineProcessorAttributeRemapper {
    /**
     * @return If the processor is enabled or not.
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return Name of the processor
     * 
     */
    private @Nullable String name;
    /**
     * @return Override the target element if already set.
     * 
     */
    private @Nullable Boolean overrideOnConflict;
    /**
     * @return Remove or preserve the remapped source element.
     * 
     */
    private @Nullable Boolean preserveSource;
    /**
     * @return Defines where the sources are from (log `attribute` or `tag`).
     * 
     */
    private String sourceType;
    /**
     * @return List of source attributes or tags.
     * 
     */
    private List<String> sources;
    /**
     * @return Final attribute or tag name to remap the sources.
     * 
     */
    private String target;
    /**
     * @return If the `target_type` of the remapper is `attribute`, try to cast the value to a new specific type. If the cast is not possible, the original type is kept. `string`, `integer`, or `double` are the possible types. If the `target_type` is `tag`, this parameter may not be specified.
     * 
     */
    private @Nullable String targetFormat;
    /**
     * @return Defines if the target is a log `attribute` or `tag`.
     * 
     */
    private String targetType;

    private LogsCustomPipelineProcessorAttributeRemapper() {}
    /**
     * @return If the processor is enabled or not.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return Name of the processor
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Override the target element if already set.
     * 
     */
    public Optional<Boolean> overrideOnConflict() {
        return Optional.ofNullable(this.overrideOnConflict);
    }
    /**
     * @return Remove or preserve the remapped source element.
     * 
     */
    public Optional<Boolean> preserveSource() {
        return Optional.ofNullable(this.preserveSource);
    }
    /**
     * @return Defines where the sources are from (log `attribute` or `tag`).
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }
    /**
     * @return List of source attributes or tags.
     * 
     */
    public List<String> sources() {
        return this.sources;
    }
    /**
     * @return Final attribute or tag name to remap the sources.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return If the `target_type` of the remapper is `attribute`, try to cast the value to a new specific type. If the cast is not possible, the original type is kept. `string`, `integer`, or `double` are the possible types. If the `target_type` is `tag`, this parameter may not be specified.
     * 
     */
    public Optional<String> targetFormat() {
        return Optional.ofNullable(this.targetFormat);
    }
    /**
     * @return Defines if the target is a log `attribute` or `tag`.
     * 
     */
    public String targetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorAttributeRemapper defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private @Nullable String name;
        private @Nullable Boolean overrideOnConflict;
        private @Nullable Boolean preserveSource;
        private String sourceType;
        private List<String> sources;
        private String target;
        private @Nullable String targetFormat;
        private String targetType;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorAttributeRemapper defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.overrideOnConflict = defaults.overrideOnConflict;
    	      this.preserveSource = defaults.preserveSource;
    	      this.sourceType = defaults.sourceType;
    	      this.sources = defaults.sources;
    	      this.target = defaults.target;
    	      this.targetFormat = defaults.targetFormat;
    	      this.targetType = defaults.targetType;
        }

        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {

            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder overrideOnConflict(@Nullable Boolean overrideOnConflict) {

            this.overrideOnConflict = overrideOnConflict;
            return this;
        }
        @CustomType.Setter
        public Builder preserveSource(@Nullable Boolean preserveSource) {

            this.preserveSource = preserveSource;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            if (sourceType == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorAttributeRemapper", "sourceType");
            }
            this.sourceType = sourceType;
            return this;
        }
        @CustomType.Setter
        public Builder sources(List<String> sources) {
            if (sources == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorAttributeRemapper", "sources");
            }
            this.sources = sources;
            return this;
        }
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorAttributeRemapper", "target");
            }
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder targetFormat(@Nullable String targetFormat) {

            this.targetFormat = targetFormat;
            return this;
        }
        @CustomType.Setter
        public Builder targetType(String targetType) {
            if (targetType == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorAttributeRemapper", "targetType");
            }
            this.targetType = targetType;
            return this;
        }
        public LogsCustomPipelineProcessorAttributeRemapper build() {
            final var _resultValue = new LogsCustomPipelineProcessorAttributeRemapper();
            _resultValue.isEnabled = isEnabled;
            _resultValue.name = name;
            _resultValue.overrideOnConflict = overrideOnConflict;
            _resultValue.preserveSource = preserveSource;
            _resultValue.sourceType = sourceType;
            _resultValue.sources = sources;
            _resultValue.target = target;
            _resultValue.targetFormat = targetFormat;
            _resultValue.targetType = targetType;
            return _resultValue;
        }
    }
}
