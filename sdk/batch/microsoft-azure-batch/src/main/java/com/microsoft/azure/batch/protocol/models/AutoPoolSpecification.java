/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies characteristics for a temporary 'auto pool'. The Batch service
 * will create this auto Pool when the Job is submitted.
 */
public class AutoPoolSpecification {
    /**
     * A prefix to be added to the unique identifier when a Pool is
     * automatically created.
     * The Batch service assigns each auto Pool a unique identifier on
     * creation. To distinguish between Pools created for different purposes,
     * you can specify this element to add a prefix to the ID that is assigned.
     * The prefix can be up to 20 characters long.
     */
    @JsonProperty(value = "autoPoolIdPrefix")
    private String autoPoolIdPrefix;

    /**
     * The minimum lifetime of created auto Pools, and how multiple Jobs on a
     * schedule are assigned to Pools.
     * Possible values include: 'jobSchedule', 'job'.
     */
    @JsonProperty(value = "poolLifetimeOption", required = true)
    private PoolLifetimeOption poolLifetimeOption;

    /**
     * Whether to keep an auto Pool alive after its lifetime expires.
     * If false, the Batch service deletes the Pool once its lifetime (as
     * determined by the poolLifetimeOption setting) expires; that is, when the
     * Job or Job Schedule completes. If true, the Batch service does not
     * delete the Pool automatically. It is up to the user to delete auto Pools
     * created with this option.
     */
    @JsonProperty(value = "keepAlive")
    private Boolean keepAlive;

    /**
     * The Pool specification for the auto Pool.
     */
    @JsonProperty(value = "pool")
    private PoolSpecification pool;

    /**
     * Get the Batch service assigns each auto Pool a unique identifier on creation. To distinguish between Pools created for different purposes, you can specify this element to add a prefix to the ID that is assigned. The prefix can be up to 20 characters long.
     *
     * @return the autoPoolIdPrefix value
     */
    public String autoPoolIdPrefix() {
        return this.autoPoolIdPrefix;
    }

    /**
     * Set the Batch service assigns each auto Pool a unique identifier on creation. To distinguish between Pools created for different purposes, you can specify this element to add a prefix to the ID that is assigned. The prefix can be up to 20 characters long.
     *
     * @param autoPoolIdPrefix the autoPoolIdPrefix value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withAutoPoolIdPrefix(String autoPoolIdPrefix) {
        this.autoPoolIdPrefix = autoPoolIdPrefix;
        return this;
    }

    /**
     * Get possible values include: 'jobSchedule', 'job'.
     *
     * @return the poolLifetimeOption value
     */
    public PoolLifetimeOption poolLifetimeOption() {
        return this.poolLifetimeOption;
    }

    /**
     * Set possible values include: 'jobSchedule', 'job'.
     *
     * @param poolLifetimeOption the poolLifetimeOption value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withPoolLifetimeOption(PoolLifetimeOption poolLifetimeOption) {
        this.poolLifetimeOption = poolLifetimeOption;
        return this;
    }

    /**
     * Get if false, the Batch service deletes the Pool once its lifetime (as determined by the poolLifetimeOption setting) expires; that is, when the Job or Job Schedule completes. If true, the Batch service does not delete the Pool automatically. It is up to the user to delete auto Pools created with this option.
     *
     * @return the keepAlive value
     */
    public Boolean keepAlive() {
        return this.keepAlive;
    }

    /**
     * Set if false, the Batch service deletes the Pool once its lifetime (as determined by the poolLifetimeOption setting) expires; that is, when the Job or Job Schedule completes. If true, the Batch service does not delete the Pool automatically. It is up to the user to delete auto Pools created with this option.
     *
     * @param keepAlive the keepAlive value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    /**
     * Get the pool value.
     *
     * @return the pool value
     */
    public PoolSpecification pool() {
        return this.pool;
    }

    /**
     * Set the pool value.
     *
     * @param pool the pool value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withPool(PoolSpecification pool) {
        this.pool = pool;
        return this;
    }

}
