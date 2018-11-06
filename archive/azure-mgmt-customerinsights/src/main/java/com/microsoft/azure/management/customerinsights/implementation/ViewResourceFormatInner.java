/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights.implementation;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.customerinsights.ProxyResource;

/**
 * The view resource format.
 */
@JsonFlatten
public class ViewResourceFormatInner extends ProxyResource {
    /**
     * Name of the view.
     */
    @JsonProperty(value = "properties.viewName", access = JsonProperty.Access.WRITE_ONLY)
    private String viewName;

    /**
     * the user ID.
     */
    @JsonProperty(value = "properties.userId")
    private String userId;

    /**
     * the hub name.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Localized display name for the view.
     */
    @JsonProperty(value = "properties.displayName")
    private Map<String, String> displayName;

    /**
     * View definition.
     */
    @JsonProperty(value = "properties.definition", required = true)
    private String definition;

    /**
     * Date time when view was last modified.
     */
    @JsonProperty(value = "properties.changed", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime changed;

    /**
     * Date time when view was created.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * Get the viewName value.
     *
     * @return the viewName value
     */
    public String viewName() {
        return this.viewName;
    }

    /**
     * Get the userId value.
     *
     * @return the userId value
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId value.
     *
     * @param userId the userId value to set
     * @return the ViewResourceFormatInner object itself.
     */
    public ViewResourceFormatInner withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public Map<String, String> displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the ViewResourceFormatInner object itself.
     */
    public ViewResourceFormatInner withDisplayName(Map<String, String> displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the definition value.
     *
     * @return the definition value
     */
    public String definition() {
        return this.definition;
    }

    /**
     * Set the definition value.
     *
     * @param definition the definition value to set
     * @return the ViewResourceFormatInner object itself.
     */
    public ViewResourceFormatInner withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get the changed value.
     *
     * @return the changed value
     */
    public DateTime changed() {
        return this.changed;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

}