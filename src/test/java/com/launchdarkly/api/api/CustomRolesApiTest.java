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
import com.launchdarkly.api.model.CustomRole;
import com.launchdarkly.api.model.CustomRoleBody;
import com.launchdarkly.api.model.CustomRoles;
import com.launchdarkly.api.model.PatchOperation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomRolesApi
 */
@Ignore
public class CustomRolesApiTest {

    private final CustomRolesApi api = new CustomRolesApi();

    
    /**
     * Delete a custom role by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomRoleTest() throws ApiException {
        String customRoleKey = null;
        api.deleteCustomRole(customRoleKey);

        // TODO: test validations
    }
    
    /**
     * Get one custom role by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomRoleTest() throws ApiException {
        String customRoleKey = null;
        CustomRole response = api.getCustomRole(customRoleKey);

        // TODO: test validations
    }
    
    /**
     * Return a complete list of custom roles.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomRolesTest() throws ApiException {
        CustomRoles response = api.getCustomRoles();

        // TODO: test validations
    }
    
    /**
     * Modify a custom role by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCustomRoleTest() throws ApiException {
        String customRoleKey = null;
        List<PatchOperation> patchDelta = null;
        CustomRole response = api.patchCustomRole(customRoleKey, patchDelta);

        // TODO: test validations
    }
    
    /**
     * Create a new custom role.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCustomRoleTest() throws ApiException {
        CustomRoleBody customRoleBody = null;
        CustomRole response = api.postCustomRole(customRoleBody);

        // TODO: test validations
    }
    
}
