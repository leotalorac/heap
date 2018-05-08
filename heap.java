import java.util.ArrayList;

/**
 * heap
 */
public class heap {
    private ArrayList<Integer> heaplist = new ArrayList<>();
    private int size;
    public heap(){
        heaplist.add(0,0);
        size = 0;
    }
    public void switchUp(int index){
        while(((int)index/2) > 0){
            if (heaplist.get(index) > heaplist.get((int)index/2)){
                int tem = heaplist.get((int)index/2);
                heaplist.set((int)index/2, heaplist.get(index));
                heaplist.set(index,tem);
            }
            index = (int)index/2;
        }
    }
    public void switchDown(int index){
        while((index*2)<= this.size){
            int midpos = this.mid(index);
            if (heaplist.get(index) < heaplist.get(midpos)){
                int tem = heaplist.get(index);
                heaplist.set(index, heaplist.get(midpos));
                heaplist.set(midpos,tem);
            }
            index = midpos;
        }
    }
    public int mid(int i){
        if ((int)(i * 2 + 1) > this.size)
            return (i * 2);
        else{
            if (heaplist.get(i*2) > heaplist.get(i*2+1))
                return (i * 2);
            else
                return (i * 2 + 1);
        }
    }
    public void insert(int k){
        if(!heaplist.contains(k)){
            this.heaplist.add(k);
            this.size++;
            this.switchUp(this.size);
        }else{
            System.out.println("This number is already on the heap");
        }
        
    }
    public void delete(){
        int val = this.heaplist.get(1);
        //System.out.println(val);
        this.heaplist.set(1,this.heaplist.get(heaplist.size()-1));
        size--;
        heaplist.remove(heaplist.size()-1);
        this.switchDown(1);
    }
    public String printheap(){
        String a = this.heaplist.toString();
        a = a.substring(4,a.length());
        a = "[" +a;
        return a;
    }
    public int getRoot(){
        return heaplist.get(1);
    }
}