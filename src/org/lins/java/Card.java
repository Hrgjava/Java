package org.lins.java;

import java.util.Scanner;

public class Card {

	public static String [][] card() {
		String[][] card = new String[104][2];
		for (int i = 0; i < 42; i++) {
			if (i < 21) {
				card[i][0] = "梅花";
			} else {
				card[i][0] = "黑桃";
			}
			card[i][1] = "杀";
		}
		for (int i = 42; i < 84; i++) {
			card[i][0] = "方块";
			card[i][1] = "闪";
		}
		for (int i = 84; i < 104; i++) {
			card[i][0] = "红桃";
			card[i][1] = "桃";
		}
		return card;
	}
	public static void star(){
		card();
		System.out.println("是否开始游戏[y/n]");
		Scanner sc=new Scanner(System.in);
		String bg=sc.next();
		int numPlay=0,numCom=0;
		String [] arrayPlay=new String [numPlay];
		String [] arrayCom=new String [numCom];
		if(bg.equals("y")){
			//	kapai，kapai1分别为玩家和电脑手牌，numPlay、numCom为玩家和电脑手牌计数
			int kapai,kapai1;
			
			System.out.println("发牌给：玩家");
			for (int i = 0; i < 4; i++) {
				kapai=(int)(Math.random()*104+1);
				System.out.print("[卡牌"+(i+1)+"]("+card()[kapai][0]+") "+card()[kapai][1]);
				//到这
		
				numPlay++;
			}
			System.out.println();
			System.out.println("发牌给:电脑");
			for (int i = 0; i < 4; i++) {
				kapai1=(int)(Math.random()*104+1);
				System.out.print("[卡牌"+(i+1)+"]("+card()[kapai1][0]+") "+card()[kapai1][1]);
				numCom++;
			}
			for (int i = 0; i <2; i++) {
				 int pk=(int)(Math.random()*104+1);
				 
			}
		}
		
	}
}
