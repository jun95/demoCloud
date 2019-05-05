package com.democloud.provider.service.impl;


import com.democloud.domain.PromotionInfo;
import com.democloud.provider.dao.PromotionDAO;
import com.democloud.provider.service.PromotionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hwj on 2019/4/30.
 */
@Service
public class PromotionServiceImpl implements PromotionService {

    @Resource
    private PromotionDAO promotionDAO;

    @Override
    public PromotionInfo getPromotionById(Long id) {
        return promotionDAO.selectByPrimaryKey(id);
    }
}
