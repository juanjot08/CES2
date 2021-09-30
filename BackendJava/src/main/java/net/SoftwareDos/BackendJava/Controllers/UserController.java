package net.SoftwareDos.BackendJava.Controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.SoftwareDos.BackendJava.Models.Request.UserDetailRequestModel;
import net.SoftwareDos.BackendJava.Models.Responses.UserRest;

import net.SoftwareDos.BackendJava.Services.UserServiceInterface;
import net.SoftwareDos.BackendJava.Shared.dto.UserDTO;



@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {

    @Autowired
    UserServiceInterface userService;

    @GetMapping
    public String getUser() {
        return "Obteniendo usuario";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails) {

        UserRest userToReturn = new UserRest();

        UserDTO userDTO = new UserDTO();

        BeanUtils.copyProperties(userDetails, userDTO);

        UserDTO createdUser = userService.createUser(userDTO);


        BeanUtils.copyProperties(createdUser, userToReturn);

        return userToReturn;
    }

}
