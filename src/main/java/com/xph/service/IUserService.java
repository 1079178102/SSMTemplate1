package com.xph.service;

import com.xph.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {

    //查询所有账号
    public List<User> findAll() throws Exception;

    //添加账户
    public int addUser(User user) throws Exception;

    //根据用户名更新密码
    public int updatePasswordByUsername(User user) throws Exception;

    //根据用户名删除账户
    public int deleteUserByUsername(String username) throws Exception;

    //测试事务回滚用的
    public void transactionManager(User user1,User user2)throws Exception;

    //验证用户登录
    public int findUserByUsernamePassword(User user);
}
