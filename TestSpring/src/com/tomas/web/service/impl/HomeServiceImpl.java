package com.tomas.web.service.impl;

import com.tomas.web.instance.Users;
import com.tomas.web.service.HomeService;
import org.springframework.stereotype.Service;

/**
 * Created by thomas on 2017/10/30.
 */
@Service
public class HomeServiceImpl implements HomeService
{

    @Override
    public Users getHomeUser(int userId1, int userId2) {
        System.out.println("public Users getHomeUser ÷¥––¡À");
        System.out.println("paramters "+userId1+userId2);
        return null;
    }

}
