// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestRequestClientCertificateKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestRequestClientCertificateKeyArgs Empty = new SyntheticsTestRequestClientCertificateKeyArgs();

    /**
     * Content of the certificate.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return Content of the certificate.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * File name for the certificate.
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return File name for the certificate.
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
    }

    private SyntheticsTestRequestClientCertificateKeyArgs() {}

    private SyntheticsTestRequestClientCertificateKeyArgs(SyntheticsTestRequestClientCertificateKeyArgs $) {
        this.content = $.content;
        this.filename = $.filename;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestRequestClientCertificateKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestRequestClientCertificateKeyArgs $;

        public Builder() {
            $ = new SyntheticsTestRequestClientCertificateKeyArgs();
        }

        public Builder(SyntheticsTestRequestClientCertificateKeyArgs defaults) {
            $ = new SyntheticsTestRequestClientCertificateKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content Content of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Content of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param filename File name for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename File name for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        public SyntheticsTestRequestClientCertificateKeyArgs build() {
            if ($.content == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestRequestClientCertificateKeyArgs", "content");
            }
            return $;
        }
    }

}
