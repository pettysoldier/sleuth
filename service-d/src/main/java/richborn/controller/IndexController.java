package richborn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhusg
 * @date 2020/7/21 15:45
 */
@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/Fourth")
    public String index(){
        //远程调用service-b的方法，service-b分别调用service-c、service-b
        String result = remoteCallServiceB();
        return " service-d start ," + result;
    }

    //远程调用service-b
    private String remoteCallServiceB(){
//        String url = "http://service-a/Second";
//        String result = restTemplate.getForObject(url , String.class);
        return "end";
    }
}
