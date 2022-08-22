package exam01;

public abstract interface RemoteControl {
	public static int MIN_VOL = 0;
	public abstract void turnOn();
	//추상메서드는 메서드를 선언상태까지만 한 것.
	//abstract는 생략 가능_컴파일 과정에서 자동으로 붙음

	// 아래는 JAVA8 버젼 이후 추가 가능
	default void setMute() {
		
		System.out.println("VOL 0.");
	}
	static void changeBatt() {
		//static은 클래스 차원의 내용.
		System.out.println("Please change Battery.");
	}
}
