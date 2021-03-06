/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.RunbookTypeEnum;
import com.microsoft.azure.management.automation.v2015_10_31.ContentLink;
import com.microsoft.azure.management.automation.v2015_10_31.RunbookState;
import java.util.Map;
import com.microsoft.azure.management.automation.v2015_10_31.RunbookParameter;
import java.util.List;
import com.microsoft.azure.management.automation.v2015_10_31.RunbookProvisioningState;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Definition of the runbook type.
 */
@JsonFlatten
@SkipParentValidation
public class RunbookInner extends Resource {
    /**
     * Gets or sets the type of the runbook. Possible values include: 'Script',
     * 'Graph', 'PowerShellWorkflow', 'PowerShell', 'GraphPowerShellWorkflow',
     * 'GraphPowerShell'.
     */
    @JsonProperty(value = "properties.runbookType")
    private RunbookTypeEnum runbookType;

    /**
     * Gets or sets the published runbook content link.
     */
    @JsonProperty(value = "properties.publishContentLink")
    private ContentLink publishContentLink;

    /**
     * Gets or sets the state of the runbook. Possible values include: 'New',
     * 'Edit', 'Published'.
     */
    @JsonProperty(value = "properties.state")
    private RunbookState state;

    /**
     * Gets or sets verbose log option.
     */
    @JsonProperty(value = "properties.logVerbose")
    private Boolean logVerbose;

    /**
     * Gets or sets progress log option.
     */
    @JsonProperty(value = "properties.logProgress")
    private Boolean logProgress;

    /**
     * Gets or sets the option to log activity trace of the runbook.
     */
    @JsonProperty(value = "properties.logActivityTrace")
    private Integer logActivityTrace;

    /**
     * Gets or sets the job count of the runbook.
     */
    @JsonProperty(value = "properties.jobCount")
    private Integer jobCount;

    /**
     * Gets or sets the runbook parameters.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, RunbookParameter> parameters;

    /**
     * Gets or sets the runbook output types.
     */
    @JsonProperty(value = "properties.outputTypes")
    private List<String> outputTypes;

    /**
     * Gets or sets the draft runbook properties.
     */
    @JsonProperty(value = "properties.draft")
    private RunbookDraftInner draft;

    /**
     * Gets or sets the provisioning state of the runbook. Possible values
     * include: 'Succeeded'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private RunbookProvisioningState provisioningState;

    /**
     * Gets or sets the last modified by.
     */
    @JsonProperty(value = "properties.lastModifiedBy")
    private String lastModifiedBy;

    /**
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Gets or sets the etag of the resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get gets or sets the type of the runbook. Possible values include: 'Script', 'Graph', 'PowerShellWorkflow', 'PowerShell', 'GraphPowerShellWorkflow', 'GraphPowerShell'.
     *
     * @return the runbookType value
     */
    public RunbookTypeEnum runbookType() {
        return this.runbookType;
    }

    /**
     * Set gets or sets the type of the runbook. Possible values include: 'Script', 'Graph', 'PowerShellWorkflow', 'PowerShell', 'GraphPowerShellWorkflow', 'GraphPowerShell'.
     *
     * @param runbookType the runbookType value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withRunbookType(RunbookTypeEnum runbookType) {
        this.runbookType = runbookType;
        return this;
    }

    /**
     * Get gets or sets the published runbook content link.
     *
     * @return the publishContentLink value
     */
    public ContentLink publishContentLink() {
        return this.publishContentLink;
    }

    /**
     * Set gets or sets the published runbook content link.
     *
     * @param publishContentLink the publishContentLink value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withPublishContentLink(ContentLink publishContentLink) {
        this.publishContentLink = publishContentLink;
        return this;
    }

    /**
     * Get gets or sets the state of the runbook. Possible values include: 'New', 'Edit', 'Published'.
     *
     * @return the state value
     */
    public RunbookState state() {
        return this.state;
    }

    /**
     * Set gets or sets the state of the runbook. Possible values include: 'New', 'Edit', 'Published'.
     *
     * @param state the state value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withState(RunbookState state) {
        this.state = state;
        return this;
    }

    /**
     * Get gets or sets verbose log option.
     *
     * @return the logVerbose value
     */
    public Boolean logVerbose() {
        return this.logVerbose;
    }

    /**
     * Set gets or sets verbose log option.
     *
     * @param logVerbose the logVerbose value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLogVerbose(Boolean logVerbose) {
        this.logVerbose = logVerbose;
        return this;
    }

    /**
     * Get gets or sets progress log option.
     *
     * @return the logProgress value
     */
    public Boolean logProgress() {
        return this.logProgress;
    }

    /**
     * Set gets or sets progress log option.
     *
     * @param logProgress the logProgress value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLogProgress(Boolean logProgress) {
        this.logProgress = logProgress;
        return this;
    }

    /**
     * Get gets or sets the option to log activity trace of the runbook.
     *
     * @return the logActivityTrace value
     */
    public Integer logActivityTrace() {
        return this.logActivityTrace;
    }

    /**
     * Set gets or sets the option to log activity trace of the runbook.
     *
     * @param logActivityTrace the logActivityTrace value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLogActivityTrace(Integer logActivityTrace) {
        this.logActivityTrace = logActivityTrace;
        return this;
    }

    /**
     * Get gets or sets the job count of the runbook.
     *
     * @return the jobCount value
     */
    public Integer jobCount() {
        return this.jobCount;
    }

    /**
     * Set gets or sets the job count of the runbook.
     *
     * @param jobCount the jobCount value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    /**
     * Get gets or sets the runbook parameters.
     *
     * @return the parameters value
     */
    public Map<String, RunbookParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the runbook parameters.
     *
     * @param parameters the parameters value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withParameters(Map<String, RunbookParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get gets or sets the runbook output types.
     *
     * @return the outputTypes value
     */
    public List<String> outputTypes() {
        return this.outputTypes;
    }

    /**
     * Set gets or sets the runbook output types.
     *
     * @param outputTypes the outputTypes value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withOutputTypes(List<String> outputTypes) {
        this.outputTypes = outputTypes;
        return this;
    }

    /**
     * Get gets or sets the draft runbook properties.
     *
     * @return the draft value
     */
    public RunbookDraftInner draft() {
        return this.draft;
    }

    /**
     * Set gets or sets the draft runbook properties.
     *
     * @param draft the draft value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withDraft(RunbookDraftInner draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Get gets or sets the provisioning state of the runbook. Possible values include: 'Succeeded'.
     *
     * @return the provisioningState value
     */
    public RunbookProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets or sets the provisioning state of the runbook. Possible values include: 'Succeeded'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withProvisioningState(RunbookProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets or sets the last modified by.
     *
     * @return the lastModifiedBy value
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set gets or sets the last modified by.
     *
     * @param lastModifiedBy the lastModifiedBy value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get gets or sets the creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get gets or sets the last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get gets or sets the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description.
     *
     * @param description the description value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets the etag of the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets or sets the etag of the resource.
     *
     * @param etag the etag value to set
     * @return the RunbookInner object itself.
     */
    public RunbookInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
