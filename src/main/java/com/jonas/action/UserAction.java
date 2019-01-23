package com.jonas.action;

import com.alibaba.fastjson.JSON;
import com.jonas.config.BaseAction;
import com.jonas.entity.User;
import com.jonas.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/23
 */
@RestController
@Namespace("/uc")
public class UserAction extends BaseAction {

    @Autowired
    private UserService userService;

    @Action("getUser")
    public void getUser() {
        String id = request.getParameter("id");
        if (null != id) {
            User user = userService.getUser(Long.valueOf(id));
            renderJson(JSON.toJSONString(user));
        }
    }
}
