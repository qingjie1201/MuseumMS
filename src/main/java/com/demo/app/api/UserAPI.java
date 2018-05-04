package com.demo.app.api;

import com.demo.app.pojo.User;
import com.demo.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserAPI {

    private static final Logger logger = LoggerFactory.getLogger(UserAPI.class);

    @Autowired
    UserService userService;

    @RequestMapping(value="/queryUserById/{uid}")
    @ResponseBody
    public Object getUserById(@PathVariable Integer uid){
        List<User> users = userService.getUsers(uid);
        logger.info("===============================成功查询用户列表！");

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("status",true);
        map.put("data",users);
        map.put("msg","");

        return map;
    }

}
