package principais_implementacoes.queue;

import principais_implementacoes.queue.digitalInovation.Celular;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Queue<Celular> celularQueue = new LinkedList<>();

        celularQueue.add(new Celular("LG"));
        celularQueue.add(new Celular("Samsung"));
        celularQueue.add(new Celular("Apple"));

        System.out.println(celularQueue.add(new Celular("Xiaomi")));
        System.out.println(celularQueue);
        System.out.println(celularQueue.offer(new Celular("Xiaomi")));
        System.out.println(celularQueue);
        System.out.println(celularQueue.peek());
        System.out.println(celularQueue.poll());
        System.out.println(celularQueue);
        System.out.println(celularQueue.isEmpty());
        System.out.println(celularQueue.size());


    }
}
