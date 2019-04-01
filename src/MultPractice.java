/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice {
    private int int1;
    private int int2;
    public MultPractice(int int1, int int2){
        this.int1=int1;
        this.int2=int2;
    }
    public String getProblem(){
        return (this.int1+" times "+this.int2);
    }
    public void nextProblem(){
        this.int2++;
    }
}
