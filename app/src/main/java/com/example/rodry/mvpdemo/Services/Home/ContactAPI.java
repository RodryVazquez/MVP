package com.example.rodry.mvpdemo.Services.Home;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rodry on 7/7/2017.
 */

public interface ContactAPI {

    @GET("GetAllContacts")
    Call<List<ContactModel>> getAllContacts();
}
