// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionConnectionHttpTokenAuthBody {
    /**
     * @return Serialized body content. String length must be at least 1.
     * 
     */
    private @Nullable String content;
    /**
     * @return Content type of the body. String length must be at least 1.
     * 
     */
    private @Nullable String contentType;

    private ActionConnectionHttpTokenAuthBody() {}
    /**
     * @return Serialized body content. String length must be at least 1.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return Content type of the body. String length must be at least 1.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionConnectionHttpTokenAuthBody defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String content;
        private @Nullable String contentType;
        public Builder() {}
        public Builder(ActionConnectionHttpTokenAuthBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
        }

        @CustomType.Setter
        public Builder content(@Nullable String content) {

            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {

            this.contentType = contentType;
            return this;
        }
        public ActionConnectionHttpTokenAuthBody build() {
            final var _resultValue = new ActionConnectionHttpTokenAuthBody();
            _resultValue.content = content;
            _resultValue.contentType = contentType;
            return _resultValue;
        }
    }
}
