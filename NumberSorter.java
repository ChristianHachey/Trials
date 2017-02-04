// The "NumberSorter" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.io.FileReader;
// import java.io.IOException;
import java.io.BufferedReader;
// import java.io.File;

public class NumberSorter
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException // allows access to out side java
    {
	c = new Console (); // the out put

	int choice = 0; // what the want to be done
	int num[] = new int [10]; // variable to get the 10 numbers
	int display[] = new int [10]; // trying to get the out put
	char convert[] = new char [10];
	int temp = 0;




	while (choice != 6) // loops until 6 is choosen
	{
	    // menu
	    c.println ("Enter your choice");
	    c.println ("1. Input numbers");
	    c.println ("2. Smallest to Largest");
	    c.println ("3. Average");
	    c.println ("4. Largest to Smallest");
	    c.println ("5. Smallest to Largest. Please re-input so numbers are over 100");
	    c.println ("6. Exit");
	    choice = c.readInt ();
	    if (choice == 1)
	    {
		PrintWriter fw = new PrintWriter (new FileWriter ("NumberSorter.txt")); // write file
		BufferedWriter bw = new BufferedWriter (fw);

		for (int i = 1 ; i <= 10 ; i = i + 1) // limmets 10 numbers to be put in onl
		{
		    c.println ("Write the number please"); // tell to write number
		    num [i] = c.readInt (); // getting the numbers
		    bw.write (num [i]); // putting th numbers into the file

		    //num [i] = Integer.parseInt;
		}

		fw.close (); // close file
	    }
	    else if (choice == 2)
	    {
		BufferedReader br = new BufferedReader (new FileReader ("NumberSorter.txt")); // allowing to read the file
		for (int x = 1 ; x <= 10 ; x = x + 1)
		{
		    Integer.parseInt
		    display [x] = br.readLine();  // reading the file
		}
		br.close (); // close file

	    }
	    else if (choice == 3)
	    {
		BufferedReader br2 = new BufferedReader (new FileReader ("NumberSorter.txt")); // allowing to read the file
		for (int i = 1 ; i < 10 ; i = i + 1)
		{
		Integer.parseInt
		    display [i] = br2.readLine();
		    temp = temp + display [i];
		    temp = temp / 10;
		    c.println ("The average of the ten numbers you entered is " + temp);
		}

		br2.close (); // close file
	    }
	    else if (choice == 4)
	    {
		BufferedReader br3 = new BufferedReader (new FileReader ("NumberSorter.txt")); // allowing to read the file
		for (int i = 1 ; i < 10 ; i = i + 1)
		{
		 
		}
		br3.close (); // closes the file
	    }
	    else if (choice == 5)
	    {
		BufferedReader br4 = new BufferedReader (new FileReader ("NumberSorter.txt")); // allowing to read the file
		for (int i = 1 ; i < 10 ; i = i + 1)
		{
		 
		}
		br4.close (); // closes the file
	    }


	}
    } // main method
} // NumberSorter class


