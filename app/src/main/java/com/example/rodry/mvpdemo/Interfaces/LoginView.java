package com.example.rodry.mvpdemo.Interfaces;

/**
 * Created by Rodry on 7/5/2017.
 */

public interface LoginView {

    void ShowProgress();

    void HideProgress();

    void SetErrorUser();

    void SetErrorPassword();

    void NavigateToHome();
}
