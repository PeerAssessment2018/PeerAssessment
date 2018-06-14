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
    public int[][] distribute_answers(String course_id,String question_id)
    {
        int arr[][]=null;
        try {
            Connection conn=null;
            Properties conn_prop=new Properties();
            conn_prop.put("user", "root");
            conn_prop.put("password", "");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/peer_assesment",conn_prop);
            
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
                    arr=new int[len*number_assessor][2];
                  
                   int n=number_assessor;
                   
                   for(int i=0;i<len;i++)
                   {
                      while(n--!=0)
                      {
                          arr[i+n-1][0]=(int)answers.get(i);
                          Random random = new Random();
                          int index = random.nextInt(len);
                          int x=(int)answers.get(index);
                          while(x==arr[i+n-1][0])
                          {
                              random = new Random();
                              index = random.nextInt(len);
                              x=(int)answers.get(index);
                          }
                          arr[i+n-1][1]=x;       
                      }
                   }
            
        } catch (Exception e) 
        {
            System.out.println("machanism.distribute_answers() "+e.getMessage());
        }
        return arr;
    }
    
    public int[] get_allocated(int id,int couse_id)
    {
        int arr[]=null;
        try {
            Connection conn=null;
            Properties conn_prop=new Properties();
            conn_prop.put("user", "root");
            conn_prop.put("password", "");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/peer_assesment",conn_prop);
            
            String sql = "SELECT user_id from pa_grade course_id = '"+id+"'";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            ArrayList arrL=new ArrayList();
            while(rs.next())
            {
                arrL.add(rs.getString("user_id"));
            }
            conn.close();
            
            //for()
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }
    
    
   public boolean store_allocated(int arr[][],int n,String ques_idString,String course_id)
    {
        boolean f=false;
        try {
            Connection conn=null;
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/peer_assesment","root","");
            String sql="";
            for(int i=0;i<0;i++)
            {
                sql="INSERT INTO pa_grade (user_id,anonymus_id) VALUES ("+arr[i][0]+","+arr[i][1]+");";
                Statement statement=conn.createStatement();
                statement.executeQuery(sql);
            }
            f=true;
           } catch (Exception e) {
               System.out.println(e.getMessage());
        }
        return f;
    }
    
    public String[] get_questions_to_put (int user_id)
    {
        String respoceesString[]=null;
        
            
        //for(int )
        return respoceesString;
    }
}

