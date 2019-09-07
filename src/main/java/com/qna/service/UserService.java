/**
 * @Author Aditya Kelkar
 */


package com.qna.service;

import com.qna.data.User;
import com.qna.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }

    public void addUser(User usr) {
        userRepository.save(usr);
    }

    public User userLogin(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

}
