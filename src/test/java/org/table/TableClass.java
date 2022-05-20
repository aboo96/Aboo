package org.table;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TableClass {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("java");
		li.add("java@gmail.com");
		li.add("12354");
		String string = li.get(2);
System.out.println(string);


		Map<String,String> m = new LinkedHashMap();
		m.put("name", "alice");
		m.put("email", "alice@gmail.com");
		m.put("password", "25896");
		String string2 = m.get("password");
	
		System.out.println(string2);
		
		
		List<List<String>> l = new ArrayList<>();
		List<String> l1 = new ArrayList<>();
		l1.add("philip");
		l1.add("philip@gmail.com");
		l1.add("11111");
		
		List<String> l2 = new ArrayList<>();
		l2.add("ravi");
		l2.add("ravi@gmail.com");
		l2.add("2222");
		l.add(l1);
		l.add(l2);
		
		
		List<String> list = l.get(0);
		String string3 = list.get(0);
		System.out.println(string3);
		
		
		List<Map<String,String>> lis = new ArrayList<>();
		Map<String, String> k = new LinkedHashMap<>();
		k.put("name", "ab");
		k.put("email", "ab@gmail.com");
		k.put("password", "555");
		Map<String,String> h = new LinkedHashMap<>();
		h.put("name", "kk");
		h.put("email", "k@gmail.com");
		h.put("password", "8888");
		lis.add(k);
		lis.add(h);
		Map<String, String> map = lis.get(0);
		String string4 = map.get("name");
		System.out.println(string4);
		
	}

}
