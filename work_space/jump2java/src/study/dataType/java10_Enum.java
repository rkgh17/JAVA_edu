package study.dataType;

public class java10_Enum {

    // Enum : 여러 개의 상수 집합
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {

        // Enum 출력
        System.out.println("Enum 출력1 :"+ CoffeeType.AMERICANO);
        System.out.println("Enum 출력2 :"+ CoffeeType.ICE_AMERICANO);
        System.out.println("Enum 출력3 :"+ CoffeeType.CAFE_LATTE);
        System.out.println();

        // Enum - for와 values를 활용한 전체 값 출력
        for(CoffeeType type : CoffeeType.values()){
            System.out.println("Enum for-values 출력 :"+ type);
        }
        System.out.println();
    }
}
