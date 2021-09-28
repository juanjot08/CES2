package net.SoftwareDos.BackendJava.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.SoftwareDos.BackendJava.UserRepository;
import net.SoftwareDos.BackendJava.entities.UserEntity;
import net.SoftwareDos.BackendJava.shared.dto.UserDTO;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDTO createUser(UserDTO userDto) {
        
        // La creacion del usuario
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);
        
        userEntity.setEncryptedPassword("testpassword");
        userEntity.setUsersId("testUserId");

        UserEntity storedUserDetail = userRepository.save(userEntity);

        UserDTO userToReturn = new UserDTO();
        BeanUtils.copyProperties(storedUserDetail, userToReturn);

        return userToReturn;
    }
    
}
