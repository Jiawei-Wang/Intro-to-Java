package java_class;

import java.util.Scanner;

public class Week_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//��һ�⣺ʱ����ʾ��ת����������������Э��ʱ��
//˼·��ʹ��if-else��
		//0-59��00:00-00:59��ת��Ϊǰһ��1600-1659��
		//100-759��01:00-0:59��ת��Ϊǰһ��1700-2359��
		//800-2359(08:00-23:59)ת��Ϊͬһ��0-1559��
		
		Scanner in1 = new Scanner(System.in);
		int eight, standard;
		System.out.println("�����뱱��ʱ�䣺");
		eight = in1.nextInt();
		if (eight>=0&&eight<=759)
			{
			standard = eight + 1600;
			System.out.println("����Э��ʱΪ: ǰһ��"+standard);
			}
		else 
			{
			standard = eight - 800;
			System.out.println("����Э��ʱΪ: ����"+standard);
			}
		
//�ڶ��⣺�ź�ǿ�����ֵĽ��
		//ʮλ���ֺ��壺1.unreadable;2.barely readable;
		//3.readable with considerable difficulty;4.readable with no difficulty;
		//5.perfectly readable;
		//��λ���ֺ���:1.faint;2.very weak;3.weak;4.fair;5.fairly good;
		//6.good;7.moderately strong;8.strong;9.extremely strong;
//˼·��������ַ�Χ�Ƿ�Ϸ���Ȼ��ʹ������洢���֣���switch-case���������
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("�������ź�ǿ�ȣ�");
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
		else System.out.println("���ֳ����Ϸ���Χ");
	}

}
