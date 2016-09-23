package base;

public class MyInteger {
	private int iValue;
	public MyInteger(int value) {
		iValue = value;
	}

	public int getiValue() {
		return iValue;
	}
	public boolean isEven() {
		if((getiValue() % 2 == 0)) {
		return true;
		}
	return false;
	}
	
	public boolean isOdd() {
		if (getiValue() % 2 != 0) {
		return true;
		}
	return false;
	}
	
	public boolean isPrime() {
		if (iValue > 2 ){
		for (int i = 2; i * 2 < iValue; i++) {
			if(iValue % i == 0) {
				return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd(int iValue) {
		if (iValue % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int value) {
		if (value > 2){
		for (int i = 2; i * 2 < value; i++) {
			if(value % i == 0) {
				return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}
	public static boolean isOdd(MyInteger value){
		return value.isOdd();
	}

	public static boolean isPrime(MyInteger value){
		if (value.iValue > 2){
			for (int i = 2; i * 2 < value.iValue; i++) {
				if(value.iValue % i == 0) {
					return false;
					}
				}
			}
			return true;
		
	}
	public boolean equals(int value){
		return (value==iValue?true:false);
	}
	public boolean equals(MyInteger value){
		return (value.equals(iValue));
	}
	
}
