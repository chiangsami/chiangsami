package lab05;

public class Statistics {
    int[] lowscores = new int[5];
    
    int[] highscores = new int[5];
    
    float[] avgscores = new float[5];

    /*
    * This method will find the lowest score and store it in an array names
    * lowscores.
    */
    void findlow(Student[] a) {
    	
        for (int i = 0; i < 5; i++) {
        	
            for (int j = 0; j < a.length; j++) {
            	
                if (lowscores[i] > a[j].getScores()[i]) {
                	
                    lowscores[i] = a[j].getScores()[i];
                    
                }
            }
        }
    }

    /*
     * This method will find the highest score and store it in an array names
     * highscores.
     */
    void findhigh(Student[] a) {
    	
        for (int i = 0; i < 5; i++) {
        	
            for (int j = 0; j < a.length; j++) {
            	
                if (highscores[i] < a[j].getScores()[i]) {
                	
                    highscores[i] = a[j].getScores()[i];
                    
                }
            }
        }
    }

    /*
     * This method will find avg score for each quiz and store it in an array names
     * avgscores.
     */
    void findavg(Student[] a) {
    	
        // go through each quiz number
        for (int i = 0; i < 5; i++) {
        	
            int avgScore = 0;
            
            // add each student quiz score to the total
            for (int j = 0; j < a.length; j++) {
            	
                avgScore += a[j].getScores()[i];
                
            }
            // divide by the number of students
            avgScore /= a.length;
            
            avgscores[i] = avgScore;
        }
    }

    public void printScores() {
        for (int i = 0; i < 5; i++) {
            System.out.println("For quiz " + (i+1));
            
            System.out.println("low: " + lowscores[i]);
            
            System.out.println("high:  " + highscores[i]);
            
            System.out.println("average: " + avgscores[i]);
        }
    }
}