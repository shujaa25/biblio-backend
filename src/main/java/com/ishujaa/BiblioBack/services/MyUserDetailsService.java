package com.ishujaa.BiblioBack.services;

import com.ishujaa.BiblioBack.model.UserEntity;
import com.ishujaa.BiblioBack.model.UserPrincipal;
import com.ishujaa.BiblioBack.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepo.findByUsername(username);

        if(userEntity == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User 404");
        }

        return new UserPrincipal(userEntity);
    }
}
