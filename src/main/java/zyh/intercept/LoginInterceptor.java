package zyh.intercept;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @program: SSM-base
 * @description: 拦截类
 * @author: Mr.Z
 * @create: 2020-05-10 13:47
 **/
public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        Object user = httpServletRequest.getSession().getAttribute("user");
//        if (user == null||user==""){
//            httpServletRequest.getRequestDispatcher("/hello.do").forward(httpServletRequest, httpServletResponse);
//            return false;
//        }
//        return true;
        HttpSession session = httpServletRequest.getSession();
        String requestURI = httpServletRequest.getRequestURI();
        if(requestURI.equals("/change.do") || requestURI.equals("/hello.do")){
            return true;
        }else {
            if (session.getAttribute("user") != null) {
                return true;
            }else {
                httpServletRequest.getRequestDispatcher("/hello.do").forward(httpServletRequest, httpServletResponse);
                return false;
            }
        }
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
