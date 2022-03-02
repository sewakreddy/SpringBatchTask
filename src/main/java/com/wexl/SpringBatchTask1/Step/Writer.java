package com.wexl.SpringBatchTask1.Step;

import com.wexl.SpringBatchTask1.Model.User;
import com.wexl.SpringBatchTask1.Repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    public Writer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data Saved for User: " + users);
        userRepository.saveAll(users);

    }
}
