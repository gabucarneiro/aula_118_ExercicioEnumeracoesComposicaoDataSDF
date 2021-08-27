package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post1 {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	List<Comment1> comments1 = new ArrayList<>();
	
	public Post1() {
	}
	
	public Post1(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment1> getComments1() {
		return comments1;
	}
	
	public void addComment1(Comment1 comment1) {
		comments1.add(comment1);
	}
	public void removeComment1(Comment1 comment1) {
		comments1.remove(comment1);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title+"\n");
		sb.append(likes + " Likes");
		sb.append(" - "+ sdf.format(moment) +"\n");
		sb.append(content+"\n");
		int sum = 0;
		
		sb.append("\n");
		for(Comment1 cmt:comments1) {
			sb.append("Comment "+sum+":\n");
			sb.append(cmt.getText()+"\n");
			sum++;
			sb.append("\n");
		};
		
		return sb.toString();
	}
}
