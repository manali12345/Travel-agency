/*
This file contains all the code pertaining to the database
 */
package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dbaseAccount 
{
    //Declaring variables
    
    String dbusername = "root"; //this is a default user name
    String dbpassword ="" ; //do not leave any blank space here  
    String dburl = "jdbc:mysql://localhost:3306/travelagency"; 
// 3306 is the default port numner,travelagency is our database name
    String dbdriver = "com.mysql.jdbc.Driver";
    //you can find this driver class,in the libraries folder of you project. 
    // libraries>>com.mysql.jdbc(package)>>Driver.class
    Connection dbcon;
    
    //Now we will create a method to connect load the driver
    void dbConnect() throws ClassNotFoundException, SQLException //exception will be generated ,in case the driver is not found
    {
       // Class.forName("dbdriver");
        
        //now we will cineect he driver to the database using DriverManager class,
        //import java.sql.connection for this
        
        dbcon = DriverManager.getConnection(dburl, dbusername, dbpassword);//we have creatd these variables earlier
    }
    
    void dbclose() throws SQLException//will be used for closing database connection
    {
        dbcon.close();
    }
    
    //=====We will start writing methods here ===/
    public ResultSet getSourceCity() throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select distinct source from flight";
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                              //the result in the resultset rst
        return (rst);
    }

 public ResultSet getDestinationCity() throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select distinct destination from flight";
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                              //the result in the resultset rst
        return (rst);
    }
 
  public ResultSet getDepartureFlight(String s,String d) throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select * from flight where source =  " + "'" + s + "'" + " and destination =" + "'" + d + "'" ;
       
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                              //the result in the resultset rst
        return (rst);
    }
  
  public ResultSet getReturnFlight(String s,String d) throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select * from flight where source =  " + "'" + d + "'" + " and destination =" + "'" + s + "'" ;
       
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                              //the result in the resultset rst
        return (rst);
    }
  
   public ResultSet finaldepart(String s) throws ClassNotFoundException, SQLException
    {
        dbConnect();
       String sql = "select departtime,fare from flight where flightid =  '" +  s + "'"  ;
       
       
       
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                            //the result in the resultset rst
        return (rst);
    }
   
   public ResultSet finalreturn(String s) throws ClassNotFoundException, SQLException
    {
        dbConnect();
       String sql = "select departtime,fare from flight where flightid =  '" +  s + "'"  ;
       
       
       
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                            //the result in the resultset rst
        return (rst);
    }
   
   public int insertdata(String source, String destination, String departflightcode, String returnflightcode, double fare, String salutation,String firstname,String lastname, String contact) throws ClassNotFoundException, SQLException
   {
       int x;
   dbConnect();
  // String sql = "INSERT INTO travelagency.bookings ( source, destination, departflightcode, returnflightcode,fare,salutation,firstname,lastname,contact)VALUES ( " + source+","+ destination+ ","+ departflightcode +"," + returnflightcode+ ","+ fare+","+ salutation+ "," + firstname+ ","+ lastname+","+contact +")";
  
  //question marks mean that the values will be given later.This is done so that the query remains easy to handle. 
  String sql = "INSERT INTO travelagency.bookings ( source, destination, departflightcode, returnflightcode,fare,salutation,firstname,lastname,contact)VALUES  (?,?,?,?,?,?,?,?,?)";
  
  
  PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
  pstmt.setString(1, source);
  pstmt.setString(2, destination);
  pstmt.setString(3, departflightcode);
  pstmt.setString(4, returnflightcode);
  pstmt.setDouble(5, fare);
  pstmt.setString(6, salutation);
  pstmt.setString(7, firstname);
  pstmt.setString(8, lastname);
  pstmt.setString(9, contact);
  
  
  
        x=  pstmt.executeUpdate();
        return(x);
   }
  
  
}
