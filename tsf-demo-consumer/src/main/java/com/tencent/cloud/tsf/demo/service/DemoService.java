package com.tencent.cloud.tsf.demo.service;

        import org.springframework.cloud.netflix.feign.FeignClient;
        import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by chazling on 2018/1/17.
 */
@FeignClient("demo-provider")
public interface DemoService {

    @GetMapping("/provider")
    String provider();
}
