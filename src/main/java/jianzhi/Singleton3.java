package jianzhi;
/**
 * �����֣�ͨ��������������߳��¶�δ���������
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
