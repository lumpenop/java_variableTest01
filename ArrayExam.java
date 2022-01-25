class ArrayExam{

    int intArr[] = new int[10];
    double doubleArr[] = new double[10];
    String stringArr[] = new String[10];
    char charArr[] = new char[10];

    private void printArrayValue01(){
        System.out.println(intArr);
        for(int i=0; i<intArr.length;i++){
            System.out.println(intArr[i]);
        }

        System.out.println(doubleArr);
        for(int i=0; i<intArr.length;i++){
            System.out.println(doubleArr[i]);
        }

        System.out.println(stringArr);
        for(int i=0; i<intArr.length;i++){
            System.out.println(stringArr[i]);
        }

        System.out.println(charArr);
        for(int i=0; i<intArr.length;i++){
            System.out.println(charArr[i]);
        }
    }

    private void printArrayValue02(){
        for(int i=0; i<intArr.length;i++){
            intArr[i] = i;
            doubleArr[i] = i*0.1;
            stringArr[i] = "a"+i;
            charArr[i]  = (char)('a'+i);
        }

        printArrayValue01();
    }

    private void printArrayValue03(){
        
    }

    public static void main(String[] args){
        new ArrayExam().printArrayValue02();
    }
}