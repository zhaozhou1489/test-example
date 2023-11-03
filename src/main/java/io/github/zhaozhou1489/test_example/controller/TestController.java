package io.github.zhaozhou1489.test_example.controller;

import com.alibaba.fastjson2.JSON;
import io.github.zhaozhou1489.test_example.service.UserService;
import io.github.zhaozhou1489.tools_db_query.params.QueryCond;
import io.github.zhaozhou1489.tools_db_query.params.QueryParam;
import io.github.zhaozhou1489.tools_db_query.tools.QueryBuilder;
import io.github.zhaozhou1489.tools_db_query.tools.QueryTransUtil;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Author:zhaozhou
 * @Date: 2023/11/03
 * @Desc: todo
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    private static OkHttpClient okHttpClient = new OkHttpClient();
    @GetMapping("/selectOne")
    public Object selectOne(){
        //通过QueryBuilder构造查询参数
        QueryBuilder builder = QueryBuilder.newBuilder();
        builder.addEqualQuery("code","111")
                .addLikeQuery("name","tom");
        //通过http请求调用对应接口
        Object obj=  this.postRequest("/user/selectOne", builder.getQueryParam());
        return obj;
    }







    private Object postRequest(String path,QueryParam param){

        MediaType mediaType = MediaType.parse("application/json;charset=utf-8");
        RequestBody requestBody = RequestBody.create(mediaType, JSON.toJSONString(param));
        Request request = new Request.Builder()
                .url("http://localhost:8080" + path)
                .post(requestBody).build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            String bodyStr = response.body().string();
            System.out.println("response:" + JSON.toJSONString(bodyStr));
            return bodyStr;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
