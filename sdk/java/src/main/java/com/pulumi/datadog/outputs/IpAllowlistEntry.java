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
public final class IpAllowlistEntry {
    /**
     * @return IP address or range of addresses.
     * 
     */
    private String cidrBlock;
    /**
     * @return Note accompanying IP address.
     * 
     */
    private @Nullable String note;

    private IpAllowlistEntry() {}
    /**
     * @return IP address or range of addresses.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return Note accompanying IP address.
     * 
     */
    public Optional<String> note() {
        return Optional.ofNullable(this.note);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAllowlistEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidrBlock;
        private @Nullable String note;
        public Builder() {}
        public Builder(IpAllowlistEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.note = defaults.note;
        }

        @CustomType.Setter
        public Builder cidrBlock(String cidrBlock) {
            if (cidrBlock == null) {
              throw new MissingRequiredPropertyException("IpAllowlistEntry", "cidrBlock");
            }
            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder note(@Nullable String note) {

            this.note = note;
            return this;
        }
        public IpAllowlistEntry build() {
            final var _resultValue = new IpAllowlistEntry();
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.note = note;
            return _resultValue;
        }
    }
}