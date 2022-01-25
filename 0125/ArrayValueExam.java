class ArrayValueExam{
    public static void main(String[] args){

        new ArrayValue().printArrayValue();
    }
}

class ArrayValue{
    public void printArrayValue(){
        int arr[];
        arr = new int[]{
            0, 1, 2, 3, 4, 5
            };
        System.out.println("주소: " + arr);
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.println(arr[i]);
        }
    }
}