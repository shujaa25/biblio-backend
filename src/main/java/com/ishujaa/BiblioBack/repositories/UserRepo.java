package com.ishujaa.BiblioBack.repositories;

import com.ishujaa.BiblioBack.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

    public UserEntity findByUsername(String username);

}
