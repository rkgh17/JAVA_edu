package exam04;

public class CarExam {
	public static void main(String[] args) {
		Car car1 = new Car(100);
		System.out.println("car1 : " + car1.currentSpeed);
		car1.speedUp();
		System.out.println("car1 : " + car1.currentSpeed);
		System.out.println("------------------------------");
		
		SportsCar car2 = new SportsCar(150);
		System.out.println("car2 : " + car2.currentSpeed);
		car2.speedUp();
		// 1. 자식클래스에서 재정의된(오버라이딩) 메서드가 있으면 실행
		// 2. 없으면 부모 클래스의 메서드
		System.out.println("car2 : " + car2.currentSpeed);
		car2.turboSpeedUp(); // 자식 클래스 메서드
		System.out.println("car2 : " + car2.currentSpeed);
		
		
	}
}