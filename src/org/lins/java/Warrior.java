package org.lins.java;

import java.util.Scanner;

public class Warrior {
	private static final Warrior[] wu = null;
	private int bood;
	private String name;
	private String skill;
	
	public int getBood() {
		return bood;
	}

	public void setBood(int bood) {
		this.bood = bood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public Warrior(int bood, String name, String skill) {
		super();
		this.bood = bood;
		this.name = name;
		this.skill = skill;
	}
	
	public Warrior() {
		super();
	}

	public static Warrior [] Wu(){
		Warrior [] wu=new Warrior[5];
		Warrior wu1=new Warrior();
		wu1.setName("刘备");
		wu1.setBood(4);
		wu1.setSkill("仁德");
		
		Warrior wu2=new Warrior();
		wu2.setName("赵云");
		wu2.setBood(4);
		wu2.setSkill("龙胆");
		
		Warrior wu3=new Warrior();
		wu3.setName("曹操");
		wu3.setBood(4);
		wu3.setSkill("奸雄");
		
		Warrior wu4=new Warrior();
		wu4.setName("孙权");
		wu4.setBood(4);
		wu4.setSkill("制衡");
		
		Warrior wu5=new Warrior();
		wu5.setName("周瑜");
		wu5.setBood(3);
		wu5.setSkill("反间");
		
		wu[0]=wu1;
		wu[1]=wu2;
		wu[2]=wu3;
		wu[3]=wu4;
		wu[4]=wu5;
		return wu;

	}
	public static void wuJiang(Warrior [] wu){
		System.out.println("序号"+" "+" 武将"+" "+"血量"+" "+"技能");
		for (int i = 0; i < wu.length; i++) {
			System.out.print(" "+(i+1)+"  "+wu[i].getName()+"  "+wu[i].getBood()
			+"  "+wu[i].getSkill());
			System.out.println();
		}
	}
	public static void choose(){
		System.out.println("=========欢迎来到迷你版三国杀=========");
		System.out.println("==================================");
		System.out.println("三国杀是一款以三国为背景的桌游");
		System.out.println("迷你版三国杀是一款以java开发的控制台游戏程序");
		System.out.println("===================================");
		Warrior [] wu=Warrior.Wu();
		Warrior.wuJiang(wu);
		System.out.println("请输入你要选择的武将序号[1/2/3/4/5]:");
		Scanner sc=new Scanner(System.in);
		int xuhao=sc.nextInt();
		System.out.println("你选择的是："+wu[xuhao-1].getName());
		int com=(int)(Math.random()*5+1);
		int com1;
		if(com==xuhao){
			do{
			com1=(int)(Math.random()*5+1);
			com=com1;
			}while(com!=com1);
		}
		System.out.println("电脑选择的是："+wu[com-1].getName());
	}
}
