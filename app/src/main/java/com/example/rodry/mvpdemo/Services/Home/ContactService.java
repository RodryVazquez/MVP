package com.example.rodry.mvpdemo.Services.Home;

import com.example.rodry.mvpdemo.Helpers.ApplicationConstants;
import com.example.rodry.mvpdemo.Interfaces.CRUD;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Rodry on 7/6/2017.
 */

public class ContactService implements CRUD<Call<List<ContactModel>>, ContactModel, Integer> {

    private static ContactService instance = null;
    private ContactAPI contactAPI;
    private Retrofit retrofit;

    private ContactService() {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApplicationConstants.URL_GET_CONTACTS).build();
        contactAPI = retrofit.create(ContactAPI.class);
    }

    public static ContactService getInstance() {
        if (instance == null) {
            synchronized (ContactService.class) {
                if (instance == null) {
                    instance = new ContactService();
                }
            }
        }
        return instance;
    }

    @Override
    public Call<List<ContactModel>> GetAll() {
        return this.contactAPI.getAllContacts();
    }

    @Override
    public void GetById(Integer args) {

    }

    @Override
    public void Create(ContactModel args) {

    }

    @Override
    public void Update(ContactModel args) {

    }

    @Override
    public void Delete(ContactModel args) {

    }
}
