/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TestJedisSpring.java   
 * @Package com.taotao.jedis   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年6月3日 下午2:58:57   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.jedis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author robin
 *
 */
public class TestJedisSpring {
	
	@Test
	public void testJedisClient() throws Exception{
		// 初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
	    // 从容器中获取jedisClient对象
		JedisClient client = context.getBean(JedisClient.class);
		client.set("jedisClient-test", "mytest");
		String result = client.get("jedisClient-test");
		System.out.println(result);
	}

}
