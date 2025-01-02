import java.util.Arrays;

class Solution {
    private boolean isSatisfy(String a){
        a = a.toLowerCase();
        char start = a.charAt(0);
        char end = a.charAt(a.length()-1);
        if((start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') &&
            (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u')){
                return true;
            }
            return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int res[] = new int[queries.length];
        int satisfyCount[] = new int[words.length];
        int k = 0;

        for(int i=0;i<words.length;i++){
            if(isSatisfy(words[i])){
                satisfyCount[i] = 1;
            }
        }

        System.out.println(Arrays.toString(satisfyCount));

        for(int a[]: queries){
            int count = 0;
            int start = a[0];
            int end = a[1];
            for(int i=start;i<=end;i++){
                count += satisfyCount[i];
            }
            res[k] = count;
            k++;
        }

        // for(int a[] : queries){
        //     int count = 0;
        //     int start = a[0];
        //     int end = a[1];
        //     for(int i=start;i<=end;i++){
        //         if(isSatisfy(words[i])){
        //             count++;
        //         }
        //     }
        //     res[k] = count;
        //     k++;
        // }
        return res;
    }
}
public class countVowelStringsInRanges {

	public static void main(String[] args) {
		//[0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1]
		String []words = {"bzmxvzjxfddcuznspdcbwiojiqf","mwguoaskvramwgiweogzulcinycosovozppl","uigevazgbrddbcsvrvnngfrvkhmqszjicpieahs","uivcdsboxnraqpokjzaayedf","yalc","bbhlbmpskgxmxosft","vigplemkoni","krdrlctodtmprpxwditvcps","gqjwokkskrb","bslxxpabivbvzkozzvdaykaatzrpe","qwhzcwkchluwdnqjwhabroyyxbtsrsxqjnfpadi","siqbezhkohmgbenbkikcxmvz","ddmaireeouzcvffkcohxus","kjzguljbwsxlrd","gqzuqcljvcpmoqlnrxvzqwoyas","vadguvpsubcwbfbaviedr","nxnorutztxfnpvmukpwuraen","imgvujjeygsiymdxp","rdzkpk","cuap","qcojjumwp","pyqzshwykhtyzdwzakjejqyxbganow","cvxuskhcloxykcu","ul","axzscbjajazvbxffrydajapweci"};
		int [][]queries = {{4, 4},{6, 17},{10, 17},{9, 18},{17, 22},{5, 23},{2, 5},{17, 21},{5, 17},{4, 8},{7, 17},{16, 19},{7, 12},{9, 20},{13, 23},{1, 5},{19, 19}};
		
		Solution soln = new Solution();
		System.out.println(Arrays.toString(soln.vowelStrings(words, queries)));
	}

}
