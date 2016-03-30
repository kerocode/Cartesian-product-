/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mr.keroles
 */
public class Relation {
private  String [] a ; 
private String [] b ; 
private String [] c ; 
private boolean isEquil ; 
Relation (){}

  Relation (String [] setA, String [] x, String [] y){
  a = setA; 
  b= x; 
  c=y; 
  }
  
  // setter 
 public void SetA (String [] setA){
  this.a =setA; 
  }
 public void SetX (String [] x){
  this.b =x; 
  }
 public void SetY (String [] y){
  this.c =y; 
  }
 // getter 
 public String [] getA (){
 return this.a;
 } 
 public String getX (int i){
 return this.b[i];
 }  
 public String  getY (int i){
 return this.c[i];
 } 
 public boolean isEquivalence (){
 return this.isEquil; 
 }

 public void DisplaySet (){
 String Set =Arrays.toString(getA());  
 String output = Set.substring(1, Set.length()-1);
 System.out.print ("A={"+output+"} \n"); 
 }
 
 public void DisplayProduct (){
     String temp="";
 System.out.print("A*A = {");
    for (int i=0;i< a.length; i++) {
        for (int j=0 ;j<a.length;j++){
        temp  = temp+"("+a[i]+","+a[j]+")"+",";        
        } 
    }
 System.out.print (temp.substring(0, temp.length()-1)+"} \n");
 }    
public void matrixDisplay (){
    
 for (int i=0;i< a.length; i++) {
        for (int j=0 ;j<b.length;j++) {  
           if (a[i][]==b[i]&&b[j]== c[j]){    
                  System.out.print(" 1 ");
                  }
           else {
            System.out.print (" 0 ");    
               }
        }
 System.out.println();
 }
}
public boolean equivalenceChecker (){
for (int i =0 ; i<b.length ; i++){
    // checking Reflexive    
    if (b[i]== c[i]){
        for (int j=i+1;j<b.length;j++) {
        //checking Symmetric 
        if (b[i]==c[j]&&c[i]==b[j]){
            for (int k=j+1;k< b.length;k++){
            //checking Transitive 
            if (b[i]==b[k]&& c[i]==b[j]){
             
            
            }
        }
        
    }
 }
return isEquil = true ;
    }
else {
return     isEquil = false ;
    }
}
return isEquil;

}
}
