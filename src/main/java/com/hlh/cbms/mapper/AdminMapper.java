package com.hlh.cbms.mapper;

import com.hlh.cbms.domain.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {

    Admin loginName(@Param("aName") String aName, @Param("password") String password);
}
