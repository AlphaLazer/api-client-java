/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 4.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiException;
import java.math.BigDecimal;
import com.launchdarkly.api.model.FeatureFlag;
import com.launchdarkly.api.model.FeatureFlagApprovalRequest;
import com.launchdarkly.api.model.FeatureFlagApprovalRequestApplyConfigBody;
import com.launchdarkly.api.model.FeatureFlagApprovalRequestConfigBody;
import com.launchdarkly.api.model.FeatureFlagApprovalRequestReviewConfigBody;
import com.launchdarkly.api.model.FeatureFlagApprovalRequests;
import com.launchdarkly.api.model.FeatureFlagBody;
import com.launchdarkly.api.model.FeatureFlagCopyBody;
import com.launchdarkly.api.model.FeatureFlagStatus;
import com.launchdarkly.api.model.FeatureFlagStatusAcrossEnvironments;
import com.launchdarkly.api.model.FeatureFlagStatuses;
import com.launchdarkly.api.model.FeatureFlags;
import com.launchdarkly.api.model.PatchComment;
import com.launchdarkly.api.model.UsageError;
import com.launchdarkly.api.model.UserTargetingExpirationForFlags;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeatureFlagsApi
 */
@Ignore
public class FeatureFlagsApiTest {

    private final FeatureFlagsApi api = new FeatureFlagsApi();

    
    /**
     * Copies the feature flag configuration from one environment to the same feature flag in another environment.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFeatureFlagTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        FeatureFlagCopyBody featureFlagCopyBody = null;
        FeatureFlag response = api.copyFeatureFlag(projectKey, featureFlagKey, featureFlagCopyBody);

        // TODO: test validations
    }
    
    /**
     * Delete a feature flag in all environments. Be careful-- only delete feature flags that are no longer being used by your application.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFeatureFlagTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        api.deleteFeatureFlag(projectKey, featureFlagKey);

        // TODO: test validations
    }
    
    /**
     * Delete an approval request for a feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFeatureFlagApprovalRequestTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String featureFlagKey = null;
        String featureFlagApprovalRequestId = null;
        FeatureFlagApprovalRequestConfigBody featureFlagApprovalRequestConfigBody = null;
        api.deleteFeatureFlagApprovalRequest(projectKey, environmentKey, featureFlagKey, featureFlagApprovalRequestId, featureFlagApprovalRequestConfigBody);

        // TODO: test validations
    }
    
    /**
     * Get expiring user targets for feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExpiringUserTargetsTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String featureFlagKey = null;
        UserTargetingExpirationForFlags response = api.getExpiringUserTargets(projectKey, environmentKey, featureFlagKey);

        // TODO: test validations
    }
    
    /**
     * Get a single feature flag by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        List<String> env = null;
        FeatureFlag response = api.getFeatureFlag(projectKey, featureFlagKey, env);

        // TODO: test validations
    }
    
    /**
     * Get a single approval request for a feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagApprovalRequestTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        String environmentKey = null;
        String featureFlagApprovalRequestId = null;
        FeatureFlagApprovalRequests response = api.getFeatureFlagApprovalRequest(projectKey, featureFlagKey, environmentKey, featureFlagApprovalRequestId);

        // TODO: test validations
    }
    
    /**
     * Get all approval requests for a feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagApprovalRequestsTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        String environmentKey = null;
        FeatureFlagApprovalRequests response = api.getFeatureFlagApprovalRequests(projectKey, featureFlagKey, environmentKey);

        // TODO: test validations
    }
    
    /**
     * Get the status for a particular feature flag.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagStatusTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String featureFlagKey = null;
        FeatureFlagStatus response = api.getFeatureFlagStatus(projectKey, environmentKey, featureFlagKey);

        // TODO: test validations
    }
    
    /**
     * Get the status for a particular feature flag across environments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagStatusAcrossEnvironmentsTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        FeatureFlagStatusAcrossEnvironments response = api.getFeatureFlagStatusAcrossEnvironments(projectKey, featureFlagKey);

        // TODO: test validations
    }
    
    /**
     * Get a list of statuses for all feature flags. The status includes the last time the feature flag was requested, as well as the state of the flag.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagStatusesTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        FeatureFlagStatuses response = api.getFeatureFlagStatuses(projectKey, environmentKey);

        // TODO: test validations
    }
    
    /**
     * Get a list of all features in the given project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagsTest() throws ApiException {
        String projectKey = null;
        List<String> env = null;
        Boolean summary = null;
        Boolean archived = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String filter = null;
        String sort = null;
        String tag = null;
        FeatureFlags response = api.getFeatureFlags(projectKey, env, summary, archived, limit, offset, filter, sort, tag);

        // TODO: test validations
    }
    
    /**
     * Update, add, or delete expiring user targets on feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchExpiringUserTargetsTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String featureFlagKey = null;
        Object semanticPatchWithComment = null;
        UserTargetingExpirationForFlags response = api.patchExpiringUserTargets(projectKey, environmentKey, featureFlagKey, semanticPatchWithComment);

        // TODO: test validations
    }
    
    /**
     * Perform a partial update to a feature.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchFeatureFlagTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        PatchComment patchComment = null;
        FeatureFlag response = api.patchFeatureFlag(projectKey, featureFlagKey, patchComment);

        // TODO: test validations
    }
    
    /**
     * Apply approval request for a feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postApplyFeatureFlagApprovalRequestTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        String environmentKey = null;
        String featureFlagApprovalRequestId = null;
        FeatureFlagApprovalRequestApplyConfigBody featureFlagApprovalRequestApplyConfigBody = null;
        FeatureFlagApprovalRequests response = api.postApplyFeatureFlagApprovalRequest(projectKey, featureFlagKey, environmentKey, featureFlagApprovalRequestId, featureFlagApprovalRequestApplyConfigBody);

        // TODO: test validations
    }
    
    /**
     * Creates a new feature flag.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFeatureFlagTest() throws ApiException {
        String projectKey = null;
        FeatureFlagBody featureFlagBody = null;
        String clone = null;
        FeatureFlag response = api.postFeatureFlag(projectKey, featureFlagBody, clone);

        // TODO: test validations
    }
    
    /**
     * Create an approval request for a feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFeatureFlagApprovalRequestTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        String environmentKey = null;
        String featureFlagApprovalRequestId = null;
        FeatureFlagApprovalRequestConfigBody featureFlagApprovalRequestConfigBody = null;
        FeatureFlagApprovalRequest response = api.postFeatureFlagApprovalRequest(projectKey, featureFlagKey, environmentKey, featureFlagApprovalRequestId, featureFlagApprovalRequestConfigBody);

        // TODO: test validations
    }
    
    /**
     * Review approval request for a feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postReviewFeatureFlagApprovalRequestTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        String environmentKey = null;
        String featureFlagApprovalRequestId = null;
        FeatureFlagApprovalRequestReviewConfigBody featureFlagApprovalRequestReviewConfigBody = null;
        FeatureFlagApprovalRequests response = api.postReviewFeatureFlagApprovalRequest(projectKey, featureFlagKey, environmentKey, featureFlagApprovalRequestId, featureFlagApprovalRequestReviewConfigBody);

        // TODO: test validations
    }
    
}
