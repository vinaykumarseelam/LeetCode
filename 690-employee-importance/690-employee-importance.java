/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer, Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        
        for(Employee e : employees){
            map.put(e.id, e);
        }
        
        int result =0;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        
        while(!q.isEmpty()){
            int eid = q.poll();
            Employee e = map.get(eid);
                result += e.importance;
            
            for (int subId : e.subordinates){
                q.add(subId);
            }
        }
        return result;
    }
}