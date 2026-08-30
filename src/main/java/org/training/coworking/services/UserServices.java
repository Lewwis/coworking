package org.training.coworking.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.training.coworking.dto.UserDTO;
import org.training.coworking.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServices {

    private final UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDTO createUser(UserDTO user) {
        return userRepository.save(user);
    }

    public Optional<UserDTO> getUser(Long id) {
        return userRepository.findById(id);
    }

}
