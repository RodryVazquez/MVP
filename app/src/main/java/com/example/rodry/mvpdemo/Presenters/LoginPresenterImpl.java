package com.example.rodry.mvpdemo.Presenters;

import com.example.rodry.mvpdemo.Interactors.LoginInteractorImpl;
import com.example.rodry.mvpdemo.Interfaces.LoginInteractor;
import com.example.rodry.mvpdemo.Interfaces.LoginPresenter;
import com.example.rodry.mvpdemo.Interfaces.LoginView;
import com.example.rodry.mvpdemo.Interfaces.OnLoginFinished;

/**
 * Created by Rodry on 7/5/2017.
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinished {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    //Habilitamos la comunicacion con la View y Interactor
    //Dependencia
    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void ValidateUser(String user, String password) {
        loginView.ShowProgress();
        //Llamamos al metodo del interactor
        loginInteractor.ValidateUser(user,password,this);
    }

    @Override
    public void SetErrorUser() {
        loginView.HideProgress();
        loginView.SetErrorUser();
    }

    @Override
    public void SetErrorPassword() {
        loginView.HideProgress();
        loginView.SetErrorPassword();
    }

    @Override
    public void LoginSuccess() {
        loginView.HideProgress();
        loginView.NavigateToHome();
    }
}
