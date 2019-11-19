/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.22
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiException;
import com.launchdarkly.api.model.EvaluationUsageError;
import com.launchdarkly.api.model.Events;
import com.launchdarkly.api.model.MAU;
import com.launchdarkly.api.model.MAUbyCategory;
import com.launchdarkly.api.model.Stream;
import com.launchdarkly.api.model.StreamBySDK;
import com.launchdarkly.api.model.StreamSDKVersion;
import com.launchdarkly.api.model.StreamUsageError;
import com.launchdarkly.api.model.Streams;
import com.launchdarkly.api.model.Usage;
import com.launchdarkly.api.model.UsageError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerMetricsApi
 */
@Ignore
public class CustomerMetricsApiTest {

    private final CustomerMetricsApi api = new CustomerMetricsApi();

    
    /**
     * Get events usage by event id and the feature flag key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEvaluationsTest() throws ApiException {
        String envId = null;
        String flagKey = null;
        StreamSDKVersion response = api.getEvaluations(envId, flagKey);

        // TODO: test validations
    }
    
    /**
     * Get events usage by event type.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTest() throws ApiException {
        String type = null;
        StreamSDKVersion response = api.getEvent(type);

        // TODO: test validations
    }
    
    /**
     * Get events usage endpoints.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        Events response = api.getEvents();

        // TODO: test validations
    }
    
    /**
     * Get monthly active user data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMAUTest() throws ApiException {
        MAU response = api.getMAU();

        // TODO: test validations
    }
    
    /**
     * Get monthly active user data by category.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMAUByCategoryTest() throws ApiException {
        MAUbyCategory response = api.getMAUByCategory();

        // TODO: test validations
    }
    
    /**
     * Get a stream endpoint and return timeseries data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamTest() throws ApiException {
        String source = null;
        Stream response = api.getStream(source);

        // TODO: test validations
    }
    
    /**
     * Get a stream timeseries data by source show sdk version metadata.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamBySDKTest() throws ApiException {
        String source = null;
        StreamBySDK response = api.getStreamBySDK(source);

        // TODO: test validations
    }
    
    /**
     * Get a stream timeseries data by source and show all sdk version associated.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamSDKVersionTest() throws ApiException {
        String source = null;
        StreamSDKVersion response = api.getStreamSDKVersion(source);

        // TODO: test validations
    }
    
    /**
     * Returns a list of all streams.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamsTest() throws ApiException {
        Streams response = api.getStreams();

        // TODO: test validations
    }
    
    /**
     * Returns of the usage endpoints available.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageTest() throws ApiException {
        Usage response = api.getUsage();

        // TODO: test validations
    }
    
}