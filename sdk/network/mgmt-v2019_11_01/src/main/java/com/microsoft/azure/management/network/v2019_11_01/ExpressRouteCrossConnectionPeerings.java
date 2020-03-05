/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_11_01.implementation.ExpressRouteCrossConnectionPeeringsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRouteCrossConnectionPeerings.
 */
public interface ExpressRouteCrossConnectionPeerings extends SupportsCreating<ExpressRouteCrossConnectionPeering.DefinitionStages.Blank>, HasInner<ExpressRouteCrossConnectionPeeringsInner> {
    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCrossConnectionPeering> getAsync(String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCrossConnectionPeering> listAsync(final String resourceGroupName, final String crossConnectionName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String crossConnectionName, String peeringName);

}
