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
		System.out.println(Integer.toBinaryString(a));//��ʮ����ת��Ϊ������
		System.out.println(Integer.toOctalString(a));//��ʮ����ת��Ϊ�˽���
		System.out.println(Integer.toHexString(a));//��ʮ����ת��Ϊʮ������

		int a5 = 10;
		long a6 = 300;
		byte b2 = 100;//������ݵĴ�Сû�г���byte/short/char�ı�����Χ��������Զ�ת�͡�
		
		long a7 = 1112321232L;//��L�����Զ�ת��Ϊlong���͵����ͣ�����l���Ϊ1
		long l = 3;
		//longl2 = l+3;//L����

	}
}