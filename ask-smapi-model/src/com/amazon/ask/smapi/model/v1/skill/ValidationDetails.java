/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Standardized, machine readable structure that wraps all the information about a specific occurrence of an error of the type specified by the code.
 */

@JsonDeserialize(builder = ValidationDetails.Builder.class)
public final class ValidationDetails {

    @JsonProperty("actualImageAttributes")
    private com.amazon.ask.smapi.model.v1.skill.ImageAttributes actualImageAttributes = null;

    @JsonProperty("actualNumberOfItems")
    private Integer actualNumberOfItems = null;

    @JsonProperty("actualStringLength")
    private Integer actualStringLength = null;

    @JsonProperty("allowedContentTypes")
    private List<String> allowedContentTypes = new ArrayList<String>();

    @JsonProperty("allowedDataTypes")
    private List<com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes> allowedDataTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes>();

    @JsonProperty("allowedImageAttributes")
    private List<com.amazon.ask.smapi.model.v1.skill.ImageAttributes> allowedImageAttributes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.ImageAttributes>();

    @JsonProperty("conflictingInstance")
    private com.amazon.ask.smapi.model.v1.skill.Instance conflictingInstance = null;

    @JsonProperty("expectedInstance")
    private com.amazon.ask.smapi.model.v1.skill.Instance expectedInstance = null;

    @JsonProperty("expectedRegexPattern")
    private String expectedRegexPattern = null;

    @JsonProperty("agreementType")
    private String agreementType = null;

    @JsonProperty("feature")
    private com.amazon.ask.smapi.model.v1.skill.ValidationFeature feature = null;

    @JsonProperty("inconsistentEndpoint")
    private com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint inconsistentEndpoint = null;

    @JsonProperty("minimumIntegerValue")
    private Integer minimumIntegerValue = null;

    @JsonProperty("minimumNumberOfItems")
    private Integer minimumNumberOfItems = null;

    @JsonProperty("minimumStringLength")
    private Integer minimumStringLength = null;

    @JsonProperty("maximumIntegerValue")
    private Integer maximumIntegerValue = null;

    @JsonProperty("maximumNumberOfItems")
    private Integer maximumNumberOfItems = null;

    @JsonProperty("maximumStringLength")
    private Integer maximumStringLength = null;

    @JsonProperty("originalEndpoint")
    private com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint originalEndpoint = null;

    @JsonProperty("originalInstance")
    private com.amazon.ask.smapi.model.v1.skill.Instance originalInstance = null;

    @JsonProperty("requiredProperty")
    private String requiredProperty = null;

    @JsonProperty("unexpectedProperty")
    private String unexpectedProperty = null;

    public static Builder builder() {
        return new Builder();
    }

    private ValidationDetails(Builder builder) {
        if (builder.actualImageAttributes != null) {
            this.actualImageAttributes = builder.actualImageAttributes;
        }
        if (builder.actualNumberOfItems != null) {
            this.actualNumberOfItems = builder.actualNumberOfItems;
        }
        if (builder.actualStringLength != null) {
            this.actualStringLength = builder.actualStringLength;
        }
        if (builder.allowedContentTypes != null) {
            this.allowedContentTypes = builder.allowedContentTypes;
        }
        if (builder.allowedDataTypes != null) {
            this.allowedDataTypes = builder.allowedDataTypes;
        }
        if (builder.allowedImageAttributes != null) {
            this.allowedImageAttributes = builder.allowedImageAttributes;
        }
        if (builder.conflictingInstance != null) {
            this.conflictingInstance = builder.conflictingInstance;
        }
        if (builder.expectedInstance != null) {
            this.expectedInstance = builder.expectedInstance;
        }
        if (builder.expectedRegexPattern != null) {
            this.expectedRegexPattern = builder.expectedRegexPattern;
        }
        if (builder.agreementType != null) {
            this.agreementType = builder.agreementType;
        }
        if (builder.feature != null) {
            this.feature = builder.feature;
        }
        if (builder.inconsistentEndpoint != null) {
            this.inconsistentEndpoint = builder.inconsistentEndpoint;
        }
        if (builder.minimumIntegerValue != null) {
            this.minimumIntegerValue = builder.minimumIntegerValue;
        }
        if (builder.minimumNumberOfItems != null) {
            this.minimumNumberOfItems = builder.minimumNumberOfItems;
        }
        if (builder.minimumStringLength != null) {
            this.minimumStringLength = builder.minimumStringLength;
        }
        if (builder.maximumIntegerValue != null) {
            this.maximumIntegerValue = builder.maximumIntegerValue;
        }
        if (builder.maximumNumberOfItems != null) {
            this.maximumNumberOfItems = builder.maximumNumberOfItems;
        }
        if (builder.maximumStringLength != null) {
            this.maximumStringLength = builder.maximumStringLength;
        }
        if (builder.originalEndpoint != null) {
            this.originalEndpoint = builder.originalEndpoint;
        }
        if (builder.originalInstance != null) {
            this.originalInstance = builder.originalInstance;
        }
        if (builder.requiredProperty != null) {
            this.requiredProperty = builder.requiredProperty;
        }
        if (builder.unexpectedProperty != null) {
            this.unexpectedProperty = builder.unexpectedProperty;
        }
    }

