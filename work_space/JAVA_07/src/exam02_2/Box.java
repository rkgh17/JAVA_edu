package exam02_2;

public class Box<T> {
	
	private T t;

	public T getBox() {
		return t;
	}

	public void setBox(T t) {
		this.t = t;
	}
}
// <T>는 객체생성시 정의한 타입으로 
// 클래스 전체에 동일하게 적용된다.
// <String>이면 위의 클래스의 T는 모두 String
// <Integer>이면 위의 클래스의 T는 모두 Integer
// <Member>이면 위의 클래스의 T는 모두 Member
