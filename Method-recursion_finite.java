class RecursionExample {
static int count=0;
static void p() {
    count++;
    if(count<=100){
        System.out.println("Hello:"+count);
        p();
    }
}
public static void main(String args []){
    p();
}
}