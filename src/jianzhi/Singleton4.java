package jianzhi;

public class Singleton4 {
	private Singleton4() {
		
	}
	public static Singleton4 getInstance(){
		return Nest.instance;
	}
	static class Nest{
		private Nest() {
			
		}
		static final Singleton4 instance=new Singleton4(); 
	}
}
