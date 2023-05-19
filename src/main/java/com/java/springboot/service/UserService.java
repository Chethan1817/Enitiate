package com.java.springboot.service;

import com.java.springboot.entities.User;
import com.java.springboot.enums.AccountStatus;
import com.java.springboot.enums.ProfileType;
import com.java.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User registerUser(User user) throws Exception {

        

        if(user.getEmail_id()==null){

            throw new Exception("empty email");

        }

        if(user.getRole() == null){

            throw new Exception("empty role");

        }
        if(user.getMobile_number()==null)
        {
            throw new Exception("empty mobile number");
        }

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        if(user.getMobile_number().length()!=10)
        {
            throw new Exception("incorrect mobile number");
        }

        user.setAccount_status(AccountStatus.active);

        user.setAccount_created_on(new Date());

        user.setProfile_type(ProfileType.free);

        User saveduser = userRepository.save(user); // persisting user

        return saveduser;

    }

    public String signinUser(User user) {

        User find = userRepository.findByPassword(user.getPassword());

        if(find == null) {
            return "Invalid password"; // checking password
        }

        if(!find.getEmail_id().equals(user.getEmail_id())){
            return "error email"; // checking email
        }

        user.setLast_loggedin_on(new Date());


        userRepository.save(user);

        return "signin happened";
    }
}
