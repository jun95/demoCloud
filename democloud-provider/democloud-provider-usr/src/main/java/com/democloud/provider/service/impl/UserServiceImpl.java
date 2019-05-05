package com.democloud.provider.service.impl;

import com.democloud.domain.CdUser;
import com.democloud.provider.dao.UserDAO;
import com.democloud.provider.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hwj on 2019/4/30.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public CdUser getUserById(Long id) {
        return userDAO.selectByPrimaryKey(id);
    }
}
