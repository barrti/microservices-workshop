package com.pgs.workshop;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "config-client")
public interface ProducerClient {

    @GetMapping("/")
    String getString();
}
