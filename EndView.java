
/**
 ��û�� ����� ȭ�� ��� ����ϴ� Ŭ���� 
*/
class EndView{

   /**
      �������� �޽����� ����ϴ� �޼ҵ� 
   */
   public static void printMessage(String message){
      System.out.println(message);
   }

   /**
      ��ü�˻��� ����� ����ϴ� �޼ҵ� 
   */
   public static void printSelectAll(Goods [] goodsArr){
        System.out.println("*****��ǰ LIST ( "+ GoodsService.count +" )�� *************");
		//������ּ���.
		for(int i=0; i < GoodsService.count ; i++){
             System.out.println( goodsArr[i].getCode() );
		}

		System.out.println();
   }

   /**
      ��ǰ�ڵ忡 �ش��ϴ� ���� ��� �ϴ� �޼ҵ� 
   */
   public static void printSelectByCode(Goods goods){
	   System.out.println("--------"+goods.getCode() +"�� �ش��ϴ� ����--------------");
	   //���� ������ּ���

   }

}