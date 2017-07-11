package com.example.rodry.mvpdemo.Presenters;

import com.example.rodry.mvpdemo.Interactors.HomeInteractorImpl;
import com.example.rodry.mvpdemo.Interfaces.Home.HomeInteractor;
import com.example.rodry.mvpdemo.Interfaces.Home.HomePresenter;
import com.example.rodry.mvpdemo.Interfaces.Home.HomeView;
import com.example.rodry.mvpdemo.Interfaces.Home.OnFetchDataFinished;
import com.example.rodry.mvpdemo.Services.Home.ContactModel;

import java.util.List;

/**
 * Presentador para la vista Home
 */

public class HomePresenterImpl implements HomePresenter, OnFetchDataFinished<List<ContactModel>> {

    //Dependencias Vista,Interactor
    private HomeView homeView;
    private HomeInteractor homeInteractor;

    public HomePresenterImpl(HomeView homeView) {
        this.homeView = homeView;
        this.homeInteractor = new HomeInteractorImpl();
    }

    @Override
    public void FetchData() {
        this.homeView.ShowProgress();
        this.homeInteractor.FetchData(this);
    }

    @Override
    public void OnError() {
        this.homeView.HideProgress();
    }

    @Override
    public void Response(List<ContactModel> args) {
        this.homeView.HideProgress();
        this.homeView.Response(args);
    }
}
