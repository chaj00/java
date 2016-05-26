package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//HashMap에 데이터 저장 - key와 value를 한 쌍으로 저장하는 자료구조
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("ab", "java");
		map.put("aa", "servlet");
		map.put("ac", "spring");
		map.put("ag", "hadoop");
		map.put("ah", "mongodb");
		map.put("aj", "mongodb1");
		System.out.println(map.size());
		System.out.println(map.get(5));
		
		//1. map의 모든키를 추출하기 -Set의 형태로 저장
		Set<String> keys = map.keySet();
		//2. Set을 Iteratot로 변환후 작업하기
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("key="+key+":value="+map.get(key));
		}

	}

}
