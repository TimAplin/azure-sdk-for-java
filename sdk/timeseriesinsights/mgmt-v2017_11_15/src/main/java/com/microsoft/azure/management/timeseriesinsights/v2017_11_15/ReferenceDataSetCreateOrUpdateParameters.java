/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The ReferenceDataSetCreateOrUpdateParameters model.
 */
@JsonFlatten
public class ReferenceDataSetCreateOrUpdateParameters extends CreateOrUpdateTrackedResourceProperties {
    /**
     * The list of key properties for the reference data set.
     */
    @JsonProperty(value = "properties.keyProperties", required = true)
    private List<ReferenceDataSetKeyProperty> keyProperties;

    /**
     * The reference data set key comparison behavior can be set using this
     * property. By default, the value is 'Ordinal' - which means case
     * sensitive key comparison will be performed while joining reference data
     * with events or while adding new reference data. When 'OrdinalIgnoreCase'
     * is set, case insensitive comparison will be used. Possible values
     * include: 'Ordinal', 'OrdinalIgnoreCase'.
     */
    @JsonProperty(value = "properties.dataStringComparisonBehavior")
    private DataStringComparisonBehavior dataStringComparisonBehavior;

    /**
     * Get the list of key properties for the reference data set.
     *
     * @return the keyProperties value
     */
    public List<ReferenceDataSetKeyProperty> keyProperties() {
        return this.keyProperties;
    }

    /**
     * Set the list of key properties for the reference data set.
     *
     * @param keyProperties the keyProperties value to set
     * @return the ReferenceDataSetCreateOrUpdateParameters object itself.
     */
    public ReferenceDataSetCreateOrUpdateParameters withKeyProperties(List<ReferenceDataSetKeyProperty> keyProperties) {
        this.keyProperties = keyProperties;
        return this;
    }

    /**
     * Get the reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used. Possible values include: 'Ordinal', 'OrdinalIgnoreCase'.
     *
     * @return the dataStringComparisonBehavior value
     */
    public DataStringComparisonBehavior dataStringComparisonBehavior() {
        return this.dataStringComparisonBehavior;
    }

    /**
     * Set the reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used. Possible values include: 'Ordinal', 'OrdinalIgnoreCase'.
     *
     * @param dataStringComparisonBehavior the dataStringComparisonBehavior value to set
     * @return the ReferenceDataSetCreateOrUpdateParameters object itself.
     */
    public ReferenceDataSetCreateOrUpdateParameters withDataStringComparisonBehavior(DataStringComparisonBehavior dataStringComparisonBehavior) {
        this.dataStringComparisonBehavior = dataStringComparisonBehavior;
        return this;
    }

}
