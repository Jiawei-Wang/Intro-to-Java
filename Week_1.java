package java_class;

import java.util.Scanner;

//华氏度摄氏度转换
public class Week_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F, C;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入华氏温度：");
		F = in.nextInt();
		C = (int)((F-32)*5/9.0);
		System.out.println("摄氏温度为：");
		System.out.println(C);
	}

}
