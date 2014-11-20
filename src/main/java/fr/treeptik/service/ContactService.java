package fr.treeptik.service;

import fr.treeptik.dao.ContactDAO;
import fr.treeptik.dao.DAOFactory;
import fr.treeptik.dao.NumeroDAO;
import fr.treeptik.pojo.Contact;
import fr.treeptik.pojo.Numero;
import fr.treeptik.utils.ConnectionUtils;

public class ContactService {

	public static Contact create(Contact contact, Numero numero) {
		ContactDAO contactDAO = DAOFactory.getContactDAO();
		NumeroDAO numeroDAO = DAOFactory.getNumeroDAO();

		contactDAO.create(contact);

		numero.setIdContact(contact.getId());
		numeroDAO.create(numero);
		ConnectionUtils.commitTX();
		return contact;

	}
}
