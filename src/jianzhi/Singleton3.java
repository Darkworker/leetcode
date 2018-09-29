package jianzhi;
/**
 * 第三种：通过加锁来避免多线程下多次创建的问题
 * @author symfony
 *
 */
public class Singleton3 {
	private Singleton3() {
		
	}
	private static Singleton3 instance=null;
	public static Singleton3 getInstance() {
		Object lock=new Object();
		if(instance==null) {
		synchronized (lock) {
			if(instance==null)
				instance=new Singleton3();
		}
		}
		return instance;
	}
}
