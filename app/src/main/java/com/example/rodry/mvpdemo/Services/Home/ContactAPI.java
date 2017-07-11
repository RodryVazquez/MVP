package com.example.rodry.mvpdemo.Services.Home;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Interface Retrofit
 */

public interface ContactAPI {

    @GET("GetAllContacts")
    Call<List<ContactModel>> getAllContacts();
}
