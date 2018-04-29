package AAA;
class A {
	 public void go(){
		 System.out.println("a");
	 }
	
}

  class B extends A{
	 public void go(){
		 System.out.println("b");
	 }
	 public static void main(String args[]){
			A a=new A();
			B b=new B();
			a.go();
			b.go();
	 }
}
 


