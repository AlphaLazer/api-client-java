/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.7.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiException;
import com.launchdarkly.api.model.UserFlagSetting;
import com.launchdarkly.api.model.UserFlagSettings;
import com.launchdarkly.api.model.UserSettingsBody;
import com.launchdarkly.api.model.UserTargetingExpirationOnFlagsForUser;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserSettingsApi
 */
@Ignore
public class UserSettingsApiTest {

    private final UserSettingsApi api = new UserSettingsApi();

    
    /**
     * Get expiring dates on flags for user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExpiringUserTargetsForUserTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userKey = null;
        UserTargetingExpirationOnFlagsForUser response = api.getExpiringUserTargetsForUser(projectKey, environmentKey, userKey);

        // TODO: test validations
    }
    
    /**
     * Fetch a single flag setting for a user by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserFlagSettingTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userKey = null;
        String featureFlagKey = null;
        UserFlagSetting response = api.getUserFlagSetting(projectKey, environmentKey, userKey, featureFlagKey);

        // TODO: test validations
    }
    
    /**
     * Fetch a single flag setting for a user by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserFlagSettingsTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userKey = null;
        UserFlagSettings response = api.getUserFlagSettings(projectKey, environmentKey, userKey);

        // TODO: test validations
    }
    
    /**
     * Update, add, or delete expiring user targets for a single user on all flags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchExpiringUserTargetsForFlagsTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userKey = null;
        Object semanticPatchWithComment = null;
        UserTargetingExpirationOnFlagsForUser response = api.patchExpiringUserTargetsForFlags(projectKey, environmentKey, userKey, semanticPatchWithComment);

        // TODO: test validations
    }
    
    /**
     * Specifically enable or disable a feature flag for a user based on their key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFlagSettingTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userKey = null;
        String featureFlagKey = null;
        UserSettingsBody userSettingsBody = null;
        api.putFlagSetting(projectKey, environmentKey, userKey, featureFlagKey, userSettingsBody);

        // TODO: test validations
    }
    
}
