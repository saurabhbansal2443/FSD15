package ImplementArrayList;

class CustomArrayList {

    private int[] arr;
    private int size;

    CustomArrayList() {
        this.arr = new int[10];
        this.size = 0;
    }

    CustomArrayList(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    // public void addFirst(int val) {
    //     if (this.size == 0) {
    //         this.arr[0] = val;
    //         size++;
    //     }
    // }

    public void push(int val){

        if(this.arr.length == this.size-1){
            int[] narr = new int[2*size]; 

            for(int i=0 ; i<this.arr.length ; i++){
                narr[i] = this.arr[i]; 
            }
            this.arr = narr ; 
        }
        this.arr[size] = val ; 
        size++; 
    }

    public int pop(){
        int ele = this.arr[this.size-1];
        this.size--; 
        return ele ;  
    }




}

public class Index {
    public static void main(String[] args) {

    }
}
