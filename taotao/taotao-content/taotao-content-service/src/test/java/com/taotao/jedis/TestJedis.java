/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TestJedis.java   
 * @Package com.taotao.jedis   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年6月2日 上午11:08:04   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.jedis;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

/**
 * @author robin
 *
 */
public class TestJedis {
	
	@Test
	public void testJedis() throws Exception{
		// 创建一个jedis对象，指定服务的ip、端口号
		Jedis jedis = new Jedis("192.168.126.129", 6379);
		// 直接操作数据库 
		jedis.set("jedis-key", "1234");
		String result = jedis.get("jedis-key");
		System.out.println(result);
		// 关闭jedis
		jedis.close();
	}
	
	@Test
	public void testJedisPool() throws Exception{
		// 创建一个数据库连接池对象(单例),指定服务的ip、端口号
		JedisPool pool = new JedisPool("192.168.126.129", 6379);
		// 从连接池中获得连接
		Jedis jedis = pool.getResource();
		// 使用jedis操作数据库(方法级别)
		String result = jedis.get("jedis-key");
		System.out.println("result:" + result);
		// 关闭连接
		jedis.close();
		// 关闭连接池
		pool.close();
	}

	@Test
	public void testJedisCluster() throws Exception{
		// 创建一个jedisCluster对象，构造参数Set类型，集合中每个元素是HostAndPort类型
		Set<HostAndPort> nodes = new HashSet<HostAndPort>();
		// 向集合中添加节点
		nodes.add(new HostAndPort("192.168.126.129", 7001));
		nodes.add(new HostAndPort("192.168.126.129", 7002));
		nodes.add(new HostAndPort("192.168.126.129", 7003));
		nodes.add(new HostAndPort("192.168.126.129", 7004));
		nodes.add(new HostAndPort("192.168.126.129", 7005));
		nodes.add(new HostAndPort("192.168.126.129", 7006));
		JedisCluster cluster = new JedisCluster(nodes);
		// 直接使用jedisCluster操作redis，自带连接池，可以是单例
		cluster.set("cluster-test", "hello jedis cluster");
		String result = cluster.get("cluster-test");
		System.out.println("result2:" + result);
		// 关闭
		cluster.close();
	}
}
