package com.programmer.jpaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUser(int id){
        return userRepository.findById(id).get();
    }
    // delete by a roll no
    public String deleteId(int id){
        userRepository.deleteById(id);
        return "User deleted successfully";
    }
    // delete all the users
    public String delete(){
        userRepository.deleteAll();
        return "delete all users";
    }
    // update a user by id
//    public String update-users(int id){
//        userRepository.s;
//    }
}
