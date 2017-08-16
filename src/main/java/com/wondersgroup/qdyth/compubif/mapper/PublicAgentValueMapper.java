package com.wondersgroup.qdyth.compubif.mapper;

import com.wondersgroup.qdyth.compubif.pojo.PublicAgentValue;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicAgentValueMapper {
    long countByExample(PublicAgentValueExample example);

    int deleteByExample(PublicAgentValueExample example);

    int insert(PublicAgentValue record);

    int insertSelective(PublicAgentValue record);

    List<PublicAgentValue> selectByExample(PublicAgentValueExample example);

    int updateByExampleSelective(@Param("record") PublicAgentValue record, @Param("example") PublicAgentValueExample example);

    int updateByExample(@Param("record") PublicAgentValue record, @Param("example") PublicAgentValueExample example);
}