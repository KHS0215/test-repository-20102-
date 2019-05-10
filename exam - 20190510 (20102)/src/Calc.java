
public class Calc {
	public static void main(String[] args) {
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		char operator = scanner.next().charAt(0);
		switch (operator){
		case '+';
			Add add = new add;
			add.setValue(a,b);
			System.out.println(add.calculate());
			break;
			
		case '-';
			Sub sub = new sub();
			sub.setValue(a,b);
			System.out.println(sub.calculate());
			break;
			
		case '*';
			Mul mul = new Mul;
			mul.setValue(a,b);
			System.out.println(mul.calculate());
			break;
		
		case '/';
			Div div = new Div();
			div.setValue(a,b);
			System.out.println(div.calculate());
			break;
		
		default;
			System.out.println("잘못된 연산자입니다.");
		}
		scanner.close();
	}
}
