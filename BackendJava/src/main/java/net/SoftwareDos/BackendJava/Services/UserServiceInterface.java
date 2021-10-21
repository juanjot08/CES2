package net.SoftwareDos.BackendJava.Services;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.SoftwareDos.BackendJava.Shared.dto.UserDTO;

public interface UserServiceInterface extends UserDetailsService {
    
    public UserDTO createUser(UserDTO userDto);

}
