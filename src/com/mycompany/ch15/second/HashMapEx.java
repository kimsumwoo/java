package com.mycompany.ch15.second;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("김선우",100);
		map.put("전지현",100);
		map.put("장동건",100);
		map.put("고소영",100);
//		map.put("김선우","ㅁㄴㅇㅁㄴㅇㅁㄴ);
		
		map.forEach((key, value)->{
			System.out.println(key + ":" + value);
		});
			
		System.out.println("----------------");
		
		for(String strkey : map.keySet() ) {
			Integer strValue = map.get(strkey);
			System.out.println(strkey + ":" + strValue);
		}
	}

}
