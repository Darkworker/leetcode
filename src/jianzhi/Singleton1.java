package jianzhi;
/**
 * 第一种： 多线程下会创建多个实例
 * @author symfony
 *
 */
public final class Singleton1 {
	private Singleton1() {
		// TODO Auto-generated constructor stub
	}
	private static Singleton1 s1;
	public static Singleton1 getSingleton1() {
		if(s1==null)
			s1=new Singleton1();
		return s1;
	}
}
