/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indranil
 */

import java.util.*;

public class distribution_mechanics 
{
   ArrayList query;

    public distribution_mechanics() 
    {
        query=null;
    }

    public void getQuery() 
    {
       connection_table ct=new connection_table();
       query=ct.get_Answers();
    }
    public void shuffle_query()
    {
        
        //Collections.shuffle(query,new Random());
    }
}
