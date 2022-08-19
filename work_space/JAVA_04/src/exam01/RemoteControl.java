package exam01;

public interface RemoteControl {
	public static int MIN_VOL = 0;
	public void turnOn();
	default void setMute() {
		System.out.println("VOL 0.");
	}
	static void changeBatt() {
		System.out.println("Please change Battery.");
	}
}
