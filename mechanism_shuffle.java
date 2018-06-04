import java.util.*;
public class mechanism
{
    ArrayList student_list;
    public static void  main(String args[])
    {

    }
    public void distribute()
    {
        boolean flag;
        /*ArrayList a1;
        student_lsit=get_enrolled_Students();
        a1=get_teacher_pref();
        a1.get(2);
        ArrayList shuffeled=student_list;
        Collections.shuffle(shuffeled);
        int count_student=0,count_eval=0;
        while(flag)
        {
            count_student++;
            ArrayList tempo=(ArrayList)student_list.get(count_student);
            ArrayList
            schedule_evaluation(tempo.get(0),)
        }*/

        ArrayList array_list;
        array_list=get_enrolled_Students();
        int number_of_param=0,number_students=99
        String students[][]=new String[number_students][number_of_param];
        for(int i=0;i<number_students;i++)
        {
            ArrayList a1=(ArrayList)array_list.get(i);
            students[i][0]=(String)a1.get(0);
            students[i][1]=(String)a1.get(1);
            students[i][2]=(String)a1.get(2);
            students[i][3]=(String)a1.get(3);
        }

        Collections.shuffle(array_list);
        String students_shuffeled[][]=new String[number_students][number_of_param];
        for(int i=0;i<number_students;i++)
        {
            ArrayList a1=(ArrayList)array_list.get(i);
            students_shuffeled[i][0]=(String)a1.get(0);
            students_shuffeled[i][1]=(String)a1.get(1);
            students_shuffeled[i][2]=(String)a1.get(2);
            students_shuffeled[i][3]=(String)a1.get(3);
        }

        for(int i=0;i<number_students;i++)
        {
            int base=5;
            int number_eval=12;
            for(int j=base;j<base+number_eval;j++)
                students[i][j]=students[new Random().nextInt(students.length)][0];
        }
    }
}
