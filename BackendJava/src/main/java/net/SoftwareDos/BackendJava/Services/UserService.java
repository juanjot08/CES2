package net.SoftwareDos.BackendJava.Services;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.SoftwareDos.BackendJava.UserRepository;
import net.SoftwareDos.BackendJava.Entities.UserEntity;
import net.SoftwareDos.BackendJava.Shared.dto.UserDTO;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDto) {
        
        if(userRepository.findUserByEmail(userDto.getEmail()) != null) throw new RuntimeException("El email ya existe");

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);

        userEntity.setEncryptedPassword("testpassword");
        
        UUID userId = UUID.randomUUID();
        userEntity.setUserId(userId.toString());
        

        UserEntity storedUserDetail =  userRepository.save(userEntity);

        UserDTO userToReturn = new UserDTO();
        BeanUtils.copyProperties(storedUserDetail, userToReturn);
        return userToReturn;
    }
    
}
