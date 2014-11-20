package fr.treeptik.runtime;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import fr.treeptik.pojo.Contact;
import fr.treeptik.pojo.Numero;
import fr.treeptik.service.ContactService;

public class Main {

	public static void main(String[] args) {

		/*
		 * Contact contact = new Contact("aa", "aa"); Numero numero = new
		 * Numero("2222222900", contact.getId(), 1);
		 * 
		 * ContactService.create(contact, numero);
		 */
		
		Contact contact = new Contact("Dupond", "Jean");
		List<Numero> numeros;
		Numero numero = new Numero();
		numeros.add("111");
		contact.setNumeros(numeros);
	 
		File f = new File ("contact.objet");
		File fxml = new File ("contact-xml.objet");
		
		/*
		try
		{
		    ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (f));
		    oos.writeObject (contact);
		    oos.close();
		}
		catch (IOException exception)
		{
		    System.out.println ("Erreur lors de l'écriture : " + exception.getMessage());
		}
		
		System.out.println("*********************");
		
		
		
		
		
		
		
		
		try
		{
		    ObjectInputStream ois = new ObjectInputStream (new FileInputStream (f));
		    Contact p2 = (Contact) ois.readObject();
		    ois.close();
		 
		    System.out.println (p2.getId());
		}
		catch (ClassNotFoundException exception)
		{
		    System.out.println ("Impossible de lire l'objet : " + exception.getMessage());
		}
		catch (IOException exception)
		{
		    System.out.println ("Erreur lors de l'écriture : " + exception.getMessage());
		}*/
		try {	
			encodeToFile(contact, "contact-xml.objet");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void encodeToFile(Object object, String fileName) throws FileNotFoundException, IOException {
        // ouverture de l'encodeur vers le fichier
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(fileName));
        try {
            // serialisation de l'objet
            encoder.writeObject(object);
            encoder.flush();
        } finally {
            // fermeture de l'encodeur
            encoder.close();
        }
    }

}
