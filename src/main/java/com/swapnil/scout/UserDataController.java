package com.swapnil.scout;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api/userdata")
public class UserDataController {
    @Autowired
    private UserDataRepository userRepository;

    @Transactional
    public UserData addUser(@RequestBody UserData userData) {
        System.out.println("Received data: " + userData);
        return userRepository.save(userData);
    }
}
