package com.classassignment.taskmanager.api;

import com.classassignment.taskmanager.model.Users;
import com.classassignment.taskmanager.serverresponse.ImageResponse;
import com.classassignment.taskmanager.serverresponse.SignupResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UsersApi {

    @POST("users/signup")
    Call<SignupResponse> responseUser(@Body Users users);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);
}
