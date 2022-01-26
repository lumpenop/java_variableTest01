//TwoDmArrayExam.java
public class TwoDmArrayExam{
	//main메소드에서
	
		//TwoDmArray객체생성
		
		//TwoDmArray객체의 make2DmArray메소드 호출
		
		//TwoDmArray객체의 print2DmArray메소드 호출

    public static void main(String[] args){
        TwoDmArray tda = new TwoDmArray();

        tda.make2DmArray();
        tda.print2DmArray();
    }
	
}

class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	String[][] twoDmArray = new String[10][];
	//메소드 make2DmArray
    public void make2DmArray(){
        //twoDmArray 배열에  값을 할당 = 대입
        for(int i=0; i<twoDmArray.length;i++){
            twoDmArray[i] = new String[i+1];
            for(int j=0; j<i+1; j++){
                twoDmArray[i][j] = (i+1) + "동"+ (j+1) +"호";
            }
        }
    }

    public void print2DmArray(){
        for(int i=0; i<twoDmArray.length;i++){
            if(i>0){
                    System.out.print(String.format("%" + i + "s"," "));
            }
            for(int j=i; j<twoDmArray.length; j++){
                
                System.out.print(twoDmArray[j][i] + " ");
                if(j == 9){
                    System.out.println("");
                }
            }
        }
    }
		
		
	//메소드 print2DmArray- 별찍기 모양 참고
	//	twoDmArray 배열의 값을 주어진형식으로 출력
		
}
////////////////////////////////////////////////////
