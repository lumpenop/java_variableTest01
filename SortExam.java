public class SortExam{
    public static void main(String[] args){
        int arr[] = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
        int len = arr.length-1;
        int bin = 0;

        for(int j=0; j<len-1; j++){

            for(int i=j+1; i<len; i++){
                
                if(arr[j] > arr[i]){
                    bin = arr[i];
                    arr[i] = arr[j];
                    arr[j] = bin;
                }
            }
        }
        for(int i=0; i<len+1; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}