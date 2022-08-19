import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* LRU缓存
*
* */
public class Main166 {
    int cas;
    LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>(cas);
    public static void main(String[] args) {
        Main166 main166=new Main166(1);
        main166.put(2,1);
        System.out.println(main166.get(1));
    }


    public Main166(int capacity){
     this.cas=capacity;
    }
    public  int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
//       让key变成最近使用
        makeRecently(key);
        return map.get(key);
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            map.put(key,value);
            makeRecently(key);
            return;
        }
       if(map.size()>=this.cas){
//           找到头节点的值
            int oldKey=map.keySet().iterator().next();
            map.remove(oldKey);
       }
        map.put(key,value);
    }
    private void makeRecently(int key){
        int val=map.get(key);
//       放入到队尾中
        map.remove(key);
        map.put(key,val);
    }
}
