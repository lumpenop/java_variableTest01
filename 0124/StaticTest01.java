class Test{
    int a;
    static int b;
    
    public void aa(){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(this.b);
    }

    public void bb(){

    }

    public static void cc(){
        // System.out.println(a); // static이 아니기 때문에 접근 불가
        // System.out.println(this.a); //this 사용 불가
        System.out.println(b); // 접근 가능
        // System.out.println(this.b); //this 사용 불가
        

    }

    public static void dd(){

    }
}

public class StaticTest01{
    public static void main(String[] args){
        System.out.println("static 멤버 필드");
        Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = new Test();

        System.out.println("test1 = " + test1);
        System.out.println("test2 = " + test2);
        System.out.println("test3 = " + test3);

        System.out.println("non-static 변수 a 값 변경 전");

        System.out.println("test1.a = " + test1.a);
        System.out.println("test2.a = " + test2.a);
        System.out.println("test3.a = " + test3.a);

        test1.a = 100;

        System.out.println("non-static a 값 변경 후");

        System.out.println("test1.a = " + test1.a);
        System.out.println("test2.a = " + test2.a);
        System.out.println("test3.a = " + test3.a);


        System.out.println("======================");

        System.out.println("static 변수 b 값 변경 전");

        System.out.println("test1.a = " + test1.b);
        System.out.println("test2.a = " + test2.b);
        System.out.println("test3.a = " + test3.b);

        test1.b = 200;

        System.out.println("non-static b 값 변경 후");

        System.out.println("test1.a = " + test1.b);
        System.out.println("test2.a = " + test2.b);
        System.out.println("test3.a = " + test3.b);

        test1 = test2;

        System.out.println("test1 = " + test1);
        System.out.println("test2 = " + test2);
        System.out.println("test3 = " + test3);
    }

    static{
        System.out.println("static 영역, 메인보다 먼저 실행 \n");

    }
}