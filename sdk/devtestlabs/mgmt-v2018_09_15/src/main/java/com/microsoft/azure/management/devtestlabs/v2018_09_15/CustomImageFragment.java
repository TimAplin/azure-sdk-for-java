/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A custom image.
 */
@JsonFlatten
public class CustomImageFragment extends UpdateResource {
    /**
     * The virtual machine from which the image is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private CustomImagePropertiesFromVmFragment vm;

    /**
     * The VHD from which the image is to be created.
     */
    @JsonProperty(value = "properties.vhd")
    private CustomImagePropertiesCustomFragment vhd;

    /**
     * The description of the custom image.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The author of the custom image.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * The Managed Image Id backing the custom image.
     */
    @JsonProperty(value = "properties.managedImageId")
    private String managedImageId;

    /**
     * The Managed Snapshot Id backing the custom image.
     */
    @JsonProperty(value = "properties.managedSnapshotId")
    private String managedSnapshotId;

    /**
     * Storage information about the data disks present in the custom image.
     */
    @JsonProperty(value = "properties.dataDiskStorageInfo")
    private List<DataDiskStorageTypeInfoFragment> dataDiskStorageInfo;

    /**
     * Storage information about the plan related to this custom image.
     */
    @JsonProperty(value = "properties.customImagePlan")
    private CustomImagePropertiesFromPlanFragment customImagePlan;

    /**
     * Whether or not the custom images underlying offer/plan has been enabled
     * for programmatic deployment.
     */
    @JsonProperty(value = "properties.isPlanAuthorized")
    private Boolean isPlanAuthorized;

    /**
     * Get the virtual machine from which the image is to be created.
     *
     * @return the vm value
     */
    public CustomImagePropertiesFromVmFragment vm() {
        return this.vm;
    }

    /**
     * Set the virtual machine from which the image is to be created.
     *
     * @param vm the vm value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withVm(CustomImagePropertiesFromVmFragment vm) {
        this.vm = vm;
        return this;
    }

    /**
     * Get the VHD from which the image is to be created.
     *
     * @return the vhd value
     */
    public CustomImagePropertiesCustomFragment vhd() {
        return this.vhd;
    }

    /**
     * Set the VHD from which the image is to be created.
     *
     * @param vhd the vhd value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withVhd(CustomImagePropertiesCustomFragment vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the description of the custom image.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the custom image.
     *
     * @param description the description value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author of the custom image.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author of the custom image.
     *
     * @param author the author value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the Managed Image Id backing the custom image.
     *
     * @return the managedImageId value
     */
    public String managedImageId() {
        return this.managedImageId;
    }

    /**
     * Set the Managed Image Id backing the custom image.
     *
     * @param managedImageId the managedImageId value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withManagedImageId(String managedImageId) {
        this.managedImageId = managedImageId;
        return this;
    }

    /**
     * Get the Managed Snapshot Id backing the custom image.
     *
     * @return the managedSnapshotId value
     */
    public String managedSnapshotId() {
        return this.managedSnapshotId;
    }

    /**
     * Set the Managed Snapshot Id backing the custom image.
     *
     * @param managedSnapshotId the managedSnapshotId value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withManagedSnapshotId(String managedSnapshotId) {
        this.managedSnapshotId = managedSnapshotId;
        return this;
    }

    /**
     * Get storage information about the data disks present in the custom image.
     *
     * @return the dataDiskStorageInfo value
     */
    public List<DataDiskStorageTypeInfoFragment> dataDiskStorageInfo() {
        return this.dataDiskStorageInfo;
    }

    /**
     * Set storage information about the data disks present in the custom image.
     *
     * @param dataDiskStorageInfo the dataDiskStorageInfo value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withDataDiskStorageInfo(List<DataDiskStorageTypeInfoFragment> dataDiskStorageInfo) {
        this.dataDiskStorageInfo = dataDiskStorageInfo;
        return this;
    }

    /**
     * Get storage information about the plan related to this custom image.
     *
     * @return the customImagePlan value
     */
    public CustomImagePropertiesFromPlanFragment customImagePlan() {
        return this.customImagePlan;
    }

    /**
     * Set storage information about the plan related to this custom image.
     *
     * @param customImagePlan the customImagePlan value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withCustomImagePlan(CustomImagePropertiesFromPlanFragment customImagePlan) {
        this.customImagePlan = customImagePlan;
        return this;
    }

    /**
     * Get whether or not the custom images underlying offer/plan has been enabled for programmatic deployment.
     *
     * @return the isPlanAuthorized value
     */
    public Boolean isPlanAuthorized() {
        return this.isPlanAuthorized;
    }

    /**
     * Set whether or not the custom images underlying offer/plan has been enabled for programmatic deployment.
     *
     * @param isPlanAuthorized the isPlanAuthorized value to set
     * @return the CustomImageFragment object itself.
     */
    public CustomImageFragment withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.isPlanAuthorized = isPlanAuthorized;
        return this;
    }

}
