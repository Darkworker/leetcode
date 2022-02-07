package jianzhi;


public class Case2{
	int k;
	static {
		System.out.println("��̬��ʼ�������");
	}
	{
		k=2;
		System.out.println("��ʼ�������");
	}
	public Case2() {
		System.out.println("���캯��");
	}
	public static void main(String[] args) {
		Case2 c=new Case2();
	}
}