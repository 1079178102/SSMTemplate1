package com.xph.dao;

import com.xph.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {

    //查询所有账号
    @Select("select * from users")
    public List<User> findAll() throws Exception;

    //添加账户
    @Insert("insert into users(username,password,status) values(#{username},#{password},#{status})")
    public int addUser(User user) throws Exception;

    //根据用户名更新密码
    @Update("update users set password = #{password} where username = #{username}")
    public int updatePasswordByUsername(User user) throws Exception;

    //根据用户名删除账户
    @Delete("delete from users where username = #{username}")
    public int deleteUserByUsername(String username);
}
