package thread.sync;

import thread.sync.Toilet;

//�����尴ü
public class Person extends Thread {
	String name;;
	Toilet toilet;
	
	public Person(String name, Toilet toilet){
		super();
		this.name = name;
		this.toilet = toilet;
		
	}
	
	@Override
	public void run(){
		toilet.open(name);
	}
}
