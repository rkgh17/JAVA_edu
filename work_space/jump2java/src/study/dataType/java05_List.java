package study.dataType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class java05_List {
    public static void main(String[] args) {

        // List는 가변형이다.
        // 알아서 크기가 조절됨.
        // 3가지 종류가 있다.
        // 1. ArrayList
        // 2. Vector
        // 3. LinkedList

//        arrayList();
//        vector();
//        linkedList();
    }
    public static void arrayList() {

        // ArrayList
        // 동기화 처리가 되어 있지 않은 대신 처리 속도가 빠르다.

        // add : 데이터 추가
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "100"); // 0인덱스 값 추가
        pitches.add(1, "101");

        // get : 특정 인덱스 값 추출
        System.out.println(pitches.get(0)); // 100

        // set : 값 변경
        pitches.set(2,"102");

        // size : ArrayList 갯수 리턴
        System.out.println(pitches.size()); // 5

        // contains : 값 검색
        System.out.println(pitches.contains("142")); // true

        // remove
        //  - 1. remove(객체) : 삭제한 bool 결과를 리턴함.
        System.out.println(pitches.remove("129")); // true
        //   -2. remove(인덱스) : 삭제하고 삭제한 항목을 리턴.
        System.out.println(pitches.remove(0)); // 100
    }

    public static void vector(){

        // Vector
        // ArrayList와 동일한 내부구조
        // 한가지 다른 점 : Vector는 동기화된 메소드로 구성되어 있기 때문에
        // 멀티 스레드 환경에서 한 개씩 실행됨
        // 안전하게 객체를 추가하고 삭제할 수 있음.
        // 단, 느림

        Vector v = new Vector();

        // 값 추가
        v.add(3);
        v.add(null);
        v.add(1,10);

        // 값 수정
        v.set(0,1);

        // 값 제거
        v.remove(0);
        v.removeAllElements(); // 전부 삭제
        v.clear(); // 전부 삭제

        // 크기 구하기
        System.out.println(v.size()); // 0
        // 물리적 크기 구하기
        System.out.println(v.capacity()); // 10

    }

    public static void linkedList(){

        // linkedList
        // 데이터가 연속적으로 저장되는게 아니라, 데이터부분 + 주소 부분 으로 이루어져 있음
        // 각각 포인터와 주소를 사용하여 연결
        // 각 데이터는 노드라 불리며 자주 삽입, 삭제가 이루어지는 경우 ArrayList보다 많이 사용됨
        // 검색은 느림

        LinkedList li = new LinkedList();

        // 값 추가
        li.add("Hello");
        li.add("Hello");
        li.add(1, "World");
        System.out.println(li); // [Hello, World, Hello]

        // 값 변경
        li.set(2,"Java");
        System.out.println(li); // [Hello, World, Java]

        // 값 삭제
        li.remove(); // 첫 데이터 삭제
        li.remove(1);
        System.out.println(li); // [World]
        li.clear(); // 전부 삭제
        System.out.println(li); // []

        // 크기 구하기
        li.add("Hello");
        li.add("World");
        li.add("Hello");
        li.add("World");
        System.out.println(li.size()); // 4

        // 값 출력
        System.out.println(li.get(0)); // Hello

        // 값 검색
        System.out.println("값 검색(contains) : " + li.contains("Hello")); // true : bool값반환
        System.out.println("값 검색(IndexOf) : " + li.indexOf("Hello")); // 0 : index값 반환

    }
}
