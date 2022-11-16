package list.array.api;

/**
 * Array api 사용법
 */
public class Main {

    public static void main(String[] args){

        // 크기가 4인 int 형태의 배열을 선언
        int[] intArray1 = new int[4];

        // 배열 인덱스 값 저장
        intArray1[0] = 10;
        intArray1[1] = 20;
        intArray1[2] = 30;
        intArray1[3] = 40;

        // int 형태의 배열의 크기와 값 선언
        int[] intArray2 = {100,200,300,400};

        // int 형태의 배열의 크기와 값 선언 (intArray2와 같음)
        int[] intArray3 = new int[]{1000,2000,3000,4000};

        // intArray1 출력
        System.out.println("intArray1[0] = " + intArray1[0]);
        System.out.println("intArray1[1] = " + intArray1[1]);
        System.out.println("intArray1[2] = " + intArray1[2]);
        System.out.println("intArray1[3] = " + intArray1[3]);

        // while) intArray2 출력
        int i=0;
        while(intArray2.length > i){
            System.out.println("while) intArray2[" + i + "] = " + intArray2[i]);
            i++;
        }

        // for) intArray3 출력
        for(i = 0; i < intArray3.length; i++){
            System.out.println("for) intArray3[" + i + "] = " + intArray3[i]);
        }







    }
}
