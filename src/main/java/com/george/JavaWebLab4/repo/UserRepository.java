package com.george.JavaWebLab4.repo;

import com.george.JavaWebLab4.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}