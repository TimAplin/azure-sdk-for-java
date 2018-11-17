/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.microsoft.azure.keyvault.webkey.JsonWebKeyOperation;
import com.microsoft.azure.keyvault.webkey.JsonWebKeyType;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key create parameters.
 */
public class KeyCreateParameters {
    /**
     * The type of key to create. For valid values, see JsonWebKeyType.
     * Possible values include: 'EC', 'EC-HSM', 'RSA', 'RSA-HSM', 'oct'.
     */
    @JsonProperty(value = "kty", required = true)
    private JsonWebKeyType kty;

    /**
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     */
    @JsonProperty(value = "key_size")
    private Integer keySize;

    /**
     * The keyOps property.
     */
    @JsonProperty(value = "key_ops")
    private List<JsonWebKeyOperation> keyOps;

    /**
     * The keyAttributes property.
     */
    @JsonProperty(value = "attributes")
    private KeyAttributes keyAttributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Elliptic curve name. For valid values, see JsonWebKeyCurveName. Possible
     * values include: 'P-256', 'P-384', 'P-521', 'P-256K'.
     */
    @JsonProperty(value = "crv")
    private JsonWebKeyCurveName curve;

    /**
     * Get the kty value.
     *
     * @return the kty value
     */
    public JsonWebKeyType kty() {
        return this.kty;
    }

    /**
     * Set the kty value.
     *
     * @param kty the kty value to set
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withKty(JsonWebKeyType kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get the keySize value.
     *
     * @return the keySize value
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize value.
     *
     * @param keySize the keySize value to set
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the keyOps value.
     *
     * @return the keyOps value
     */
    public List<JsonWebKeyOperation> keyOps() {
        return this.keyOps;
    }

    /**
     * Set the keyOps value.
     *
     * @param keyOps the keyOps value to set
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withKeyOps(List<JsonWebKeyOperation> keyOps) {
        this.keyOps = keyOps;
        return this;
    }

    /**
     * Get the keyAttributes value.
     *
     * @return the keyAttributes value
     */
    public KeyAttributes keyAttributes() {
        return this.keyAttributes;
    }

    /**
     * Set the keyAttributes value.
     *
     * @param keyAttributes the keyAttributes value to set
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withKeyAttributes(KeyAttributes keyAttributes) {
        this.keyAttributes = keyAttributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the curve value.
     *
     * @return the curve value
     */
    public JsonWebKeyCurveName curve() {
        return this.curve;
    }

    /**
     * Set the curve value.
     *
     * @param curve the curve value to set
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withCurve(JsonWebKeyCurveName curve) {
        this.curve = curve;
        return this;
    }

}