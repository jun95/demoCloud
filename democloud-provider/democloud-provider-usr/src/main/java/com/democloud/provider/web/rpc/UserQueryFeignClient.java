package com.democloud.provider.web.rpc;

import com.democloud.domain.CdUser;
import com.democloud.provider.service.UserQueryFeignApi;
import com.democloud.provider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by hwj on 2019/4/30.
 */
@RestController
@Api(value = "API - UserQueryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserQueryFeignClient implements UserQueryFeignApi {

    @Resource
    private UserService userService;

    @Override
    @ApiOperation(httpMethod = "POST", value = "根据ID获取用户信息")
    public CdUser getUser(Long userId) {
        return userService.getUserById(userId);
    }
}
