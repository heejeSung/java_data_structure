package list.arrayList.implementation;

import list.arrayList.implementation.ArrayList.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.addLast(10);
        al.addLast(20);
        al.addLast(30);
        al.addLast(40);
        System.out.println();
        System.out.println("ArrayList Begin");
        System.out.println("al = " + al);

        System.out.println();
        System.out.println();
        System.out.println("## 데이터 추가 테스트");
        System.out.println();

        System.out.println("G) 마지막 인덱스에 추가");
        System.out.println("W) addLast(50) result = " + al.addLast(50));
        System.out.println("T) ArrayList result = " + al);

        System.out.println();

        System.out.println("G) 특정 인덱스 위치에 추가");
        System.out.println("W) al.add(2,25) = " + al.add(2,25));
        System.out.println("T) ArrayList result = " + al);

        System.out.println();
        System.out.println();
        System.out.println("## 데이터 확인 테스트 ");
        System.out.println();

        System.out.println("G) toString 메서드 .toString()은 생략 가능 " );
        System.out.println("W.T) al.toString() = " + al.toString());

        System.out.println();
        System.out.println();
        System.out.println("## 데이터 삭제 테스트");
        System.out.println();

        System.out.println("G) 인덱스 삭제");
        System.out.println("W) al.remove(1) result = " + al.remove(1));
        System.out.println("T) ArrayList result = " + al);

        System.out.println();

        System.out.println("G) 첫번째 인덱스 삭제 테스트");
        System.out.println("W) al.removeFirst() result = " +  al.removeFirst());
        System.out.println("T) ArrayList result = " + al);

        System.out.println();

        System.out.println("G) 마지막 인덱스 삭제 테스트");
        System.out.println("W) al.removeLast() result = " + al.removeLast());
        System.out.println("T) ArrayList result = " + al);

        System.out.println();
        System.out.println();
        System.out.println("## 데이터 가져오기 테스트");
        System.out.println();

        System.out.println("G) 인덱스 값 확인");
        System.out.println("G) ArrayList 현재 상태 al = " + al);
        System.out.println("W) al.get(1)");
        System.out.println("T) al.get(1) result = " + al.get(1));

        System.out.println();
        System.out.println();
        System.out.println("## 데이터 크기 테스트");
        System.out.println();
        System.out.println("G) 데이터(리스트) 크기 확인");
        System.out.println("G) ArrayList 현재 상태 al = " + al);
        System.out.println("W) al.size()");
        System.out.println("T) al.size() result = " + al.size());

        System.out.println();
        System.out.println("G) 엘리먼트 값으로 인덱스 탐색");
        System.out.println("G) ArrayList 현재 상태 al = " + al);
        System.out.println("W1) al.indexOf(40)");
        System.out.println("T1) al.indexOf(40) result= " + al.indexOf(40));
        System.out.println("W2) al.indexOf(50)");
        System.out.println("T2) al.indexOf(50) result= " + al.indexOf(50));

        System.out.println();
        System.out.println();
        System.out.println("## iterator  테스트");
        System.out.println();

        System.out.println("G) ArrayList 현재 상태 al = " + al);
        System.out.println("G) ListIterator 객체 생성 ");
        ListIterator lt = al.listIterator();
        System.out.println("W) next(), hasNext() 구현 후 반복문 실행 ");

        while(lt.hasNext()){
            System.out.println("T) lt.hasNext Result ) " + lt.next());
        }

        System.out.println();

        System.out.println("G) ArrayList 현재 상태 al = " + al);
        System.out.println("W) previous(), hasPrevious() 구현 후 반복문 실행");
        while(lt.hasPrevious()){
            System.out.println("T) lt.hasPrevious Result ) " + lt.previous());
        }

        System.out.println();
        System.out.println();
        System.out.println("## iterator - add() 테스트");
        System.out.println();

        System.out.println("G) ArrayList 현재 상태 al = " + al);
        System.out.println("W) lt.hasNext() -> if(number == 30) lt.add(35)");
        while(lt.hasNext()){
            int number = (int) lt.next();
            if(number == 30) {
                lt.add(35);
            }
        }
        System.out.println("T) lt.add(35) result al = " + al);
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("## iterator - remove() 테스트");
        System.out.println();

        System.out.println("G) ArrayList 현재 상태 al = " + al);
        System.out.println("W) lt.hasNext() -> if(number == 30) lt.remove()");
        while(lt.hasNext()){
            int number = (int) lt.next();
            if(number == 30){
                lt.remove();
            }
        }
        System.out.println("T) if(number == 30) lt.remove() result al = " + al);


    }
}
