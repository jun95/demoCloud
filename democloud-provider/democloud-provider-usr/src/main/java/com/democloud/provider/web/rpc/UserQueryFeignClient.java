package com.democloud.provider.web.rpc;

import com.democloud.domain.CdUser;
import com.democloud.provider.service.UserQueryFeignApi;
import com.democloud.provider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hwj on 2019/4/30.
 */
@RestController
@Api(value = "API - UserQueryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserQueryFeignClient implements UserQueryFeignApi {

    @Resource
    private UserService userService;

    @Override
    @ApiOperation(httpMethod = "GET", value = "根据ID获取用户信息")
    public CdUser getUser(Long userId) {
        return userService.getUserById(userId);
    }

    public static final void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("a", "alpha");
        m.put("b", "beta");

        Iterator<Map.Entry<String,String>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            if (entry.getKey().equals("b")) {
                entry.setValue("new Value");
            }
        }
        it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            System.out.println("key = " + entry.getKey() + ", value = "
                    + entry.getValue());
        }
    }
}
