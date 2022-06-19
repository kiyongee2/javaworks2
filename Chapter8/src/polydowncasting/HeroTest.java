package polydowncasting;

import java.util.ArrayList;

class Hero {
	String name;
	
	public Hero(String name) { 
		this.name = name; 
	}
	
	public void attack() {
		System.out.println("�ָ� ������");
	}
	
	public void showInfo() {
		System.out.println("���� : " + name);
	}
}

class Warrior extends Hero{
	public Warrior(String name) {
		super(name);
	}
	
	public void groundCutting() {
		System.out.println("���� ������");
	}
}

class Archer extends Hero{
	public Archer(String name) {
		super(name);
	}
	
	public void fireArrow() {
		System.out.println("��ȭ�� ���");
	}
}

class Wizard extends Hero{
	public Wizard(String name) {
		super(name);
	}
	
	public void freezing() {
		System.out.println("�󸮱�");
	}
}

public class HeroTest {

	public static void main(String[] args) {
		ArrayList<Hero> heroList = new ArrayList<>();
		heroList.add(new Warrior("����"));
		heroList.add(new Archer("�ü�"));
		heroList.add(new Wizard("������"));
		
		for(Hero hero : heroList) {
			hero.attack();
			if(hero instanceof Warrior) {
				Warrior war = (Warrior)hero;
				war.showInfo();
				war.groundCutting();;
			}
			else if(hero instanceof Archer) {
				Archer arc = (Archer)hero;
				arc.showInfo();
				arc.fireArrow();
			}
			else if(hero instanceof Wizard) {
				Wizard wiz = (Wizard)hero;
				wiz.showInfo();
				wiz.freezing();
			}
			else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
		

	}

}
