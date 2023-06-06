package study.dataType;

import java.util.HashMap;

public class java08_Map {
    public static void main(String[] args) {

        // Key - Value로 이루어진 자료형

        // HashMap : Map 인터페이스를 상속, Map 자료형의 기본유형
        HashMap<String, String> map = new HashMap<>();

        // 이외의 Map 자료형
        // 1. LinkedHashMap
        //      입력된 순서대로 데이터를 저장하는 특징을 가지고 있다.
        //
        // 2. TreeMap
        //      입력된 key의 오름차순 순서로 데이터를 저장하는 특징을 가지고 있다.

        // put : HashMap 자료 입력
        map.put("people", "사람");
        map.put("baseball", "야구");

        // get : HashMap 자료 추출
        System.out.println("HashMap 출력(people) : "+ map.get("people")); // 사람 출력
        System.out.println();

        // getOrDefault : null과 Default
        System.out.println("HashMap NULL 출력 :"+map.get("java")); // java key는 없으므로 null 출력
        System.out.println("HashMap NULL Default 출력 :"+ map.getOrDefault("java","자바"));
        System.out.println();

        // containsKey : key가 있는지를 조사
        System.out.println("HashMap containsKey 출력 :"+ map.containsKey("people")); // true
        System.out.println();

        // remove : 해당하는 key를 지우고, 삭제한 value값을 리턴함
        System.out.println("HashMap remove 출력 :"+ map.remove("people")); // 사람
        System.out.println("HashMap remove 결과 :"+ map.get("people")); // people 키를 지웠으므로 null
        System.out.println();

        // size : 전체 사이즈 리턴
        System.out.println("HashMap Size 출력 :"+ map.size()); // 1
        System.out.println();

        // keySet : Map의 모든 Key를 모아서 리턴
        System.out.println("HashMap keySet 출력 :"+ map.keySet());
        System.out.println();
    }
}
