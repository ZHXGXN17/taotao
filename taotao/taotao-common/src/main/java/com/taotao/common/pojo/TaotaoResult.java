/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TaotaoResult.java   
 * @Package com.taotao.common.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月26日 上午9:42:51   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author robin
 * 淘淘商城自定义响应结构
 *
 */
public class TaotaoResult implements Serializable{
	
	/** 定义jackson对象. */
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	/** 响应业务状态status. */
	private Integer status;
	
	/** 响应消息msg. */
	private String msg;
	
	/** 响应中的数据data. */
	private Object data;
	
	public static TaotaoResult build(Integer status, String msg, Object data) {
        return new TaotaoResult(status, msg, data);
    }

    public static TaotaoResult ok(Object data) {
        return new TaotaoResult(data);
    }

    public static TaotaoResult ok() {
        return new TaotaoResult(null);
    }

    public TaotaoResult() {

    }

    public static TaotaoResult build(Integer status, String msg) {
        return new TaotaoResult(status, msg, null);
    }

    public TaotaoResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public TaotaoResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为TaotaoResult对象
     * 
     * @param jsonData json数据
     * @param clazz TaotaoResult中的object类型
     * @return
     */
    public static TaotaoResult formatToPojo(String jsonData, Class<?> clazz) {
    		try {
    			if(clazz == null) {
    				return MAPPER.readValue(jsonData, TaotaoResult.class);
    			}
    			
    			JsonNode jsonNode = MAPPER.readTree(jsonData);
    			JsonNode data = jsonNode.get("data");
    			Object obj = null;
    			if(clazz != null) {
    				if(data.isObject()) {
    					obj = MAPPER.readValue(data.traverse(), clazz);
    				}else if(data.isTextual()) {
    					obj = MAPPER.readValue(data.asText(), clazz);
    				}
    			}
    			
    			return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
    }
    
    
    /**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     */
    public static TaotaoResult format(String json) {
        try {
            return MAPPER.readValue(json, TaotaoResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     * 
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
    public static TaotaoResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
}
