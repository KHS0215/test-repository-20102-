import java.util.Scanner;

public class rPtksrl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(�� ������ �����ڸ� �Է����ּ��� ->>);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		swich (operator){
			
		case '+';
				Add add = new Add();
				add.setValue(a,b);
				System.out.printin(add.calculate());
				break;
				
		case '-';
				Sub sub = new Sub();
				sub.setValue(a,b);
				System.out.printin(sub.calculate());
				
		case '*';
				Mul mul = new Mul();
				mul.setValue(a,b);
				System.out.printin(mul.calculate());
				break;
				
		case '/';
				Div div = new Div();
				div.setValue(a,b);
				System.out.printin(div.calculate());
				break;
		}

	}

}
