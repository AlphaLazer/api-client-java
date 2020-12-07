/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.10.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiCallback;
import com.launchdarkly.api.ApiClient;
import com.launchdarkly.api.ApiException;
import com.launchdarkly.api.ApiResponse;
import com.launchdarkly.api.Configuration;
import com.launchdarkly.api.Pair;
import com.launchdarkly.api.ProgressRequestBody;
import com.launchdarkly.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.launchdarkly.api.model.PatchOperation;
import com.launchdarkly.api.model.RelayProxyConfig;
import com.launchdarkly.api.model.RelayProxyConfigBody;
import com.launchdarkly.api.model.RelayProxyConfigs;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelayProxyConfigurationsApi {
    private ApiClient apiClient;

    public RelayProxyConfigurationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RelayProxyConfigurationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteRelayProxyConfig
     * @param id The relay proxy configuration ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRelayProxyConfigCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/relay-auto-configs/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRelayProxyConfigValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteRelayProxyConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRelayProxyConfigCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a relay proxy configuration by ID.
     * 
     * @param id The relay proxy configuration ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRelayProxyConfig(String id) throws ApiException {
        deleteRelayProxyConfigWithHttpInfo(id);
    }

    /**
     * Delete a relay proxy configuration by ID.
     * 
     * @param id The relay proxy configuration ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteRelayProxyConfigWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteRelayProxyConfigValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a relay proxy configuration by ID. (asynchronously)
     * 
     * @param id The relay proxy configuration ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRelayProxyConfigAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteRelayProxyConfigValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getRelayProxyConfig
     * @param id The relay proxy configuration ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRelayProxyConfigCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/relay-auto-configs/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRelayProxyConfigValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getRelayProxyConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = getRelayProxyConfigCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a single relay proxy configuration by ID.
     * 
     * @param id The relay proxy configuration ID (required)
     * @return RelayProxyConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RelayProxyConfig getRelayProxyConfig(String id) throws ApiException {
        ApiResponse<RelayProxyConfig> resp = getRelayProxyConfigWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get a single relay proxy configuration by ID.
     * 
     * @param id The relay proxy configuration ID (required)
     * @return ApiResponse&lt;RelayProxyConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RelayProxyConfig> getRelayProxyConfigWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getRelayProxyConfigValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single relay proxy configuration by ID. (asynchronously)
     * 
     * @param id The relay proxy configuration ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelayProxyConfigAsync(String id, final ApiCallback<RelayProxyConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelayProxyConfigValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRelayProxyConfigs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRelayProxyConfigsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/relay-auto-configs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRelayProxyConfigsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getRelayProxyConfigsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of relay proxy configurations in the account.
     * 
     * @return RelayProxyConfigs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RelayProxyConfigs getRelayProxyConfigs() throws ApiException {
        ApiResponse<RelayProxyConfigs> resp = getRelayProxyConfigsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns a list of relay proxy configurations in the account.
     * 
     * @return ApiResponse&lt;RelayProxyConfigs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RelayProxyConfigs> getRelayProxyConfigsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getRelayProxyConfigsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<RelayProxyConfigs>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of relay proxy configurations in the account. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelayProxyConfigsAsync(final ApiCallback<RelayProxyConfigs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelayProxyConfigsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RelayProxyConfigs>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchRelayProxyConfig
     * @param id The relay proxy configuration ID (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchRelayProxyConfigCall(String id, List<PatchOperation> patchDelta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = patchDelta;

        // create path and map variables
        String localVarPath = "/account/relay-auto-configs/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call patchRelayProxyConfigValidateBeforeCall(String id, List<PatchOperation> patchDelta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling patchRelayProxyConfig(Async)");
        }
        
        // verify the required parameter 'patchDelta' is set
        if (patchDelta == null) {
            throw new ApiException("Missing the required parameter 'patchDelta' when calling patchRelayProxyConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = patchRelayProxyConfigCall(id, patchDelta, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Modify a relay proxy configuration by ID.
     * 
     * @param id The relay proxy configuration ID (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return RelayProxyConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RelayProxyConfig patchRelayProxyConfig(String id, List<PatchOperation> patchDelta) throws ApiException {
        ApiResponse<RelayProxyConfig> resp = patchRelayProxyConfigWithHttpInfo(id, patchDelta);
        return resp.getData();
    }

    /**
     * Modify a relay proxy configuration by ID.
     * 
     * @param id The relay proxy configuration ID (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return ApiResponse&lt;RelayProxyConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RelayProxyConfig> patchRelayProxyConfigWithHttpInfo(String id, List<PatchOperation> patchDelta) throws ApiException {
        com.squareup.okhttp.Call call = patchRelayProxyConfigValidateBeforeCall(id, patchDelta, null, null);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify a relay proxy configuration by ID. (asynchronously)
     * 
     * @param id The relay proxy configuration ID (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchRelayProxyConfigAsync(String id, List<PatchOperation> patchDelta, final ApiCallback<RelayProxyConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = patchRelayProxyConfigValidateBeforeCall(id, patchDelta, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postRelayAutoConfig
     * @param relayProxyConfigBody Create a new relay proxy configuration (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postRelayAutoConfigCall(RelayProxyConfigBody relayProxyConfigBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = relayProxyConfigBody;

        // create path and map variables
        String localVarPath = "/account/relay-auto-configs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postRelayAutoConfigValidateBeforeCall(RelayProxyConfigBody relayProxyConfigBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'relayProxyConfigBody' is set
        if (relayProxyConfigBody == null) {
            throw new ApiException("Missing the required parameter 'relayProxyConfigBody' when calling postRelayAutoConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = postRelayAutoConfigCall(relayProxyConfigBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a new relay proxy config.
     * 
     * @param relayProxyConfigBody Create a new relay proxy configuration (required)
     * @return RelayProxyConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RelayProxyConfig postRelayAutoConfig(RelayProxyConfigBody relayProxyConfigBody) throws ApiException {
        ApiResponse<RelayProxyConfig> resp = postRelayAutoConfigWithHttpInfo(relayProxyConfigBody);
        return resp.getData();
    }

    /**
     * Create a new relay proxy config.
     * 
     * @param relayProxyConfigBody Create a new relay proxy configuration (required)
     * @return ApiResponse&lt;RelayProxyConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RelayProxyConfig> postRelayAutoConfigWithHttpInfo(RelayProxyConfigBody relayProxyConfigBody) throws ApiException {
        com.squareup.okhttp.Call call = postRelayAutoConfigValidateBeforeCall(relayProxyConfigBody, null, null);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new relay proxy config. (asynchronously)
     * 
     * @param relayProxyConfigBody Create a new relay proxy configuration (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postRelayAutoConfigAsync(RelayProxyConfigBody relayProxyConfigBody, final ApiCallback<RelayProxyConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postRelayAutoConfigValidateBeforeCall(relayProxyConfigBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for resetRelayProxyConfig
     * @param id The relay proxy configuration ID (required)
     * @param expiry An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resetRelayProxyConfigCall(String id, Long expiry, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/relay-auto-configs/{id}/reset"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (expiry != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expiry", expiry));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call resetRelayProxyConfigValidateBeforeCall(String id, Long expiry, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling resetRelayProxyConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = resetRelayProxyConfigCall(id, expiry, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Reset a relay proxy configuration&#39;s secret key with an optional expiry time for the old key.
     * 
     * @param id The relay proxy configuration ID (required)
     * @param expiry An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately (optional)
     * @return RelayProxyConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RelayProxyConfig resetRelayProxyConfig(String id, Long expiry) throws ApiException {
        ApiResponse<RelayProxyConfig> resp = resetRelayProxyConfigWithHttpInfo(id, expiry);
        return resp.getData();
    }

    /**
     * Reset a relay proxy configuration&#39;s secret key with an optional expiry time for the old key.
     * 
     * @param id The relay proxy configuration ID (required)
     * @param expiry An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately (optional)
     * @return ApiResponse&lt;RelayProxyConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RelayProxyConfig> resetRelayProxyConfigWithHttpInfo(String id, Long expiry) throws ApiException {
        com.squareup.okhttp.Call call = resetRelayProxyConfigValidateBeforeCall(id, expiry, null, null);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Reset a relay proxy configuration&#39;s secret key with an optional expiry time for the old key. (asynchronously)
     * 
     * @param id The relay proxy configuration ID (required)
     * @param expiry An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resetRelayProxyConfigAsync(String id, Long expiry, final ApiCallback<RelayProxyConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = resetRelayProxyConfigValidateBeforeCall(id, expiry, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RelayProxyConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
