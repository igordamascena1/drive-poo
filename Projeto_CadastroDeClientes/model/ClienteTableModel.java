package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel{
	
	private String [] colunas = {"Nome", "Telefone", 
			"Email", "Sexo"};
	private ArrayList<Cliente> clientes = new ArrayList<>();
	
	//Construtor
	public ClienteTableModel(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return clientes.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int rowColumn) {
		Cliente cliente = clientes.get(rowIndex);
		switch(rowColumn) {
			case 0:
				return cliente.getNome();
			case 1:
				return cliente.getTelefone();
			case 2:
				return cliente.getEmail();
			case 3:
				return cliente.getSexo();
			default:
				return null;
		}

	}
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
		fireTableRowsInserted(clientes.size()-1, clientes.size()-1);
	}
	
	public void removerCliente(int indice) {
		if (indice >= 0 && indice < clientes.size()) {
			this.clientes.remove(indice);
			fireTableRowsDeleted(indice, indice);
		}
	}
	
	public int buscarCliente(String nome) {
		for (int i=0; i < clientes.size();i++) {
			if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}
	
	public void limparDados() {
		this.clientes.clear();
		fireTableDataChanged();
	}

}
