package com.democloud.provider.service.hystrix;

import com.democloud.domain.CdUser;
import com.democloud.provider.service.UserQueryFeignApi;
import org.springframework.stereotype.Component;

/**
 * Created by hwj on 2019/4/30.
 */
@Component
public class UserQueryFeignHystrix implements UserQueryFeignApi {

    @Override
    public CdUser getUser(Long userId) {
        return null;
    }
}
