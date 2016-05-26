package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//HashMap�� ������ ���� - key�� value�� �� ������ �����ϴ� �ڷᱸ��
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
		
		//1. map�� ���Ű�� �����ϱ� -Set�� ���·� ����
		Set<String> keys = map.keySet();
		//2. Set�� Iteratot�� ��ȯ�� �۾��ϱ�
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("key="+key+":value="+map.get(key));
		}

	}

}
