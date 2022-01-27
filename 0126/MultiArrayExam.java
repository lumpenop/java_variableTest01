class MultiArrayExam{
    int [][] arr1;
    int [][] arr2 = new int[3][];
    int [][] arr3 = new int[3][5];
    int [][] arr4 = {
        {1,2,3},
        {4,5,6}
    };

    public void test(){
        System.out.println("arr1: " + arr1);
        System.out.println("arr2: " + arr2);
        System.out.println("arr2[0]: " + arr2[0]);
        System.out.println("arr3: " + arr3);
        System.out.println("arr3[0]: " + arr3[0]);
        System.out.println("arr3[0][0]: " + arr3[0][0]);
    }

    public void improvedFor(int[][] arr){
        for(int[] row: arr){
            for(int j: row){
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args){
        MultiArrayExam ma = new MultiArrayExam();
        ma.improvedFor(ma.arr4);
    }
}