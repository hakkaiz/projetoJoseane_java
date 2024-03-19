package util;

import java.util.Timer;
import java.util.TimerTask;

public class limparMensagem {
    public static void clearMessageAfterDelay() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Limpa a mensagem anterior da tela usando caracteres de escape ANSI
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }, 5000); // 5000 milissegundos = 5 segundos
    }
}
