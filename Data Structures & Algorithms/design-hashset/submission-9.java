class MyHashSet {

    private static class NodeList{
        int key;
        NodeList next;

        NodeList(int key){
            this.key = key;
        }
    }

    NodeList[] set;
    public MyHashSet() {
        set = new NodeList[1000];
        for(int i =0; i<set.length; i++){
            set[i] = new NodeList(0);
        }
    }
    
    public void add(int key) {
        NodeList cur = set[key % set.length];
        while(cur.next != null){
            if(cur.next.key == key){
                return;
            }
            cur = cur.next;
        }
        cur.next = new NodeList(key);
    }
    
    public void remove(int key) {
        NodeList cur = set[key % set.length];
        while(cur.next != null){
            if(cur.next.key == key){
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }
    
    public boolean contains(int key) {
        NodeList cur = set[key% set.length];
        while(cur.next != null){
            if(cur.next.key == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */