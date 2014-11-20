package fr.treeptik.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import fr.treeptik.dao.NumeroDAO;
import fr.treeptik.pojo.Numero;
import fr.treeptik.utils.ConnectionUtils;

public class NumeroDAOImpl implements NumeroDAO{

	public Numero create(Numero numero) {
		try {
			Connection connection = ConnectionUtils.getConnection();
			String sql = "insert into numero (tel, id_contact, id_type) values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, numero.getTel());
			statement.setInt(2, numero.getIdContact());
			statement.setInt(3, numero.getIdType());
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return numero;
	}

	public Numero update(Numero obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Numero obj) {
		// TODO Auto-generated method stub
		
	}

	public Numero find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
