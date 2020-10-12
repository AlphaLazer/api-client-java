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
import com.launchdarkly.api.model.PatchOperation;
import com.launchdarkly.api.model.UnboundedSegmentTargetsBody;
import com.launchdarkly.api.model.UserSegment;
import com.launchdarkly.api.model.UserSegmentBody;
import com.launchdarkly.api.model.UserSegments;
import com.launchdarkly.api.model.UserTargetingExpirationForSegment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserSegmentsApi
 */
@Ignore
public class UserSegmentsApiTest {

    private final UserSegmentsApi api = new UserSegmentsApi();

    
    /**
     * Delete a user segment.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserSegmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userSegmentKey = null;
        api.deleteUserSegment(projectKey, environmentKey, userSegmentKey);

        // TODO: test validations
    }
    
    /**
     * Get expiring user targets for user segment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExpiringUserTargetsOnSegmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userSegmentKey = null;
        UserTargetingExpirationForSegment response = api.getExpiringUserTargetsOnSegment(projectKey, environmentKey, userSegmentKey);

        // TODO: test validations
    }
    
    /**
     * Get a single user segment by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSegmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userSegmentKey = null;
        UserSegment response = api.getUserSegment(projectKey, environmentKey, userSegmentKey);

        // TODO: test validations
    }
    
    /**
     * Get a list of all user segments in the given project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSegmentsTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String tag = null;
        UserSegments response = api.getUserSegments(projectKey, environmentKey, tag);

        // TODO: test validations
    }
    
    /**
     * Update, add, or delete expiring user targets on user segment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchExpiringUserTargetsOnSegmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userSegmentKey = null;
        Object semanticPatchWithComment = null;
        UserTargetingExpirationForSegment response = api.patchExpiringUserTargetsOnSegment(projectKey, environmentKey, userSegmentKey, semanticPatchWithComment);

        // TODO: test validations
    }
    
    /**
     * Perform a partial update to a user segment.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchUserSegmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userSegmentKey = null;
        List<PatchOperation> patchOnly = null;
        UserSegment response = api.patchUserSegment(projectKey, environmentKey, userSegmentKey, patchOnly);

        // TODO: test validations
    }
    
    /**
     * Creates a new user segment.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUserSegmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        UserSegmentBody userSegmentBody = null;
        UserSegment response = api.postUserSegment(projectKey, environmentKey, userSegmentBody);

        // TODO: test validations
    }
    
    /**
     * Update targets included or excluded in an unbounded segment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatedUnboundedSegmentTargetsTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userSegmentKey = null;
        UnboundedSegmentTargetsBody unboundedSegmentTargetsBody = null;
        api.updatedUnboundedSegmentTargets(projectKey, environmentKey, userSegmentKey, unboundedSegmentTargetsBody);

        // TODO: test validations
    }
    
}
