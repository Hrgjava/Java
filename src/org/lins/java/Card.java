package org.lins.java;

import java.util.Scanner;

public class Card {

	public static String [][] card() {
		String[][] card = new String[104][2];
		for (int i = 0; i < 42; i++) {
			if (i < 21) {
				card[i][0] = "÷��";
			} else {
				card[i][0] = "����";
			}
			card[i][1] = "ɱ";
		}
		for (int i = 42; i < 84; i++) {
			card[i][0] = "����";
			card[i][1] = "��";
		}
		for (int i = 84; i < 104; i++) {
			card[i][0] = "����";
			card[i][1] = "��";
		}
		return card;
	}
	public static void star(){
		card();
		System.out.println("�Ƿ�ʼ��Ϸ[y/n]");
		Scanner sc=new Scanner(System.in);
		String bg=sc.next();
		int numPlay=0,numCom=0;
		String [] arrayPlay=new String [numPlay];
		String [] arrayCom=new String [numCom];
		if(bg.equals("y")){
			//	kapai��kapai1�ֱ�Ϊ��Һ͵������ƣ�numPlay��numComΪ��Һ͵������Ƽ���
			int kapai,kapai1;
			
			System.out.println("���Ƹ������");
			for (int i = 0; i < 4; i++) {
				kapai=(int)(Math.random()*104+1);
				System.out.print("[����"+(i+1)+"]("+card()[kapai][0]+") "+card()[kapai][1]);
				//����
		
				numPlay++;
			}
			System.out.println();
			System.out.println("���Ƹ�:����");
			for (int i = 0; i < 4; i++) {
				kapai1=(int)(Math.random()*104+1);
				System.out.print("[����"+(i+1)+"]("+card()[kapai1][0]+") "+card()[kapai1][1]);
				numCom++;
			}
			for (int i = 0; i <2; i++) {
				 int pk=(int)(Math.random()*104+1);
				 
			}
		}
		
	}
}
