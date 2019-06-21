package org.guo.mybatis.generatorMyBatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.guo.mybatis.generatorMyBatis.po.TOrderdetail;
import org.guo.mybatis.generatorMyBatis.po.TOrderdetailExample;

public interface TOrderdetailMapper {
    long countByExample(TOrderdetailExample example);

    int deleteByExample(TOrderdetailExample example);

    int insert(TOrderdetail record);

    int insertSelective(TOrderdetail record);

    List<TOrderdetail> selectByExample(TOrderdetailExample example);

    int updateByExampleSelective(@Param("record") TOrderdetail record, @Param("example") TOrderdetailExample example);

    int updateByExample(@Param("record") TOrderdetail record, @Param("example") TOrderdetailExample example);
}