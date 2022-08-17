package exam01;
//자식객체
public class SportsCar extends Car{
	
	public SportsCar(int currentSpeed) {
		super(currentSpeed);
		this.currentSpeed = currentSpeed;
	}
	public void turboSpeedUp() {
		this.currentSpeed = this.currentSpeed + 10;
	}
}
