package util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("swing");
		set.add("java");		
		System.out.println(set.size());
		//HashSet을 Iterator로 변환
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String token = it.next();
			System.out.println(token);
		}

	}

}
