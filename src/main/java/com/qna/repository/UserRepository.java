/**
 * @Author Aditya Kelkar
 */


package com.qna.repository;

import com.qna.data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);
}
