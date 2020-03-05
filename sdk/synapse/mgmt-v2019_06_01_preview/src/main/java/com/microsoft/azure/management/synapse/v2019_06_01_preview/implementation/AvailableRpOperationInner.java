/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.AvailableRpOperationDisplayInfo;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.OperationMetaServiceSpecification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An operation that is available in this resource provider.
 */
@JsonFlatten
public class AvailableRpOperationInner {
    /**
     * Display properties of the operation.
     */
    @JsonProperty(value = "display")
    private AvailableRpOperationDisplayInfo display;

    /**
     * Whether this operation is a data action.
     */
    @JsonProperty(value = "isDataAction")
    private String isDataAction;

    /**
     * Operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Operation service specification.
     */
    @JsonProperty(value = "properties.serviceSpecification")
    private OperationMetaServiceSpecification serviceSpecification;

    /**
     * Operation origin.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Get display properties of the operation.
     *
     * @return the display value
     */
    public AvailableRpOperationDisplayInfo display() {
        return this.display;
    }

    /**
     * Set display properties of the operation.
     *
     * @param display the display value to set
     * @return the AvailableRpOperationInner object itself.
     */
    public AvailableRpOperationInner withDisplay(AvailableRpOperationDisplayInfo display) {
        this.display = display;
        return this;
    }

    /**
     * Get whether this operation is a data action.
     *
     * @return the isDataAction value
     */
    public String isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set whether this operation is a data action.
     *
     * @param isDataAction the isDataAction value to set
     * @return the AvailableRpOperationInner object itself.
     */
    public AvailableRpOperationInner withIsDataAction(String isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get operation name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name.
     *
     * @param name the name value to set
     * @return the AvailableRpOperationInner object itself.
     */
    public AvailableRpOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get operation service specification.
     *
     * @return the serviceSpecification value
     */
    public OperationMetaServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set operation service specification.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the AvailableRpOperationInner object itself.
     */
    public AvailableRpOperationInner withServiceSpecification(OperationMetaServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Get operation origin.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set operation origin.
     *
     * @param origin the origin value to set
     * @return the AvailableRpOperationInner object itself.
     */
    public AvailableRpOperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

}
