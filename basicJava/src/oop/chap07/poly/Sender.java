package oop.chap07.poly;
abstract public class Sender {
	String name;
	Sender(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract public void print();
	
}

