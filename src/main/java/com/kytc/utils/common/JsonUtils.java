package com.kytc.utils.common;

import com.alibaba.fastjson.JSON;

public class JsonUtils {
	public static String toJSON(Object obj){
		if(obj==null){
			return "{}";
		}else{
			return JSON.toJSONString(obj);
		}
	}
	public static <T> T change(String str,Class<T> clazz){
		return JSON.parseObject(str, clazz);
	}
	public static <T> T change(Object obj,Class<T> clazz){
		return JSON.parseObject(toJSON(obj), clazz);
	}
}
