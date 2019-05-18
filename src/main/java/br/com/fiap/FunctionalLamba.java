package br.com.fiap;

public class FunctionalLamba {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        };
        new Thread(r).start();
    }
}
