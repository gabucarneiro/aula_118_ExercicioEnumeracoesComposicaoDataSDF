package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Post1;
import entities.Comment1;

public class Program1 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		Date now = new Date();
		System.out.println(sdf.format(now));
		System.out.println();
		
		System.out.print("Title: ");
		String title = sc.nextLine();
		System.out.print("Content: ");
		String content = sc.nextLine();
		System.out.print("Likes: ");
		int likes = sc.nextInt();
		Post1 post1 = new Post1(sdf.parse("21/06/2018 13:05:44"), title, content, likes);
		
		System.out.print("Number of comments: ");
		int nCmt = sc.nextInt();
		for(int i=0; i<nCmt; i++) {
			System.out.print("Type the comment: ");
			Comment1 comment1 = new Comment1(sc.next());
			post1.addComment1(comment1);
		}
		System.out.println();
		System.out.println("--------------------");
		System.out.println("New comments about this post: ");
		System.out.println(post1.toString());
		
		sc.close();
	}

}
