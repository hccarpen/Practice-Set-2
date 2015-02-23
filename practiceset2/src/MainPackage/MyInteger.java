package MainPackage;
// created by https://github.com/hccarpen
public class MyInteger {
	public int value;
	
	public static void main(String[] args) {
		System.out.println("Nothing to see here!");
	}
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int get() {
		return this.value;
	}
	
	public boolean isEven() {
		return isEven(this.value);
	}
	public boolean isOdd() {
		return isOdd(this.value);
	}
	public boolean isPrime() {
		return isPrime(this.value);
	}
	
	public boolean isEven(MyInteger a) {
		return isEven(a.value);
	}
	public boolean isOdd(MyInteger a) {
		return isOdd(a.value);
	}
	public boolean isPrime(MyInteger a) {
		return isPrime(a.value);
	}
	
	public boolean equals(int a) {
		if (a == this.value)
			return true;
		return false;
	}
	public boolean equals(MyInteger a) {
		if (a.value == this.value)
			return true;
		return false;
	}
	
	public static int parseInt(char[] a) {
		return Integer.parseInt(new String(a));
	}
	public static int parseInt(String a) {
		return Integer.parseInt(new String(a));
	}
	
	private static boolean isEven(int a) {
		if ((a%2) == 0)
			return true;
		return false;
	}
	private static boolean isOdd(int a) {
		if ((a%2) != 0)
			return true;
		return false;
	}
	private static boolean isPrime(int a) {
	    if (isEven(a)) return false;
	    for (int i=3; i*i<=a; i+=2) {
	        if ((a%i) == 0)
	            return false;
	    }
	    return true;
	}
}
