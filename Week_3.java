package java_class;

import java.util.Scanner;

public class Week_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//��һ�⣺������ż���ļ���
		Scanner in1 = new Scanner(System.in);
		System.out.println("��������������������0������");
		int a,odd=0,even=0;
		do {
			a = in1.nextInt();
			if (a % 2 == 1) odd+=1;
			else even+=1;
		} while(a!=0);
		System.out.println("�����У�"+odd+"����ż����"+(even-1)+"��");
		
//�ڶ��⣺����������ֵ
//˼·��ʹ��ѭ��+����ȥ��¼�¶�λ����ÿһλ���֣�ʹ��ѭ��ȥ�ж���ż�Բ��ۼ�����ֵ��������
		Scanner in2 = new Scanner(System.in);
		System.out.println("������һ��10λ���ڵ���������");
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
		System.out.println("�˶�λ��������ֵΪ��"+sum);
	}

}
