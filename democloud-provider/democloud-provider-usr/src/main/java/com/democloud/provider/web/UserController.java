package com.democloud.provider.web;

import com.democloud.domain.CdUser;
import com.democloud.domain.PromotionInfo;
import com.democloud.provider.service.MarkQueryFeignApi;
import com.democloud.provider.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hwj on 2019/5/5.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private MarkQueryFeignApi markQueryFeignApi;

    @Resource
    private UserService userService;

    @RequestMapping("getUsrAndProm")
    public Map<String,Object> getUsrAndProm(@RequestParam("userId") Long userId, @RequestParam("promotionId") Long promotionId) {
        Map<String,Object> map = new HashMap<>();

        PromotionInfo promotion = markQueryFeignApi.getPromotion(promotionId);
        CdUser userById = userService.getUserById(userId);

        map.put("user",userById);
        map.put("promotion",promotion);

        return map;
    }

}
