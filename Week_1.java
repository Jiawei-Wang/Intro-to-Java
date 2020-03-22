package java_class;

import java.util.Scanner;

//���϶����϶�ת��
public class Week_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F, C;
		Scanner in = new Scanner(System.in);
		System.out.println("�����뻪���¶ȣ�");
		F = in.nextInt();
		C = (int)((F-32)*5/9.0);
		System.out.println("�����¶�Ϊ��");
		System.out.println(C);
	}
}
