// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.cosmos.implementation.Configs;
import com.azure.cosmos.models.Permission;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Helper class to buildAsyncClient {@link CosmosAsyncClient} instances
 * as logical representation of the Azure Cosmos database service.
 *
 * <pre>
 * {@code
 * ConnectionPolicy connectionPolicy = new ConnectionPolicy();
 * getConnectionPolicy.getConnectionMode(ConnectionMode.DIRECT);
 * CosmosAsyncClient client = new CosmosAsyncClient.cosmosClientBuilder()
 *         .setEndpoint(serviceEndpoint)
 *         .setKey(key)
 *         .setConnectionPolicy(connectionPolicy)
 *         .setConsistencyLevel(ConsistencyLevel.SESSION)
 *         .buildAsyncClient();
 * }
 * </pre>
 */
@ServiceClientBuilder(serviceClients = {CosmosClient.class, CosmosAsyncClient.class})
public class CosmosClientBuilder {
    private Configs configs = new Configs();
    private String serviceEndpoint;
    private String keyOrResourceToken;
    private ConnectionPolicy connectionPolicy;
    private ConsistencyLevel desiredConsistencyLevel;
    private List<Permission> permissions;
    private CosmosAuthorizationTokenResolver cosmosAuthorizationTokenResolver;
    private CosmosKeyCredential cosmosKeyCredential;
    private boolean sessionCapturingOverrideEnabled;
    private boolean connectionReuseAcrossClientsEnabled;

    /**
     * Instantiates a new Cosmos client builder.
     */
    public CosmosClientBuilder() {
    }

    /**
     * Session capturing is enabled by default for {@link ConsistencyLevel#SESSION}.
     * For other consistency levels, it is not needed, unless if you need occasionally send requests with Session
     * Consistency while the client is not configured in session.
     * <p>
     * enabling Session capturing for Session mode has no effect.
     * @param sessionCapturingOverrideEnabled session capturing override
     * @return current cosmosClientBuilder
     */
    public CosmosClientBuilder setSessionCapturingOverrideEnabled(boolean sessionCapturingOverrideEnabled) {
        this.sessionCapturingOverrideEnabled = sessionCapturingOverrideEnabled;
        return this;
    }

    /**
     * Indicates if Session capturing is enabled for non Session modes.
     * The default is false.
     *
     * @return the session capturing override
     */
    public boolean isSessionCapturingOverrideEnabled() {
        return this.sessionCapturingOverrideEnabled;
    }

    /**
     * Enables connections sharing across multiple Cosmos Clients. The default is false.
     *
     *
     * <pre>
     * {@code
     * ConnectionPolicy connectionPolicy = new ConnectionPolicy();
     * getConnectionPolicy.getConnectionMode(ConnectionMode.DIRECT);
     * CosmosAsyncClient client1 = new CosmosAsyncClient.cosmosClientBuilder()
     *         .setEndpoint(serviceEndpoint1)
     *         .setKey(key1)
     *         .setConnectionPolicy(connectionPolicy)
     *         .setConsistencyLevel(ConsistencyLevel.SESSION)
     *         .setConnectionSharingAcrossClientsEnabled(true)
     *         .buildAsyncClient();
     *
     * CosmosAsyncClient client2 = new CosmosAsyncClient.cosmosClientBuilder()
     *         .setEndpoint(serviceEndpoint2)
     *         .setKey(key2)
     *         .setConnectionPolicy(connectionPolicy)
     *         .setConsistencyLevel(ConsistencyLevel.SESSION)
     *         .setConnectionSharingAcrossClientsEnabled(true)
     *         .buildAsyncClient();
     *
     * // when configured this way client1 and client2 will share connections when possible.
     * }
     * </pre>
     *
     * When you have multiple instances of Cosmos Client in the same JVM interacting to multiple Cosmos accounts,
     * enabling this allows connection sharing in Direct mode if possible between instances of Cosmos Client.
     *
     * Please note, when setting this option, the connection configuration (e.g., socket timeout config, idle timeout
     * config) of the first instantiated client will be used for all other client instances.
     *
     * @param connectionReuseAcrossClientsEnabled connection sharing
     * @return current cosmosClientBuilder
     */
    public CosmosClientBuilder setConnectionReuseAcrossClientsEnabled(boolean connectionReuseAcrossClientsEnabled) {
        this.connectionReuseAcrossClientsEnabled = true;
        return this;
    }

    /**
     * Indicates whether connection sharing is enabled. The default is false.
     *
     * When you have multiple instances of Cosmos Client in the same JVM interacting to multiple Cosmos accounts,
     * enabling this allows connection sharing in Direct mode if possible between instances of Cosmos Client.
     *
     * @return the connection sharing across multiple clients
     */
    public boolean isConnectionReuseAcrossClientsEnabled() {
        return this.connectionReuseAcrossClientsEnabled;
    }

    /**
     * Gets the token resolver
     *
     * @return the token resolver
     */
    public CosmosAuthorizationTokenResolver getCosmosAuthorizationTokenResolver() {
        return cosmosAuthorizationTokenResolver;
    }

