class ChildThread extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("child"+i);
        }
    }
}
class MultiThreading{
    public static void main(String[] args) {
        ChildThread obj=new ChildThread();
        obj.start(); //this will randomly call and both functions can run simultaneously
        for(int i=1;i<=100;i++){
            System.out.println("main"+i);
        }
    }
}