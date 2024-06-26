// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRumApplicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRumApplicationArgs Empty = new GetRumApplicationArgs();

    /**
     * ID of the RUM application. Cannot be used with name and type filters.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the RUM application. Cannot be used with name and type filters.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name used to search for a RUM application.
     * 
     */
    @Import(name="nameFilter")
    private @Nullable Output<String> nameFilter;

    /**
     * @return The name used to search for a RUM application.
     * 
     */
    public Optional<Output<String>> nameFilter() {
        return Optional.ofNullable(this.nameFilter);
    }

    /**
     * The type used to search for a RUM application.
     * 
     */
    @Import(name="typeFilter")
    private @Nullable Output<String> typeFilter;

    /**
     * @return The type used to search for a RUM application.
     * 
     */
    public Optional<Output<String>> typeFilter() {
        return Optional.ofNullable(this.typeFilter);
    }

    private GetRumApplicationArgs() {}

    private GetRumApplicationArgs(GetRumApplicationArgs $) {
        this.id = $.id;
        this.nameFilter = $.nameFilter;
        this.typeFilter = $.typeFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRumApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRumApplicationArgs $;

        public Builder() {
            $ = new GetRumApplicationArgs();
        }

        public Builder(GetRumApplicationArgs defaults) {
            $ = new GetRumApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the RUM application. Cannot be used with name and type filters.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the RUM application. Cannot be used with name and type filters.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param nameFilter The name used to search for a RUM application.
         * 
         * @return builder
         * 
         */
        public Builder nameFilter(@Nullable Output<String> nameFilter) {
            $.nameFilter = nameFilter;
            return this;
        }

        /**
         * @param nameFilter The name used to search for a RUM application.
         * 
         * @return builder
         * 
         */
        public Builder nameFilter(String nameFilter) {
            return nameFilter(Output.of(nameFilter));
        }

        /**
         * @param typeFilter The type used to search for a RUM application.
         * 
         * @return builder
         * 
         */
        public Builder typeFilter(@Nullable Output<String> typeFilter) {
            $.typeFilter = typeFilter;
            return this;
        }

        /**
         * @param typeFilter The type used to search for a RUM application.
         * 
         * @return builder
         * 
         */
        public Builder typeFilter(String typeFilter) {
            return typeFilter(Output.of(typeFilter));
        }

        public GetRumApplicationArgs build() {
            return $;
        }
    }

}
