// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Contains the configurations for tests.
 *
 * For running tests, you can pass a customized endpoint configuration in one of the following
 * ways:
 * <ul>
 * <li>-DACCOUNT_KEY="[your-key]" -ACCOUNT_HOST="[your-endpoint]" as JVM
 * command-line option.</li>
 * <li>You can set ACCOUNT_KEY and ACCOUNT_HOST as environment variables.</li>
 * <li>You can have a properties file with ACCOUNT_KEY AND ACCOUNT_HOST, etc.</li>
 * </ul>
 *
 * If none of the above is set, emulator endpoint will be used.
 */
public final class TestConfigurations {
    private static Logger logger = LoggerFactory.getLogger(TestConfigurations.class);
    private static Properties properties = loadProperties();

    // REPLACE MASTER_KEY and HOST with values from your Azure Cosmos DB account.
    // The default values are credentials of the local emulator, which are not used in any production environment.
    // <!--[SuppressMessage("Microsoft.Security", "CS002:SecretInNextLine")]-->
    public static String MASTER_KEY =
        properties.getProperty("ACCOUNT_KEY",
                    StringUtils.defaultString(Strings.emptyToNull(
                            System.getenv().get("ACCOUNT_KEY")),
                            "C2y6yDjf5/R+ob0N8A7Cgv30VRDJIWEHLM+4QDU5DE2nQ9nDuVTqobD4b8mGGyPMbIZnqyMsEcaGQy67XIw/Jw=="));

    public static String SECONDARY_MASTER_KEY =
        properties.getProperty("SECONDARY_ACCOUNT_KEY",
            StringUtils.defaultString(Strings.emptyToNull(
                System.getenv().get("SECONDARY_ACCOUNT_KEY")),
                "C2y6yDjf5/R+ob0N8A7Cgv30VRDJIWEHLM+4QDU5DE2nQ9nDuVTqobD4b8mGGyPMbIZnqyMsEcaGQy67XIw/Jw=="));

    public static String HOST =
        properties.getProperty("ACCOUNT_HOST",
                    StringUtils.defaultString(Strings.emptyToNull(
                            System.getenv().get("ACCOUNT_HOST")),
                            "https://localhost:443/"));

    public static String CONSISTENCY =
        properties.getProperty("ACCOUNT_CONSISTENCY",
                               StringUtils.defaultString(Strings.emptyToNull(
                                       System.getenv().get("ACCOUNT_CONSISTENCY")), "Strong"));

    public static String PREFERRED_LOCATIONS =
        properties.getProperty("PREFERRED_LOCATIONS",
                               StringUtils.defaultString(Strings.emptyToNull(
                                       System.getenv().get("PREFERRED_LOCATIONS")), null));

    public static String MAX_RETRY_LIMIT =
        properties.getProperty("MAX_RETRY_LIMIT",
                               StringUtils.defaultString(Strings.emptyToNull(
                                       System.getenv().get("MAX_RETRY_LIMIT")),
                                                         "2"));

    public static String DESIRED_CONSISTENCIES =
        properties.getProperty("DESIRED_CONSISTENCIES",
                               StringUtils.defaultString(Strings.emptyToNull(
                                       System.getenv().get("DESIRED_CONSISTENCIES")),
                                                         null));

    public static String PROTOCOLS =
        properties.getProperty("PROTOCOLS",
                               StringUtils.defaultString(Strings.emptyToNull(
                                       System.getenv().get("PROTOCOLS")),
                                                         null));

    private static Properties loadProperties() {
        Path path = Paths.get(System.getProperty("user.home"), "cosmos-v4.properties");
        Properties properties = new Properties(System.getProperties());
        try {
            if (Files.exists(path)) {
                properties.load(Files.newInputStream(path));
            }

        } catch (Exception e) {
            logger.error("loading properties {} failed", path, e);
        }

        return properties;
    }
}
