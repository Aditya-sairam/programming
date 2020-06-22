//Counting Valleys problem in hackerrank
public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
            int level = 0;
            int count = 0;
            int i;
            for(i=0;i<n;i++){
                if(s.charAt(i) == 'U'){
                    level += 1;
                }
                if(s.charAt(i) == 'D'){
                    level -= 1;
                }
                
                if(level == 0 && s.charAt(i) == 'U'){
                    count += 1;
                }
            }
        return count;
    }

