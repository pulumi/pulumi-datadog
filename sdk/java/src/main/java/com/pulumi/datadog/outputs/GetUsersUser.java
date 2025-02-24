// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUsersUser {
    private String createdAt;
    private Boolean disabled;
    private String email;
    private String handle;
    private String icon;
    private String id;
    private Boolean mfaEnabled;
    private String modifiedAt;
    private String name;
    private Boolean serviceAccount;
    private String status;
    private String title;
    private Boolean verified;

    private GetUsersUser() {}
    public String createdAt() {
        return this.createdAt;
    }
    public Boolean disabled() {
        return this.disabled;
    }
    public String email() {
        return this.email;
    }
    public String handle() {
        return this.handle;
    }
    public String icon() {
        return this.icon;
    }
    public String id() {
        return this.id;
    }
    public Boolean mfaEnabled() {
        return this.mfaEnabled;
    }
    public String modifiedAt() {
        return this.modifiedAt;
    }
    public String name() {
        return this.name;
    }
    public Boolean serviceAccount() {
        return this.serviceAccount;
    }
    public String status() {
        return this.status;
    }
    public String title() {
        return this.title;
    }
    public Boolean verified() {
        return this.verified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private Boolean disabled;
        private String email;
        private String handle;
        private String icon;
        private String id;
        private Boolean mfaEnabled;
        private String modifiedAt;
        private String name;
        private Boolean serviceAccount;
        private String status;
        private String title;
        private Boolean verified;
        public Builder() {}
        public Builder(GetUsersUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.disabled = defaults.disabled;
    	      this.email = defaults.email;
    	      this.handle = defaults.handle;
    	      this.icon = defaults.icon;
    	      this.id = defaults.id;
    	      this.mfaEnabled = defaults.mfaEnabled;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.name = defaults.name;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.verified = defaults.verified;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder handle(String handle) {
            if (handle == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "handle");
            }
            this.handle = handle;
            return this;
        }
        @CustomType.Setter
        public Builder icon(String icon) {
            if (icon == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "icon");
            }
            this.icon = icon;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mfaEnabled(Boolean mfaEnabled) {
            if (mfaEnabled == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "mfaEnabled");
            }
            this.mfaEnabled = mfaEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedAt(String modifiedAt) {
            if (modifiedAt == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "modifiedAt");
            }
            this.modifiedAt = modifiedAt;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(Boolean serviceAccount) {
            if (serviceAccount == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "serviceAccount");
            }
            this.serviceAccount = serviceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "title");
            }
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder verified(Boolean verified) {
            if (verified == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "verified");
            }
            this.verified = verified;
            return this;
        }
        public GetUsersUser build() {
            final var _resultValue = new GetUsersUser();
            _resultValue.createdAt = createdAt;
            _resultValue.disabled = disabled;
            _resultValue.email = email;
            _resultValue.handle = handle;
            _resultValue.icon = icon;
            _resultValue.id = id;
            _resultValue.mfaEnabled = mfaEnabled;
            _resultValue.modifiedAt = modifiedAt;
            _resultValue.name = name;
            _resultValue.serviceAccount = serviceAccount;
            _resultValue.status = status;
            _resultValue.title = title;
            _resultValue.verified = verified;
            return _resultValue;
        }
    }
}
