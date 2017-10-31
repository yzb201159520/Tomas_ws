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
     * ��1��������Ĵ����ԣ�@Transactional(propagation=Propagation.REQUIRED)
     ���������, ��ô��������, û�еĻ��½�һ��(Ĭ�������)
     ��2��������ĳ�ʱ�ԣ�@Transactional(timeout=30) //Ĭ����30��
     ע������˵��������ĳ�ʱ�Զ�����Connection�ĳ�ʱ�ԣ����������������
     ��3��������ĸ��뼶��@Transactional(isolation = Isolation.READ_UNCOMMITTED)
     ��ȡδ�ύ����(��������, �����ظ���) ������ʹ��
     ��4�����ع���
     ָ����һ�쳣�ࣺ@Transactional(rollbackFor=RuntimeException.class)

     ָ������쳣�ࣺ@Transactional(rollbackFor={RuntimeException.class, Exception.class})

     ����������������Ҫ���лع����쳣�����飬���������׳�ָ���쳣�����е��쳣ʱ�����������ع���
     ��5����ֻ����@Transactional(readOnly=true)
     �������������õ�ǰ�����Ƿ�Ϊֻ����������Ϊtrue��ʾֻ����false���ʾ�ɶ�д��Ĭ��ֵΪfalse��
     * @param userId
     * @return
     */
    @Override
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED,timeout = 30,isolation = Isolation.REPEATABLE_READ,
            rollbackFor = {ClassNotFoundException.class,ArrayIndexOutOfBoundsException.class})
    public Users queryById(int userId) {
        System.out.println("public Users queryById(int userId) { ִ����");
        return this.usersDAO.findById(userId);
    }
}
