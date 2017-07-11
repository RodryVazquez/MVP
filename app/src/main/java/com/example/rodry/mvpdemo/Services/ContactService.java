package com.example.rodry.mvpdemo.Services;

import com.example.rodry.mvpdemo.Helpers.ApplicationConstants;
import com.example.rodry.mvpdemo.Interfaces.CRUD;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Servicio para todo lo relacionado con Contactos
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
        return getInstance().contactAPI.getAllContacts();
    }

    @Override
    public ContactModel GetById(Integer args) {
        return null;
    }

    @Override
    public void Create(ContactModel args) {

    }

    @Override
    public void Update(ContactModel args) {

    }

    @Override
    public void Delete(Integer args) {

    }
}
