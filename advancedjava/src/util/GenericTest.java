package util;

import java.util.Date;

import gui.tool.Page1;


/*
 *  E - Element
 *  K - Key
 *  V - Value
 *  T - Type
 */

class GenericDemo<T>{
	private T obj;
	public void setObj(T obj){
		this.obj = obj;
	}
	public T getObj(){
		return obj;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		GenericDemo<Date> obj1 = new GenericDemo<Date>();
		obj1.setObj(new Date());
		System.out.println(obj1.getObj());
		
		GenericDemo<Page1> obj2 = new GenericDemo<Page1>();
		obj2.setObj(new Page1());
		System.out.println(obj2.getObj());

	}

}
