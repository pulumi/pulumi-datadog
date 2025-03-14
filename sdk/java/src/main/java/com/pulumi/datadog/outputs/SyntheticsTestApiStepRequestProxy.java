// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestApiStepRequestProxy {
    /**
     * @return Header name and value map.
     * 
     */
    private @Nullable Map<String,String> headers;
    /**
     * @return URL of the proxy to perform the test.
     * 
     */
    private String url;

    private SyntheticsTestApiStepRequestProxy() {}
    /**
     * @return Header name and value map.
     * 
     */
    public Map<String,String> headers() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * @return URL of the proxy to perform the test.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestApiStepRequestProxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> headers;
        private String url;
        public Builder() {}
        public Builder(SyntheticsTestApiStepRequestProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder headers(@Nullable Map<String,String> headers) {

            this.headers = headers;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestApiStepRequestProxy", "url");
            }
            this.url = url;
            return this;
        }
        public SyntheticsTestApiStepRequestProxy build() {
            final var _resultValue = new SyntheticsTestApiStepRequestProxy();
            _resultValue.headers = headers;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
