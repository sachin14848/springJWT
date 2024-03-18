package com.messaging.springjwt.services;

import com.messaging.springjwt.modal.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
       store.add(new User(UUID.randomUUID().toString(), "sachin mishra", "sachin@gmail.com"));
       store.add(new User(UUID.randomUUID().toString(), "ram mishra", "ram@gmail.com"));
       store.add(new User(UUID.randomUUID().toString(), "xyz mishra", "xyz@gmail.com"));
       store.add(new User(UUID.randomUUID().toString(), "abcs mishra", "abcd@gmail.com"));
    }

    public List<User> getUsrs(){
        return this.store;
    }
}
