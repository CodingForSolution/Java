import java.util.*;

class Search{
 public static void main(String args[]){
      int a[]={4,5,62,42,4,24,6,35,62,535,464};
      int key=35, flag=0;
      for(int i=0;i<a.length;i++){
          if(key==a[i]){
              flag=1;
              break;
          }
      }
      if(flag==1){
          System.out.println("Element found"); 
      }else{
        System.out.println("Not Found");
       }
 }
}
