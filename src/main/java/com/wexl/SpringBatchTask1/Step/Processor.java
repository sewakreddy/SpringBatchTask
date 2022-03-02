package com.wexl.SpringBatchTask1.Step;

import com.wexl.SpringBatchTask1.Model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor(){
        DEPT_NAMES.put("110", "EEE");
        DEPT_NAMES.put("111", "ECE");
        DEPT_NAMES.put("112", "CSE");
    }

    @Override
    public User process(User user) throws Exception {

        String deptCode = user.getDepartment();
        String department = DEPT_NAMES.get(deptCode);
        user.setDepartment(department);
        return user;
    }
}
