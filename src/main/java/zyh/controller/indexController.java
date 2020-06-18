package zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @program: blue-cloud
 * @description:
 * @author: Mr.Z
 * @create: 2020-06-17 23:27
 **/
@Controller
public class indexController {

    @RequestMapping("/translate.do")
    public String translate(@RequestParam("local") String locale, HttpSession session) {
        if ("zh".equals(locale)) {
            Locale locale1 = new Locale("zh","CN");
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale1);
        }else {
            Locale locale1 = new Locale("en","US");
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale1);
        }
        return "index";
    }
}
