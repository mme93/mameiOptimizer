package de.mameie.backend.rest.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface REST<T> {

    void delete(Long id);
    T get(Long id) throws IOException;
    List<T> getAll() throws IOException;
    void put(T object);
    void post(T object) throws IOException;
}
