package net.SoftwareDos.BackendJava.services;

import net.SoftwareDos.BackendJava.shared.dto.UserDTO;

public interface UserServiceInterface {
    public UserDTO createUser(UserDTO userDto);
}
