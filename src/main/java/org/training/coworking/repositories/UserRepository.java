package org.training.coworking.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.training.coworking.dto.UserDTO;

@Repository
public interface UserRepository extends MongoRepository<UserDTO, Long> {
}
