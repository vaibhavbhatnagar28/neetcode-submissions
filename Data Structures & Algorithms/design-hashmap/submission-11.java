class NodeList{
    int key;
    int value;
    NodeList next;

    public NodeList(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}


class MyHashMap {
    NodeList[] set;

    public MyHashMap() {
        set = new NodeList[1000];
    }
    
    public void put(int key, int value) {
        int index = key%set.length;
        if(set[index]==null){
            set[index] = new NodeList(key, value);
        } else{
            NodeList temp = set[index];
            if(temp.key == key){
                temp.value = value;
                return;
            }
            while(temp.next != null){
                if(temp.key == key){
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            temp.next = new NodeList(key, value);
        }
    }
    
    public int get(int key) {
        int index = key%set.length;

        NodeList temp = set [index];
        if(temp == null)return -1;

        if(temp.key == key)return temp.value;

        while(temp!= null){
            if(temp.key == key)return temp.value;
            temp = temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key%set.length;
        NodeList temp = set[index];
        if(temp == null)return;
        if(temp.key == key){
            set[index] = temp.next;
            return;
        }
        while(temp.next!= null){
            if(temp.next.key ==key){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */