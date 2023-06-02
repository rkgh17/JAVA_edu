package study.dataType;

public class javaString {
    public static void main(String[] args){

        // equals : 문자열 비교
//        String a = "hello";
//        String b = "java";
//        String c = "hello";
//
//        System.out.println(a.equals(b)); // false
//        System.out.println(a.equals(c)); // true

        // == : 문자열 비교
//        String a = "hello";
//        String b = new String("hello");
//        System.out.println(a.equals(b)); // true
//        System.out.println(a == b); // false : 값은 같지만 객체가 다름.

        // indexOf : 특정 문자열 위치 반환(인덱스)
//        String a = "Hello Java";
//        System.out.println(a.indexOf("Java")); // 6

        // contains : 문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴함
//        String a = "Hello Java";
//        System.out.println(a.contains("Java")); // true

        // charAt : 특정 인덱스의 문자를 리턴
//        String a = "Hello Java";
//        System.out.println(a.charAt(6)); // J

        // replaceAll : 앞의 문자열을 뒤의 문자열로 바꿈
        // replace 참고 https://mine-it-record.tistory.com/127
//        String a = "Hello Java";
//        System.out.println(a.replaceAll("Java", "World")); // Hello World

        // substring : 문자열 중 특정 부분을 뽑아낸다
//        String a = "Hello Java";
//        System.out.println(a.substring(1)); // 1부터 끝까지 - ello Java
//        System.out.println(a.substring(0,4)); // 0부터 4까지 - Hell

        // toUpperCase : 대문자 치환
        // toLowerCase : 소문자 치환
//        String a = "Hello Java";
//        System.out.println(a.toUpperCase()); // HELLO JAVA
//        System.out.println(a.toLowerCase()); // hello java

        // split : 구분자로 나누어 문자열 배열로 리턴하는 메서드
//        String a = "a:b:c:d";
//        String[] result = a.split(":");

    }
}
