package b16_기본클래스;

public class ObjectEx{
	private String className = "ObjectEx";
	
	@Override
	public String toString() {
		return className;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		
		ObjectEx oex = new ObjectEx();
		System.out.println(oex);
		
	}
	
}
