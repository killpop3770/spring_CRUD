package com.x.springboot.repostitory;

import com.x.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
//    List<User> findById(int id);
//    List<User> findByFirsttName(String firstName);
//    List<User> findByLastName(String lastName);

}
