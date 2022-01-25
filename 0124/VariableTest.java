class VariableTest{
    public static void main(String[] args){

        Test test = new Test();

        test.aa();
    }
}

class Test{

    int a; // global variable
    private String name;

    public void aa(){
        int a = 10; // local variable
        System.out.println(a);
        System.out.println(this.a);
    }

    public void bb(){

    }
}