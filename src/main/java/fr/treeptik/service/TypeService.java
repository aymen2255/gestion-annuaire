package fr.treeptik.service;

import java.util.List;

import fr.treeptik.dao.DAOFactory;
import fr.treeptik.dao.TypeDAO;
import fr.treeptik.pojo.Type;

public class TypeService {
	public static List<Type> getAllType() {
		TypeDAO typeDAO = DAOFactory.getTypeDAO();
		List<Type> types = typeDAO.findAll();
		
		return types;

	}
}
