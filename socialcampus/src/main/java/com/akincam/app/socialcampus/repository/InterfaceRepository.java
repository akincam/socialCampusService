package com.akincam.app.socialcampus.repository;

import com.akincam.app.socialcampus.model.UserEntity;

import java.util.List;


public interface InterfaceRepository<T>{

    public List<T> getAllSelect();

    public T getEntityByName(String name);

    public int addAEntity(T entity);

}
