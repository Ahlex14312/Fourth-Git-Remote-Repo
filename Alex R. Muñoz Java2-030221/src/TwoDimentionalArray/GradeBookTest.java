/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDimentionalArray;

/**
 *
 * @author 2ndyrGroupA
 */
public class GradeBookTest {
    public static void main( String args[] )
     {
     int gradesArray[][] = {
         { 87, 96, 70 }, 
         { 68, 87, 90 }, 
         { 94, 100, 90 }, 
         { 100, 81, 82 }, 
         { 83, 65, 85 }, 
         { 78, 87, 65 }, 
         { 85, 75, 83 }, 
         { 91, 94, 100 }, 
         { 76, 72, 84 }, 
         { 87, 93, 73 }
     }; 

    GradeBook myGradeBook = new GradeBook("\nSD202 Java 2", gradesArray );
     myGradeBook.displayMessage();
    myGradeBook.processGrades();
    } 
 } 

