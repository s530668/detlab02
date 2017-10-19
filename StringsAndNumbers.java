/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author sangeetha Detne  
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string1="   Why";
        String string2=" choose ";
        String string3="   Northwest  ";
        String string4="among";
        String string5=" other     ";
        String string6=" Universities ";
        System.out.println("Output:");
        System.out.println();
        System.out.println();
        System.out.println("******** String Class ********\n");
        String s1=string1.concat(string2.concat(string3.concat(string4.concat(
                string5.concat(string6)))));
        
        System.out.println("The length of the concatenated string is: "+
                s1.length());//get length of the string//
        String s2 =string1.trim().concat(string2.concat(string3.trim().concat(" "
                +string4.concat(" "+string5.trim().concat(" "+string6.trim())))));
        System.out.println("Whole sentence: "+s2.concat("?"));
        System.out.println("The length of the trimmed string: "+s2.length());
        int i0=s2.indexOf("Universities");
        System.out.println("Index of first 'i' in Universities is: "
               +s2.substring(i0,i0+"Universities".length()).indexOf("i"));
        String s3="computer Applied science Applied Computer science  \n" +
                 "science Applied computer Appleid computer Science Applied "
                + "computer \n" 
                +""+ "Applied";
        System.out.println("The first occurrence of word Computer is: "
               + s3.indexOf("Computer")); // get the first occurrence of the computer//
        
        int i1=s3.indexOf("Applied");
        int i2=s3.indexOf("Computer"); //index of the word//
        int i3=s3.indexOf("Science");
      
        String s4=string3.trim().concat(" is "+"one"+" among "+"the"+
                        string6.concat("")+"which"+" provides "+
                        s3.substring(i1,i1+"Applied".length())+" "+
                        s3.substring(i2,i2+"Computer".length())+" "+
                        s3.substring(i3, i3+"Science".length()));
       System.out.println("String of strings: "+s4);
       System.out.println();
       
       System.out.println("******** Math Class ******** ");
       System.out.println();
       int value1=27;
       int value2=4;
       double myNumber=43.35;
       int myNumber1=30;
       int myNumber2=60;
       System.out.println("27 power 4 is: "+Math.pow(value1,value2));
       System.out.println("Secant of 27 is: "+Math.round(1/Math.cos(value1)));
       System.out.println("Square root of 43.35 is: "+Math.sqrt(myNumber));
       System.out.println("Ceil Value of 43.35 is: "+Math.ceil(myNumber));
       System.out.println("Floor value is: "+Math.floor(myNumber));
       System.out.println("Cos(30)-rounded: "+Math.round(Math.cos(myNumber1)));
       System.out.println("Cos(60)-rounded: "+Math.round(Math.cos(myNumber2)));
       System.out.println("Tan(30)-rounded: "+Math.round(Math.tan(myNumber1)));
       System.out.println("Tan(60)-rounded: "+Math.round(Math.tan(myNumber2)));
       double z=Math.ceil((1/Math.sin(value1))*(Math.pow(3,2)/Math.sqrt(
               Math.sqrt(4)+(5*3*2)+3)));
       System.out.println("Trigonometry: "+z);
       System.out.println();
       System.out.println("******** Random Class ********");
       System.out.println();
       int n=300;
       Random r = new Random();
        System.out.println("**Without Seed value**");
        System.out.println("First Random value:"+r.nextInt(n));
        System.out.println("Second Random value:"+r.nextInt(n));//as n=300,seedless value//
        System.out.println("Third Random value:"+r.nextInt(n));
        System.out.println("Fourth Random value:"+r.nextInt(n));
        System.out.println("Fifth Random value:"+r.nextInt());
        System.out.println("Sixth Random value:"+r.nextInt());
        System.out.println("Seventh Random value:"+r.nextInt());
        System.out.println("** 4b. The values keep on changing with the very "
                + "execution");
        System.out.println();
        System.out.println("**With Seed value**");
          Random r1 = new Random(20L);
        System.out.println("First Random value:"+r1.nextInt(n));
        System.out.println("Second Random value:"+r1.nextInt(n));
        System.out.println("Third Random value:"+r1.nextInt(n));
        System.out.println("Fourth Random value:"+r1.nextInt(n));//n=300,seed value//
        System.out.println("Fifth Random value:"+r1.nextInt());
        System.out.println("Sixth Random value:"+r1.nextInt());
        System.out.println("Seventh Random value:"+r1.nextInt());
        System.out.println("** 4d. The values does not change with the very "
                + "execution");
        System.out.println("** 4e. The diffrence in  b and d is that when we "
                + "pass seed value the random values are fixed,whereas in"
                + " seedless"
                + " the random values keep on changing");
     }
    
}
