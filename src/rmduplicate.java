// Write a Java program to remove duplicate elements from an array

public class rmduplicate {

    public static void main(String[] args) {

        int[] arraydup = {20,50,26,60,40,20,70};

        for (int i=0; i<arraydup.length; i++){

            for(int a = 0; a<arraydup.length; a++){

                if (arraydup[i] == (arraydup[a+1]) ) {

                    arraydup[a] = 0;
                }else {

                    System.out.print("  ");
                }


                }

            }

        }
    }



