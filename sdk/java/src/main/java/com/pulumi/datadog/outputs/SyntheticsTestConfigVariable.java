// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestConfigVariable {
    private @Nullable String example;
    private @Nullable String id;
    private String name;
    private @Nullable String pattern;
    private String type;

    private SyntheticsTestConfigVariable() {}
    public Optional<String> example() {
        return Optional.ofNullable(this.example);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public String name() {
        return this.name;
    }
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestConfigVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String example;
        private @Nullable String id;
        private String name;
        private @Nullable String pattern;
        private String type;
        public Builder() {}
        public Builder(SyntheticsTestConfigVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.example = defaults.example;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pattern = defaults.pattern;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder example(@Nullable String example) {
            this.example = example;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SyntheticsTestConfigVariable build() {
            final var o = new SyntheticsTestConfigVariable();
            o.example = example;
            o.id = id;
            o.name = name;
            o.pattern = pattern;
            o.type = type;
            return o;
        }
    }
}