class MyHashSet {
    private boolean [][] storage;
    int bucket;
    int bucketItem;

    public MyHashSet() {
        this.bucket = 1000;
        this.bucketItem = 1000;
        this.storage = new boolean [bucket][];
    }
    
    private int Hash1(int key){
        return key % bucket;
    }
    
    private int Hash2(int key){
        return key / bucketItem;
    }
    
    public void add(int key) {
        int Hash1 = Hash1(key);
        int Hash2 = Hash2(key);
        
        if(storage[Hash1] == null)
        {
        if(Hash1 == 0){
            storage[Hash1] = new boolean[bucket + 1];
        }
        else{
            storage[Hash1] = new boolean[bucket];
        }
        
    }
        storage[Hash1][Hash2] = true;
        
        }
        
    public void remove(int key) {
        int Hash1 = Hash1(key);
        int Hash2 = Hash2(key);
        
        if(storage[Hash1] == null) return;
        
        storage[Hash1][Hash2] = false;
    }
    
    public boolean contains(int key) {
        int Hash1 = Hash1(key);
        int Hash2 = Hash2(key);
        
        if(storage[Hash1] == null) return false;
        
        return storage[Hash1][Hash2];
    } 
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */