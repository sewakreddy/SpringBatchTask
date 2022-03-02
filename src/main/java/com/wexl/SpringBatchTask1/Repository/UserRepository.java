package com.wexl.SpringBatchTask1.Repository;

import com.wexl.SpringBatchTask1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
