package Array;

// found index and given elements
class findInd{
    public void findIndex(){
        int [] arr = {3,4,3,5};
        int ans = -1;
        int x = 4;

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == x){
                ans = i;
                break;
            }
        }
        System.out.println("Found " + x + " at index " + ans);
    }
}


public class FindIndex {
    public static void main(String[] args) {
        findInd obj = new findInd();
        obj.findIndex();
    }
}

