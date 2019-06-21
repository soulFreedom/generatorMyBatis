package org.guo.mybatis.generatorMyBatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.guo.mybatis.generatorMyBatis.po.TItem;
import org.guo.mybatis.generatorMyBatis.po.TItemExample;

public interface TItemMapper {
    long countByExample(TItemExample example);

    int deleteByExample(TItemExample example);

    int insert(TItem record);

    int insertSelective(TItem record);

    List<TItem> selectByExample(TItemExample example);

    int updateByExampleSelective(@Param("record") TItem record, @Param("example") TItemExample example);

    int updateByExample(@Param("record") TItem record, @Param("example") TItemExample example);
}