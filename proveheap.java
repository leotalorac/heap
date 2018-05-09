import java.util.Scanner;

/**
 * proveheap
 */
public class proveheap {

    public static void main(String[] args) {
        heap l  = new heap();
        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        while(keep){
            try{
                System.out.println("What do you want to do?");
                System.out.println("1. Create a new heap" + "\n" + "2. insert on the existent heap" + "\n" + "3. delete the max" + "\n" + "4. show the max" + "\n" + "5. exit");
                int o = sc.nextInt();
                switch(o){
                    case 1:
                        l = new heap();
                    case 2:
                        System.out.println("How many elements do you want put?");
                        int t = sc.nextInt();
                        for(int i=0;i<t;i++){
                            System.out.println("insert the element " + (i+1) );
                            int s = sc.nextInt();
                            if(!(l.ihaveit(s))){
                                l.insert(s);
                            }else{
                                System.out.println("the element is already on the heap");
                                i--;
                            }
                            
                        }
                        break;
                    case 3:
                        l.delete();
                        break;
                    case 4:
                        System.out.println("the max is " +l.getRoot());
                        break;
                    case 5:
                        keep = false;
                        break;
                }
                System.out.println("the actual heap is: " +l.printheap());
            }catch(java.util.InputMismatchException e){
                System.out.println("this is not option try again");
                keep=false;
            }
        }
    }


}