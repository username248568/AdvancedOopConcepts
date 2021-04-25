
public class BookArray {
public static void main(String[] args) {
	Books [] books = new Books[10];
	
	books[0] = new Fiction("The Regulators");
	books[1] = new Fiction("Rant");
	books[2] = new Fiction("Battle Royale");
	books[3] = new Fiction("The DaVinci Code");
	books[4] = new Fiction("A Study in Scarlet");
	books[5] = new NonFiction("The New Jim Crow");
	books[6] = new NonFiction("The Emperor of All Maladies");
	books[7] = new NonFiction("The Immortal Life of Henrietta Lacks");
	books[8] = new NonFiction("Bloodlands");
	books[9] = new NonFiction("Between the World and Me");
	
	System.out.println("Details: ");
	for(int i = 0; i < books.length; i++) {
		System.out.println("Book: " + books[i].getTitle());
		System.out.println("Price: " + books[i].getPrice() + "$");
		}
	}
}
