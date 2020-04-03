package java_class;

import java.util.Scanner;

public class Week_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//第一题：时间显示的转换（东八区与世界协调时）
//思路：使用if-else，
		//0-59（00:00-00:59）转换为前一日1600-1659；
		//100-759（01:00-0:59）转换为前一日1700-2359；
		//800-2359(08:00-23:59)转换为同一日0-1559；
		
		Scanner in1 = new Scanner(System.in);
		int eight, standard;
		System.out.println("请输入北京时间：");
		eight = in1.nextInt();
		if (eight>=0&&eight<=759)
			{
			standard = eight + 1600;
			System.out.println("世界协调时为: 前一日"+standard);
			}
		else 
			{
			standard = eight - 800;
			System.out.println("世界协调时为: 本日"+standard);
			}
		
//第二题：信号强度数字的解读
		//十位数字含义：1.unreadable;2.barely readable;
		//3.readable with considerable difficulty;4.readable with no difficulty;
		//5.perfectly readable;
		//个位数字含义:1.faint;2.very weak;3.weak;4.fair;5.fairly good;
		//6.good;7.moderately strong;8.strong;9.extremely strong;
//思路：检测数字范围是否合法，然后使用数组存储数字，再switch-case进行输出；
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("请输入信号强度：");
		int check = in2.nextInt();
		int a[] = {0,0};
		a[0] = check/10;
		a[1] = check-a[0]*10; 
		if (a[0]>0&&a[0]<6&&a[1]!=0)
		{
			switch (a[0])
			{
			case 1: System.out.println("unreadable"); break;
			case 2: System.out.println("barely readable"); break;
			case 3: System.out.println("readable with considerable difficulty"); break;
			case 4: System.out.println("readable with no difficulty"); break;
			case 5: System.out.println("perfectly readable"); break;
			}
			switch (a[1])
			{
			case 1: System.out.println("faint"); break;
			case 2: System.out.println("very weak"); break;
			case 3: System.out.println("weak"); break;
			case 4: System.out.println("fair"); break;
			case 5: System.out.println("fairly good"); break;
			case 6: System.out.println("good"); break;
			case 7: System.out.println("moderately strong"); break;
			case 8: System.out.println("strong"); break;
			case 9: System.out.println("extremely strong"); break;
			}
		}
		else System.out.println("数字超过合法范围");
	}

}
