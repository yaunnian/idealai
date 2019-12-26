package cn.laoban.controller;

import cn.laoban.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("laoban")
public class LaobanController {
    @Autowired
    private RestTemplate restTemplate;
   /* @Autowired
    private DiscoveryClient discoveryClient;*/

/*    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);
        String url="http://"+instance.getHost()+":"+instance.getPort()+"/laoban/"+id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }*/
    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        String url="http://user-service/laoban/"+id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}
