public class MeMoryApart{
    public static void main(String[] args){
        MultiArray ma = new MultiArray();

        ma.printArr(ma.array99());
    }
}

class MultiArray{
    // 정수형 2차원 배열 8*9
    // 메소드 이름 array99로 구구단 출력
    public int[][] array99(){

        int[][] arr = new int[8][9];
        for(int i=0;i<8;i++){
            for(int j=0; j<9; j++){
                arr[i][j] = (i+2) * (j+1);
            }
        }
        return arr;
    }

    public void printArr(int[][] arr){
        
        for(int[] row: arr){
            for(int i: row){
                System.out.println(i);
            }
        }
    }
}