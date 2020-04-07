package com.akincam.app.socialcampus.service;


import com.akincam.app.socialcampus.model.UniversityEntity;
import com.akincam.app.socialcampus.repository.InterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    private final InterfaceRepository<UniversityEntity> interfaceRepository;

    @Autowired
    public UniversityService(@Qualifier("postgresqlUniversityDB") InterfaceRepository<UniversityEntity> interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }

    public List<UniversityEntity> getAllUser() {
        return interfaceRepository.getAllSelect();
    }

    public UniversityEntity getUniByName(String name) {
        return interfaceRepository.getEntityByName(name);
    }

    public void saveUser(UniversityEntity userEntity) {
        interfaceRepository.addAEntity(userEntity);
    }

}
