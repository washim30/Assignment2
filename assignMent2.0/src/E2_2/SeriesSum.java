package E2_2;

public class SeriesSum {
    private int result;
    public SeriesSum(){
        result=0;
    }
    public int SeriesSum(int highestNum){
        for(int loopCount=1; loopCount<=highestNum; loopCount++)
        {
            result=result+loopCount;
        }
        return result;

    }
}
