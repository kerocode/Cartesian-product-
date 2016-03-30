/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

/**
 *
 * @author Mr.keroles
 */
class a {
 public static void main(String []args)
{
  String Set []={"a","b","c","d"};
  String s1[]={"a","b","c","d","b","c"};
  String s2 [] ={"a","b","c","d","c","b"};
  Relation  R1 = new Relation(Set,s1,s2);
   R1.DisplayProduct();
   R1.DisplaySet();
   R1.matrixDisplay(); 
   R1.equivalenceChecker() ;
   if (R1.equivalenceChecker()== true ) {
   System.out.println ("the relation is equivalence");
   }
   else {
   System.out.println ("the relation is not equivalence");
   }
String set1 [] ={"1","2","3","4","5"};
String is1 [] ={"1","2","3","4"};
String is2[]={"2","3","4","5"};
Relation R2 =new Relation (set1,is1,is2);
R2.DisplayProduct();
R2.DisplaySet();
R2.matrixDisplay(); 
R2.equivalenceChecker() ;
if (R1.equivalenceChecker()== true ) {
   System.out.println ("the relation is equivalence");
   }
   else {
   System.out.println ("the relation is not equivalence");
   }
}
}