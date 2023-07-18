package E1_3;

public class SeriesMultiplication {
    private int result;
    public SeriesMultiplication(){
        result=1;
    }
    public int SeriesMultiplication(int highestNum){
        for(int loopCount=1; loopCount<=highestNum; loopCount++)
        {
            result=result*loopCount;
        }
        return result;

    }
}
