public class TestDataType {

	public static void main(String[] args){
		int a = 10;
		byte b = 20;
		int a2 = 010;
		int a3 = 0xf;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Integer.toBinaryString(a));//将十进制转化为二进制
		System.out.println(Integer.toOctalString(a));//将十进制转化为八进制
		System.out.println(Integer.toHexString(a));//将十进制转化为十六进制

		int a5 = 10;
		long a6 = 300;
		byte b2 = 100;//如果数据的大小没有超过byte/short/char的表述范围，则可以自动转型。
		
		long a7 = 1112321232L;//加L将数自动转化为long类型的数型，不用l误解为1
		long l = 3;
		//longl2 = l+3;//L问题

	}
}
public void Test(){
}
