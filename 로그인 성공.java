class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        int flag1 = 0, flag2 = 0;
        
        for(int i=0;i<db.length;i++){
            for(int j=0; j<2; j++){
                if(id_pw[j].equals(db[i][j])){
                    if(j==0) flag1 = 1;
                    else if(j==1) flag2 = 1;
                }
            }
            if(flag1 == 1 && flag2 == 1){
                answer ="login";  break;
            }
            else if(flag1 == 1 && flag2 == 0){
                answer = "wrong pw"; break;
            }
            flag1 = 0;
            flag2 = 0;
        }
        
        return answer;
    }
}