package org.training.coworking.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.training.coworking.dto.RequestUserDTO;
import org.training.coworking.dto.UserDTO;
import org.training.coworking.services.UserServices;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserServices userServices;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userServices.getAllUsers();
    }

    @PostMapping
    public UserDTO createUser(@RequestBody RequestUserDTO user) {
        return userServices.createUser(new UserDTO(user.id(), user.name()));
    }

    @GetMapping("/filter")
    public Optional<UserDTO> getUser(@RequestParam Long userId){
        return userServices.getUser(userId);

    }

}
