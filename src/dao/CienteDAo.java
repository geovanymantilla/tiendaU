package dao;

import entities.Cliente;
import util.Conexion;

public class CienteDAo extends Conexion<Cliente> implements GenericDao<Cliente> {

	public CienteDAo() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

}
