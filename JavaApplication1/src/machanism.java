/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indranil
 */
import java.sql.*;
import java.util.*;

public class machanism 
{
    int number_assessor;
    public void distribute_answers(String course_id,String question_id)
    {
        try {
            Connection conn=null;
            Properties conn_prop=new Properties();
            conn_prop.put("user", "root");
            conn_prop.put("password", "");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test",conn_prop);
            
            String sql = "SELECT no_assessor from peer_assessment course_id = '"+course_id+"'";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            rs.next();
            number_assessor=Integer.valueOf(rs.getString("course_id"));
            
            conn.close();
                    DataBase_Handler dh=new DataBase_Handler();
                   ArrayList answers=dh.get_Answers();
                   dh.conn.close();
                   ArrayList answers2=(ArrayList)answers.clone();
                   int len=answers.size();
                   int arr[][]=new int[len*number_assessor][2];
                  
                   int n=number_assessor;
                   
                   for(int i=0;i<len;i++)
                   {
                      while(n--)
                      {
                          arr[i+n-1][0]=(int)answers.get(i);
                          Random random = new Random();
                          int index = random.nextInt(len);
                          int x=(int)answers.get(index);
                          while(x!=arr[i+n-1][0])
                          {
                              random = new Random();
                              index = random.nextInt(len);
                              x=(int)answers.get(index);
                          }
                            arr[i+n-1][1]=x;
                              
                      }
                   }
            /*for(int i=0;i<len;i++)
            {
             while(n)
                {
                  Random random = new Random();
                 int index = random.nextInt(len);
                 
                 //answers.remove(index);
                 arr[i+(l-n)][0]=(int)
                 arr[i+(l-n)][1]=(int)((ArrayList)answers.get(index)).get(0);
                 n--;
                 //return as an 2d array where the assignment takes place 
                }
               // answers=answers2;
                n=number_assessor;
            }*/
            
        } catch (Exception e) 
        {
            System.out.println("machanism.distribute_answers() "+e.getMessage());
        }
    }
}
