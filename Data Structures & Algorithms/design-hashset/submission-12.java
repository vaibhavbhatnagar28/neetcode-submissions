class LinkedList{
    int data;
    LinkedList next;

    public LinkedList(int key){
        this.data = key;
        this.next = null;
    }

}

class MyHashSet {

    private final LinkedList[] set;

    public MyHashSet() {
        set = new LinkedList[10000];
    }
    
    public void add(int key) {
        int index = key%set.length;
        if(set[index]==null){
            set[index] = new LinkedList(key);
        }
        else{
            LinkedList temp = set[index];
            while(temp.next!=null){
                if(temp.data ==key)return;
                temp = temp.next;
            }
            if(temp.data == key)return;
            temp.next = new LinkedList(key);
        }
    }
    
    public void remove(int key) {
        LinkedList temp = set[key%set.length];
        if(temp==null)return;
        if(temp.data == key){
            temp = temp.next;
            set[key%set.length] = temp;
            return;
        }
        while(temp.next!=null){
            if(temp.next.data ==key){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        return;     
    }
    
    public boolean contains(int key) {
        LinkedList temp = set[key%set.length];
        if(temp == null)return false;
        if(temp.data == key) return true;
        while(temp.next!= null){
            if(temp.data == key)return true;
            temp = temp.next;
        }
        if(temp.data ==key)return true;
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