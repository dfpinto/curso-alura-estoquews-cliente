package br.com.caelum.estoque.cliente;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestaClienteURL {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/estoquews-servidor/teste?wsdl");
		QName qname = new QName("http://ws.estoque.caelum.com.br/","EstoqueWSClient");
		Service service = Service.create(url,qname);
		EstoqueWS cliente = service.getPort(EstoqueWS.class);
		
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
