public class MethodOverloadExam{
    public static void main(String[] args){
        OverloadedMethod over = new OverloadedMethod();

        over.setOverload(10);
        System.out.println(over.getOverload());

        System.out.println("== 오버로딩 ==");

        over.setOverload("11");
        System.out.println(over.getOverload());

        over.setOverload('a');
        // private로 막혀있는 char 타입 메소드가 아닌
        // public int 타입 메소드로 호출됨 (char -> int 자동 변환)
        
        System.out.println(over.getOverload());


        
    }
}

class OverloadedMethod{
    private int i; // 전역변수 선언

    public void setOverload(int i){
        this.i = i; // 매개변수 i의 값을 전역변수 i에 대입
    }

    public int getOverload(){
        return i; // 전역변수 i의 값 리턴
    }

    // setOverload 오버로딩
    public void setOverload(String i){
        this.i = Integer.parseInt(i);
    }

    private void setOverload(char ch){
        this.i = i;
        System.out.println("char 호출");
    }
}

