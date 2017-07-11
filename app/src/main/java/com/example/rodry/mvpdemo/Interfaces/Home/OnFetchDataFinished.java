package com.example.rodry.mvpdemo.Interfaces.Home;

/**
 *  Listener para comunicar al Interactor y el Presenter de
 *  la vista Home
 */

public interface OnFetchDataFinished<T> {

    void OnError();

    void Response(T args);
}
