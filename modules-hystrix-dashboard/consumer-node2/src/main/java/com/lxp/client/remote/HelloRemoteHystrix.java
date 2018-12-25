package com.lxp.client.remote;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/15.
 */
@Component
@Service
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}
