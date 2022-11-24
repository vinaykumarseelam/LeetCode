class MyHashMap {
 class Node{
     int key;
     int val;
     Node next;
     
     public Node(int key, int val){
         this.key = key;
         this.val = val;
     }
 }
    private Node[] storage;
    private int buckets;
    public MyHashMap() {
        this.buckets =1000;
        this.storage = new Node[this.buckets];
    }
    
    private Node find(Node head,int key){
        Node prev = null;
        Node curr = head;
        
        while(curr != null && curr.key != key){
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
    
    private int hash1(int key){
        return key%this.buckets;
    }
    
    public void put(int key, int value) {
        int hash1 = hash1(key);
        if(storage[hash1] == null){
            storage[hash1] = new Node(-1,-1);
        }
         Node prev = find(storage[hash1],key);
         if (prev.next == null){ 
              prev.next = new Node(key, value);
            }
            else{
                prev.next.val = value;
            }
        }
    
    
    public int get(int key) {
        int hash1 = hash1(key);
        
        if(storage[hash1] == null) return -1;
        Node prev = find(storage[hash1], key);
        
        if(prev.next == null) return -1;
        return prev.next.val;
    }
    
    public void remove(int key) {
        int hash1 = hash1(key);
        
        if(storage[hash1] == null) return;
        Node prev = find(storage[hash1], key);
        if(prev.next == null) return;
            prev.next = prev.next.next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */