package assignment6;

 class cat implements Animals {

	public void speak() {
		System.out.println("cat speaks like mee aa hoo mee aa hoo");

	}

	@Override
	public void eat() {
		System.out.println("cat loves to eat MILK ");

	}
 }
	class dog implements Animals {

		public void speak() {
			System.out.println("dogs barks likes boo boo booo booo");

		}

		@Override
		public void eat() {
			System.out.println("dog likes to eat BONES ");

		}
	}
		class assignment6
		{

	public static void main(String[] args) {
		Animals a=new dog();
		a.speak();
		a.eat();
		Animals c=new cat();
		c.speak();
		c.eat();
		

	}

}
