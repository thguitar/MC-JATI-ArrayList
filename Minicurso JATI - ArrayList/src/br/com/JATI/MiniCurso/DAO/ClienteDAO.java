package br.com.JATI.MiniCurso.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.JATI.MiniCurso.MODEL.Cliente;

public class ClienteDAO {
	private List<Cliente> clientes;
	
	public ClienteDAO() {
		clientes = new ArrayList<Cliente>();
		for (int i = 0; i < 100; i++) {
			clientes.add(new Cliente((i+1), 
					"Cliente MiniCurso JATI "+String.valueOf(i+1),
					"Rua do Cliente Minicurso JATI "+String.valueOf(i+1),
					"Observação do Cliente Minicurso JATI"+String.valueOf(i+1)));
		}
	}
	
	public List<Cliente> getClientes(){
		return this.clientes;
	}
}
