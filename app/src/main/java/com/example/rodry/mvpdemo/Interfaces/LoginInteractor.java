package com.example.rodry.mvpdemo.Interfaces;

/**
 * Created by Rodry on 7/5/2017.
 */

public interface LoginInteractor {

    void ValidateUser(String user, String password, OnLoginFinished listener);
}