    /**
     * Sets the token resolver
     *
     * @param cosmosAuthorizationTokenResolver the token resolver
     * @return current cosmosClientBuilder
     */
    public CosmosClientBuilder setCosmosAuthorizationTokenResolver(
        CosmosAuthorizationTokenResolver cosmosAuthorizationTokenResolver) {
        this.cosmosAuthorizationTokenResolver = cosmosAuthorizationTokenResolver;
        return this;
    }

    /**
     * Gets the Azure Cosmos DB endpoint the SDK will connect to
     *
     * @return the endpoint
     */
    public String getEndpoint() {
        return serviceEndpoint;
    }

    /**
     * Sets the Azure Cosmos DB endpoint the SDK will connect to
     *
     * @param endpoint the service endpoint
     * @return current Builder
     */
    public CosmosClientBuilder setEndpoint(String endpoint) {
        this.serviceEndpoint = endpoint;
        return this;
    }

    /**
     * Gets either a master or readonly key used to perform authentication
     * for accessing resource.
     *
     * @return the key
     */
    public String getKey() {
        return keyOrResourceToken;
    }

    /**
     * Sets either a master or readonly key used to perform authentication
     * for accessing resource.
     *
     * @param key master or readonly key
     * @return current Builder.
     */
    public CosmosClientBuilder setKey(String key) {
        this.keyOrResourceToken = key;
        return this;
    }

    /**
     * Sets a resource token used to perform authentication
     * for accessing resource.
     *
     * @return the resourceToken
     */
    public String getResourceToken() {
        return keyOrResourceToken;
    }

    /**
     * Sets a resource token used to perform authentication
     * for accessing resource.
     *
     * @param resourceToken resourceToken for authentication
     * @return current Builder.
     */
    public CosmosClientBuilder setResourceToken(String resourceToken) {
        this.keyOrResourceToken = resourceToken;
        return this;
    }

    /**
     * Gets the permission list, which contains the
     * resource tokens needed to access resources.
     *
     * @return the permission list
     */
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * Sets the permission list, which contains the
     * resource tokens needed to access resources.
     *
     * @param permissions Permission list for authentication.
     * @return current Builder.
     */
    public CosmosClientBuilder setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Gets the {@link ConsistencyLevel} to be used
     *
     * @return the consistency level
     */
    public ConsistencyLevel getConsistencyLevel() {
        return this.desiredConsistencyLevel;
    }

    /**
     * Sets the {@link ConsistencyLevel} to be used
     *
     * @param desiredConsistencyLevel {@link ConsistencyLevel}
     * @return current Builder
     */
    public CosmosClientBuilder setConsistencyLevel(ConsistencyLevel desiredConsistencyLevel) {
        this.desiredConsistencyLevel = desiredConsistencyLevel;
        return this;
    }

    /**
     * Gets the (@link ConnectionPolicy) to be used
     *
     * @return the connection policy
     */
    public ConnectionPolicy getConnectionPolicy() {
        return connectionPolicy;
    }

    /**
     * Sets the {@link ConnectionPolicy} to be used
     *
     * @param connectionPolicy {@link ConnectionPolicy}
     * @return current Builder
     */
    public CosmosClientBuilder setConnectionPolicy(ConnectionPolicy connectionPolicy) {
        this.connectionPolicy = connectionPolicy;
        return this;
    }

    /**
     * Gets the {@link CosmosKeyCredential} to be used
     *
     * @return cosmosKeyCredential
     */
    public CosmosKeyCredential getCosmosKeyCredential() {
        return cosmosKeyCredential;
    }

    /**
     * Sets the {@link CosmosKeyCredential} to be used
     *
     * @param cosmosKeyCredential {@link CosmosKeyCredential}
     * @return current cosmosClientBuilder
     */
    public CosmosClientBuilder setCosmosKeyCredential(CosmosKeyCredential cosmosKeyCredential) {
        this.cosmosKeyCredential = cosmosKeyCredential;
        return this;
    }

    /**
     * Builds a cosmos configuration object with the provided properties
     *
     * @return CosmosAsyncClient
     */
    public CosmosAsyncClient buildAsyncClient() {

        validateConfig();
        return new CosmosAsyncClient(this);
    }

    private void validateConfig() {
        ifThrowIllegalArgException(this.serviceEndpoint == null,
            "cannot buildAsyncClient client without service endpoint");
        ifThrowIllegalArgException(
            this.keyOrResourceToken == null && (permissions == null || permissions.isEmpty())
                && this.cosmosAuthorizationTokenResolver == null && this.cosmosKeyCredential == null,
            "cannot buildAsyncClient client without any one of key, resource token, permissions, token resolver, and "
                + "cosmos key credential");
        ifThrowIllegalArgException(cosmosKeyCredential != null && StringUtils.isEmpty(cosmosKeyCredential.getKey()),
            "cannot buildAsyncClient client without key credential");
    }

    /**
     * Builds a cosmos sync client object with the provided properties
     *
     * @return CosmosClient
     */
    public CosmosClient buildClient() {

        validateConfig();
        return new CosmosClient(this);
    }

    Configs configs() {
        return configs;
    }

    /**
     * Configs
     *
     * @return current cosmosClientBuilder
     */
    CosmosClientBuilder configs(Configs configs) {
        this.configs = configs;
        return this;
    }

    private void ifThrowIllegalArgException(boolean value, String error) {
        if (value) {
            throw new IllegalArgumentException(error);
        }
    }
}
