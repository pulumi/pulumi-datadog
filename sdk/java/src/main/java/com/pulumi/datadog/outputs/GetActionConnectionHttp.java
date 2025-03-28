// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetActionConnectionHttpTokenAuth;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetActionConnectionHttp {
    /**
     * @return Base HTTP url for the integration
     * 
     */
    private String baseUrl;
    /**
     * @return Configuration for an HTTP connection that uses token auth
     * 
     */
    private @Nullable GetActionConnectionHttpTokenAuth tokenAuth;

    private GetActionConnectionHttp() {}
    /**
     * @return Base HTTP url for the integration
     * 
     */
    public String baseUrl() {
        return this.baseUrl;
    }
    /**
     * @return Configuration for an HTTP connection that uses token auth
     * 
     */
    public Optional<GetActionConnectionHttpTokenAuth> tokenAuth() {
        return Optional.ofNullable(this.tokenAuth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionConnectionHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String baseUrl;
        private @Nullable GetActionConnectionHttpTokenAuth tokenAuth;
        public Builder() {}
        public Builder(GetActionConnectionHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.tokenAuth = defaults.tokenAuth;
        }

        @CustomType.Setter
        public Builder baseUrl(String baseUrl) {
            if (baseUrl == null) {
              throw new MissingRequiredPropertyException("GetActionConnectionHttp", "baseUrl");
            }
            this.baseUrl = baseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder tokenAuth(@Nullable GetActionConnectionHttpTokenAuth tokenAuth) {

            this.tokenAuth = tokenAuth;
            return this;
        }
        public GetActionConnectionHttp build() {
            final var _resultValue = new GetActionConnectionHttp();
            _resultValue.baseUrl = baseUrl;
            _resultValue.tokenAuth = tokenAuth;
            return _resultValue;
        }
    }
}
