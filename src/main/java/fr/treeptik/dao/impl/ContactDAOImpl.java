package fr.treeptik.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import fr.treeptik.dao.ContactDAO;
import fr.treeptik.pojo.Contact;
import fr.treeptik.utils.ConnectionUtils;

public class ContactDAOImpl implements ContactDAO {

	public Contact create(Contact contact) {
		try {
			Connection connection = ConnectionUtils.getConnection();
			//insert new contact
			String sql = "insert into contact (nom, prenom) values(?,?)";
			PreparedStatement statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, contact.getNom());
			statement.setString(2, contact.getPrenom());
			statement.executeUpdate();
			ResultSet idContact = statement.getGeneratedKeys();
			idContact.next();
			
	contact.setId(idContact.getInt(1));
		} catch (Exception e) {
			// TODO: handle exception
		}

		return contact;
	}

	public Contact update(Contact obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Contact obj) {
		// TODO Auto-generated method stub

	}

	public Contact find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
