/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Users;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.GroupUserContract;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.GenerateSsoUrlResult;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserTokenResult;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserTokenParameters;

class UsersImpl extends WrapperImpl<UsersInner> implements Users {
    private final ApiManagementManager manager;

    UsersImpl(ApiManagementManager manager) {
        super(manager.inner().users());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public UserContractImpl define(String name) {
        return wrapModel(name);
    }

    private UserContractImpl wrapModel(UserContractInner inner) {
        return  new UserContractImpl(inner, manager());
    }

    private UserContractImpl wrapModel(String name) {
        return new UserContractImpl(name, this.manager());
    }

    @Override
    public Observable<GroupUserContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        UsersInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<UserContractInner>, Iterable<UserContractInner>>() {
            @Override
            public Iterable<UserContractInner> call(Page<UserContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UserContractInner, GroupUserContract>() {
            @Override
            public GroupUserContract call(UserContractInner inner) {
                return new GroupUserContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String userId) {
        UsersInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, userId).toCompletable();
    }

    @Override
    public Observable<GroupUserContract> getAsync(String resourceGroupName, String serviceName, String userId) {
        UsersInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, userId)
        .map(new Func1<UserContractInner, GroupUserContract>() {
            @Override
            public GroupUserContract call(UserContractInner inner) {
                return new GroupUserContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String userId, String ifMatch) {
        UsersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, userId, ifMatch).toCompletable();
    }

    @Override
    public Observable<GenerateSsoUrlResult> generateSsoUrlAsync(String resourceGroupName, String serviceName, String userId) {
        UsersInner client = this.inner();
        return client.generateSsoUrlAsync(resourceGroupName, serviceName, userId)
        .map(new Func1<GenerateSsoUrlResultInner, GenerateSsoUrlResult>() {
            @Override
            public GenerateSsoUrlResult call(GenerateSsoUrlResultInner inner) {
                return new GenerateSsoUrlResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UserTokenResult> getSharedAccessTokenAsync(String resourceGroupName, String serviceName, String userId, UserTokenParameters parameters) {
        UsersInner client = this.inner();
        return client.getSharedAccessTokenAsync(resourceGroupName, serviceName, userId, parameters)
        .map(new Func1<UserTokenResultInner, UserTokenResult>() {
            @Override
            public UserTokenResult call(UserTokenResultInner inner) {
                return new UserTokenResultImpl(inner, manager());
            }
        });
    }

}
