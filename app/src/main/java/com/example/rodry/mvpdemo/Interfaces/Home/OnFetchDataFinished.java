package com.example.rodry.mvpdemo.Interfaces.Home;

/**
 * Created by Rodry on 7/7/2017.
 */

public interface OnFetchDataFinished<T> {

    void OnError();

    void Response(T args);
}
