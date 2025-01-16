class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        return dfs(0, k, visited, dungeons);
    }
    public int dfs(int depth, int k, boolean[] visited, int[][] dungeons){
        int answer = depth;
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                answer = Math.max(answer, dfs(depth+1, k-dungeons[i][1], visited, dungeons));
                visited[i]=false;
            }
        }
        return answer;
    }
}