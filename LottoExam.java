import java.util.Random;

public class LottoExam{
    
    public int[] Sort(int[] arr){

        int len = arr.length;
        int bin = 0;

        for(int j=0; j<len; j++){
            for(int i=j+1; i<len; i++){
                if(arr[j] < arr[i]){
                    bin = arr[i];
                    arr[i] = arr[j];
                    arr[j] = bin;
                }
            }
        }
        return arr;
    }

    public int[] allNumber(){

        int arr[] = new int[6];
        boolean flag = true;

        for(int i=0; i<6; i++){
            int randNum = new Random().nextInt(45) + 1;
            if(!isDuplication(randNum, arr, i)){
                arr[i] = randNum;
            }else{
                i -= 1;
            }
        }
        return arr;
    }

    public boolean isDuplication(int randNum, int[] arr, int i){
        for(int j=0; j<i; j++){
            if(randNum == arr[j]){
                return true;
            }
        }
        return false;
    }

    public void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        LottoExam le = new LottoExam();

        for(int i=0; i<5; i++){
            int arr[] = le.allNumber();
            arr = le.Sort(arr);
            le.printArr(arr);    
        }
    }
}