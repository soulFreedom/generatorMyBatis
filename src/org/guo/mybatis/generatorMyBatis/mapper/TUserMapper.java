package org.guo.mybatis.generatorMyBatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.guo.mybatis.generatorMyBatis.po.TUser;
import org.guo.mybatis.generatorMyBatis.po.TUserExample;

public interface TUserMapper {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);
}