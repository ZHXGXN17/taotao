package com.qhfc.dao;

import com.qhfc.entity.QhDaliy;
import com.qhfc.entity.QhDaliyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QhDaliyMapper {
    int countByExample(QhDaliyExample example);

    int deleteByExample(QhDaliyExample example);

    int deleteByPrimaryKey(String daliyId);

    int insert(QhDaliy record);

    int insertSelective(QhDaliy record);

    List<QhDaliy> selectByExample(QhDaliyExample example);

    QhDaliy selectByPrimaryKey(String daliyId);

    int updateByExampleSelective(@Param("record") QhDaliy record, @Param("example") QhDaliyExample example);

    int updateByExample(@Param("record") QhDaliy record, @Param("example") QhDaliyExample example);

    int updateByPrimaryKeySelective(QhDaliy record);

    int updateByPrimaryKey(QhDaliy record);
}