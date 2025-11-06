package SisNoticacoes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notificacao> canaisDeNotificacao = new ArrayList<>();

        canaisDeNotificacao.add(new EmailNotificacao("usuario@exemplo.com"));
        canaisDeNotificacao.add(new SMSNotificacao("+5511999998888"));
        canaisDeNotificacao.add(new PushNotificacao("TOKEN_XYZ_123"));

        String mensagemAlerta = "Seu pedido saiu para entrega!";

        System.out.println("--- Disparando Notificações ---");
        for (Notificacao canal : canaisDeNotificacao) {
            canal.enviar(mensagemAlerta);
        }
    }
}