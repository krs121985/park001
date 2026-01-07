package oop.modifier6.practice;

public class Book {
	String name;
	String category;
	int page;
	int price;
	String standard;
//---------------------------------------------
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	//---------------------------------------------
		public String getName() {
			return this.name;
		}
		public String getCategory() {
			return this.category;
		}
		public int getPage() {
			return this.page;
		}
		public int getPrice() {
			return this.price;
		}
		public String getStandard() {
			return this.standard;
		}
	//---------------------------------------------
		public Book(String name, String category, int page, int price){
		this.setName(name);
		this.setCategory(category);
		this.setPage(page);
		this.setPrice(price);
		this.setStandard("대여가능");
		}
		
		public Book(String name, String category, int page, int price, String standard){
		this.setName(name);
		this.setCategory(category);
		this.setPage(page);
		this.setPrice(price);
		this.setStandard(standard);
		}
		
	public void show() {
		System.out.println("<강좌 정보>");
		System.out.println("강좌명 : " + this.getName());
		System.out.println("카테고리 : " + this.getCategory());
		System.out.println("강의시간 : " + this.getPage());
		System.out.println("수강료 : " +  this.getPrice());
		System.out.println("훈련유형 : " + this.getStandard());
	}
}
