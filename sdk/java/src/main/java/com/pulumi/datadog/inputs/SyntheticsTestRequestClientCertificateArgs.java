// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.SyntheticsTestRequestClientCertificateCertArgs;
import com.pulumi.datadog.inputs.SyntheticsTestRequestClientCertificateKeyArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;


public final class SyntheticsTestRequestClientCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestRequestClientCertificateArgs Empty = new SyntheticsTestRequestClientCertificateArgs();

    @Import(name="cert", required=true)
    private Output<SyntheticsTestRequestClientCertificateCertArgs> cert;

    public Output<SyntheticsTestRequestClientCertificateCertArgs> cert() {
        return this.cert;
    }

    @Import(name="key", required=true)
    private Output<SyntheticsTestRequestClientCertificateKeyArgs> key;

    public Output<SyntheticsTestRequestClientCertificateKeyArgs> key() {
        return this.key;
    }

    private SyntheticsTestRequestClientCertificateArgs() {}

    private SyntheticsTestRequestClientCertificateArgs(SyntheticsTestRequestClientCertificateArgs $) {
        this.cert = $.cert;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestRequestClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestRequestClientCertificateArgs $;

        public Builder() {
            $ = new SyntheticsTestRequestClientCertificateArgs();
        }

        public Builder(SyntheticsTestRequestClientCertificateArgs defaults) {
            $ = new SyntheticsTestRequestClientCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder cert(Output<SyntheticsTestRequestClientCertificateCertArgs> cert) {
            $.cert = cert;
            return this;
        }

        public Builder cert(SyntheticsTestRequestClientCertificateCertArgs cert) {
            return cert(Output.of(cert));
        }

        public Builder key(Output<SyntheticsTestRequestClientCertificateKeyArgs> key) {
            $.key = key;
            return this;
        }

        public Builder key(SyntheticsTestRequestClientCertificateKeyArgs key) {
            return key(Output.of(key));
        }

        public SyntheticsTestRequestClientCertificateArgs build() {
            if ($.cert == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestRequestClientCertificateArgs", "cert");
            }
            if ($.key == null) {
                throw new MissingRequiredPropertyException("SyntheticsTestRequestClientCertificateArgs", "key");
            }
            return $;
        }
    }

}
