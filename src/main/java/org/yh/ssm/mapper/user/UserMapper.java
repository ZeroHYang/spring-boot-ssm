package org.yh.ssm.mapper.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.yh.ssm.bean.User;

@Mapper
public interface UserMapper {

//    @Select("select * from t_user where id = #{id}")
    public User getUser(String id);
}
