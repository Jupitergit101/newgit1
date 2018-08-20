// Write a Java program to find the common elements between two arrays (string values)

public class commonelement {

    public static void main(String[] args) {

     String[] arraystr1 = {"Pakistan", "India", "America","Thailad","Cuba","Pakistan"};

     String[] arraystr2 = {"Dubai", "America", "Pakistan"};
     int count=0;

     for (int i=0; i<arraystr1.length; i++){

           for (int a = 0; a<arraystr2.length; a++) {

               if (arraystr1[i] == arraystr2[a]) {
                   System.out.println("Country Matched " + arraystr2[a]+ " Match with index #  " +a);
                   count = count + 1;
               } else {
               // System.out.println();


               }

           }

     }
        System.out.println("The number of matched Item in two Arrays List " +count+ " Items");


     }

    }


