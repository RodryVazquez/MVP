package com.example.rodry.mvpdemo.Interfaces;

/**
 * Interfaz para la vista Login
 */

public interface LoginView {

    void ShowProgress();

    void HideProgress();

    void SetErrorUser();

    void SetErrorPassword();

    void NavigateToHome();
}
