package net.SoftwareDos.BackendJava.Controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.SoftwareDos.BackendJava.Models.Request.UserDetailRequestModel;
import net.SoftwareDos.BackendJava.Models.Responses.UserRest;
import net.SoftwareDos.BackendJava.shared.dto.UserDTO;



@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser() {
        return "Obteniendo usuario";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Borrando usuario";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailRequestModel userDetails) {
        UserRest userToReturn = new UserRest();

        UserDTO userDTO = new UserDTO();

        BeanUtils.copyProperties(userDetails, userDTO);

        UserDTO createUser = userService.createUser(userDTO);

        BeanUtils.copyProperties(createUser, userToReturn);

        return userToReturn;
    }

}
