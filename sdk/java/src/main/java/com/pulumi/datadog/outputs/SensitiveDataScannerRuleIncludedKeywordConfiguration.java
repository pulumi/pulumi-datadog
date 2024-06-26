// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SensitiveDataScannerRuleIncludedKeywordConfiguration {
    /**
     * @return Number of characters before the match to find a keyword validating the match. It must be between 1 and 50 (inclusive).
     * 
     */
    private Integer characterCount;
    /**
     * @return Keyword list that is checked during scanning in order to validate a match. The number of keywords in the list must be lower than or equal to 30.
     * 
     */
    private List<String> keywords;

    private SensitiveDataScannerRuleIncludedKeywordConfiguration() {}
    /**
     * @return Number of characters before the match to find a keyword validating the match. It must be between 1 and 50 (inclusive).
     * 
     */
    public Integer characterCount() {
        return this.characterCount;
    }
    /**
     * @return Keyword list that is checked during scanning in order to validate a match. The number of keywords in the list must be lower than or equal to 30.
     * 
     */
    public List<String> keywords() {
        return this.keywords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensitiveDataScannerRuleIncludedKeywordConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer characterCount;
        private List<String> keywords;
        public Builder() {}
        public Builder(SensitiveDataScannerRuleIncludedKeywordConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterCount = defaults.characterCount;
    	      this.keywords = defaults.keywords;
        }

        @CustomType.Setter
        public Builder characterCount(Integer characterCount) {
            if (characterCount == null) {
              throw new MissingRequiredPropertyException("SensitiveDataScannerRuleIncludedKeywordConfiguration", "characterCount");
            }
            this.characterCount = characterCount;
            return this;
        }
        @CustomType.Setter
        public Builder keywords(List<String> keywords) {
            if (keywords == null) {
              throw new MissingRequiredPropertyException("SensitiveDataScannerRuleIncludedKeywordConfiguration", "keywords");
            }
            this.keywords = keywords;
            return this;
        }
        public Builder keywords(String... keywords) {
            return keywords(List.of(keywords));
        }
        public SensitiveDataScannerRuleIncludedKeywordConfiguration build() {
            final var _resultValue = new SensitiveDataScannerRuleIncludedKeywordConfiguration();
            _resultValue.characterCount = characterCount;
            _resultValue.keywords = keywords;
            return _resultValue;
        }
    }
}
