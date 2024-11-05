package Tarea8.src;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws Exception {
        Reloj reloj = new Reloj();
        Timer timer  = new Timer();

        TimerTask tarea = new TimerTask() {
            public void run(){
                reloj.incrementar();
                System.out.println(reloj.toString());
            }
        };
        
        timer.scheduleAtFixedRate(tarea, 0, 1000);
    }
}
