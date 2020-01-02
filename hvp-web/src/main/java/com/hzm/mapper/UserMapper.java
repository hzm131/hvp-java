package com.hzm.mapper;

import com.hzm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper //表示这是一个mybatis的mapper类
@Repository //dao层
public interface UserMapper {
    User Sel(int id);
}
