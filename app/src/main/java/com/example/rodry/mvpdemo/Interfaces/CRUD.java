package com.example.rodry.mvpdemo.Interfaces;

/**
 * Created by Rodry on 7/6/2017.
 */

public interface CRUD<T,O, P> {

    T GetAll();

    void GetById(P args);

    void Create(O args);

    void Update(O args);

    void Delete(O args);
}
