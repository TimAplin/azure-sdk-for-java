/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a lab's announcement banner.
 */
public class LabAnnouncementPropertiesFragment {
    /**
     * The plain text title for the lab announcement.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * The markdown text (if any) that this lab displays in the UI. If left
     * empty/null, nothing will be shown.
     */
    @JsonProperty(value = "markdown")
    private String markdown;

    /**
     * Is the lab announcement active/enabled at this time?. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "enabled")
    private EnableStatus enabled;

    /**
     * The time at which the announcement expires (null for never).
     */
    @JsonProperty(value = "expirationDate")
    private DateTime expirationDate;

    /**
     * Has this announcement expired?.
     */
    @JsonProperty(value = "expired")
    private Boolean expired;

    /**
     * Get the plain text title for the lab announcement.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the plain text title for the lab announcement.
     *
     * @param title the title value to set
     * @return the LabAnnouncementPropertiesFragment object itself.
     */
    public LabAnnouncementPropertiesFragment withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     *
     * @return the markdown value
     */
    public String markdown() {
        return this.markdown;
    }

    /**
     * Set the markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     *
     * @param markdown the markdown value to set
     * @return the LabAnnouncementPropertiesFragment object itself.
     */
    public LabAnnouncementPropertiesFragment withMarkdown(String markdown) {
        this.markdown = markdown;
        return this;
    }

    /**
     * Get is the lab announcement active/enabled at this time?. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the enabled value
     */
    public EnableStatus enabled() {
        return this.enabled;
    }

    /**
     * Set is the lab announcement active/enabled at this time?. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param enabled the enabled value to set
     * @return the LabAnnouncementPropertiesFragment object itself.
     */
    public LabAnnouncementPropertiesFragment withEnabled(EnableStatus enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the time at which the announcement expires (null for never).
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the time at which the announcement expires (null for never).
     *
     * @param expirationDate the expirationDate value to set
     * @return the LabAnnouncementPropertiesFragment object itself.
     */
    public LabAnnouncementPropertiesFragment withExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get has this announcement expired?.
     *
     * @return the expired value
     */
    public Boolean expired() {
        return this.expired;
    }

    /**
     * Set has this announcement expired?.
     *
     * @param expired the expired value to set
     * @return the LabAnnouncementPropertiesFragment object itself.
     */
    public LabAnnouncementPropertiesFragment withExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

}
