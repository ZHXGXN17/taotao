/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TestPageHelper.java   
 * @Package com.taotao.pagehelper   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月26日 下午2:58:26   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;

/**
 * @author robin
 *
 */
public class TestPageHelper {
	
	@Test
	public void testPageHelper() throws Exception{
		// 1.在mybatis的配置文件中配置分页插件
		// 2.在执行查询之前配置分页条件，使用pageHelper的静态方法
		PageHelper.startPage(1, 10);
		// 3.执行查询
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
		// 创建example对象
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		List<TbItem> list = itemMapper.selectByExample(example);
		// 取分页信息，使用PageInfo对象获取
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		System.out.println("总记录数:" + pageInfo.getTotal());
		System.out.println("总记页数:" + pageInfo.getPages());
		System.out.println("返回的记录数:" + list.size());
	}

}
