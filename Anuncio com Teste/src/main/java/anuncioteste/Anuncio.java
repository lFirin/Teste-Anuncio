package anuncioteste;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Anuncio {

    public static void main(String[] args) {

        String nomeAnuncio = "Curso Marketing";
        String cliente = "Rogerio";
        double investimentoDiario = 100; 
        long quantidademaximaCliques = 0;
        int totalPessoas = 500;
        int compartilhamentoQuantidade = 100;
        double pessoasCompartilharam = 15.0/100.0;

        valorinvestido(investimentoDiario);
        totalvizualizacao(compartilhamentoQuantidade);
        totalpessoasclicaram(totalPessoas);
        totalpessoasquecompartilharam(pessoasCompartilharam, compartilhamentoQuantidade);


    }
    public static void valorinvestido (double investimentoDiario) {
    	LocalDate dataTermino = LocalDate.of(2021, Month.MAY, 15);
        LocalDate dataInicio = LocalDate.of(2021, Month.MAY, 7);
        long dias = ChronoUnit.DAYS.between(dataInicio, dataTermino);
        double valorTotal = dias * investimentoDiario;
        System.out.println("VALOR TOTAL INVESTIDO: " + valorTotal);
    }


    public static void totalvizualizacao(int compartilhamentoQuantidade) {
        int totalVizualizacao = compartilhamentoQuantidade * 40;
        System.out.println("TOTAL DE VIZUALIZAÇÃO: " +totalVizualizacao);
    }


    public static void totalpessoasclicaram(int totalPessoas) {
        double pessoasClicaram = totalPessoas * (12.0/100.0);
        System.out.println("QUANTIDADE MAXIMA DE CLIQUES: " +pessoasClicaram);
    }

    public static void totalpessoasquecompartilharam(double pessoasCompartilharam, int compartilhamentoQuantidade) {
        compartilhamentoQuantidade *= pessoasCompartilharam;
        System.out.println("QUANTIDADE MAXIMA DE COMPARTILHAMENTO: " +compartilhamentoQuantidade);
    }

}
