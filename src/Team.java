import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Team {
         Student student;
         Teacher teacher;
         Graduate_Student graduate_student;

    public Team(Teacher teacher) {
        this.teacher = teacher;
    }
    void dosomthing ()
    {
        student.study();
        teacher.teach();
        graduate_student.study();
    }
   void leader ()
   {

       System.out.println("这个团队的领导是老师");

   }
}
class Student{
       void study(){
        System.out.println("学生正在学习");
    }

}
class Teacher {
    void teach() {
        System.out.println("老师正在教书");
    }
}
class Graduate_Student{
             void study()
             {
                 System.out.println("研究生正在学习");
             }

}


