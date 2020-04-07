package com.akincam.app.socialcampus.repository;

import com.akincam.app.socialcampus.model.UniversityEntity;
import com.akincam.app.socialcampus.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgresqlUniversityDB")
public class UniversityDataAccessService implements InterfaceRepository<UniversityEntity> {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UniversityDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UniversityEntity> getAllSelect() {
        final String sql="Select * from university";
        return jdbcTemplate.query(sql,(resultSet, i) -> {
            return new UniversityEntity(
                    resultSet.getString("uni_name"),
                    Integer.parseInt(resultSet.getString("uni_id")),
                    Integer.parseInt(resultSet.getString("city_id")),
                    Integer.parseInt(resultSet.getString("status"))
            );
        });
    }

    @Override
    public UniversityEntity getEntityByName(String name) {
        return null;
    }

    @Override
    public int addAEntity(UniversityEntity entity) {
        return 0;
    }
}
