/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.33
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiException;
import com.launchdarkly.api.model.AuditLogEntries;
import com.launchdarkly.api.model.AuditLogEntry;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditLogApi
 */
@Ignore
public class AuditLogApiTest {

    private final AuditLogApi api = new AuditLogApi();

    
    /**
     * Get a list of all audit log entries. The query parameters allow you to restrict the returned results by date ranges, resource specifiers, or a full-text search query.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogEntriesTest() throws ApiException {
        Long before = null;
        Long after = null;
        String q = null;
        BigDecimal limit = null;
        String spec = null;
        AuditLogEntries response = api.getAuditLogEntries(before, after, q, limit, spec);

        // TODO: test validations
    }
    
    /**
     * Use this endpoint to fetch a single audit log entry by its resouce ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogEntryTest() throws ApiException {
        String resourceId = null;
        AuditLogEntry response = api.getAuditLogEntry(resourceId);

        // TODO: test validations
    }
    
}
