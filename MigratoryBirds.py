//Migratory birds problem in hackerrank
public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        int i;
        for(i=0;i<arr.size();i++){
            if(hmap.containsKey(arr.get(i))){
                int freq = hmap.get(arr.get(i));
                freq++;
                hmap.put(arr.get(i),freq);
            }
            else{
                hmap.put(arr.get(i),1);
            }
        }
        int n = arr.size();
        int maxi = arr.get(0);
        for(i=0;i<n;i++){
            int val = hmap.get(arr.get(i));
            if(val == hmap.get(maxi) && maxi>arr.get(i)){
                maxi = arr.get(i);
            }
            else if(val > hmap.get(maxi)){
                maxi = arr.get(i);
            }
            else{
                ;
            }
        }
        return maxi;


    }
