// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.ObservabilityPipelineConfigProcessorsRenameFieldField;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ObservabilityPipelineConfigProcessorsRenameField {
    /**
     * @return List of fields to rename.
     * 
     */
    private @Nullable List<ObservabilityPipelineConfigProcessorsRenameFieldField> fields;
    /**
     * @return The unique ID of the processor.
     * 
     */
    private String id;
    /**
     * @return A Datadog search query used to determine which logs this processor targets.
     * 
     */
    private String include;
    /**
     * @return The inputs for the processor.
     * 
     */
    private List<String> inputs;

    private ObservabilityPipelineConfigProcessorsRenameField() {}
    /**
     * @return List of fields to rename.
     * 
     */
    public List<ObservabilityPipelineConfigProcessorsRenameFieldField> fields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * @return The unique ID of the processor.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A Datadog search query used to determine which logs this processor targets.
     * 
     */
    public String include() {
        return this.include;
    }
    /**
     * @return The inputs for the processor.
     * 
     */
    public List<String> inputs() {
        return this.inputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObservabilityPipelineConfigProcessorsRenameField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ObservabilityPipelineConfigProcessorsRenameFieldField> fields;
        private String id;
        private String include;
        private List<String> inputs;
        public Builder() {}
        public Builder(ObservabilityPipelineConfigProcessorsRenameField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.include = defaults.include;
    	      this.inputs = defaults.inputs;
        }

        @CustomType.Setter
        public Builder fields(@Nullable List<ObservabilityPipelineConfigProcessorsRenameFieldField> fields) {

            this.fields = fields;
            return this;
        }
        public Builder fields(ObservabilityPipelineConfigProcessorsRenameFieldField... fields) {
            return fields(List.of(fields));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsRenameField", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder include(String include) {
            if (include == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsRenameField", "include");
            }
            this.include = include;
            return this;
        }
        @CustomType.Setter
        public Builder inputs(List<String> inputs) {
            if (inputs == null) {
              throw new MissingRequiredPropertyException("ObservabilityPipelineConfigProcessorsRenameField", "inputs");
            }
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(String... inputs) {
            return inputs(List.of(inputs));
        }
        public ObservabilityPipelineConfigProcessorsRenameField build() {
            final var _resultValue = new ObservabilityPipelineConfigProcessorsRenameField();
            _resultValue.fields = fields;
            _resultValue.id = id;
            _resultValue.include = include;
            _resultValue.inputs = inputs;
            return _resultValue;
        }
    }
}
