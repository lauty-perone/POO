package ar.edu.unlp.info.oo2.Ejercicio14;

import java.util.Collection;
import java.util.List;

public class Proxy implements DatabaseAccess{
	
	private String password;
	private boolean login;
	private DatabaseAccess databaseRealAccess;

	public Proxy(String password, DatabaseAccess databaseRealAccess) {
		this.password = password;
		this.databaseRealAccess = databaseRealAccess;
	}
	
	public void authenticate(String password) {
		this.login = this.password.equals(password);
	}
	
	public void closeSession() {
		this.login = false;
	}
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (!this.login)
			throw new RuntimeException("Access denied or incorrect password");
		return this.databaseRealAccess.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (!this.login)
			throw new RuntimeException("Access denied or incorrect password");
		return this.databaseRealAccess.insertNewRow(rowData);
	}
}
