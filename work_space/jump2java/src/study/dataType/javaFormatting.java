package study.dataType;

public class javaFormatting {
    public static void main(String[] args){

        // String.format : 문자열 안에 특정한 값을 바꿔야 할 경우 사용하는 기법


        // 숫자 바로 대입 : %d
//        System.out.println(String.format("I eat %d apples.", 3)); // I eat 3 apples.

        // 문자열 바로 대입 : %s
//        System.out.println(String.format("I eat %s apples.", "five")); // I eat five apples.

        // 숫자 값을 나타내는 변수로 대입
//        int number = 3;
//        System.out.println(String.format("I eat %d apples.", number)); // I eat 3 apples.

        // 2개 이상 값을 넣기
//        int number = 10;
//        String day = "three";
//        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day)); // I ate 10 apples. so I was sick for three days.

        // 문자열 포맷 코드
//        코드	설명
//        %s	문자열(String)
//        %c	문자 1개(character)
//        %d	정수(Integer)
//        %f	부동소수(floating-point)
//        %o	8진수
//        %x	16진수
//        %%	Literal % (문자 % 자체)

        // 정렬과 공백
//        System.out.println(String.format("%10s", "hi")); //         hi : 10칸 이후 hi 출력
//        System.out.println(String.format("%-10sjane", "hi")); // hi        jane : hi 10칸 이후 jane출력

        // 소수점 출력
//        System.out.println(String.format("%.4f", 3.42134234)); // 3.4213

        // System.out.printf
//        System.out.printf("I eat %d apples", 3); // I eat 3 apples

    }
}
