package com.jonas.config;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/23
 */
public class BaseAction extends ActionSupport
        implements ServletRequestAware, ServletResponseAware, SessionAware {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected Map<String, Object> session;

    protected void render(String content, String contentType) {
        if (null != response) {
            response.setContentType(contentType);
            try {
                response.getWriter().write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void renderJson(String content) {
        render(content, "text/json; charset=UTF-8");
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}

