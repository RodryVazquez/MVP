package com.example.rodry.mvpdemo.Interfaces;

/**
 * Interfaz utilizada por el Interactor de la vista Login
 */

public interface LoginInteractor {

    void ValidateUser(String user, String password, OnLoginFinished listener);
}
