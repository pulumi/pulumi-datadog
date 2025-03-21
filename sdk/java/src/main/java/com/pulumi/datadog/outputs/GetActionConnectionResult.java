// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetActionConnectionAws;
import com.pulumi.datadog.outputs.GetActionConnectionHttp;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetActionConnectionResult {
    /**
     * @return Configuration for an AWS connection
     * 
     */
    private @Nullable GetActionConnectionAws aws;
    /**
     * @return Configuration for an HTTP connection
     * 
     */
    private @Nullable GetActionConnectionHttp http;
    /**
     * @return ID for Connection.
     * 
     */
    private String id;
    /**
     * @return Name of the connection
     * 
     */
    private String name;

    private GetActionConnectionResult() {}
    /**
     * @return Configuration for an AWS connection
     * 
     */
    public Optional<GetActionConnectionAws> aws() {
        return Optional.ofNullable(this.aws);
    }
    /**
     * @return Configuration for an HTTP connection
     * 
     */
    public Optional<GetActionConnectionHttp> http() {
        return Optional.ofNullable(this.http);
    }
    /**
     * @return ID for Connection.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the connection
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetActionConnectionAws aws;
        private @Nullable GetActionConnectionHttp http;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetActionConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.http = defaults.http;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder aws(@Nullable GetActionConnectionAws aws) {

            this.aws = aws;
            return this;
        }
        @CustomType.Setter
        public Builder http(@Nullable GetActionConnectionHttp http) {

            this.http = http;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetActionConnectionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetActionConnectionResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetActionConnectionResult build() {
            final var _resultValue = new GetActionConnectionResult();
            _resultValue.aws = aws;
            _resultValue.http = http;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
