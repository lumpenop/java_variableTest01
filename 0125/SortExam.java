public class SortExam{
    public static void main(String[] args){
        int arr[] = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
        int len = arr.length-1;
        int bin = 0;

        for(int j=len; j>0; j--){

            for(int i=0; i<j; i++){
                
                if(arr[i] > arr[i+1]){
                    bin = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = bin;
                }
            }
        }
        for(int i=0; i<len+1; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}