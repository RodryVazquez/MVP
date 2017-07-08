package com.example.rodry.mvpdemo.Interfaces.Home;

/**
 * Created by Rodry on 7/7/2017.
 */

public interface HomeView<T> {

    void ShowProgress();

    void HideProgress();

    void FetchData();

    void Response(T args);
}
