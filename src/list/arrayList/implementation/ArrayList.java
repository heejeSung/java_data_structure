package list.arrayList.implementation;

public class ArrayList {

    private int size = 0;
    private Object[] elementData =new Object[100];

    //addLast
    //데이터 마지막에 추가
    public boolean addLast(Object element){
        elementData[size] = element;
        size++;
        return true;
    }

    //add
    //데이터 원하는 위치에 추가
    public boolean add(int index, Object element){
        // int[] arr = {10,20,30,40}
        // add(2, 25)
        // size 5가 되고, 25가 add[2] 인덱스에 값이 추가되어야 함
        // add(0,20); 인덱스 전부 뒤로 한칸씩 밀림
        // add(3,20); 인덱스 밀리는거 없이 그냥 추가하면 됨

//            for(int i = size -1; index <= i; i--) {
            for(int i = size - 1; index <= i; i--) {
                elementData[i + 1] = elementData[i];
            }
            elementData[index] = element;
            size++;
        return true;
    }

    // toString
    public String toString(){
        String str = "[";

        for(int i=0; i < size; i++){
            str += elementData[i];
            if(i < size - 1){
                str += ",";
            }
        }

        return str + "]";
    }


    // 인덱스 삭제
    public Object remove(int index){

        Object removed = elementData[index];
        for(int i = index + 1; i <= size - 1; i++){
            elementData[i-1] = elementData[i];
        }
        size--;
        elementData[size] = null;
        return removed;
    }

    // 첫번째 인덱스 삭제
    public Object removeFirst(){
        return remove(0);
    }

    // 마지막 인덱스 삭제
    public Object removeLast(){
        return remove(size-1);
    }


    // 인덱스 값 가져오기
    public Object get(int index){
        return elementData[index];
    }

    public int size(){
        return size;
    }

    public Object indexOf(Object o) {

        for(int i=0; i < size; i++) {
            if (o.equals(elementData[i])){
                return i; // 값 비교해서 같으면 index 반환
            }
        }
        return new Exception("존재하지 않는 element");
    }

    public ListIterator listIterator(){
        return new ListIterator();
    }

    public class ListIterator {
        private int nextIndex = 0;

        public boolean hasNext(){
            return nextIndex < size;
        }

        public Object next() {
//            Object returnData = elementData[nextIndex];
//            nextIndex++;
//            return returnData;
            return elementData[nextIndex++];
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public Object previous() {
            return elementData[--nextIndex];
            // -- 처리가 먼저 인 이유
            // 현재 nextIndex가 존재 하지 않는 값을 가리키기 때문.
            // hasNext  0 -> 1 -> 2 -> (x) (nextIndex 위치)
            // hasPrevious 0 <- 1 <- 2 <- (x) (nextIndex 위치)
        }

        public void add(Object element){
            ArrayList.this.add(nextIndex++,element);
        }

        public void remove(){
            ArrayList.this.remove(nextIndex - 1);
            nextIndex--;
        }


    }
}
