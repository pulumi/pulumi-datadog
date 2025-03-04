// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.LogsCustomPipelineProcessorCategoryProcessorCategory;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsCustomPipelineProcessorCategoryProcessor {
    /**
     * @return List of filters to match or exclude a log with their corresponding name to assign a custom value to the log.
     * 
     */
    private List<LogsCustomPipelineProcessorCategoryProcessorCategory> categories;
    /**
     * @return If the processor is enabled or not.
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return Name of the category
     * 
     */
    private @Nullable String name;
    /**
     * @return Name of the target attribute whose value is defined by the matching category.
     * 
     */
    private String target;

    private LogsCustomPipelineProcessorCategoryProcessor() {}
    /**
     * @return List of filters to match or exclude a log with their corresponding name to assign a custom value to the log.
     * 
     */
    public List<LogsCustomPipelineProcessorCategoryProcessorCategory> categories() {
        return this.categories;
    }
    /**
     * @return If the processor is enabled or not.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return Name of the category
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Name of the target attribute whose value is defined by the matching category.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorCategoryProcessor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<LogsCustomPipelineProcessorCategoryProcessorCategory> categories;
        private @Nullable Boolean isEnabled;
        private @Nullable String name;
        private String target;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorCategoryProcessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder categories(List<LogsCustomPipelineProcessorCategoryProcessorCategory> categories) {
            if (categories == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorCategoryProcessor", "categories");
            }
            this.categories = categories;
            return this;
        }
        public Builder categories(LogsCustomPipelineProcessorCategoryProcessorCategory... categories) {
            return categories(List.of(categories));
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
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("LogsCustomPipelineProcessorCategoryProcessor", "target");
            }
            this.target = target;
            return this;
        }
        public LogsCustomPipelineProcessorCategoryProcessor build() {
            final var _resultValue = new LogsCustomPipelineProcessorCategoryProcessor();
            _resultValue.categories = categories;
            _resultValue.isEnabled = isEnabled;
            _resultValue.name = name;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
