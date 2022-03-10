
package ex4;
import javafx.application.Platform;
import javafx.scene.control.Button;

public class Runnableper  extends Thread {
    
    public Button button;
    public String nome;
    public int prioridade = Thread.MIN_PRIORITY;
    
    public Runnableper(Button v1 , String v2){
    button=v1;
    nome=v2;
    }
    
    @Override
    public  void run(){
    Thread.currentThread().setPriority(prioridade);
    System.out.println(Thread.currentThread().getName() + " - Prioridade: " + Thread.currentThread().getPriority());
    
    for (int i= 1; i<=600;i++){
    
        Platform.runLater(()-> button.setLayoutX(button.getLayoutX()+1));
        if (button.getLayoutX()==350){
            System.out.println(Thread.currentThread().getName() + " - Chegou!!!");
            }
        
        }
    sleep1();
    
    
        
        }
    public void sleep1() {
        int l=0;
        for (int j=l;j<=4000000;j++){
         if (1% 3 ==0){ l=l+2;}
         if(l%2==0){l=l+1;}
         l=l+1;
        }
     }
}


