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
		wu1.setName("����");
		wu1.setBood(4);
		wu1.setSkill("�ʵ�");
		
		Warrior wu2=new Warrior();
		wu2.setName("����");
		wu2.setBood(4);
		wu2.setSkill("����");
		
		Warrior wu3=new Warrior();
		wu3.setName("�ܲ�");
		wu3.setBood(4);
		wu3.setSkill("����");
		
		Warrior wu4=new Warrior();
		wu4.setName("��Ȩ");
		wu4.setBood(4);
		wu4.setSkill("�ƺ�");
		
		Warrior wu5=new Warrior();
		wu5.setName("���");
		wu5.setBood(3);
		wu5.setSkill("����");
		
		wu[0]=wu1;
		wu[1]=wu2;
		wu[2]=wu3;
		wu[3]=wu4;
		wu[4]=wu5;
		return wu;

	}
	public static void wuJiang(Warrior [] wu){
		System.out.println("���"+" "+" �佫"+" "+"Ѫ��"+" "+"����");
		for (int i = 0; i < wu.length; i++) {
			System.out.print(" "+(i+1)+"  "+wu[i].getName()+"  "+wu[i].getBood()
			+"  "+wu[i].getSkill());
			System.out.println();
		}
	}
	public static void choose(){
		System.out.println("=========��ӭ�������������ɱ=========");
		System.out.println("==================================");
		System.out.println("����ɱ��һ��������Ϊ����������");
		System.out.println("���������ɱ��һ����java�����Ŀ���̨��Ϸ����");
		System.out.println("===================================");
		Warrior [] wu=Warrior.Wu();
		Warrior.wuJiang(wu);
		System.out.println("��������Ҫѡ����佫���[1/2/3/4/5]:");
		Scanner sc=new Scanner(System.in);
		int xuhao=sc.nextInt();
		System.out.println("��ѡ����ǣ�"+wu[xuhao-1].getName());
		int com=(int)(Math.random()*5+1);
		int com1;
		if(com==xuhao){
			do{
			com1=(int)(Math.random()*5+1);
			com=com1;
			}while(com!=com1);
		}
		System.out.println("����ѡ����ǣ�"+wu[com-1].getName());
	}
}
