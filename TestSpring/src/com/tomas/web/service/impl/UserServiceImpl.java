package com.tomas.web.service.impl;

import com.tomas.web.dao.itrface.UsersDAO;
import com.tomas.web.instance.Users;
import com.tomas.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by thomas on 2017/10/30.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersDAO usersDAO;

    /**\
     * （1）、事务的传播性：@Transactional(propagation=Propagation.REQUIRED)
     如果有事务, 那么加入事务, 没有的话新建一个(默认情况下)
     （2）、事务的超时性：@Transactional(timeout=30) //默认是30秒
     注意这里说的是事务的超时性而不是Connection的超时性，这两个是有区别的
     （3）、事务的隔离级别：@Transactional(isolation = Isolation.READ_UNCOMMITTED)
     读取未提交数据(会出现脏读, 不可重复读) 基本不使用
     （4）、回滚：
     指定单一异常类：@Transactional(rollbackFor=RuntimeException.class)

     指定多个异常类：@Transactional(rollbackFor={RuntimeException.class, Exception.class})

     该属性用于设置需要进行回滚的异常类数组，当方法中抛出指定异常数组中的异常时，则进行事务回滚。
     （5）、只读：@Transactional(readOnly=true)
     该属性用于设置当前事务是否为只读事务，设置为true表示只读，false则表示可读写，默认值为false。
     * @param userId
     * @return
     */
    @Override
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED,timeout = 30,isolation = Isolation.REPEATABLE_READ,
            rollbackFor = {ClassNotFoundException.class,ArrayIndexOutOfBoundsException.class})
    public Users queryById(int userId) {
        System.out.println("public Users queryById(int userId) { 执行了");
        return this.usersDAO.findById(userId);
    }
}
