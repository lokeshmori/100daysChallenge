import java.util.Scanner;

public class Main {


          // linear search in arrays
             // time complexity O(n)

    public static int linearSearch(String arr[] , String key ){

        for(int i=0; i<arr.length;i++) {
            if (key.equals(arr[i])) {
                return i;
            }
        }
        return -1 ;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array");
        int  n = sc.nextInt() ;

        String arr[] = new String[n];

        for(int i = 0; i < n ; i++) {

            System.out.println("Enter the "+i+" element of array");

            arr[i] = sc.next() ;

        }
        System.out.println(" Enter the element Do you want to search");

        String s = sc.next() ;

         int  posi =  linearSearch(arr,s);

        if( posi ==-1 ){
            System.out.println("not found ");
        }else{
            System.out.println("element is at "+ posi);
        }

    }
    }
