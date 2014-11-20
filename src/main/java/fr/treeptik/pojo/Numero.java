package fr.treeptik.pojo;

public class Numero {

	private int id;
	private String tel;
	private Integer idContact;
	private int idType;

	public Numero() {
		super();
	}

	public Numero(String tel, Integer idContact, int idType) {
		super();
		this.tel = tel;
		this.idContact = idContact;
		this.idType = idType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getIdContact() {
		return idContact;
	}

	public void setIdContact(Integer idContact) {
		this.idContact = idContact;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}
	



}
