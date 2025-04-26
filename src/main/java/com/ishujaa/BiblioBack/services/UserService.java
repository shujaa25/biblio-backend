package com.ishujaa.BiblioBack.services;

import com.ishujaa.BiblioBack.dto.UserDTO;
import com.ishujaa.BiblioBack.model.UserEntity;
import com.ishujaa.BiblioBack.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepo userRepo, ModelMapper modelMapper,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public UserDTO addUser(UserDTO userDTO){

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));

        return modelMapper.map(userRepo.save(userEntity), UserDTO.class);

    }

}
