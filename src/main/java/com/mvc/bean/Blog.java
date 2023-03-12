package com.mvc.bean;

public class Blog {
	private int num_blog , id_user;
	private String titre, soustitre , contenu;
	
	public Blog(int n , String titre , String soustitre, String contenu , int id_user) {
		this.setNum_blog(n);
		this.setTitre(titre);
		this.setSoustitre(soustitre);
		this.setContenu(contenu);
		this.setId_user(id_user);
	}



	public int getNum_blog() {
		return num_blog;
	}

	public void setNum_blog(int num_blog) {
		this.num_blog = num_blog;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSoustitre() {
		return soustitre;
	}

	public void setSoustitre(String soustitre) {
		this.soustitre = soustitre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


	public int getId_user() {
		return id_user;
	}


	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

}
