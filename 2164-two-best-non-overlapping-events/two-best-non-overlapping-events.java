class Solution {
    public int maxTwoEvents(int[][] events) {
     Arrays.sort(events, (a,b) -> a[0] -b[0]);
      int n = events.length;
      int[]suffix= new int[n];
      suffix[n-1]=events[n-1][2];
      for(int i=n-2;i>=0;i--)
      {
        suffix[i]=Math.max(suffix[i+1],events[i][2]);
      }
      int ans=0;
      for(int i=0;i<n;i++)
      {
        ans=Math.max(ans,events[i][2]);
        int left = i+1,right = n-1;
        int next=-1;
        while(left<=right)
        {
        int mid = left + ( right - left ) / 2;
        if(events[mid][0]> events[i][1])
        {
            next = mid;
            right=mid-1;
        }
        else
        {
            left= mid+1;
        }
      }
      if(next!=-1)
      {
        ans= Math.max(ans,events[i][2]+suffix[next]);
      }
      }
      return ans;
    }
}