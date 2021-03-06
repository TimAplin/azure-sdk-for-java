/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the RecoveryServicesBackupClientImpl class.
 */
public class RecoveryServicesBackupClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription ID. */
    private String subscriptionId;

    /**
     * Gets The subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public RecoveryServicesBackupClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client API version. */
    private String apiVersion;

    /**
     * Gets Client API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public RecoveryServicesBackupClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public RecoveryServicesBackupClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public RecoveryServicesBackupClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ItemLevelRecoveryConnectionsInner object to access its operations.
     */
    private ItemLevelRecoveryConnectionsInner itemLevelRecoveryConnections;

    /**
     * Gets the ItemLevelRecoveryConnectionsInner object to access its operations.
     * @return the ItemLevelRecoveryConnectionsInner object.
     */
    public ItemLevelRecoveryConnectionsInner itemLevelRecoveryConnections() {
        return this.itemLevelRecoveryConnections;
    }

    /**
     * The RestoresInner object to access its operations.
     */
    private RestoresInner restores;

    /**
     * Gets the RestoresInner object to access its operations.
     * @return the RestoresInner object.
     */
    public RestoresInner restores() {
        return this.restores;
    }

    /**
     * The ProtectionPolicyOperationStatusesInner object to access its operations.
     */
    private ProtectionPolicyOperationStatusesInner protectionPolicyOperationStatuses;

    /**
     * Gets the ProtectionPolicyOperationStatusesInner object to access its operations.
     * @return the ProtectionPolicyOperationStatusesInner object.
     */
    public ProtectionPolicyOperationStatusesInner protectionPolicyOperationStatuses() {
        return this.protectionPolicyOperationStatuses;
    }

    /**
     * The ProtectionPolicyOperationResultsInner object to access its operations.
     */
    private ProtectionPolicyOperationResultsInner protectionPolicyOperationResults;

    /**
     * Gets the ProtectionPolicyOperationResultsInner object to access its operations.
     * @return the ProtectionPolicyOperationResultsInner object.
     */
    public ProtectionPolicyOperationResultsInner protectionPolicyOperationResults() {
        return this.protectionPolicyOperationResults;
    }

    /**
     * The ProtectionPoliciesInner object to access its operations.
     */
    private ProtectionPoliciesInner protectionPolicies;

    /**
     * Gets the ProtectionPoliciesInner object to access its operations.
     * @return the ProtectionPoliciesInner object.
     */
    public ProtectionPoliciesInner protectionPolicies() {
        return this.protectionPolicies;
    }

    /**
     * The ProtectionContainerOperationResultsInner object to access its operations.
     */
    private ProtectionContainerOperationResultsInner protectionContainerOperationResults;

    /**
     * Gets the ProtectionContainerOperationResultsInner object to access its operations.
     * @return the ProtectionContainerOperationResultsInner object.
     */
    public ProtectionContainerOperationResultsInner protectionContainerOperationResults() {
        return this.protectionContainerOperationResults;
    }

    /**
     * The ProtectionContainerRefreshOperationResultsInner object to access its operations.
     */
    private ProtectionContainerRefreshOperationResultsInner protectionContainerRefreshOperationResults;

    /**
     * Gets the ProtectionContainerRefreshOperationResultsInner object to access its operations.
     * @return the ProtectionContainerRefreshOperationResultsInner object.
     */
    public ProtectionContainerRefreshOperationResultsInner protectionContainerRefreshOperationResults() {
        return this.protectionContainerRefreshOperationResults;
    }

    /**
     * The ProtectionContainersInner object to access its operations.
     */
    private ProtectionContainersInner protectionContainers;

    /**
     * Gets the ProtectionContainersInner object to access its operations.
     * @return the ProtectionContainersInner object.
     */
    public ProtectionContainersInner protectionContainers() {
        return this.protectionContainers;
    }

    /**
     * The RecoveryPointsInner object to access its operations.
     */
    private RecoveryPointsInner recoveryPoints;

    /**
     * Gets the RecoveryPointsInner object to access its operations.
     * @return the RecoveryPointsInner object.
     */
    public RecoveryPointsInner recoveryPoints() {
        return this.recoveryPoints;
    }

    /**
     * The BackupsInner object to access its operations.
     */
    private BackupsInner backups;

    /**
     * Gets the BackupsInner object to access its operations.
     * @return the BackupsInner object.
     */
    public BackupsInner backups() {
        return this.backups;
    }

    /**
     * The ProtectedItemOperationStatusesInner object to access its operations.
     */
    private ProtectedItemOperationStatusesInner protectedItemOperationStatuses;

    /**
     * Gets the ProtectedItemOperationStatusesInner object to access its operations.
     * @return the ProtectedItemOperationStatusesInner object.
     */
    public ProtectedItemOperationStatusesInner protectedItemOperationStatuses() {
        return this.protectedItemOperationStatuses;
    }

    /**
     * The ProtectedItemOperationResultsInner object to access its operations.
     */
    private ProtectedItemOperationResultsInner protectedItemOperationResults;

    /**
     * Gets the ProtectedItemOperationResultsInner object to access its operations.
     * @return the ProtectedItemOperationResultsInner object.
     */
    public ProtectedItemOperationResultsInner protectedItemOperationResults() {
        return this.protectedItemOperationResults;
    }

    /**
     * The ProtectedItemsInner object to access its operations.
     */
    private ProtectedItemsInner protectedItems;

    /**
     * Gets the ProtectedItemsInner object to access its operations.
     * @return the ProtectedItemsInner object.
     */
    public ProtectedItemsInner protectedItems() {
        return this.protectedItems;
    }

    /**
     * The ProtectableItemsInner object to access its operations.
     */
    private ProtectableItemsInner protectableItems;

    /**
     * Gets the ProtectableItemsInner object to access its operations.
     * @return the ProtectableItemsInner object.
     */
    public ProtectableItemsInner protectableItems() {
        return this.protectableItems;
    }

    /**
     * The ExportJobsOperationResultsInner object to access its operations.
     */
    private ExportJobsOperationResultsInner exportJobsOperationResults;

    /**
     * Gets the ExportJobsOperationResultsInner object to access its operations.
     * @return the ExportJobsOperationResultsInner object.
     */
    public ExportJobsOperationResultsInner exportJobsOperationResults() {
        return this.exportJobsOperationResults;
    }

    /**
     * The JobOperationResultsInner object to access its operations.
     */
    private JobOperationResultsInner jobOperationResults;

    /**
     * Gets the JobOperationResultsInner object to access its operations.
     * @return the JobOperationResultsInner object.
     */
    public JobOperationResultsInner jobOperationResults() {
        return this.jobOperationResults;
    }

    /**
     * The JobsInner object to access its operations.
     */
    private JobsInner jobs;

    /**
     * Gets the JobsInner object to access its operations.
     * @return the JobsInner object.
     */
    public JobsInner jobs() {
        return this.jobs;
    }

    /**
     * The JobCancellationsInner object to access its operations.
     */
    private JobCancellationsInner jobCancellations;

    /**
     * Gets the JobCancellationsInner object to access its operations.
     * @return the JobCancellationsInner object.
     */
    public JobCancellationsInner jobCancellations() {
        return this.jobCancellations;
    }

    /**
     * The JobDetailsInner object to access its operations.
     */
    private JobDetailsInner jobDetails;

    /**
     * Gets the JobDetailsInner object to access its operations.
     * @return the JobDetailsInner object.
     */
    public JobDetailsInner jobDetails() {
        return this.jobDetails;
    }

    /**
     * The BackupOperationStatusesInner object to access its operations.
     */
    private BackupOperationStatusesInner backupOperationStatuses;

    /**
     * Gets the BackupOperationStatusesInner object to access its operations.
     * @return the BackupOperationStatusesInner object.
     */
    public BackupOperationStatusesInner backupOperationStatuses() {
        return this.backupOperationStatuses;
    }

    /**
     * The BackupOperationResultsInner object to access its operations.
     */
    private BackupOperationResultsInner backupOperationResults;

    /**
     * Gets the BackupOperationResultsInner object to access its operations.
     * @return the BackupOperationResultsInner object.
     */
    public BackupOperationResultsInner backupOperationResults() {
        return this.backupOperationResults;
    }

    /**
     * The BackupEnginesInner object to access its operations.
     */
    private BackupEnginesInner backupEngines;

    /**
     * Gets the BackupEnginesInner object to access its operations.
     * @return the BackupEnginesInner object.
     */
    public BackupEnginesInner backupEngines() {
        return this.backupEngines;
    }

    /**
     * Initializes an instance of RecoveryServicesBackupClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public RecoveryServicesBackupClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of RecoveryServicesBackupClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public RecoveryServicesBackupClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of RecoveryServicesBackupClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public RecoveryServicesBackupClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2016-06-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.itemLevelRecoveryConnections = new ItemLevelRecoveryConnectionsInner(restClient().retrofit(), this);
        this.restores = new RestoresInner(restClient().retrofit(), this);
        this.protectionPolicyOperationStatuses = new ProtectionPolicyOperationStatusesInner(restClient().retrofit(), this);
        this.protectionPolicyOperationResults = new ProtectionPolicyOperationResultsInner(restClient().retrofit(), this);
        this.protectionPolicies = new ProtectionPoliciesInner(restClient().retrofit(), this);
        this.protectionContainerOperationResults = new ProtectionContainerOperationResultsInner(restClient().retrofit(), this);
        this.protectionContainerRefreshOperationResults = new ProtectionContainerRefreshOperationResultsInner(restClient().retrofit(), this);
        this.protectionContainers = new ProtectionContainersInner(restClient().retrofit(), this);
        this.recoveryPoints = new RecoveryPointsInner(restClient().retrofit(), this);
        this.backups = new BackupsInner(restClient().retrofit(), this);
        this.protectedItemOperationStatuses = new ProtectedItemOperationStatusesInner(restClient().retrofit(), this);
        this.protectedItemOperationResults = new ProtectedItemOperationResultsInner(restClient().retrofit(), this);
        this.protectedItems = new ProtectedItemsInner(restClient().retrofit(), this);
        this.protectableItems = new ProtectableItemsInner(restClient().retrofit(), this);
        this.exportJobsOperationResults = new ExportJobsOperationResultsInner(restClient().retrofit(), this);
        this.jobOperationResults = new JobOperationResultsInner(restClient().retrofit(), this);
        this.jobs = new JobsInner(restClient().retrofit(), this);
        this.jobCancellations = new JobCancellationsInner(restClient().retrofit(), this);
        this.jobDetails = new JobDetailsInner(restClient().retrofit(), this);
        this.backupOperationStatuses = new BackupOperationStatusesInner(restClient().retrofit(), this);
        this.backupOperationResults = new BackupOperationResultsInner(restClient().retrofit(), this);
        this.backupEngines = new BackupEnginesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "RecoveryServicesBackupClient", "2016-06-01");
    }
}
