// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.OnCallScheduleLayerInterval;
import com.pulumi.datadog.outputs.OnCallScheduleLayerRestriction;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OnCallScheduleLayer {
    /**
     * @return The date/time when this layer should become active (in ISO 8601).
     * 
     */
    private String effectiveDate;
    /**
     * @return The date/time after which this layer no longer applies (in ISO 8601).
     * 
     */
    private @Nullable String endDate;
    /**
     * @return The ID of this layer.
     * 
     */
    private @Nullable String id;
    /**
     * @return Rotation interval for this layer.
     * 
     */
    private @Nullable OnCallScheduleLayerInterval interval;
    /**
     * @return The name of this layer. Should be unique within the schedule.
     * 
     */
    private String name;
    /**
     * @return List of restrictions for the layer.
     * 
     */
    private @Nullable List<OnCallScheduleLayerRestriction> restrictions;
    /**
     * @return The date/time when the rotation for this layer starts (in ISO 8601).
     * 
     */
    private String rotationStart;
    /**
     * @return List of user IDs for the layer. Can either be a valid user id or null
     * 
     */
    private List<String> users;

    private OnCallScheduleLayer() {}
    /**
     * @return The date/time when this layer should become active (in ISO 8601).
     * 
     */
    public String effectiveDate() {
        return this.effectiveDate;
    }
    /**
     * @return The date/time after which this layer no longer applies (in ISO 8601).
     * 
     */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * @return The ID of this layer.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Rotation interval for this layer.
     * 
     */
    public Optional<OnCallScheduleLayerInterval> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return The name of this layer. Should be unique within the schedule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of restrictions for the layer.
     * 
     */
    public List<OnCallScheduleLayerRestriction> restrictions() {
        return this.restrictions == null ? List.of() : this.restrictions;
    }
    /**
     * @return The date/time when the rotation for this layer starts (in ISO 8601).
     * 
     */
    public String rotationStart() {
        return this.rotationStart;
    }
    /**
     * @return List of user IDs for the layer. Can either be a valid user id or null
     * 
     */
    public List<String> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnCallScheduleLayer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effectiveDate;
        private @Nullable String endDate;
        private @Nullable String id;
        private @Nullable OnCallScheduleLayerInterval interval;
        private String name;
        private @Nullable List<OnCallScheduleLayerRestriction> restrictions;
        private String rotationStart;
        private List<String> users;
        public Builder() {}
        public Builder(OnCallScheduleLayer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveDate = defaults.effectiveDate;
    	      this.endDate = defaults.endDate;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.name = defaults.name;
    	      this.restrictions = defaults.restrictions;
    	      this.rotationStart = defaults.rotationStart;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder effectiveDate(String effectiveDate) {
            if (effectiveDate == null) {
              throw new MissingRequiredPropertyException("OnCallScheduleLayer", "effectiveDate");
            }
            this.effectiveDate = effectiveDate;
            return this;
        }
        @CustomType.Setter
        public Builder endDate(@Nullable String endDate) {

            this.endDate = endDate;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable OnCallScheduleLayerInterval interval) {

            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("OnCallScheduleLayer", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder restrictions(@Nullable List<OnCallScheduleLayerRestriction> restrictions) {

            this.restrictions = restrictions;
            return this;
        }
        public Builder restrictions(OnCallScheduleLayerRestriction... restrictions) {
            return restrictions(List.of(restrictions));
        }
        @CustomType.Setter
        public Builder rotationStart(String rotationStart) {
            if (rotationStart == null) {
              throw new MissingRequiredPropertyException("OnCallScheduleLayer", "rotationStart");
            }
            this.rotationStart = rotationStart;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<String> users) {
            if (users == null) {
              throw new MissingRequiredPropertyException("OnCallScheduleLayer", "users");
            }
            this.users = users;
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public OnCallScheduleLayer build() {
            final var _resultValue = new OnCallScheduleLayer();
            _resultValue.effectiveDate = effectiveDate;
            _resultValue.endDate = endDate;
            _resultValue.id = id;
            _resultValue.interval = interval;
            _resultValue.name = name;
            _resultValue.restrictions = restrictions;
            _resultValue.rotationStart = rotationStart;
            _resultValue.users = users;
            return _resultValue;
        }
    }
}
