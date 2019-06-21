package org.guo.mybatis.generatorMyBatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.guo.mybatis.generatorMyBatis.po.TOrder;
import org.guo.mybatis.generatorMyBatis.po.TOrderExample;

public interface TOrderMapper {
    long countByExample(TOrderExample example);

    int deleteByExample(TOrderExample example);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    List<TOrder> selectByExample(TOrderExample example);

    int updateByExampleSelective(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);
}