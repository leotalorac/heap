/**
 * proveheap
 */
public class proveheap {

    public static void main(String[] args) {
        heap l = new heap();
        int[] lis = {18,2,13,9,6,32,25,3,7,15,4,1,8};
        for(int i=0;i<lis.length;i++){
            l.insert(lis[i]);
        }
        System.out.println(l.printheap());
        l.delete();
        System.out.println(l.printheap());
        l.insert(1);
        System.out.println(l.printheap());
        l.insert(64);
        System.out.println(l.printheap());
        l.delete();
        l.delete();
        l.delete();
        System.out.println(l.printheap());
    }

}