    /**
     * Set of properties of the image provided by the customer.
     * @return actualImageAttributes
    **/
    @JsonProperty("actualImageAttributes")
    public com.amazon.ask.smapi.model.v1.skill.ImageAttributes getActualImageAttributes() {
        return actualImageAttributes;
    }


    /**
     * Number of items in an array provided by the customer.
     * @return actualNumberOfItems
    **/
    @JsonProperty("actualNumberOfItems")
    public Integer getActualNumberOfItems() {
        return actualNumberOfItems;
    }


    /**
     * Number of characters in a string provided by the customer.
     * @return actualStringLength
    **/
    @JsonProperty("actualStringLength")
    public Integer getActualStringLength() {
        return actualStringLength;
    }


    /**
     * List of allowed content types for a resource.
     * @return allowedContentTypes
    **/
    @JsonProperty("allowedContentTypes")
    public List<String> getAllowedContentTypes() {
        return allowedContentTypes;
    }


    /**
     * List of allowed data types for an instance.
     * @return allowedDataTypes
    **/
    @JsonProperty("allowedDataTypes")
    public List<com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes> getAllowedDataTypes() {
        return allowedDataTypes;
    }


    /**
     * List of set of properties representing all possible allowed images.
     * @return allowedImageAttributes
    **/
    @JsonProperty("allowedImageAttributes")
    public List<com.amazon.ask.smapi.model.v1.skill.ImageAttributes> getAllowedImageAttributes() {
        return allowedImageAttributes;
    }


    /**
     * Instance conflicting with another instance.
     * @return conflictingInstance
    **/
    @JsonProperty("conflictingInstance")
    public com.amazon.ask.smapi.model.v1.skill.Instance getConflictingInstance() {
        return conflictingInstance;
    }


    /**
     * Instance that is expected by a related instance.
     * @return expectedInstance
    **/
    @JsonProperty("expectedInstance")
    public com.amazon.ask.smapi.model.v1.skill.Instance getExpectedInstance() {
        return expectedInstance;
    }


    /**
     * Regular expression that a string instance is expected to match.
     * @return expectedRegexPattern
    **/
    @JsonProperty("expectedRegexPattern")
    public String getExpectedRegexPattern() {
        return expectedRegexPattern;
    }


    /**
     * Type of the agreement that the customer must be compliant to.
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getAgreementTypeAsString().
     *
     * @return agreementType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.AgreementType getAgreementType() {
        return com.amazon.ask.smapi.model.v1.skill.AgreementType.fromValue(agreementType);
    }

    /**
     * Get the underlying String value for agreementType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return agreementType as a String value
    **/
    @JsonProperty("agreementType")
    public String getAgreementTypeAsString() {
      return agreementType;
    }

    /**
     * Properties of a publicly known feature that has restricted access.
     * @return feature
    **/
    @JsonProperty("feature")
    public com.amazon.ask.smapi.model.v1.skill.ValidationFeature getFeature() {
        return feature;
    }


    /**
     * Endpoint which has a different value for property named type when compared to original endpoint.
     * @return inconsistentEndpoint
    **/
    @JsonProperty("inconsistentEndpoint")
    public com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint getInconsistentEndpoint() {
        return inconsistentEndpoint;
    }


    /**
     * Minimum allowed value of an integer instance.
     * @return minimumIntegerValue
    **/
    @JsonProperty("minimumIntegerValue")
    public Integer getMinimumIntegerValue() {
        return minimumIntegerValue;
    }


    /**
     * Minimum allowed number of items in an array.
     * @return minimumNumberOfItems
    **/
    @JsonProperty("minimumNumberOfItems")
    public Integer getMinimumNumberOfItems() {
        return minimumNumberOfItems;
    }


    /**
     * Minimum allowed number of characters in a string.
     * @return minimumStringLength
    **/
    @JsonProperty("minimumStringLength")
    public Integer getMinimumStringLength() {
        return minimumStringLength;
    }


