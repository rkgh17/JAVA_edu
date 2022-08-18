package Exam_06_1;

public class Buyer {
	int money = 1000;
	String [] cart = new String[10];
	int index = 0;
	
	public void buy(int price) {
		this.money = money - price;
	}
	
	public void add(String name) {
		this.cart[this.index] = name;
		this.index++;		
	}
	
	public void summary() {
		System.out.print("구입한 물건의 목록 : ");
		for(int i = 0; i<this.index ; i++) {
			System.out.printf("%s\t",cart[i]);
		}
		System.out.println();
		System.out.printf("사용 금액 : %d\n남은 금액 : %d\n",1000-this.money,this.money);
		System.out.println("-----------------------------------------------------------------------------");
	}
	
}
