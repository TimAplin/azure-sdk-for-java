/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.BlobRestoreStatus;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_06_01.BlobRestoreParameters;
import com.microsoft.azure.management.storage.v2019_06_01.BlobRestoreProgressStatus;

class BlobRestoreStatusImpl extends WrapperImpl<BlobRestoreStatusInner> implements BlobRestoreStatus {
    private final StorageManager manager;
    BlobRestoreStatusImpl(BlobRestoreStatusInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public String failureReason() {
        return this.inner().failureReason();
    }

    @Override
    public BlobRestoreParameters parameters() {
        return this.inner().parameters();
    }

    @Override
    public String restoreId() {
        return this.inner().restoreId();
    }

    @Override
    public BlobRestoreProgressStatus status() {
        return this.inner().status();
    }

}
