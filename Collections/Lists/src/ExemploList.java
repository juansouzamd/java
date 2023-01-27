import java.util.*;

public class ExemploList {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Crie uma lista e adicione 7 notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(8d);
        notas.add(7.5);
        notas.add(5d);
        notas.add(2.5);
        notas.add(4d);
        notas.add(9d);
        notas.add(6.5);
    
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5.0));
        
        System.out.println("\nAdicione na lista a nota 8 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5d));

        System.out.println("\nExiba a terceira nota: ");
        System.out.println(notas.get(2));

        System.out.println("\nExiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator <Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma +=next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("\nRemova a nota 2.5: ");
        notas.remove(2.5);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator <Double> iterator01 = notas.iterator();
        while(iterator01.hasNext()){
            double next = iterator01.next();
            if(next < 7){
                iterator01.remove();
            }
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(notas.isEmpty());


    }
}
