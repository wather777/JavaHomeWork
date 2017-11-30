class Solution2 {
    public static int jump(int[] nums) {


        int pos = 0;
        int jumps = 0;
        boolean stopFlag=false;

        if (nums.length==1)
        {return 0;}
        else if  (nums.length <= nums[pos]+1) {
            return 1;
        } else {


            while (pos != nums.length - 1& stopFlag!=true) {

                jumps++;

                System.out.printf("pos:%d + num[pos]:%d >= nums.length-1:%d \n",pos,nums[pos],nums.length-1);
                if (pos+nums[pos]>=nums.length-1)
                return jumps;


                Integer nextPos = 0;
                Integer max = 0;


                for (int i = 0; i < nums[pos]; i++) {

                    System.out.printf("pos + i+1:%d+nums[pos + i]:%d>=nums.length-1:%d\n",pos + i+1,nums[pos + i+1],nums.length-1);

                    if(pos + i+1+nums[pos + i+1]>=nums.length-1)
                    {
                        jumps++;
                        System.out.println("Jumps:"+jumps);
                        stopFlag=true;
                        break;
                    }


                    if (pos + 1 + i < nums.length) {
                        if (max <= nums[pos + 1 + i]) {
                            max = nums[pos + 1 + i];
                            nextPos = pos + 1 + i;

                        }


                    } else
                        break;
                                                                                                                                                                                                                                             }


                pos = nextPos;


            }
            return jumps;
        }
    }
    public static void main(String[] args) {

        int[] arr ={9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5};

        System.out.println(jump (arr));
    }

}
