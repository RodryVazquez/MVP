package com.example.rodry.mvpdemo.Interfaces;

/**
 * Listener que comunica al Interactor con el Presenter
 * de la vista Login
 */

public interface OnLoginFinished {

    void SetErrorUser();

    void SetErrorPassword();

    void LoginSuccess();
}
