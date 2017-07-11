package com.example.rodry.mvpdemo.Interfaces;

/**
 * CRUD Generico
 */

public interface CRUD<T,O, P> {

    T GetAll();

    O GetById(P args);

    void Create(O args);

    void Update(O args);

    void Delete(P args);
}
