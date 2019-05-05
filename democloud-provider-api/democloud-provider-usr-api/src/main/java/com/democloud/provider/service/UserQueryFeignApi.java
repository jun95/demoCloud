package com.democloud.provider.service;

import com.democloud.domain.CdUser;
import com.democloud.provider.service.hystrix.UserQueryFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by hwj on 2019/4/30.
 */
@FeignClient(value = "democloud-provider-usr",fallback = UserQueryFeignHystrix.class)
public interface UserQueryFeignApi {

    @PostMapping(value = "/api/usr/getById/{userId}")
    CdUser getUser(@PathVariable("userId") Long userId);
}
