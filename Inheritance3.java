class Fruit {
public void eat() {
    System.out.println("I can eat");
  }
}
	class Orange extends Fruit {
	public void eat() {
	super.eat();
        System.out.println("I eat orange fruits");
  	}
	public void talk() {
        System.out.println("I can talk");
  	}
}

	class Main {
  	public static void main(String[] args) {
	Fruit winter = new Orange();
	winter.eat();
    	winter.talk();
  }
}
