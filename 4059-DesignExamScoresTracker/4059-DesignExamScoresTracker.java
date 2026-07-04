// Last updated: 7/4/2026, 7:40:51 PM
class ExamTracker {
    List<Integer> arr = new ArrayList<>();
    List<Long> psum = new ArrayList<>();
    public ExamTracker() {
        
    }
    
    public void record(int time, int score) {
        arr.add(time);
        if(psum.size()==0){
            psum.add((long)score);
        }
        else{
            psum.add(psum.get(psum.size()-1)+score);
        }
    }
    
    public long totalScore(int startTime, int endTime) {
        int start = bs(startTime);
        int end = be(endTime);

        if(start>end || start == arr.size() || end == -1){
            return 0;
        }

        long total = 0;
        total += (long) psum.get(end);
        if(start-1>=0){
            total -= (long)psum.get(start-1);
        }
        return total;
    }
    public int bs(int startTime){
        int low = 0;
        int high = arr.size()-1;

        int ans = arr.size();
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)>=startTime){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }
    public int be(int endTime){
        int low = 0;
        int high = arr.size()-1;

        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)<=endTime){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */