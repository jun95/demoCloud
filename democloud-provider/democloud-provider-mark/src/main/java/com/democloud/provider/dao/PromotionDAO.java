package com.democloud.provider.dao;

import com.democloud.domain.PromotionInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hwj on 2019/4/30.
 */
@Mapper
public interface PromotionDAO {

    PromotionInfo selectByPrimaryKey(Long id);
}
