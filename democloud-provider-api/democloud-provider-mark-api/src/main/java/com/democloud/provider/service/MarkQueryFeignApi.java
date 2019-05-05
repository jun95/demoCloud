package com.democloud.provider.service;

import com.democloud.domain.PromotionInfo;
import com.democloud.provider.service.hystrix.MarkQueryFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by hwj on 2019/4/30.
 */
@FeignClient(value = "democloud-provider-mark",fallback = MarkQueryFeignHystrix.class)
public interface MarkQueryFeignApi {

    @PostMapping(value = "/api/mark/getById/{promotionId}")
    PromotionInfo getPromotion(@PathVariable("promotionId") Long promotionId);
}
