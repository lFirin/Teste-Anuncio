package anuncioteste;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

public class AnuncioTest {

	@Test
	public void testValorinvestido() {
		Anuncio anun = new Anuncio();
		double investimentoDiario = 100;
		 LocalDate dataTermino = LocalDate.of(2021, Month.MAY, 15);
	        LocalDate dataInicio = LocalDate.of(2021, Month.MAY, 7);
	        long dias = ChronoUnit.DAYS.between(dataInicio, dataTermino);
	        double valorTotal = dias * investimentoDiario;
	        assertEquals(800.0, dias, valorTotal);
	}

	@Test
	public void testTotalvizualizacao() {
		Anuncio anun = new Anuncio();
		int compartilhamentoQuantidade = 100;
		int totalVizualizacao = compartilhamentoQuantidade * 40;
		assertEquals(4000, totalVizualizacao);
		
	}

	@Test
	public void testTotalpessoasclicaram() {
		Anuncio anun = new Anuncio();
		 int totalPessoas = 500;
		 double pessoasClicaram = totalPessoas * (12.0/100.0);
		 assertEquals(totalPessoas, totalPessoas);
	}

	@Test
	public void testTotalpessoasquecompartilharam() {
		Anuncio anun = new Anuncio();
		int compartilhamentoQuantidade = 100;
		double pessoasCompartilharam = 15.0/100.0;
		compartilhamentoQuantidade *= pessoasCompartilharam;
		assertEquals(15, compartilhamentoQuantidade);
	}

}
