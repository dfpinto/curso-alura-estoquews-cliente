package br.com.caelum.estoque.cliente;

public class TesteClienteSoap {

	public static void main(String[] args) {
		EstoqueWS cliente = new EstoqueWSClient().getEstoqueWSClientPort();
		
		Filtros filtros = new Filtros();
		Filtro filtro = new Filtro();
		filtro.setNome("IP");
		filtro.setTipo("Celular");
		filtros.getFiltro().add(filtro);
		
		ListaItens todosOsItens = cliente.todosOsItens(filtros);
		
		for (Item lista : todosOsItens.getItem()) {
			System.out.println(lista.getNome());
		}
	}

}
