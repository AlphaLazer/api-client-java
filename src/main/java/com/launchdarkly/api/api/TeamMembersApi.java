/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.6.0
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


import java.math.BigDecimal;
import com.launchdarkly.api.model.Member;
import com.launchdarkly.api.model.Members;
import com.launchdarkly.api.model.MembersBody;
import com.launchdarkly.api.model.PatchOperation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamMembersApi {
    private ApiClient apiClient;

    public TeamMembersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TeamMembersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteMember
     * @param memberId The member ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteMemberCall(String memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/members/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

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
    private com.squareup.okhttp.Call deleteMemberValidateBeforeCall(String memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling deleteMember(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteMemberCall(memberId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a team member by ID.
     * 
     * @param memberId The member ID. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMember(String memberId) throws ApiException {
        deleteMemberWithHttpInfo(memberId);
    }

    /**
     * Delete a team member by ID.
     * 
     * @param memberId The member ID. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMemberWithHttpInfo(String memberId) throws ApiException {
        com.squareup.okhttp.Call call = deleteMemberValidateBeforeCall(memberId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a team member by ID. (asynchronously)
     * 
     * @param memberId The member ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMemberAsync(String memberId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMemberValidateBeforeCall(memberId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getMe
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/members/me";

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
    private com.squareup.okhttp.Call getMeValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getMeCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the current team member associated with the token
     * 
     * @return Member
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Member getMe() throws ApiException {
        ApiResponse<Member> resp = getMeWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get the current team member associated with the token
     * 
     * @return ApiResponse&lt;Member&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Member> getMeWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getMeValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the current team member associated with the token (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeAsync(final ApiCallback<Member> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMeValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMember
     * @param memberId The member ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMemberCall(String memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/members/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

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
    private com.squareup.okhttp.Call getMemberValidateBeforeCall(String memberId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling getMember(Async)");
        }
        

        com.squareup.okhttp.Call call = getMemberCall(memberId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a single team member by ID.
     * 
     * @param memberId The member ID. (required)
     * @return Member
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Member getMember(String memberId) throws ApiException {
        ApiResponse<Member> resp = getMemberWithHttpInfo(memberId);
        return resp.getData();
    }

    /**
     * Get a single team member by ID.
     * 
     * @param memberId The member ID. (required)
     * @return ApiResponse&lt;Member&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Member> getMemberWithHttpInfo(String memberId) throws ApiException {
        com.squareup.okhttp.Call call = getMemberValidateBeforeCall(memberId, null, null);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single team member by ID. (asynchronously)
     * 
     * @param memberId The member ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMemberAsync(String memberId, final ApiCallback<Member> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMemberValidateBeforeCall(memberId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMembers
     * @param limit The number of objects to return. Defaults to -1, which returns everything. (optional)
     * @param offset Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items. (optional)
     * @param filter A comma-separated list of filters. Each filter is of the form field:value. (optional)
     * @param sort A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMembersCall(BigDecimal limit, BigDecimal offset, String filter, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/members";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));

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
    private com.squareup.okhttp.Call getMembersValidateBeforeCall(BigDecimal limit, BigDecimal offset, String filter, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getMembersCall(limit, offset, filter, sort, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of all members in the account.
     * 
     * @param limit The number of objects to return. Defaults to -1, which returns everything. (optional)
     * @param offset Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items. (optional)
     * @param filter A comma-separated list of filters. Each filter is of the form field:value. (optional)
     * @param sort A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order. (optional)
     * @return Members
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Members getMembers(BigDecimal limit, BigDecimal offset, String filter, String sort) throws ApiException {
        ApiResponse<Members> resp = getMembersWithHttpInfo(limit, offset, filter, sort);
        return resp.getData();
    }

    /**
     * Returns a list of all members in the account.
     * 
     * @param limit The number of objects to return. Defaults to -1, which returns everything. (optional)
     * @param offset Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items. (optional)
     * @param filter A comma-separated list of filters. Each filter is of the form field:value. (optional)
     * @param sort A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order. (optional)
     * @return ApiResponse&lt;Members&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Members> getMembersWithHttpInfo(BigDecimal limit, BigDecimal offset, String filter, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getMembersValidateBeforeCall(limit, offset, filter, sort, null, null);
        Type localVarReturnType = new TypeToken<Members>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of all members in the account. (asynchronously)
     * 
     * @param limit The number of objects to return. Defaults to -1, which returns everything. (optional)
     * @param offset Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items. (optional)
     * @param filter A comma-separated list of filters. Each filter is of the form field:value. (optional)
     * @param sort A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMembersAsync(BigDecimal limit, BigDecimal offset, String filter, String sort, final ApiCallback<Members> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMembersValidateBeforeCall(limit, offset, filter, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Members>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchMember
     * @param memberId The member ID. (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchMemberCall(String memberId, List<PatchOperation> patchDelta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = patchDelta;

        // create path and map variables
        String localVarPath = "/members/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

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
    private com.squareup.okhttp.Call patchMemberValidateBeforeCall(String memberId, List<PatchOperation> patchDelta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling patchMember(Async)");
        }
        
        // verify the required parameter 'patchDelta' is set
        if (patchDelta == null) {
            throw new ApiException("Missing the required parameter 'patchDelta' when calling patchMember(Async)");
        }
        

        com.squareup.okhttp.Call call = patchMemberCall(memberId, patchDelta, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Modify a team member by ID.
     * 
     * @param memberId The member ID. (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return Member
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Member patchMember(String memberId, List<PatchOperation> patchDelta) throws ApiException {
        ApiResponse<Member> resp = patchMemberWithHttpInfo(memberId, patchDelta);
        return resp.getData();
    }

    /**
     * Modify a team member by ID.
     * 
     * @param memberId The member ID. (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return ApiResponse&lt;Member&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Member> patchMemberWithHttpInfo(String memberId, List<PatchOperation> patchDelta) throws ApiException {
        com.squareup.okhttp.Call call = patchMemberValidateBeforeCall(memberId, patchDelta, null, null);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify a team member by ID. (asynchronously)
     * 
     * @param memberId The member ID. (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchMemberAsync(String memberId, List<PatchOperation> patchDelta, final ApiCallback<Member> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = patchMemberValidateBeforeCall(memberId, patchDelta, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postMembers
     * @param membersBody New members to invite. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postMembersCall(List<MembersBody> membersBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = membersBody;

        // create path and map variables
        String localVarPath = "/members";

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
    private com.squareup.okhttp.Call postMembersValidateBeforeCall(List<MembersBody> membersBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'membersBody' is set
        if (membersBody == null) {
            throw new ApiException("Missing the required parameter 'membersBody' when calling postMembers(Async)");
        }
        

        com.squareup.okhttp.Call call = postMembersCall(membersBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Invite new members.
     * 
     * @param membersBody New members to invite. (required)
     * @return Members
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Members postMembers(List<MembersBody> membersBody) throws ApiException {
        ApiResponse<Members> resp = postMembersWithHttpInfo(membersBody);
        return resp.getData();
    }

    /**
     * Invite new members.
     * 
     * @param membersBody New members to invite. (required)
     * @return ApiResponse&lt;Members&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Members> postMembersWithHttpInfo(List<MembersBody> membersBody) throws ApiException {
        com.squareup.okhttp.Call call = postMembersValidateBeforeCall(membersBody, null, null);
        Type localVarReturnType = new TypeToken<Members>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Invite new members. (asynchronously)
     * 
     * @param membersBody New members to invite. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postMembersAsync(List<MembersBody> membersBody, final ApiCallback<Members> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postMembersValidateBeforeCall(membersBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Members>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
