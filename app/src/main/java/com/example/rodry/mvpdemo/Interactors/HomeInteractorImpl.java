package com.example.rodry.mvpdemo.Interactors;

import com.example.rodry.mvpdemo.Interfaces.Home.HomeInteractor;
import com.example.rodry.mvpdemo.Interfaces.Home.OnFetchDataFinished;
import com.example.rodry.mvpdemo.Services.ContactModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Interactor de la vista Home
 */

public class HomeInteractorImpl implements HomeInteractor {

    /**
     * //TODO background task como se manejan?
     * @param dataFinished
     */
    @Override
    public void FetchData(final OnFetchDataFinished dataFinished) {
        List<ContactModel> data = simulateRequest();
        if(data.size() > 0){
            dataFinished.Response(data);
        }else{
            dataFinished.OnError();
        }
    }

    /**
     * Se debe de crear un wrapper del POJO para la vista?
     * @return
     */
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
