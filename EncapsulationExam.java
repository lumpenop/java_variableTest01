import java.util.Scanner;

class EncapsulationExam{

    private int weight = 0;
    private String password = "";

    private void getWeight(String password){
        if(isRightPass(password)){
            System.out.println("몸무게는 " + this.weight + "kg 입니다.");
        }else{
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    private void setWeight(String password, int weight){
        if(isRightPass(password)){
            this.weight = weight;
            System.out.println("몸무게가 " + this.weight + "kg로 설정되었습니다.");
        }else{
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    private void setPass(String password, String newPassword){
        
        if(isRightPass(password)){
            this.password = newPassword;
            System.out.println("비밀번호가 설정되었습니다.");
        }else{
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    private boolean isRightPass(String password){
        if(password.equals(this.password)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        EncapsulationExam ee = new EncapsulationExam();
        
        System.out.print("비밀번호 > ");
        String firstPass = scanner.nextLine();
        ee.setPass("", firstPass);
        System.out.print("몸무게 > ");
        int firstWeight = Integer.parseInt(scanner.nextLine());
        ee.setWeight(firstPass, firstWeight);

        while(true){
            System.out.println("\n1. 몸무게 검색 2. 몸무게 변경 3.비밀번호 변경 4. 종료");
            System.out.print(">> ");
            int menu = Integer.parseInt(scanner.nextLine());

            if(menu == 1){
                System.out.println("몸무게 검색을 위해 비밀번호를 입력해주세요.");
                System.out.print("비밀번호 > ");
                String password = scanner.nextLine();
                ee.getWeight(password);
            }else if(menu==2){
                System.out.println("몸무게 변경을 위해 비밀번호와 변경할 몸무게를를 입력해주세요.");
                System.out.print("비밀번호 > ");
                String password = scanner.nextLine();
                System.out.print("몸무게 > ");
                int weight = Integer.parseInt(scanner.nextLine());
                ee.setWeight(password, weight);
            }else if(menu==3){
                System.out.println("비밀번호 변경을 위해 현재 비밀번호와 변경할 비밀번호를 입력해주세요.");
                System.out.print("현재 비밀번호 > ");
                String password = scanner.nextLine();
                System.out.print("변경할 비밀번호 > ");
                String newPass = scanner.nextLine();
                ee.setPass(password, newPass);
            }else{   
                System.exit(1); 
            }
        } // while 종료
        
    } // main

    static{
        System.out.println("\n초기 비밀번호와 몸무게를 설정해주세요");
    }
}