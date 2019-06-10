/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.Operations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.TagResourceContract;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final ApiManagementManager manager;

    OperationsImpl(ApiManagementManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    private TagResourceContractImpl wrapModel(TagResourceContractInner inner) {
        return  new TagResourceContractImpl(inner, manager());
    }

    @Override
    public Observable<TagResourceContract> listByTagsAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        OperationsInner client = this.inner();
        return client.listByTagsAsync(resourceGroupName, serviceName, apiId)
        .flatMapIterable(new Func1<Page<TagResourceContractInner>, Iterable<TagResourceContractInner>>() {
            @Override
            public Iterable<TagResourceContractInner> call(Page<TagResourceContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagResourceContractInner, TagResourceContract>() {
            @Override
            public TagResourceContract call(TagResourceContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

}