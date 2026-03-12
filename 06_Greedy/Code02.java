
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Code02 {
    public static void main(String []args){
        int start[] = {3,1,0,5,5,8};
        int end[] = {4,2,6,7,9,9};


        // sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<activities.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        int lastEnd = activities[0][2];
        ans.add(activities[0][0]);
        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];

            }
        }


        System.out.println("max Activitly = " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }


    }
}
