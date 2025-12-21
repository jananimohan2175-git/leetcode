class Solution {
    public int minDeletionSize(String[] strs) {
    int n=strs.length;
    int m = strs[0].length();
    boolean[] sorted = new boolean[n-1];
    int deletecount=0;
    for(int col=0;col<m;col++)
    {
      boolean notdel=false; 
      for(int row=0;row<n-1;row++)
      {
        if(!sorted[row] && strs[row].charAt(col) > strs[row+1].charAt(col))
        {
            notdel=true;
            break;
        }
      }  
      if(notdel)
      {
        deletecount++;
      }
      else
      {
        for(int row=0;row<n-1;row++)
        {
            if(!sorted[row] && strs[row].charAt(col) < strs[row+1].charAt(col))
            {
                sorted[row] = true;
            }
        }
      }
    }
    return deletecount;
    }
}