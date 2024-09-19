public class Program {
    public static void main(String[] args) {
        try {
            while(true) {
                Thread.sleep(10000);
                System.out.println("hello from agent");
            }
        
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}