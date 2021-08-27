package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		Date hoje = new Date();
		Post novoPost = new Post();
		System.out.println("TIME NOW: "+ sdf.format(hoje));
		System.out.println();
		
		/*Post p1 = new Post(sdf.parse("21/06/2021 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		System.out.println("-- "+p1.getTitle()+" --");
		System.out.println("Content:");
		System.out.println(p1.getContent());
		
		for(int i=0; i<3; i++) {
			System.out.print("New comment: ");
			String comment1 = sc.nextLine();
			Comment cmt = new Comment(comment1);
			p1.addComment(cmt);
		}
		Comment c1 = new Comment ("Have a nice trip.");
		Comment c2 = new Comment ("Wow, that's awesome!");
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("-- "+p1.getTitle()+" --");
		System.out.println("Content:");
		System.out.println(p1.getContent());
		System.out.println("Comments:");

		for(Comment c: p1.getComments()) {
			System.out.println(c.getText());
		}
		*/
		System.out.println("What would you do?");
		System.out.println("1 - Keep record of a post.");
		System.out.println("2 - Add comment.");
		System.out.println("3 - Exit.");
		int whatToDo = sc.nextInt();
		while (whatToDo != 3) {
			switch (whatToDo) {
			case 1:
				System.out.print("- Would you like to keep record of a Post?\n");
				System.out.print("Title: \n");
				String title = sc.next();
				System.out.print("Content: \n");
				String content = sc.next();
				System.out.print("Likes: \n");
				int likes = sc.nextInt();

				novoPost = new Post(hoje, title, content, likes);
				System.out.println("\n ---- Post saved ---- \n" + novoPost);
				
				System.out.println("What would you do now?");
				System.out.println("1 - Keep record of a post.");
				System.out.println("2 - Add comment.");
				System.out.println("3 - Exit.");
				whatToDo = sc.nextInt();
				break;
			case 2:
				String newComment = "y";
				while (!newComment.equals("n")) {
					System.out.printf("New comment: %n");
					String comment1 = sc.next();
					Comment cmt = new Comment(comment1);
					novoPost.addComment(cmt);
					// Pode ser feito também da forma abaixo:
					//novoPost.addComment(new Comment(comment1));

					System.out.printf("New comment? y/n \n");
					newComment = sc.next();
				}
				try {
					if (novoPost.getTitle() != null) {
						System.out.println(novoPost.toString());
					}
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
				System.out.println("What would you do now?");
				System.out.println("1 - Keep record of a post.");
				System.out.println("2 - Add comment.");
				System.out.println("3 - Exit.");
				whatToDo = sc.nextInt();
				break;
			}
		}
		System.out.println();
		System.out.println("---------- END OF RECORDS ----------");
		
		/*
		Comment c3 = new Comment ("Good night.");
		Comment c4 = new Comment ("May the Force be with you");
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow!", 5);
			
		p2.addComment(c3);
		p2.addComment(c4);
		*/
		//System.out.println(p1);		
		//System.out.println(p2);
		
		sc.close();
	}

}
