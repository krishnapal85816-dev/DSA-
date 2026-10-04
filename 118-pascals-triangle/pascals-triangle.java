class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>answer = new ArrayList<>();
         
         for(int i=0;i<numRows;i++){
             List<Integer>unlist = new ArrayList<>();
             for(int j=0;j<=i;j++){
               if (j == 0 || j == i) {

                    unlist.add(1);
                }
                else{
                    int sum = answer.get(i-1).get(j-1)+answer.get(i-1).get(j);
                     unlist.add(sum);
                }
               
             }
             answer.add(unlist);
         }
         return answer;
        
    }
}