    /**
     * Maximum allowed value of an integer instance.
     * @return maximumIntegerValue
    **/
    @JsonProperty("maximumIntegerValue")
    public Integer getMaximumIntegerValue() {
        return maximumIntegerValue;
    }


    /**
     * Maximum allowed number of items in an array.
     * @return maximumNumberOfItems
    **/
    @JsonProperty("maximumNumberOfItems")
    public Integer getMaximumNumberOfItems() {
        return maximumNumberOfItems;
    }


    /**
     * Maximum allowed number of characters in a string.
     * @return maximumStringLength
    **/
    @JsonProperty("maximumStringLength")
    public Integer getMaximumStringLength() {
        return maximumStringLength;
    }


    /**
     * An Endpoint instance
     * @return originalEndpoint
    **/
    @JsonProperty("originalEndpoint")
    public com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint getOriginalEndpoint() {
        return originalEndpoint;
    }


    /**
     * An Instance
     * @return originalInstance
    **/
    @JsonProperty("originalInstance")
    public com.amazon.ask.smapi.model.v1.skill.Instance getOriginalInstance() {
        return originalInstance;
    }


    /**
     * Property required but missing in the object.
     * @return requiredProperty
    **/
    @JsonProperty("requiredProperty")
    public String getRequiredProperty() {
        return requiredProperty;
    }


