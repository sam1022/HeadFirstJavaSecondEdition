public class Test {
	private char x;
	
	public void setX(char x){
		this.x = x;
	}
	
	public void print_test(char x){
		System.out.println("Input character: " + x);
		System.out.println("Instance character: " + this.x);
	}
	
	public static void main(String[] args) {
		char x = 'a';
		Test t1 = new Test();
		t1.setX('c');
		t1.print_test(x);
	}
}