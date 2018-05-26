package com.qhfc.dao;

import com.qhfc.entity.QhWeek;
import com.qhfc.entity.QhWeekExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QhWeekMapper {
    int countByExample(QhWeekExample example);

    int deleteByExample(QhWeekExample example);

    int deleteByPrimaryKey(String weekId);

    int insert(QhWeek record);

    int insertSelective(QhWeek record);

    List<QhWeek> selectByExample(QhWeekExample example);

    QhWeek selectByPrimaryKey(String weekId);

    int updateByExampleSelective(@Param("record") QhWeek record, @Param("example") QhWeekExample example);

    int updateByExample(@Param("record") QhWeek record, @Param("example") QhWeekExample example);

    int updateByPrimaryKeySelective(QhWeek record);

    int updateByPrimaryKey(QhWeek record);
}