package assignment5;

public class Main {
    public static void main(String args[]){
//        Person p = new Person();
//        p.inputInfor();
//        p.showInfor();

        Student s = new Student();
        s.inputInfor();
        for (;;){
            if(!s.checkAge18()){
                s.setAge();
            }
            break;
        }
        s.showInfor();
//
    }
}
