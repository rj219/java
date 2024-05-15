abstract class Abs {
	public abstract void display();

	public void print() {
		System.out.println("runinng print");
	}
}

class AbsImpl extends Abs {

	@Override
	public void display() {

		System.out.println("runing display");
	}

}

public class O013_AbstractDemo {
	public static void main(String[] args) {

		// Abs abs = new Abs();
		AbsImpl impl = new AbsImpl();
		impl.display();
		impl.print();

	}
}
