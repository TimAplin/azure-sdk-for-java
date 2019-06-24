/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookDrafts;
import com.microsoft.azure.management.automation.v2018_06_30.Runbooks;
import com.microsoft.azure.management.automation.v2018_06_30.TestJobStreams;
import com.microsoft.azure.management.automation.v2018_06_30.TestJobs;
import com.microsoft.azure.management.automation.v2018_06_30.Python2Packages;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Automation resource management.
 */
public final class AutomationManager extends ManagerCore<AutomationManager, AutomationClientImpl> {
    private RunbookDrafts runbookDrafts;
    private Runbooks runbooks;
    private TestJobStreams testJobStreams;
    private TestJobs testJobs;
    private Python2Packages python2Packages;
    /**
    * Get a Configurable instance that can be used to create AutomationManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new AutomationManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of AutomationManager that exposes Automation resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the AutomationManager
    */
    public static AutomationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new AutomationManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of AutomationManager that exposes Automation resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the AutomationManager
    */
    public static AutomationManager authenticate(RestClient restClient, String subscriptionId) {
        return new AutomationManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of AutomationManager that exposes Automation management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Automation management API entry points that work across subscriptions
        */
        AutomationManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage RunbookDrafts.
     */
    public RunbookDrafts runbookDrafts() {
        if (this.runbookDrafts == null) {
            this.runbookDrafts = new RunbookDraftsImpl(this);
        }
        return this.runbookDrafts;
    }

    /**
     * @return Entry point to manage Runbooks.
     */
    public Runbooks runbooks() {
        if (this.runbooks == null) {
            this.runbooks = new RunbooksImpl(this);
        }
        return this.runbooks;
    }

    /**
     * @return Entry point to manage TestJobStreams.
     */
    public TestJobStreams testJobStreams() {
        if (this.testJobStreams == null) {
            this.testJobStreams = new TestJobStreamsImpl(this);
        }
        return this.testJobStreams;
    }

    /**
     * @return Entry point to manage TestJobs.
     */
    public TestJobs testJobs() {
        if (this.testJobs == null) {
            this.testJobs = new TestJobsImpl(this);
        }
        return this.testJobs;
    }

    /**
     * @return Entry point to manage Python2Packages.
     */
    public Python2Packages python2Packages() {
        if (this.python2Packages == null) {
            this.python2Packages = new Python2PackagesImpl(this);
        }
        return this.python2Packages;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public AutomationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return AutomationManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private AutomationManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new AutomationClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
