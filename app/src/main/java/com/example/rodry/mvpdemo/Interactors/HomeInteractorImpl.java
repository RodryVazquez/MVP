package com.example.rodry.mvpdemo.Interactors;

import com.example.rodry.mvpdemo.Interfaces.Home.HomeInteractor;
import com.example.rodry.mvpdemo.Interfaces.Home.OnFetchDataFinished;
import com.example.rodry.mvpdemo.Services.Home.ContactModel;

import java.util.ArrayList;
import java.util.List;

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
        contactModels.add(new ContactModel(1289,"Rodry Vazquez","M",28));
        contactModels.add(new ContactModel(1289,"Rodry Vazquez","M",28));
        contactModels.add(new ContactModel(1289,"Rodry Vazquez","M",28));
        contactModels.add(new ContactModel(1289,"Rodry Vazquez","M",28));
        return contactModels;
    }
}
