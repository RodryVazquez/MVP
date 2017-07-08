package com.example.rodry.mvpdemo.Interactors;

import com.example.rodry.mvpdemo.Interfaces.Home.HomeInteractor;
import com.example.rodry.mvpdemo.Interfaces.Home.OnFetchDataFinished;
import com.example.rodry.mvpdemo.Services.ContactModel;
import com.example.rodry.mvpdemo.Services.ContactService;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rodry on 7/7/2017.
 */

public class HomeInteractorImpl implements HomeInteractor {

    @Override
    public void FetchData(final OnFetchDataFinished dataFinished) {
        List<ContactModel> data = simulateRequest();
        if(data.size() > 0){
            dataFinished.Response(data);
        }else{
            dataFinished.OnError();
        }
    }

    private List<ContactModel> simulateRequest(){
        List<ContactModel> contactModels = new ArrayList<>();
        contactModels.add(new ContactModel(1289,"Rodry Vazquez","M",28));
        contactModels.add(new ContactModel(1289,"Rodry Vazquez","M",28));
        contactModels.add(new ContactModel(1289,"Rodry Vazquez","M",28));
        return contactModels;
    }
}
