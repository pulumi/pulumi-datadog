// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAppBuilderAppResult {
    /**
     * @return A map of the App&#39;s Action Query Names to Action Connection IDs.
     * 
     */
    private Map<String,String> actionQueryNamesToConnectionIds;
    /**
     * @return The JSON representation of the App.
     * 
     */
    private String appJson;
    /**
     * @return The human-readable description of the App.
     * 
     */
    private String description;
    /**
     * @return ID for the App.
     * 
     */
    private String id;
    /**
     * @return The name of the App.
     * 
     */
    private String name;
    /**
     * @return Whether the app is published or unpublished. Published apps are available to other users. To ensure the app is accessible to the correct users, you also need to set a [Restriction Policy](https://docs.datadoghq.com/api/latest/restriction-policies/) on the app if a policy does not yet exist.
     * 
     */
    private Boolean published;
    /**
     * @return The name of the root component of the app. This is a grid component that contains all other components.
     * 
     */
    private String rootInstanceName;

    private GetAppBuilderAppResult() {}
    /**
     * @return A map of the App&#39;s Action Query Names to Action Connection IDs.
     * 
     */
    public Map<String,String> actionQueryNamesToConnectionIds() {
        return this.actionQueryNamesToConnectionIds;
    }
    /**
     * @return The JSON representation of the App.
     * 
     */
    public String appJson() {
        return this.appJson;
    }
    /**
     * @return The human-readable description of the App.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID for the App.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the App.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Whether the app is published or unpublished. Published apps are available to other users. To ensure the app is accessible to the correct users, you also need to set a [Restriction Policy](https://docs.datadoghq.com/api/latest/restriction-policies/) on the app if a policy does not yet exist.
     * 
     */
    public Boolean published() {
        return this.published;
    }
    /**
     * @return The name of the root component of the app. This is a grid component that contains all other components.
     * 
     */
    public String rootInstanceName() {
        return this.rootInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppBuilderAppResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> actionQueryNamesToConnectionIds;
        private String appJson;
        private String description;
        private String id;
        private String name;
        private Boolean published;
        private String rootInstanceName;
        public Builder() {}
        public Builder(GetAppBuilderAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionQueryNamesToConnectionIds = defaults.actionQueryNamesToConnectionIds;
    	      this.appJson = defaults.appJson;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.published = defaults.published;
    	      this.rootInstanceName = defaults.rootInstanceName;
        }

        @CustomType.Setter
        public Builder actionQueryNamesToConnectionIds(Map<String,String> actionQueryNamesToConnectionIds) {
            if (actionQueryNamesToConnectionIds == null) {
              throw new MissingRequiredPropertyException("GetAppBuilderAppResult", "actionQueryNamesToConnectionIds");
            }
            this.actionQueryNamesToConnectionIds = actionQueryNamesToConnectionIds;
            return this;
        }
        @CustomType.Setter
        public Builder appJson(String appJson) {
            if (appJson == null) {
              throw new MissingRequiredPropertyException("GetAppBuilderAppResult", "appJson");
            }
            this.appJson = appJson;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAppBuilderAppResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppBuilderAppResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppBuilderAppResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder published(Boolean published) {
            if (published == null) {
              throw new MissingRequiredPropertyException("GetAppBuilderAppResult", "published");
            }
            this.published = published;
            return this;
        }
        @CustomType.Setter
        public Builder rootInstanceName(String rootInstanceName) {
            if (rootInstanceName == null) {
              throw new MissingRequiredPropertyException("GetAppBuilderAppResult", "rootInstanceName");
            }
            this.rootInstanceName = rootInstanceName;
            return this;
        }
        public GetAppBuilderAppResult build() {
            final var _resultValue = new GetAppBuilderAppResult();
            _resultValue.actionQueryNamesToConnectionIds = actionQueryNamesToConnectionIds;
            _resultValue.appJson = appJson;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.published = published;
            _resultValue.rootInstanceName = rootInstanceName;
            return _resultValue;
        }
    }
}
