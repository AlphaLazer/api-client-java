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
import com.launchdarkly.api.model.Destination;
import com.launchdarkly.api.model.DestinationBody;
import com.launchdarkly.api.model.Destinations;
import com.launchdarkly.api.model.PatchOperation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataExportDestinationsApi
 */
@Ignore
public class DataExportDestinationsApiTest {

    private final DataExportDestinationsApi api = new DataExportDestinationsApi();

    
    /**
     * Get a single data export destination by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDestinationTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String destinationId = null;
        api.deleteDestination(projectKey, environmentKey, destinationId);

        // TODO: test validations
    }
    
    /**
     * Get a single data export destination by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDestinationTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String destinationId = null;
        Destination response = api.getDestination(projectKey, environmentKey, destinationId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of all data export destinations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDestinationsTest() throws ApiException {
        Destinations response = api.getDestinations();

        // TODO: test validations
    }
    
    /**
     * Perform a partial update to a data export destination.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchDestinationTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String destinationId = null;
        List<PatchOperation> patchOnly = null;
        Destination response = api.patchDestination(projectKey, environmentKey, destinationId, patchOnly);

        // TODO: test validations
    }
    
    /**
     * Create a new data export destination
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDestinationTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        DestinationBody destinationBody = null;
        Destination response = api.postDestination(projectKey, environmentKey, destinationBody);

        // TODO: test validations
    }
    
}
