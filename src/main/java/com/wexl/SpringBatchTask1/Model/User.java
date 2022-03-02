package com.wexl.SpringBatchTask1.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {

    @Id
    private Integer rollNumber;
    private String firstName;
    private String lastName;
    private String grade;
    private String department;
    private String board;
    private String organization;
}
