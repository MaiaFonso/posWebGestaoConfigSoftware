import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValoresTeste{
	
	@Test
	public void testeInsereValor() {
		Valores valores = new Valores();
		boolean inserirRetorno = valores.ins(1);
		assertEquals(true, inserirRetorno);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		valores.ins(1);
		assertEquals(false, valores.ins(1));
	}
	
	@Test
	public void testeDeletaValor() {
		Valores valores = new Valores();
		
		assertEquals(-1, valores.del(5));
		
		valores.ins(6);
		valores.ins(-1);
		valores.ins(2);
		valores.ins(5);
		
		int valorDeletado = 5;
		
		int deleteRetorno = valores.del(valorDeletado);
		assertEquals(0, deleteRetorno);
		
		assertEquals(-1, valores.del(100));
	}
	
	@Test
	public void testeSizeValor() {
		Valores valores = new Valores();
		int tamanhoRetorno = valores.size();
		assertEquals(0, tamanhoRetorno);
	}
	

}
