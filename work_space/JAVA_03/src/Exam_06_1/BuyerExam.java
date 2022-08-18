package Exam_06_1;

public class BuyerExam {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		TV tv = new TV();
		Computer comp = new Computer();
		Audio audio = new Audio();
		
		buyer.buy(tv.price);
		buyer.add(tv.name);
		buyer.summary();
		
		buyer.buy(comp.price);
		buyer.add(comp.name);
		buyer.summary();
		
		buyer.buy(audio.price);
		buyer.add(audio.name);
		buyer.summary();
		
		buyer.buy(tv.price);
		buyer.add(tv.name);
		buyer.summary();


	}

}
