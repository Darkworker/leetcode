package jianzhi;


public class Case2{
	int k;
	static {
		System.out.println("静态初始化代码块");
	}
	{
		k=2;
		System.out.println("初始化代码块");
	}
	public Case2() {
		System.out.println("构造函数");
	}
	public static void main(String[] args) {
		Case2 c=new Case2();
	}
}