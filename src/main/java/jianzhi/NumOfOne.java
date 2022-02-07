package jianzhi;

public class NumOfOne {
	public static void main(String[] args) {
		NumOfOne noo=new NumOfOne();
		System.out.println(noo.NumberOf1Between1AndN_Solution(12));
	}
	
	public int NumberOf1Between1AndN_Solution(int n) {
        int curr_num=0;
        int upper_num=0;
        int low_num=0;
        int tmp=n;
        int sum=0;
        int tag=0;
        while(tmp!=0){
            curr_num=tmp%10;
            upper_num=tmp/10;
            low_num= n%(int)(Math.pow(10, tag));
            if(curr_num>1){
                sum+=(upper_num+1)*Math.pow(10, tag);
            }
            if(curr_num==1) {
            	sum+=((upper_num)*Math.pow(10, tag)+low_num+1);
            }
            if(curr_num==0) {
            	sum+=(upper_num)*Math.pow(10, tag);
            }
            tmp/=10;
            tag++;
        }
        return sum;
    }
	
}
