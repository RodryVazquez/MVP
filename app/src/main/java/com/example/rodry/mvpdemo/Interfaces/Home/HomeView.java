package com.example.rodry.mvpdemo.Interfaces.Home;

/**
 * Interface para la vista Home
 */

public interface HomeView<T> {

    void ShowProgress();

    void HideProgress();

    void FetchData();

    void Response(T args);
}
