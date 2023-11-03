package io.github.zhaozhou1489.test_example.entity;

import lombok.Data;

/**
 * @Author:zhaozhou
 * @Date: 2023/11/03
 * @Desc: todo
 */
@Data
public class User {
    private Long id;

    private String code;

    private String name;

    private String birthday;

    private String gender;

    private String country;

    private Long createTime;

    private Long updateTime;
}
