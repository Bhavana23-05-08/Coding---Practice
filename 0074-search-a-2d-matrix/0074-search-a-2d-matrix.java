class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length,c = matrix[0].length;
        int low = 0,high = r*c-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int value = matrix[mid/c][mid%c];
            if(value==target) return true;
            else if(value<target) low = mid+1;
            else high = mid -1;
        }
        return false;
        
    }
}