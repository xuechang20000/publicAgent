package com.wondersgroup.qdyth.compubif.mapper;

import com.wondersgroup.qdyth.compubif.pojo.PublicAgentLog;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicAgentLogMapper {
    long countByExample(PublicAgentLogExample example);

    int deleteByExample(PublicAgentLogExample example);

    int insert(PublicAgentLog record);

    int insertSelective(PublicAgentLog record);

    List<PublicAgentLog> selectByExample(PublicAgentLogExample example);

    int updateByExampleSelective(@Param("record") PublicAgentLog record, @Param("example") PublicAgentLogExample example);

    int updateByExample(@Param("record") PublicAgentLog record, @Param("example") PublicAgentLogExample example);
}