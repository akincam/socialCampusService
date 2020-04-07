package com.akincam.app.socialcampus.service;

import com.akincam.app.socialcampus.model.UserEntity;
import com.akincam.app.socialcampus.repository.InterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final InterfaceRepository<UserEntity> interfaceRepository;

    @Autowired
    public UserService(@Qualifier("postgresqlUserDB") InterfaceRepository interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }

    public List<UserEntity> getAllUser() {
        return interfaceRepository.getAllSelect();
    }

    public UserEntity getUserByName(String name) {
        return interfaceRepository.getEntityByName(name);
    }

    public void saveUser(UserEntity userEntity) {
        interfaceRepository.addAEntity(userEntity);
    }

}
