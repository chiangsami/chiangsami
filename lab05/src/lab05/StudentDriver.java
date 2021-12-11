package lab05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {

		Student studentr[]; // new Student[40];

//Populate the student array

		studentr = Util.readFile("filename.txt");
		
		// studentr[2].printInfo();
		for (int i = 0; i < studentr.length; i++) {
			
			studentr[i].printInfo();
		}
		Statistics statlab2 = new Statistics();
		
		statlab2.findavg(studentr);
		statlab2.findhigh(studentr);
		statlab2.findlow(studentr);
		
		statlab2.printScores();

//add calls to findhigh and find average

//Print the data and statistics

	}

}