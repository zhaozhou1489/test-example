package io.github.zhaozhou1489.test_example.service;

import io.github.zhaozhou1489.test_example.entity.User;
import io.github.zhaozhou1489.test_example.mapper.UserMapper;
import io.github.zhaozhou1489.tools_db_query.service.QueryCondServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author:zhaozhou
 * @Date: 2023/11/03
 * @Desc: todo
 */
@Service
public class UserService extends QueryCondServiceImpl<UserMapper, User> {
}
