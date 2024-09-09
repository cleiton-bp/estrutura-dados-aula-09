import aula.Fatorial;
import aula.Recursiva;

public class Main {
    public static void main(String[] args) {

        System.out.println("aula de fatorial");
//        Fatorial f = new Fatorial();
//
//        System.out.println(f.fatorial(30));

        System.out.println("aula de recursividade");
        System.out.println(" ");

        Recursiva r = new Recursiva();

        int[] lista = new int[150_000_000];


        for (int i = 0; i < 100000000 -1; i++) {
            lista[i] = (int)(Math.random() * 100);
        }



//        imprimeFatorial(lista);
        double tempoInicio = System.nanoTime(); //Pega o tempo inicial em nano segundo
        r.mergeSort(lista,0, lista.length -1); //Ordena o vetor com mergeSort
        double tempoFim = System.nanoTime(); //Pega o tempo final em nano segundo
        double tempoNano = tempoFim - tempoInicio; //Calculo o tempo gasto em nano
        double tempoMili = tempoNano / 1_000_000; //Converte para milisegundos
        double tempoSeg = tempoNano / 1_000_000_000; //Converte para segundos

        System.out.println("tempo inicio " + tempoInicio);
        System.out.println("tempo fim " + tempoFim);
        System.out.println("tempo nano " + tempoNano);
        System.out.println("tempo mili " + tempoMili);
        System.out.println("tempo segundo " + tempoSeg);
    }

    public static void imprimeFatorial(int[] vetor) {
        for(int vet : vetor){
            System.out.print(vet + " ");
        }
        System.out.println();
    }


}