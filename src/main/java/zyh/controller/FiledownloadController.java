package zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: blue-cloud
 * @description:
 * @author: Mr.Z
 * @create: 2020-06-17 22:53
 **/
@Controller
@RequestMapping("/file")
public class FiledownloadController {
    @RequestMapping("/download.do")
    public String download() {
        return "filedownload";
    }
}
