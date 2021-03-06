/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Grant sql control to managed identity.
 */
public class ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity {
    /**
     * Desired state. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "desiredState")
    private String desiredState;

    /**
     * Actual state. Possible values include: 'Enabling', 'Enabled',
     * 'Disabling', 'Disabled', 'Unknown'.
     */
    @JsonProperty(value = "actualState", access = JsonProperty.Access.WRITE_ONLY)
    private String actualState;

    /**
     * Get desired state. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the desiredState value
     */
    public String desiredState() {
        return this.desiredState;
    }

    /**
     * Set desired state. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param desiredState the desiredState value to set
     * @return the ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity object itself.
     */
    public ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity withDesiredState(String desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Get actual state. Possible values include: 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Unknown'.
     *
     * @return the actualState value
     */
    public String actualState() {
        return this.actualState;
    }

}
