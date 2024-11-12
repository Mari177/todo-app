package com.example.springboot.myfirstwebapp.ping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SamplePing {

    @RequestMapping("/ping")
    @ResponseBody
    public String ping() {
        return "ping: {pong}";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>To do application</title></head>");
        sb.append("<body>");
        sb.append("<h1>My first Spring MVC app");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/sayhellojsp")
    @ResponseBody
    public String sayHelloJsp() {
        return "sayhello";
    }

}
