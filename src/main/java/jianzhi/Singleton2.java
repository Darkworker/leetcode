package jianzhi;
/**
 * �ڶ��֣����þ�̬�������þ�̬�����������ʼ����ʱ���ʼ��һ��ʵ��
 * ȱ�㣺����Ĵ���ʵ���������ڴ�ռ��
 * @author symfony
 *
 */
public class Singleton2 {
	/**
	 * ���ع��캯��
	 */
	private Singleton2() {
		
	}
	private static Singleton2 s2=new Singleton2();
	
	public static Singleton2 getSingletone2() {
		return s2;
	}
}
