package pc_test;

//中兴笔试题，通过60%

public class distanceOfBulb
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int minWireLength(int numOfBulbs, int[] glowState,
                             int[] distanceOfBulb)
    {
        int sum =0;
        for(int i=0;i<numOfBulbs;i++){
            if(glowState[i]==0){
                int distance=0;
                if(distanceOfBulb[i]-distanceOfBulb[i-1]<distanceOfBulb[i+1]-distanceOfBulb[i]){
                    distance = distanceOfBulb[i]-distanceOfBulb[i-1];
                    sum = sum + distance;
                }
                else{
                    distance=distanceOfBulb[i+1]-distanceOfBulb[i];
                    sum = sum + distance;
                }
            }

        }

        return sum;

    }
    // METHOD SIGNATURE ENDS

}