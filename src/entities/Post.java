package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	Date moment;
	String titulo;
	String conteudo;
	Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {}

	public Post(Date moment, String titulo, String conteudo, Integer likes, List<Comment> comments) {
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comentario) {
		comments.add(comentario);
	}
	public void removeComment(Comment comentario) {
		comments.remove(comentario);
	}
	

}

