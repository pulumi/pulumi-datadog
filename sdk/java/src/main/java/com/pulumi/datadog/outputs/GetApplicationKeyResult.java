// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationKeyResult {
    /**
     * @return Whether to use exact match when searching by name.
     * 
     */
    private @Nullable Boolean exactMatch;
    /**
     * @return Id for Application Key.
     * 
     */
    private @Nullable String id;
    /**
     * @return The value of the Application Key.
     * 
     */
    private String key;
    /**
     * @return Name for Application Key.
     * 
     */
    private @Nullable String name;

    private GetApplicationKeyResult() {}
    /**
     * @return Whether to use exact match when searching by name.
     * 
     */
    public Optional<Boolean> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }
    /**
     * @return Id for Application Key.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The value of the Application Key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Name for Application Key.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationKeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean exactMatch;
        private @Nullable String id;
        private String key;
        private @Nullable String name;
        public Builder() {}
        public Builder(GetApplicationKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder exactMatch(@Nullable Boolean exactMatch) {

            this.exactMatch = exactMatch;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetApplicationKeyResult", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public GetApplicationKeyResult build() {
            final var _resultValue = new GetApplicationKeyResult();
            _resultValue.exactMatch = exactMatch;
            _resultValue.id = id;
            _resultValue.key = key;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}