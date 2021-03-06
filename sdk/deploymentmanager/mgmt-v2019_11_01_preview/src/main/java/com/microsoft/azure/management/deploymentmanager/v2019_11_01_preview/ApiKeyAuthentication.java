/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiKey authentication gives a name and a value that can be included in
 * either the request header or query parameters.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ApiKeyAuthentication.class)
@JsonTypeName("ApiKey")
public class ApiKeyAuthentication extends RestRequestAuthentication {
    /**
     * The key name of the authentication key/value pair.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The location of the authentication key/value pair in the request.
     * Possible values include: 'Query', 'Header'.
     */
    @JsonProperty(value = "in", required = true)
    private RestAuthLocation in;

    /**
     * The value of the authentication key/value pair.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the key name of the authentication key/value pair.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the key name of the authentication key/value pair.
     *
     * @param name the name value to set
     * @return the ApiKeyAuthentication object itself.
     */
    public ApiKeyAuthentication withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location of the authentication key/value pair in the request. Possible values include: 'Query', 'Header'.
     *
     * @return the in value
     */
    public RestAuthLocation in() {
        return this.in;
    }

    /**
     * Set the location of the authentication key/value pair in the request. Possible values include: 'Query', 'Header'.
     *
     * @param in the in value to set
     * @return the ApiKeyAuthentication object itself.
     */
    public ApiKeyAuthentication withIn(RestAuthLocation in) {
        this.in = in;
        return this;
    }

    /**
     * Get the value of the authentication key/value pair.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the authentication key/value pair.
     *
     * @param value the value value to set
     * @return the ApiKeyAuthentication object itself.
     */
    public ApiKeyAuthentication withValue(String value) {
        this.value = value;
        return this;
    }

}
