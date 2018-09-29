package jianzhi;
/**
 * 第二种：利用静态变量，该静态变量会在类初始化的时候初始化一个实例
 * 缺点：过早的创建实例，导致内存占用
 * @author symfony
 *
 */
public class Singleton2 {
	/**
	 * 隐藏构造函数
	 */
	private Singleton2() {
		
	}
	private static Singleton2 s2=new Singleton2();
	
	public static Singleton2 getSingletone2() {
		return s2;
	}
}
