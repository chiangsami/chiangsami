package lab05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Util {
	static Student[] readFile(String filename) {
		Student[] studentArray = new Student[15];

		// Reads the file and builds student array. */

		// Open the file using FileReader Object.
		boolean DEBUG = false;

		try {
			FileReader file = new FileReader("/Users/samanthachiang/Desktop/StudentSample.txt");
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;

			int numLines = 0;

			int indexID = 0;

			while (!eof) {

				String line = buff.readLine();

				if (line == null) {
					eof = true;
				} else {
					if (DEBUG) {
						System.out.println("Line " + numLines + ": " + line);
					}

					if (numLines >= 1) {
						// System.out.println("Line " + numLines + ": " + line);

						StringTokenizer st = new StringTokenizer(line, " ");
						int counter = 0;

						int[] quizArray = new int[5];

						int index = 0;

						while (st.hasMoreTokens()) {
							
							String id = st.nextToken();
							
							counter++;
							
							int i = Integer.parseInt(id);
							// Student ID
							if (counter == 1) {
								
								Student studentID = new Student();
								
								studentID.setSID(i);
								
								studentArray[indexID] = studentID;
							}
							// Quiz Score
							else {
								Student score = new Student();
								
								score.setScores(quizArray);
								
								quizArray[index] = i;
								
								index++;
							}
							// set the id to the student object using the setID method.
							// convert the string to an integer.
							// Need to write another loop to go through all the quizzes.
						}
						studentArray[indexID].setScores(quizArray);
						
						indexID++;
					}
				}
				numLines++;
			}
			buff.close();
		} catch (IOException e) {
			
			System.out.println("Error -- " + e.toString());
		}
		return studentArray;
	}
}
