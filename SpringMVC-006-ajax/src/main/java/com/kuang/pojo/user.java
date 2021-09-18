package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {

    private String name;
    private int age;
    private String sex;
}
