import java.util.Scanner;
/**
  키보드 입력을 받아 각 기능을 호출해주는 객체 
*/
class MenuView{
	private Scanner sc  = new Scanner(System.in);
	private GoodsService service = new GoodsService();

   /**
     메뉴를 출력해줄 메소드 
   */
   public void printMenu(String [][] data){
       //
       service.init(data);

	    while(true){
            System.out.println("--------------------------------------------------------------------");
			System.out.println("1.등록    2.전체검색    3.상품코드검색    4.수정하기     9.종료 ");
			System.out.println("--------------------------------------------------------------------");

			System.out.print("메뉴 선택 > ");
              int menuChoice =  Integer.parseInt(sc.nextLine()) ;
			  switch(menuChoice){
                  case 1 :
				      this.inputInsert();

				  break;
				  case 2 :
                      Goods [] goodsArr = service.selectAll();
                      EndView.printSelectAll(goodsArr);
				  break; 
				  case 3 :
					  this.inputSelect();
				  break;
				  case 4 :
                      this.inputUpdate();
				  break;
				  case 9 :
                     System.out.println("다음에 또 이용해주세요. 프로그램 종료합니다.");
				     System.exit(0); //프로그램 종료
				  default : 
					  System.out.println("메뉴는 1~4 or 9 입력해주세요.");

			  }//switch문끝

		}//while문끝
   }//메소드끝
   ////////////////////////////////////////////////////////////////
   /**
      등록을 위한 키보드 입력
   */
    public void inputInsert(){
       //키보드입력 4개 받아서 하나의 Goods 만들어서 서비스의 insert전달한다.
	   System.out.print("상품코드 > ");
	   String code = sc.nextLine();

	   System.out.print("상품이름 > ");
	   String name = sc.nextLine();

	   System.out.print("상품가격 > ");
	   int price =Integer.parseInt(sc.nextLine());

	   System.out.print("상품설명 > ");
	   String explain = sc.nextLine();

	   Goods goods = new Goods();
	   goods.setCode(code);
	   goods.setName(name);
	   goods.setPrice(price);
	   goods.setExplain(explain);

	   //위 4개의 정보를 가지고 service로 이동
       int result = service.insert(goods);
	   if(result==0){
           EndView.printMessage(code+"는 중복이므로 등록할수 없습니다.");
	   }else if(result==-1){
           EndView.printMessage("배열의 길이가 벗어나 더이상 등록할수없습니다.");
	   }else{
           EndView.printMessage("등록되었습니다.");
	   }
	}

   /**
     상품검색을 위한키보드 입력
   */
   public void inputSelect(){
       System.out.print("검색할 상품코드 > ");
	   String code = sc.nextLine();

	 Goods goods = service.selectByCode(code); //호출
     if(goods ==null){
         EndView.printMessage(code+"는 없는 정보이므로 검색할수 없습니다.");
	 }else{
         EndView.printSelectByCode(goods);
	 }

   }

   /**
      수정을 위한 키보드 입력
   */
   public void inputUpdate(){
	System.out.print("수정 상품코드 > ");
	String code = sc.nextLine();

	Goods goods = service.selectByCode(code); //호출
	if(goods ==null){
		EndView.printMessage(code+"는 없는 정보입니다.");
	}else{
		System.out.print("수정할 가격 > ");
		int newPrice = Integer.parseInt(sc.nextLine());
		goods.setPrice(newPrice);

		System.out.print("수정할 설명 > ");
		String newExplain = sc.nextLine();
		goods.setExplain(newExplain);
	}
   }



}//클래스끝