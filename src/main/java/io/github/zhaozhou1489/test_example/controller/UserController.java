package io.github.zhaozhou1489.test_example.controller;

import io.github.zhaozhou1489.test_example.entity.User;
import io.github.zhaozhou1489.test_example.service.UserService;
import io.github.zhaozhou1489.tools_db_query.params.QueryCond;
import io.github.zhaozhou1489.tools_db_query.params.QueryParam;
import io.github.zhaozhou1489.tools_db_query.tools.QueryTransUtil;
import io.github.zhaozhou1489.tools_db_query.tools.QueryValidator;
import org.apache.commons.lang3.StringUtils;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhaozhou
 * @Date: 2023/11/03
 * @Desc: todo
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/selectOne")
    public Object selectOne(@RequestBody QueryParam param){
        //解析及验证查询参数
        QueryCond cond = new QueryCond();
        String errMsg = QueryTransUtil.transQueryParam(param,cond,null,null);
        if (StringUtils.isNotBlank(errMsg)){
            return errMsg;
        }
        //查询db
        return userService.selectOne(cond);
    }


    @PostMapping("/selectList")
    public Object selectList(@RequestBody QueryParam param){
        //解析及验证查询参数
        QueryCond cond = new QueryCond();
        String errMsg = QueryTransUtil.transQueryParam(param,cond,null,null);
        if (StringUtils.isNotBlank(errMsg)){
            return errMsg;
        }
        //查询db
        return userService.selectList(cond);
    }

    @PostMapping("/selectPage")
    public Object selectPage(@RequestBody QueryParam param){
        //解析及验证查询参数
        QueryCond cond = new QueryCond();
        String errMsg = QueryTransUtil.transQueryParam(param,cond,null,null);
        if (StringUtils.isNotBlank(errMsg)){
            return errMsg;
        }
        //查询db
        return userService.selectPage(cond, 1, 10);
    }
}