    /**
     * Property not expected but present in the object.
     * @return unexpectedProperty
    **/
    @JsonProperty("unexpectedProperty")
    public String getUnexpectedProperty() {
        return unexpectedProperty;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationDetails v1SkillValidationDetails = (ValidationDetails) o;
        return Objects.equals(this.actualImageAttributes, v1SkillValidationDetails.actualImageAttributes) &&
            Objects.equals(this.actualNumberOfItems, v1SkillValidationDetails.actualNumberOfItems) &&
            Objects.equals(this.actualStringLength, v1SkillValidationDetails.actualStringLength) &&
            Objects.equals(this.allowedContentTypes, v1SkillValidationDetails.allowedContentTypes) &&
            Objects.equals(this.allowedDataTypes, v1SkillValidationDetails.allowedDataTypes) &&
            Objects.equals(this.allowedImageAttributes, v1SkillValidationDetails.allowedImageAttributes) &&
            Objects.equals(this.conflictingInstance, v1SkillValidationDetails.conflictingInstance) &&
            Objects.equals(this.expectedInstance, v1SkillValidationDetails.expectedInstance) &&
            Objects.equals(this.expectedRegexPattern, v1SkillValidationDetails.expectedRegexPattern) &&
            Objects.equals(this.agreementType, v1SkillValidationDetails.agreementType) &&
            Objects.equals(this.feature, v1SkillValidationDetails.feature) &&
            Objects.equals(this.inconsistentEndpoint, v1SkillValidationDetails.inconsistentEndpoint) &&
            Objects.equals(this.minimumIntegerValue, v1SkillValidationDetails.minimumIntegerValue) &&
            Objects.equals(this.minimumNumberOfItems, v1SkillValidationDetails.minimumNumberOfItems) &&
            Objects.equals(this.minimumStringLength, v1SkillValidationDetails.minimumStringLength) &&
            Objects.equals(this.maximumIntegerValue, v1SkillValidationDetails.maximumIntegerValue) &&
            Objects.equals(this.maximumNumberOfItems, v1SkillValidationDetails.maximumNumberOfItems) &&
            Objects.equals(this.maximumStringLength, v1SkillValidationDetails.maximumStringLength) &&
            Objects.equals(this.originalEndpoint, v1SkillValidationDetails.originalEndpoint) &&
            Objects.equals(this.originalInstance, v1SkillValidationDetails.originalInstance) &&
            Objects.equals(this.requiredProperty, v1SkillValidationDetails.requiredProperty) &&
            Objects.equals(this.unexpectedProperty, v1SkillValidationDetails.unexpectedProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualImageAttributes, actualNumberOfItems, actualStringLength, allowedContentTypes, allowedDataTypes, allowedImageAttributes, conflictingInstance, expectedInstance, expectedRegexPattern, agreementType, feature, inconsistentEndpoint, minimumIntegerValue, minimumNumberOfItems, minimumStringLength, maximumIntegerValue, maximumNumberOfItems, maximumStringLength, originalEndpoint, originalInstance, requiredProperty, unexpectedProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationDetails {\n");
        
        sb.append("    actualImageAttributes: ").append(toIndentedString(actualImageAttributes)).append("\n");
        sb.append("    actualNumberOfItems: ").append(toIndentedString(actualNumberOfItems)).append("\n");
        sb.append("    actualStringLength: ").append(toIndentedString(actualStringLength)).append("\n");
        sb.append("    allowedContentTypes: ").append(toIndentedString(allowedContentTypes)).append("\n");
        sb.append("    allowedDataTypes: ").append(toIndentedString(allowedDataTypes)).append("\n");
        sb.append("    allowedImageAttributes: ").append(toIndentedString(allowedImageAttributes)).append("\n");
        sb.append("    conflictingInstance: ").append(toIndentedString(conflictingInstance)).append("\n");
        sb.append("    expectedInstance: ").append(toIndentedString(expectedInstance)).append("\n");
        sb.append("    expectedRegexPattern: ").append(toIndentedString(expectedRegexPattern)).append("\n");
        sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    inconsistentEndpoint: ").append(toIndentedString(inconsistentEndpoint)).append("\n");
        sb.append("    minimumIntegerValue: ").append(toIndentedString(minimumIntegerValue)).append("\n");
        sb.append("    minimumNumberOfItems: ").append(toIndentedString(minimumNumberOfItems)).append("\n");
        sb.append("    minimumStringLength: ").append(toIndentedString(minimumStringLength)).append("\n");
        sb.append("    maximumIntegerValue: ").append(toIndentedString(maximumIntegerValue)).append("\n");
        sb.append("    maximumNumberOfItems: ").append(toIndentedString(maximumNumberOfItems)).append("\n");
        sb.append("    maximumStringLength: ").append(toIndentedString(maximumStringLength)).append("\n");
        sb.append("    originalEndpoint: ").append(toIndentedString(originalEndpoint)).append("\n");
        sb.append("    originalInstance: ").append(toIndentedString(originalInstance)).append("\n");
        sb.append("    requiredProperty: ").append(toIndentedString(requiredProperty)).append("\n");
        sb.append("    unexpectedProperty: ").append(toIndentedString(unexpectedProperty)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
    public static class Builder {
        private com.amazon.ask.smapi.model.v1.skill.ImageAttributes actualImageAttributes;
        private Integer actualNumberOfItems;
        private Integer actualStringLength;
        private List<String> allowedContentTypes;
        private List<com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes> allowedDataTypes;
        private List<com.amazon.ask.smapi.model.v1.skill.ImageAttributes> allowedImageAttributes;
        private com.amazon.ask.smapi.model.v1.skill.Instance conflictingInstance;
        private com.amazon.ask.smapi.model.v1.skill.Instance expectedInstance;
        private String expectedRegexPattern;
        private String agreementType;
        private com.amazon.ask.smapi.model.v1.skill.ValidationFeature feature;
        private com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint inconsistentEndpoint;
        private Integer minimumIntegerValue;
        private Integer minimumNumberOfItems;
        private Integer minimumStringLength;
        private Integer maximumIntegerValue;
        private Integer maximumNumberOfItems;
        private Integer maximumStringLength;
        private com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint originalEndpoint;
        private com.amazon.ask.smapi.model.v1.skill.Instance originalInstance;
        private String requiredProperty;
        private String unexpectedProperty;

        private Builder() {}

        @JsonProperty("actualImageAttributes")

        public Builder withActualImageAttributes(com.amazon.ask.smapi.model.v1.skill.ImageAttributes actualImageAttributes) {
            this.actualImageAttributes = actualImageAttributes;
            return this;
        }


        @JsonProperty("actualNumberOfItems")

        public Builder withActualNumberOfItems(Integer actualNumberOfItems) {
            this.actualNumberOfItems = actualNumberOfItems;
            return this;
        }


        @JsonProperty("actualStringLength")

        public Builder withActualStringLength(Integer actualStringLength) {
            this.actualStringLength = actualStringLength;
            return this;
        }


        @JsonProperty("allowedContentTypes")

        public Builder withAllowedContentTypes(List<String> allowedContentTypes) {
            this.allowedContentTypes = allowedContentTypes;
            return this;
        }

        public Builder addAllowedContentTypesItem(String allowedContentTypesItem) {
            if (this.allowedContentTypes == null) {
                this.allowedContentTypes = new ArrayList<String>();
            }
            this.allowedContentTypes.add(allowedContentTypesItem);
            return this;
        }

        @JsonProperty("allowedDataTypes")

        public Builder withAllowedDataTypes(List<com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes> allowedDataTypes) {
            this.allowedDataTypes = allowedDataTypes;
            return this;
        }

        public Builder addAllowedDataTypesItem(com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes allowedDataTypesItem) {
            if (this.allowedDataTypes == null) {
                this.allowedDataTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes>();
            }
            this.allowedDataTypes.add(allowedDataTypesItem);
            return this;
        }

        @JsonProperty("allowedImageAttributes")

        public Builder withAllowedImageAttributes(List<com.amazon.ask.smapi.model.v1.skill.ImageAttributes> allowedImageAttributes) {
            this.allowedImageAttributes = allowedImageAttributes;
            return this;
        }

        public Builder addAllowedImageAttributesItem(com.amazon.ask.smapi.model.v1.skill.ImageAttributes allowedImageAttributesItem) {
            if (this.allowedImageAttributes == null) {
                this.allowedImageAttributes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.ImageAttributes>();
            }
            this.allowedImageAttributes.add(allowedImageAttributesItem);
            return this;
        }

        @JsonProperty("conflictingInstance")

        public Builder withConflictingInstance(com.amazon.ask.smapi.model.v1.skill.Instance conflictingInstance) {
            this.conflictingInstance = conflictingInstance;
            return this;
        }


        @JsonProperty("expectedInstance")

        public Builder withExpectedInstance(com.amazon.ask.smapi.model.v1.skill.Instance expectedInstance) {
            this.expectedInstance = expectedInstance;
            return this;
        }


        @JsonProperty("expectedRegexPattern")

        public Builder withExpectedRegexPattern(String expectedRegexPattern) {
            this.expectedRegexPattern = expectedRegexPattern;
            return this;
        }


        @JsonProperty("agreementType")
        public Builder withAgreementType(String agreementType) {
          this.agreementType = agreementType;
          return this;
        }

        public Builder withAgreementType(com.amazon.ask.smapi.model.v1.skill.AgreementType agreementType) {
            this.agreementType = agreementType != null ? agreementType.toString() : null;
            return this;
        }


        @JsonProperty("feature")

        public Builder withFeature(com.amazon.ask.smapi.model.v1.skill.ValidationFeature feature) {
            this.feature = feature;
            return this;
        }


        @JsonProperty("inconsistentEndpoint")

        public Builder withInconsistentEndpoint(com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint inconsistentEndpoint) {
            this.inconsistentEndpoint = inconsistentEndpoint;
            return this;
        }


        @JsonProperty("minimumIntegerValue")

        public Builder withMinimumIntegerValue(Integer minimumIntegerValue) {
            this.minimumIntegerValue = minimumIntegerValue;
            return this;
        }


        @JsonProperty("minimumNumberOfItems")

        public Builder withMinimumNumberOfItems(Integer minimumNumberOfItems) {
            this.minimumNumberOfItems = minimumNumberOfItems;
            return this;
        }


        @JsonProperty("minimumStringLength")

        public Builder withMinimumStringLength(Integer minimumStringLength) {
            this.minimumStringLength = minimumStringLength;
            return this;
        }


        @JsonProperty("maximumIntegerValue")

        public Builder withMaximumIntegerValue(Integer maximumIntegerValue) {
            this.maximumIntegerValue = maximumIntegerValue;
            return this;
        }


        @JsonProperty("maximumNumberOfItems")

        public Builder withMaximumNumberOfItems(Integer maximumNumberOfItems) {
            this.maximumNumberOfItems = maximumNumberOfItems;
            return this;
        }


        @JsonProperty("maximumStringLength")

        public Builder withMaximumStringLength(Integer maximumStringLength) {
            this.maximumStringLength = maximumStringLength;
            return this;
        }


        @JsonProperty("originalEndpoint")

        public Builder withOriginalEndpoint(com.amazon.ask.smapi.model.v1.skill.ValidationEndpoint originalEndpoint) {
            this.originalEndpoint = originalEndpoint;
            return this;
        }


        @JsonProperty("originalInstance")

        public Builder withOriginalInstance(com.amazon.ask.smapi.model.v1.skill.Instance originalInstance) {
            this.originalInstance = originalInstance;
            return this;
        }


        @JsonProperty("requiredProperty")

        public Builder withRequiredProperty(String requiredProperty) {
            this.requiredProperty = requiredProperty;
            return this;
        }


        @JsonProperty("unexpectedProperty")

        public Builder withUnexpectedProperty(String unexpectedProperty) {
            this.unexpectedProperty = unexpectedProperty;
            return this;
        }


        public ValidationDetails build() {
            return new ValidationDetails(this);
        }
    }
}

