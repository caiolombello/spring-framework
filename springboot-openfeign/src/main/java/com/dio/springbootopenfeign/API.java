package com.dio.springbootopenfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="agenda", url="localhost:8080/contact")
public interface API {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Contact returnContact();

}
