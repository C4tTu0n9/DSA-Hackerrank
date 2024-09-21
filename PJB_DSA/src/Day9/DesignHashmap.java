package Day9;

import java.util.ArrayList;

public class DesignHashmap {

    ArrayList<Integer> keys = new ArrayList<>();
    ArrayList<Integer> values = new ArrayList<>();
    public DesignHashmap() {

    }

    public void put(int key, int value) {
        if(keys.isEmpty()){
            keys.add(key);
            values.add(value);
            return;
        }
        for (int i = 0; i < keys.size(); i++) {
            if(keys.get(i) == key){
                values.set(i, value);
                return;
            }
        }
        keys.add(key);
        values.add(value);
    }

    public int get(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if(keys.get(i) == key){
                return values.get(i);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if(keys.get(i) == key){
                keys.remove(i);
                values.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        DesignHashmap dhm = new DesignHashmap();
        dhm.put(1, 1);
        dhm.put(2, 12);
        dhm.put(3, 123);
        dhm.put(4, 5);
        dhm.put(1, 10);
        for(int i : dhm.values){
            System.out.print(i+" -> ");
        }
        System.out.println();
        dhm.remove(1);
        for(int i : dhm.values){
            System.out.print(i+" -> ");
        }
        System.out.println();
        System.out.println(dhm.get(4));
        System.out.println(dhm.get(10));
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
