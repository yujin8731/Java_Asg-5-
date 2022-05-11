package ASG5;

public class EX9 {
        public int[] solution(int [] nums){

            int[] answer=new int[nums.length];
            for (int i=0; i<nums.length;i++)
                for(int j=i+1;j<nums.length;j++){
                    if(i%2==0&&nums[i]<nums[j]){
                        answer[i]++;
                    }else if(i%2==0&&nums[i]>nums[j])
                        answer[i]++;

                }
            return answer;
        }



}
