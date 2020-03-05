/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the event source.
 */
public class EventSourceCommonProperties extends ResourceProperties {
    /**
     * The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or
     * empty-string is specified, the event creation time will be used.
     */
    @JsonProperty(value = "timestampPropertyName")
    private String timestampPropertyName;

    /**
     * Get the event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     *
     * @return the timestampPropertyName value
     */
    public String timestampPropertyName() {
        return this.timestampPropertyName;
    }

    /**
     * Set the event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     *
     * @param timestampPropertyName the timestampPropertyName value to set
     * @return the EventSourceCommonProperties object itself.
     */
    public EventSourceCommonProperties withTimestampPropertyName(String timestampPropertyName) {
        this.timestampPropertyName = timestampPropertyName;
        return this;
    }

}
