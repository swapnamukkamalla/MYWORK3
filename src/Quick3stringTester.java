/*NAME          :SWAPNA MUKKAMALLA
  DATE          :09-30-2019
  COURSE        :IT-516 DATA STRUCTURES AND ALGORITHMS
  HOMEWORK      :HW03
  TITLE         :3-way string quick sort
  DESCRIPTION   :THIS APPLICATION GETS THE LENGTH OF THE ARRAY OF STRINGS
                 FROM THE USER INPUT AND ASSIGNS VALUES FROM ANOTHER STRING
                 ARRAY RANDOMLY TO THE ARRAY AND SORTS THE ARRAY USING 3 WAY
                 STRING QUICK SORT.DISPLAYS THE RANDOMIZED ARRAY AND SORTED ARRAY */

import edu.princeton.cs.algs4.Quick3string;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quick3stringTester {

    public static void main(String[] args) {

        /* This reads the input provided by user
          using keyboard*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of the array:::: ");

        // This method reads the number provided using keyboard
        //gets the length of the array given by user as an input
        int num = scan.nextInt();

        //declaring and allocating memory for number of strings given by user as a input
        String[] q = new String[num];
        int j = 0;
        String[] val = {"S", "W", "A", "P"};

        //Assigning values to the string array from val array
        for (int i = 0; i < q.length; i++) {

            q[i] = val[j];
            j++;
            if (j == val.length) {
                j = 0;
            }
        }

        //Shuffling the array to randomize
        Collections.shuffle(Arrays.asList(q));

        //Randomized array - before sorting
        //printing the array values
        StdOut.println("-----------------");
        StdOut.println("Randomized Array ");
        StdOut.println("-----------------");
        for (int i = 0; i < q.length; i++) {

            StdOut.print(q[i] + "  ");
        }
        StdOut.println();

        //sorting the array using Quick3string

        Quick3string.sort(q);


        //Printing the array after it is sorted
        StdOut.println("-----------------");
        StdOut.println("Sorted Array ");
        StdOut.println("-----------------");

        for (int i = 0; i < q.length; i++) {
            StdOut.print(q[i] + "  ");
        }

    }
}
