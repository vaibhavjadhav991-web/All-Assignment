package assignment7;
 class Book{
	 String title, author;
	 static String libraryName = "City Library";
	 final int ISBN = 12345;
	 
	 Book(String title, String author)
	 {
		 this.title = title;
		 this.author = author;
	 }
	 
	 void display()
	 {
		 System.out.println("Title:"+this.title);
		 System.out.println("Author:"+this.author);
	 }
	 
	 void getdescription() {
		 System.out.println("This is a physical Book");
	 }
	 
	 static void showLibrary() {
	        System.out.println("Library: " + libraryName);
	    }
	 void show() {
		 System.out.println(ISBN);
	 }
 }
 
 class Ebook extends Book{
	 String filesize;
	 
	 Ebook(String title, String author, String filesize){
		 super(title, author);
		 this.filesize = filesize;
	 }
		 
		void display() {
		   super.display();
		 System.out.println("File Size:"+this.filesize);
		 }
		
		void getdescription() {
			super.getdescription();
			 System.out.println("This is an electronic Book");
		 }
		 
	 
 }

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ebook eb = new Ebook("Atomic Habits","James Clear","5MB");
		eb.display();
		eb.getdescription();
		Book.showLibrary();
		eb.show();
		//eb.ISBN = 678; //Trying to modify final ISBN getting run time error
		
		String booktitle = "JAVA PROGRAMMING";
		
		System.out.println(booktitle.toUpperCase());
		System.out.println(booktitle.length());
		System.out.println(booktitle.contains("JAVA"));		
		

	}

}
