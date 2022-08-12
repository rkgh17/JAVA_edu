package Exam_06;

public class Car {
	
	//필드_맴버변수
	String company;
	String model;
	int maxSpeed;
	int currentSpeed;
	
	//생성자
	public Car() {
		this.company = "BMW";
		this.model = "BMW500";
		this.maxSpeed = 350;
		this.currentSpeed = 100;
	}
	
	//생성자 오버로딩
	public Car (String company, String model, int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	
	//메서드
	public void speedUp() {
		this.currentSpeed = this.currentSpeed + 1;
	}
	//메서드 오버로딩
	public void speedUp(int speed) {
		this.currentSpeed = this.currentSpeed + speed;
	}
	
	public int speedDown () {
		this.currentSpeed = this.currentSpeed - 1;
		return this.currentSpeed;
	}
	
	public int speedDown (int speed) {
		this.currentSpeed = this.currentSpeed - speed;
		return this.currentSpeed;
	}

}
