public class StudentArr{
    public static void main(String[] args){
        Student stu[] = new Student[3];
        String name[] = new String[]{
            "a","b","c"
        };

        int age[] = new int[]{
            11,12,21
        };

        for(int i=0; i<stu.length; i++){
            stu[i] = new Student();
            stu[i].setName(name[i]);
            stu[i].setAge(age[i]);
        }

        for(int i=0; i<stu.length; i++){
            System.out.println(stu[i].getName());
            System.out.println(stu[i].getAge());
        
        }
    }
}


// 학생의 정보를 관리할 객체
//  : VO = value object, DTO = data transfer object, domain

class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age > 20){
            System.out.println("나이 설정 불가");
        }else{
            this.age = age;
        }
        
    }

    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
}   