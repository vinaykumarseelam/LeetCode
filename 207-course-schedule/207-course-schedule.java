class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        int [] indegrees = new int[numCourses];
        
        for(int [] prereq: prerequisites){
            indegrees[prereq[0]]++;
            
            //independent to dependent
            // Adding independent to dependent to the Map
            if(!map.containsKey(prereq[1])){
                map.put(prereq[1], new ArrayList<>());
            }
            map.get(prereq[1]).add(prereq[0]);
            
        }
        Queue<Integer> q = new LinkedList<>();
        
        int count =0;
        for(int i=0; i< numCourses; i++){
            if(indegrees[i] == 0){
                q.add(i);
                count++;
            }
        }
            
            if(q.isEmpty()) return false;
            if(count == numCourses) return true;
            
            while(!q.isEmpty()){
                int curr = q.poll();
                //reduce the indegrees of babies
                
                List<Integer> children = map.get(curr);
                if(children != null){
                    for(int child: children){
                        indegrees[child]--;
                        if(indegrees[child] == 0){
                            q.add(child);
                            count++;
                            if(count == numCourses) return true;
                        }
                    }
                }
            }
        
        return false;
    }
}