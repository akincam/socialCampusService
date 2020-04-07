package com.akincam.app.socialcampus.repository;

import com.akincam.app.socialcampus.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgresqlUserDB")
public class UserDataAccessService implements InterfaceRepository<UserEntity> {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserEntity> getAllSelect() {
        final String sql="Select * from user_entity";
        return jdbcTemplate.query(sql,(resultSet, i) -> {
            return new UserEntity(
                    Integer.parseInt(resultSet.getString("id")),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("password"),
                    resultSet.getString("university")
            );
        });
    }

    @Override
    public UserEntity getEntityByName(String name) {
        final String query= "SELECT * FROM user_entity WHERE name = "+name;
        return jdbcTemplate.query(query,resultSet -> {
            return new UserEntity(Integer.parseInt(resultSet.getString("id")),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("password"),
                    resultSet.getString("university"));
        });
    }

    @Override
    public int addAEntity(UserEntity entity) {
        jdbcTemplate.update(
                "INSERT INTO user_entity (name,email,password,university) VALUES (?, ?,?,?)",
                entity.getName(),entity.getEmail(),entity.getPassword(),entity.getUniversity()
        );
        return 0;
    }
}
