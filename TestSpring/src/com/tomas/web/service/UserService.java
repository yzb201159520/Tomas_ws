package com.tomas.web.service;

import com.tomas.web.instance.Users;

/**
 * Created by thomas on 2017/10/30.
 */
public interface UserService
{
    Users queryById(int userId);
}
