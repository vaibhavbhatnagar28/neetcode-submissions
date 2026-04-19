class NodeList{
    int data;
    NodeList next;
    NodeList(int key){
        this.data = key;
        this.next = null;
    }
}


class MyHashSet {

    NodeList[] set;

    public MyHashSet() {
        set = new NodeList[10000];
    }
    
    public void add(int key) {
        int index = key%set.length;
        if(set[index]==null){
            set[index] = new NodeList(key);
            return;
        }
        else{
            NodeList temp = set[index];
            if(temp.data == key)return;
            while(temp.next!=null){
                temp = temp.next;
                if(temp.data == key)return;
            }
            temp.next = new NodeList(key);
        }
    }
    
    public void remove(int key) {
        NodeList temp = set[key%set.length];
        if(temp==null)return;
        if(temp.data == key){
            temp = null;
            set[key%set.length]=temp;
            return;
        }
        while(temp!= null){
            if(temp.next.data == key){
                temp.next = temp.next.next;
                return;
            }
        }
    }
    
    public boolean contains(int key) {
        NodeList temp = set[key%set.length];
        if(temp == null)return false;
        while(temp!=null){
            if(temp.data == key)return true;
            temp = temp.next;
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