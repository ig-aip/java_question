package Projeckts;

public class BaseSyntaksis2 {
    public static void main(String[] args) {
        System.out.println("Ракета запуститься через");
        for (int i = 10; i > 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Поехали!");
    }
}
