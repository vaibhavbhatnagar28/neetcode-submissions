

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

  class MyHashSet {
        ArrayList<Integer> array = new ArrayList<>();

        public void MyHashSet() {
            ArrayList<Integer> array_init = new ArrayList<>();
            array = array_init;
        }
        
        public void add(int key) {
            if(!array.contains(key)){
                array.add(key);
            }
        }

        public void remove(int key) {
            if(array.contains(key)){
                array.remove(array.indexOf(key));
            }            
        }
        
        public boolean contains(int key) {
            return array.contains(key);
        }
    }