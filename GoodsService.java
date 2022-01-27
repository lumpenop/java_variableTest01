/**
   상품에 대한 CRUD작업 : B/L
    : 전체검색, 등록, 수정, 삭제......

*/
class GoodsService{

   private Goods [] goodsArr = new Goods [10];
   
   static int count; //배열에 Goods가 저장된 개수를 체크!!!

	/**
	  초기치 데이터를 세팅하는 메소드 작성
	   String [][] data = new String [][]{
		  {"A01" ,"새우깡", "2500" , "짜고 고소하다"},
		  {"A02" ,"콘칩", "1500" , "고소하다"},
		  {"A03" ,"허니버터칩", "3500" , "달고 짜고 맛나다."},
		  {"A04" ,"감자깡", "1800" , "감자의 맛"},
		  {"A05" ,"고구마깡", "3000" , "고구마의 맛"}
	  };
	*/
	public void init(String [][] data){ 
      for(int i=0; i < data.length ; i++){ //data.length는 행의 길이
        goodsArr[i] = this.create( data[i] );
        GoodsService.count++;
	  }
	}
   
     /**
	   Goods를 생성해서 리턴해주는 메소드 작성
	 */
     private Goods create(String [] row){ //{"A01" ,"새우깡", "2500" , "짜고 고소하다"}
          Goods goods = new Goods();
		  goods.setCode(row[0]);
		  goods.setName(row[1]);
		  goods.setPrice(Integer.parseInt(row[2]));
		  goods.setExplain(row[3]);

		  return goods;
	 }


    /**
	   등록하기
	     : 등록전에 상품코드가 중복인지를 체크해서 중복이 아닐때 등록한다. 

		@return : int형
		  ( 0이면 상품코드중복, 
		    1이면 등록 성공, 
		    -1이면 배열의 길이를 벗어나서 등록안됨) 
	*/
	public int insert(Goods goods){//상품코드, 상품이름, 가격, 수량
        if(goodsArr.length == GoodsService.count){ 
             return -1;
		}
		//중복체크 
		if( this.selectByCode( goods.getCode()) != null){
            return 0;
		}

		//중복아니면 등록
        goodsArr[GoodsService.count] = goods;
		GoodsService.count++;

        return 1;
	}
   

	/**
	  전체검색
	   @return : Goods타입의 배열(배열이름 하나에 여러개의 상품을 담아서 리턴)
	*/
    public  Goods[] selectAll(){

          return goodsArr;
	}


	/**
	  상품코드에 해당해하는 상품검색
	   return : 만약 인수로 전달된 code에 해당하는 정보가 있으면 Goods를리틴하고
	            없으면 null을 리턴한다. 
	*/
    public Goods selectByCode(String code){

          return null;
	}


	/**
	  상품코드에 해당하는 상품가격, 설명 수정하기 
	  @return : boolean형은 수정이완료되면 true, 아니면 false
	*/
	public boolean update(Goods goods){ //상품코드, 가격, 설명

        return false;
	}
}