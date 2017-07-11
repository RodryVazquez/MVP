package com.example.rodry.mvpdemo.Interfaces;

/**
 * CRUD Generico
 */

public interface CRUD<T,O, P> {

    T GetAll();

    void GetById(P args);

    void Create(O args);

    void Update(O args);

    void Delete(O args);
}
