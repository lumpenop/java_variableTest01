/**
   ��ǰ�� ���� CRUD�۾� : B/L
    : ��ü�˻�, ���, ����, ����......

*/
class GoodsService{

   private Goods [] goodsArr = new Goods [10];
   
   static int count; //�迭�� Goods�� ����� ������ üũ!!!

	/**
	  �ʱ�ġ �����͸� �����ϴ� �޼ҵ� �ۼ�
	   String [][] data = new String [][]{
		  {"A01" ,"�����", "2500" , "¥�� ����ϴ�"},
		  {"A02" ,"��Ĩ", "1500" , "����ϴ�"},
		  {"A03" ,"��Ϲ���Ĩ", "3500" , "�ް� ¥�� ������."},
		  {"A04" ,"���ڱ�", "1800" , "������ ��"},
		  {"A05" ,"������", "3000" , "������ ��"}
	  };
	*/
	public void init(String [][] data){ 
      for(int i=0; i < data.length ; i++){ //data.length�� ���� ����
        goodsArr[i] = this.create( data[i] );
        GoodsService.count++;
	  }
	}
   
     /**
	   Goods�� �����ؼ� �������ִ� �޼ҵ� �ۼ�
	 */
     private Goods create(String [] row){ //{"A01" ,"�����", "2500" , "¥�� ����ϴ�"}
          Goods goods = new Goods();
		  goods.setCode(row[0]);
		  goods.setName(row[1]);
		  goods.setPrice(Integer.parseInt(row[2]));
		  goods.setExplain(row[3]);

		  return goods;
	 }


    /**
	   ����ϱ�
	     : ������� ��ǰ�ڵ尡 �ߺ������� üũ�ؼ� �ߺ��� �ƴҶ� ����Ѵ�. 

		@return : int��
		  ( 0�̸� ��ǰ�ڵ��ߺ�, 
		    1�̸� ��� ����, 
		    -1�̸� �迭�� ���̸� ����� ��Ͼȵ�) 
	*/
	public int insert(Goods goods){//��ǰ�ڵ�, ��ǰ�̸�, ����, ����
        if(goodsArr.length == GoodsService.count){ 
             return -1;
		}
		//�ߺ�üũ 
		if( this.selectByCode( goods.getCode()) != null){
            return 0;
		}

		//�ߺ��ƴϸ� ���
        goodsArr[GoodsService.count] = goods;
		GoodsService.count++;

        return 1;
	}
   

	/**
	  ��ü�˻�
	   @return : GoodsŸ���� �迭(�迭�̸� �ϳ��� �������� ��ǰ�� ��Ƽ� ����)
	*/
    public  Goods[] selectAll(){

          return goodsArr;
	}


	/**
	  ��ǰ�ڵ忡 �ش����ϴ� ��ǰ�˻�
	   return : ���� �μ��� ���޵� code�� �ش��ϴ� ������ ������ Goods����ƾ�ϰ�
	            ������ null�� �����Ѵ�. 
	*/
    public Goods selectByCode(String code){

          return null;
	}


	/**
	  ��ǰ�ڵ忡 �ش��ϴ� ��ǰ����, ���� �����ϱ� 
	  @return : boolean���� �����̿Ϸ�Ǹ� true, �ƴϸ� false
	*/
	public boolean update(Goods goods){ //��ǰ�ڵ�, ����, ����

        return false;
	}
}