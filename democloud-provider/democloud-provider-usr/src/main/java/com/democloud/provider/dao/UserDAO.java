package com.democloud.provider.dao;

import com.democloud.domain.CdUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hwj on 2019/4/30.
 */
@Mapper
public interface UserDAO {

    CdUser selectByPrimaryKey(Long id);
}
