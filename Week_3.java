package java_class;

import java.util.Scanner;

public class Week_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//第一题：奇数、偶数的计数
		Scanner in1 = new Scanner(System.in);
		System.out.println("请输入若干正整数，以0结束：");
		int a,odd=0,even=0;
		do {
			a = in1.nextInt();
			if (a % 2 == 1) odd+=1;
			else even+=1;
		} while(a!=0);
		System.out.println("奇数有："+odd+"个，偶数有"+(even-1)+"个");
		
//第二题：求数字特征值
//思路：使用循环+数组去记录下多位数的每一位数字，使用循环去判断奇偶性并累加特征值，最后输出
		Scanner in2 = new Scanner(System.in);
		System.out.println("请输入一个10位以内的正整数：");
		int b = in2.nextInt();
		int u=1,check[]= {0,0,0,0,0,0,0,0,0,0,0,0};
		while (b>0) {
			check[u]=b%10;
			u+=1;
			b=b/10;
		}
	    int sum=0;
		for(int i=1;i<u;i++)
		{
			if ((check[i]+i)%2==0) sum+=Math.pow(2, (i-1));
		}
		System.out.println("此多位数的特征值为："+sum);
	}

}
