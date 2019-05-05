package com.democloud.provider.service.hystrix;

import com.democloud.domain.CdUser;
import com.democloud.domain.PromotionInfo;
import com.democloud.provider.service.MarkQueryFeignApi;
import org.springframework.stereotype.Component;

/**
 * Created by hwj on 2019/4/30.
 */
@Component
public class MarkQueryFeignHystrix implements MarkQueryFeignApi {

    @Override
    public PromotionInfo getPromotion(Long promotionId) {
        return null;
    }
}
