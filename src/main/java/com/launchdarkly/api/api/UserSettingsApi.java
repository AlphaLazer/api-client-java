/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.3
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


import com.launchdarkly.api.model.UserFlagSetting;
import com.launchdarkly.api.model.UserFlagSettings;
import com.launchdarkly.api.model.UserSettingsBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSettingsApi {
    private ApiClient apiClient;

    public UserSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUserFlagSetting
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserFlagSettingCall(String projectKey, String environmentKey, String userKey, String featureFlagKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{projectKey}/{environmentKey}/{userKey}/flags/{featureFlagKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()))
            .replaceAll("\\{" + "userKey" + "\\}", apiClient.escapeString(userKey.toString()))
            .replaceAll("\\{" + "featureFlagKey" + "\\}", apiClient.escapeString(featureFlagKey.toString()));

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
    private com.squareup.okhttp.Call getUserFlagSettingValidateBeforeCall(String projectKey, String environmentKey, String userKey, String featureFlagKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling getUserFlagSetting(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling getUserFlagSetting(Async)");
        }
        
        // verify the required parameter 'userKey' is set
        if (userKey == null) {
            throw new ApiException("Missing the required parameter 'userKey' when calling getUserFlagSetting(Async)");
        }
        
        // verify the required parameter 'featureFlagKey' is set
        if (featureFlagKey == null) {
            throw new ApiException("Missing the required parameter 'featureFlagKey' when calling getUserFlagSetting(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserFlagSettingCall(projectKey, environmentKey, userKey, featureFlagKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch a single flag setting for a user by key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @return UserFlagSetting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserFlagSetting getUserFlagSetting(String projectKey, String environmentKey, String userKey, String featureFlagKey) throws ApiException {
        ApiResponse<UserFlagSetting> resp = getUserFlagSettingWithHttpInfo(projectKey, environmentKey, userKey, featureFlagKey);
        return resp.getData();
    }

    /**
     * Fetch a single flag setting for a user by key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @return ApiResponse&lt;UserFlagSetting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserFlagSetting> getUserFlagSettingWithHttpInfo(String projectKey, String environmentKey, String userKey, String featureFlagKey) throws ApiException {
        com.squareup.okhttp.Call call = getUserFlagSettingValidateBeforeCall(projectKey, environmentKey, userKey, featureFlagKey, null, null);
        Type localVarReturnType = new TypeToken<UserFlagSetting>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch a single flag setting for a user by key. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserFlagSettingAsync(String projectKey, String environmentKey, String userKey, String featureFlagKey, final ApiCallback<UserFlagSetting> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserFlagSettingValidateBeforeCall(projectKey, environmentKey, userKey, featureFlagKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserFlagSetting>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserFlagSettings
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserFlagSettingsCall(String projectKey, String environmentKey, String userKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{projectKey}/{environmentKey}/{userKey}/flags"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()))
            .replaceAll("\\{" + "userKey" + "\\}", apiClient.escapeString(userKey.toString()));

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
    private com.squareup.okhttp.Call getUserFlagSettingsValidateBeforeCall(String projectKey, String environmentKey, String userKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling getUserFlagSettings(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling getUserFlagSettings(Async)");
        }
        
        // verify the required parameter 'userKey' is set
        if (userKey == null) {
            throw new ApiException("Missing the required parameter 'userKey' when calling getUserFlagSettings(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserFlagSettingsCall(projectKey, environmentKey, userKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch a single flag setting for a user by key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @return UserFlagSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserFlagSettings getUserFlagSettings(String projectKey, String environmentKey, String userKey) throws ApiException {
        ApiResponse<UserFlagSettings> resp = getUserFlagSettingsWithHttpInfo(projectKey, environmentKey, userKey);
        return resp.getData();
    }

    /**
     * Fetch a single flag setting for a user by key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @return ApiResponse&lt;UserFlagSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserFlagSettings> getUserFlagSettingsWithHttpInfo(String projectKey, String environmentKey, String userKey) throws ApiException {
        com.squareup.okhttp.Call call = getUserFlagSettingsValidateBeforeCall(projectKey, environmentKey, userKey, null, null);
        Type localVarReturnType = new TypeToken<UserFlagSettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch a single flag setting for a user by key. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserFlagSettingsAsync(String projectKey, String environmentKey, String userKey, final ApiCallback<UserFlagSettings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserFlagSettingsValidateBeforeCall(projectKey, environmentKey, userKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserFlagSettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putFlagSetting
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @param userSettingsBody  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putFlagSettingCall(String projectKey, String environmentKey, String userKey, String featureFlagKey, UserSettingsBody userSettingsBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = userSettingsBody;

        // create path and map variables
        String localVarPath = "/users/{projectKey}/{environmentKey}/{userKey}/flags/{featureFlagKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()))
            .replaceAll("\\{" + "userKey" + "\\}", apiClient.escapeString(userKey.toString()))
            .replaceAll("\\{" + "featureFlagKey" + "\\}", apiClient.escapeString(featureFlagKey.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putFlagSettingValidateBeforeCall(String projectKey, String environmentKey, String userKey, String featureFlagKey, UserSettingsBody userSettingsBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling putFlagSetting(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling putFlagSetting(Async)");
        }
        
        // verify the required parameter 'userKey' is set
        if (userKey == null) {
            throw new ApiException("Missing the required parameter 'userKey' when calling putFlagSetting(Async)");
        }
        
        // verify the required parameter 'featureFlagKey' is set
        if (featureFlagKey == null) {
            throw new ApiException("Missing the required parameter 'featureFlagKey' when calling putFlagSetting(Async)");
        }
        
        // verify the required parameter 'userSettingsBody' is set
        if (userSettingsBody == null) {
            throw new ApiException("Missing the required parameter 'userSettingsBody' when calling putFlagSetting(Async)");
        }
        

        com.squareup.okhttp.Call call = putFlagSettingCall(projectKey, environmentKey, userKey, featureFlagKey, userSettingsBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Specifically enable or disable a feature flag for a user based on their key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @param userSettingsBody  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putFlagSetting(String projectKey, String environmentKey, String userKey, String featureFlagKey, UserSettingsBody userSettingsBody) throws ApiException {
        putFlagSettingWithHttpInfo(projectKey, environmentKey, userKey, featureFlagKey, userSettingsBody);
    }

    /**
     * Specifically enable or disable a feature flag for a user based on their key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @param userSettingsBody  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putFlagSettingWithHttpInfo(String projectKey, String environmentKey, String userKey, String featureFlagKey, UserSettingsBody userSettingsBody) throws ApiException {
        com.squareup.okhttp.Call call = putFlagSettingValidateBeforeCall(projectKey, environmentKey, userKey, featureFlagKey, userSettingsBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Specifically enable or disable a feature flag for a user based on their key. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @param userSettingsBody  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFlagSettingAsync(String projectKey, String environmentKey, String userKey, String featureFlagKey, UserSettingsBody userSettingsBody, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putFlagSettingValidateBeforeCall(projectKey, environmentKey, userKey, featureFlagKey, userSettingsBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
