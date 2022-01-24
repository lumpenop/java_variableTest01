class MethodTest{
    public void aa(){
        System.out.println("aa");
    }
    
    protected int bb(){

        return 10;
    }

    public String cc(int i, int j){

        return Integer.toString(i)+Integer.toString(j);
    }

    double dd(int i){

        return i*1.5;
    }

    public static void main(String[] args){
    MethodTest test = new MethodTest();
    test.aa();
    
    System.out.println(test.bb());

    System.out.println(test.cc(4, 7));

    System.out.println(test.dd(4));


    }
}
