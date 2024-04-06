package com.cykj.mapper;

import com.cykj.pojo.CyAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<CyAdmin> Login(@Param("acc")String acc, @Param("pwd")String pwd);
}
