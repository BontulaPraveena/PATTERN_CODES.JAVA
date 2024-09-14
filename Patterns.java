 public class Patterns{

    public static void main(String args[]){
        //comment-ctrl+k+c
        //uncomment-ctrl+/
//solid rectangle
        // int n= 4;
        // int m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
            
            //*****
            //*****
            //*****
            //*****

//hollow rectangle
        // int  n=4;
        // int m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i == 1 ||j == 1 || i == n || j == m){
        //             System.out.print("*"+" ");
        //         }
        //         else
        //         {
        //             System.out.print(" "+ " ");
        //         }
               
        //     }
        //  System.out.println();
        // }
        //* * * * */
        //*       */
        //*       */
        //* * * * */

//HALF PYRAMID
        //  int n=4;
        //  //for no.of rows
        //  for(int i=1 ;i<=n;i++){
        //     //counts the col to row value
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*"+" ");
        //      }
        //      System.out.println();
        //  }

        //*/
        //* */
        //* * */
        //* * * */

//INVERTED HALF PYRAMID
        // int n = 4;
        // //for no.of rows
        // for(int i=n;i>=1;i--)
        // {
        //     //counting cols j for each row i
        //     for(int j=1;j<=i; j++)
        //     {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        //* * * *
        //* * *
        //* *
        //* 

//INVERTED & ROTATED HALF PYRAMID
            // int n =4;
            // for(int i=1;i<=n;i++){
            //     for(int j=1 ;j<=n-i;j++){
            //         System.out.print(" "+" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*"+" ");
            //     }
            //     System.out.println();
            // }
            //      *
            //    * *
            //  * * *
            //* * * *

//HALF PYRAMID WITH NUMBERS
            //    int n=5;
            //    for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            //    }
               //1
               //1 2
               //1 2 3
               //1 2 3 4
               //1 2 3 4 5

//INVERTED HALF PYRAMID WITH NUMBERS
            // int n = 5;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i+1; j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }
            //1 2 3 4 5
            //1 2 3 4
            //1 2 3
            //1 2
            //1

//flyoids triangle
        //    int n= 5;
        //    int number=1;
        //    for(int i=1; i<=n;i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(number+" ");
        //            number++;
        //     }
        //     System.out.println();
        //    }
        

           //1
           //2 3
           //4 5 6
           //7 8 9 10
           //11 12 13 14 

//0-1 TRIANGLE
            // int n=5;
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=i;j++){
            //         int sum=i+j;
            //         if(sum % 2 == 0){
            //             System.out.print("1"+" ");
            //         }
            //         else{
            //             System.out.print("0"+" ");
            //         }
            //     }
            //     System.out.println();
            // }
            //1
            //0 1
            //1 0 1
            //0 1 0 1
            //1 0 1 0 1


        //ADVANCED PATTERNS







//BUTTERFLY PATTERN
                // int n=4;
                // //upper part
                // for(int i=1;i<=n;i++){
                //     //stars
                //     for(int j=1;j<=i;j++){
                //         System.out.print("*");
                //     }
                //     //spaces
                //     int spaces=2*(n-i);
                //     for(int j=1;j<=spaces;j++){
                //         System.out.print(" ");
                //     }
                //     //again stars
                //     for(int j=1;j<=i;j++)
                //     {
                //         System.out.print("*");
                //     }
                // System.out.println();
                // }
                //*      *
                //**    **
                //***  ***
                //********


                // //lower part
                // for(int i=n;i>=1;i--){
                //     //stars
                //     for(int j=1;j<=i;j++){
                //         System.out.print("*");
                //     }
                //     //spaces
                //     int spaces=2*(n-i);
                //     for(int j=1;j<=spaces;j++){
                //         System.out.print(" ");
                //     }
                //     //again stars
                //     for(int j=1;j<=i;j++)
                //     {
                //         System.out.print("*");
                //     }
                // System.out.println();
                // }
                //********
                //***  ***
                //**    **
                //*      *

//SOLID RHOMBUS
            //   int n=5;
            //   for(int i=1;i<=n;i++){
            //       for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //       }
            //       for(int j=1;j<=5;j++){
            //         System.out.print("*");
            //       }
            //       System.out.println();
            //   }
               //    *****
               //   *****
               //  *****
               // *****
               //*****


//HALLOW RHOMBUS
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=5;j++){
//         if(i==1||j==1||i==n||j==n){
//            System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }

      
//     }
//     System.out.println();
// }  
   //    *****
   //   *   *
   //  *   *
   // *   *
   //*****


//PALINDROME PATTERN
              //half part
            //    int n =5;
            //    for(int i=1;i<=n;i++){
            //     //spaces
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" "+" ");
            //     }
            //     //j=i to 1
            //     for(int j=i;j>=1;j--){
            //         System.out.print(j+" ");
            //     }
            //     //other part
            //     for(int j=2;j<=i;j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();

            //    }
               //        1
               //    3 2 1 2 3
               //  4 3 2 1 2 3 4
               //5 4 3 2 1 2 3 4 5 

//DIAMOND PATTERN
            //    //upper part
            //    int n = 4;
            //    for(int i=1; i<=n;i++){
            //     //spaces
            //     for(int j =1;j<=n-i;j++){
            //         System.out.print(" "+" ");
            //     }
            //     //stars
            //     for(int j=1;j<=2*i-1;j++){
            //         System.out.print("*"+" ");
            //     }
            //     System.out.println();
            //    }
            //     //lower part
                
            //     for(int i=n; i>=1;i--){
            //      //spaces
            //      for(int j =1;j<=n-i;j++){
            //          System.out.print(" "+" ");
            //      }
            //      //stars
            //      for(int j=1;j<=2*i-1;j++){
            //          System.out.print("*"+" ");
            //      }
            //      System.out.println();
            //     }
                //   *
                //  ***
                // *****
                //********
                //********
                // *****
                //  ***
                //   *
        }
    }

    

