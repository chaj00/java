package thread.sync;

public class Toilet {
	public synchronized void open(String name){
		System.out.println(name+"이 문열고 들어옴^^");
		for(int i=1; i<=100000000;i++){
			if(i==10000){
				System.out.println(name+"이 끙~~~~아~~~~~~");
			}
		}
		System.out.println(name+"이 문열고 나감^^");
	}

}
