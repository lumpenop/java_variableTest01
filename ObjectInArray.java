public class ObjectInArray{
    public static void main(String[] args){
        ObjectOne oo = new ObjectOne();
        ObjectOne arr[] = new ObjectOne[5];

        System.out.println("arr 배열 주소: " + arr);
        for(int i=0; i<arr.length; i++){
            arr[i] = new ObjectOne();
            System.out.println("변수 값: " + arr[i].a);
            System.out.println("객체 주소: " + arr[i]);
            
            
        }
        System.out.println("===== 객체 할당 =====" );
        for(int i=0; i<arr.length; i++){
            arr[i].a = i;
            System.out.println("변수 값: " + arr[i].a);
            System.out.println("객체 주소: " + arr[i]);
            
        }

    }
}

class ObjectOne{
    public int a;
}