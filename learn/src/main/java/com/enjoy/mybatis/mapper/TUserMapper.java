package com.enjoy.mybatis.mapper;

import com.enjoy.mybatis.entity.TUser;

public interface TUserMapper {
    TUser selectByPrimaryKey(Integer id);
}
