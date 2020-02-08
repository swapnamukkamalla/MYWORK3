/*NAME          :SWAPNA MUKKAMALLA
  DATE          :09-30-2019
  COURSE        :IT-516 DATA STRUCTURES AND ALGORITHMS
  HOMEWORK      :HW03
  TITLE         :Quick Sort
  DESCRIPTION   :THIS APPLICATION GETS THE LENGTH OF THE ARRAY OF INTEGERS
                 FROM THE USER INPUT AND ASSIGNS RANDOM VALUES TO THE ARRAY
                 AND SORTS THE ARRAY USING QUICK SORT.DISPLAYS THE RANDOMIZED
                 ARRAY AND SORTED ARRAY */

import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QuickTester {
    public static void main(String[] args) {

        /* This reads the input provided by user
           using keyboard*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array :::: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        //declaring and allocating memory for number of integers given by user as a input
        Integer[] q = new Integer[num];

        //Assigning values to the integer array
        for (int i = 0; i < q.length; i++) {
            q[i] = i + 1;
        }

        //Shuffling the array to randomize
        Collections.shuffle(Arrays.asList(q));

        //Randomized array -Integers before sorting
        //printing the array values
        StdOut.println("-----------------");
        StdOut.println("Randomized Array ");
        StdOut.println("-----------------");
        for (int i = 0; i < q.length; i++) {

            StdOut.print(q[i] + "  ");
        }

        StdOut.println();

        //sorting the array using Quicksort
        Quick.sort(q);
        //Printing the array after it is sorted
        StdOut.println("-----------------");
        StdOut.println("Sorted Array ");
        StdOut.println("-----------------");
        for (int i = 0; i < q.length; i++) {

            StdOut.print(q[i] + "  ");
        }
    }
}
