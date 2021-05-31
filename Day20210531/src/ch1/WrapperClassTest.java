package ch1;

public class WrapperClassTest {

	public static void main(String[] args) {
		byte b =1;
		short s= 234;
		int i = 56789;
		long l = 1234567890L;
		
		Byte wByte = b;
		Short wShort = s;
		Integer wInt = i;
		Long wLong = l;
		System.out.println(wByte.byteValue());
		System.out.println(wShort.shortValue());
		System.out.println(wInt.intValue());
		System.out.println(wLong.longValue());
		
	}

}
