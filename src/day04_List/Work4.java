package day04_List;

import java.util.*;

public class Work4 {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		BookManager bm = new BookManager(list);
		bm.add(new Book("Java", new Author("James", 60), 100));
		bm.add(new Book("C++", new Author("Bjame", 70), 200));
		bm.add(new Book("Python", new Author("Rossum", 50), 300));
		bm.add(new Book("c++", new Author("Bjame", 71), 100));
		bm.add(new Book("c++", new Author("Bjame", 61), 300));
		System.out.println(list);
		
		//ɾ��һ��ͼ��
		bm.delete("c++");
		System.out.println(list);
		
//		//ɾ��ͬһ���ߵ�����ͼ��
//		bm.deleteAll("Bjame");
//		System.out.println(list);
		
		bm.sorts();
		System.out.println(list);
		
	}	
}

class BookManager {
	ArrayList<Book> list;
	BookManager(){}
	BookManager(ArrayList<Book> list){
		this.list = list;
	}
	// ���һ��ͼ��
	public void add(Book book) {
		list.add(book);
	}
	
	// ͨ������ɾ��һ����
	public void delete(String bookname) {
		ListIterator<Book> it = list.listIterator();
		while(it.hasNext()){
			Object o = it.next();
			if(o instanceof Book){
				if(((Book) o).bookname.equals(bookname)){
					it.remove();
					break;
				}
			}
		}
	}

	// ɾ��ͬһ���ߵ������鼮
	public void deleteAll(String authorname) {
		ListIterator<Book> ite = list.listIterator();
		while(ite.hasNext()){
			Object o = ite.next();
			if(o instanceof Book){
				if(((Book)o).author.getAuthorName().equals(authorname)){
					ite.remove();
				}
			}
		}
		
	}

	// ����
	public void sorts(){
		list.sort((t1,t2) -> {
			Book b1 = (Book)t1;
			Book b2 = (Book)t2;
			int num = b2.getPrice() - b1.getPrice();	//����۸����
			return num == 0?b1.getAuthor().getAuthorAge() - b2.getAuthor().getAuthorAge():num;//���������� 
		}
		);
	}

}

class Book {	
	String bookname;
	Author author;
	int price;
	Book() {}
	public Book(String bookname, Author author, int price) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public Author getAuthor(){
		return author;
	}
	
	public String toString() {
		return bookname + "," + author.getAuthorName()+","+author.getAuthorAge() + "," + price;
	}
	
}

class Author {
	private String authorName;
	private int authorAge;
	Author() {}
	public Author(String authorName, int authorAge) {
		super();
		this.authorName = authorName;
		this.authorAge = authorAge;
	}
	
	public String getAuthorName(){
		return authorName;
	}
	
	public int getAuthorAge(){
		return authorAge;
	}
	// public int hashCode(){
	// return aname.hashCode() *11;
	// }
	// public boolean equals(Object obj){
	// if(!(obj instanceof Author))
	// throw new RuntimeException();
	// Author author = (Author)obj;
	// return this.aname.equals(author.aname);//ͬ������,����true
	//
	// }
	
	public String toString() {
		return authorName + "," + authorAge;
	}
}
