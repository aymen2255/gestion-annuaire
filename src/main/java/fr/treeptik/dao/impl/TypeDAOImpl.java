package fr.treeptik.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.dao.DAOFactory;
import fr.treeptik.dao.TypeDAO;
import fr.treeptik.pojo.Type;
import fr.treeptik.utils.ConnectionUtils;

public class TypeDAOImpl implements TypeDAO {

	public Type create(Type t) {
		try {
			Connection connection = ConnectionUtils.getConnection();
			String sql = "insert into type (type) values(?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, t.getType());
			statement.executeUpdate();
			ConnectionUtils.commitTX();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return t;
	}

	public Type update(Type obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Type obj) {
		// TODO Auto-generated method stub

	}

	public Type find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	public  List<Type> findAll() {
		List<Type> types = new ArrayList<Type>();
		try {
			Connection connection = ConnectionUtils.getConnection();
			String sql = "select * from type";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			
			
			while (result.next()) {
				Type type = new Type(result.getString("type"));
				types.add(type);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return types;
	}
}








