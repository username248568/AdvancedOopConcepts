
public class UseBook {
public static void main(String [] args) {
	Books [] books = new Books[6];
	books[0] = new Fiction("The Regulators");
	books[1] = new Fiction("Rant");
	books[2] = new Fiction("Battle Royale");
	books[3] = new NonFiction("he New Jim Crow");
	books[4] = new NonFiction("Bloodlands");
	books[5] = new NonFiction("The Immortal Life of Henrietta Lacks");
	
	for(int i = 0; i < books.length; ++i)
		System.out.println("Book: " + books[i].getTitle() + ", Price: " + books[i].getPrice() + "$");
}
}
