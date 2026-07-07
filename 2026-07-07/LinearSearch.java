class Solution {
    public int search(int arr[], int x) {
        int n = arr.length;
        int i = 0;
        int a = -1;
		while(i < n){
            if (arr[i] == x){
                a = i;
                break;
            }
            i++;
        }
        return a;
    }
}
