// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestRequestClientCertificateKey {
    /**
     * @return Content of the certificate.
     * 
     */
    private String content;
    /**
     * @return File name for the certificate.
     * 
     */
    private @Nullable String filename;

    private SyntheticsTestRequestClientCertificateKey() {}
    /**
     * @return Content of the certificate.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return File name for the certificate.
     * 
     */
    public Optional<String> filename() {
        return Optional.ofNullable(this.filename);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestRequestClientCertificateKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private @Nullable String filename;
        public Builder() {}
        public Builder(SyntheticsTestRequestClientCertificateKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.filename = defaults.filename;
        }

        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestRequestClientCertificateKey", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder filename(@Nullable String filename) {

            this.filename = filename;
            return this;
        }
        public SyntheticsTestRequestClientCertificateKey build() {
            final var _resultValue = new SyntheticsTestRequestClientCertificateKey();
            _resultValue.content = content;
            _resultValue.filename = filename;
            return _resultValue;
        }
    }
}
