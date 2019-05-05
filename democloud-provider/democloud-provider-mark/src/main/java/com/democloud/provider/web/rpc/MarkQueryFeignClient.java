package com.democloud.provider.web.rpc;

import com.democloud.domain.PromotionInfo;
import com.democloud.provider.service.MarkQueryFeignApi;
import com.democloud.provider.service.PromotionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by hwj on 2019/4/30.
 */
@RestController
@Api(value = "API - MarkQueryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MarkQueryFeignClient implements MarkQueryFeignApi {

    @Resource
    private PromotionService promotionService;

    @Override
    @ApiOperation(httpMethod = "GET", value = "根据ID获取促销信息")
    public PromotionInfo getPromotion(@PathVariable("promotionId") Long promotionId) {
        return promotionService.getPromotionById(promotionId);
    }
}
