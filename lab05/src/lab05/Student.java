package lab05;

public class Student {
    private int SID;
    private int scores[] = new int[6];

    public Student() { // default constructor
        SID = 0;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int sID) {
        SID = sID;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // write public get and set methods for

    // SID and scores
    public void printInfo() {
        System.out.printf("scores: %d, %d, %d, %d, %d\n",
            scores[0],
            scores[1],
            scores[2],
            scores[3],
            scores[4]
        );
    }
}
