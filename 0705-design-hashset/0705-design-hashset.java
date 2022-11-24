class MyHashSet {
 private boolean [][] storage;
    int bucket;
    int bucketsItems;

    public MyHashSet() {
        this.bucket = 1000;
        this.bucketsItems = 1000;
        this.storage = new boolean[bucket][];
    }
    private int hash1(int key){
        return key%bucket;
    }
    private int hash2(int key){
        return key/bucketsItems;
    }
    public void add(int key) {
        int hash1 = hash1(key);
        int hash2 = hash2(key);
        if(storage[hash1] == null) {
            if(hash1 == 0 ){
                storage[hash1] = new boolean[bucketsItems + 1];
            }
            else{
               storage[hash1] = new boolean[bucketsItems];
            }
            
        }
        storage[hash1][hash2] = true;
    }
    
    public void remove(int key) {
        int hash1 = hash1(key);
        int hash2 = hash2(key);
        
        if(storage[hash1]== null) return;
        else{
            storage[hash1][hash2] = false;
        }
    }
    
    public boolean contains(int key) {
        int hash1 = hash1(key);
        int hash2 = hash2(key);
        
        if(storage[hash1]== null) return false;
        return storage[hash1][hash2];
}
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */