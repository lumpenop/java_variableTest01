import java.util.Scanner;


public class GradeProgram01{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();
        boolean flag = true;


        while(flag){
            System.out.println("1. 성적표 구하기 2. 종료");
            int menu = Integer.parseInt(scanner.nextLine());

            if(menu == 1){
                System.out.println("ㅇㅣ르ㅁ, lang, eng, math");
                String name = scanner.nextLine();
                int lang = Integer.parseInt(scanner.nextLine());
                int eng = Integer.parseInt(scanner.nextLine());
                int math = Integer.parseInt(scanner.nextLine());
                grade.printGrade(name, lang, eng, math);
            }else if(menu == 2){
                flag = false;
            }else{
                flag = false;
            }
        }
    } 
}


class Grade{
    Scanner scanner = new Scanner(System.in);
    
    private int getTotal(int lang, int eng, int math){
        int result = lang + eng + math;

        return result;
    }

    private double getAverage(int total, int count){
        return total/count;
    }

    private char getGrade(double avg){
        if(avg>=90){
            return 'A';
        }else{
            return 'B';
        }
    }

    public void printGrade(String name, int lang, int eng, int math){
        
        int total = this.getTotal(lang, eng, math);
        double avg = this.getAverage(total, 3);
        char grade = this.getGrade(avg);

        System.out.println(name + "의 성적 - "+ "total : " +total + ", avg : " + avg + ", grade: "+ grade);
        System.out.println();
    }

}
