import java.io.IOException;
import java.util.Scanner;

public class Exce��o {
static Scanner l = new Scanner(System.in);
	public static void main(String[] args) {
	//	int num;
		try{
			System.out.println("Digite um numero: ");
			int num = l.nextInt(); 
		}catch(Exception erro){
			System.out.println("O c�digo apresenta um erro! \nO erro �: " + erro);
			//System.out.println(erro.printStackTrace());
		}finally{
			System.out.println("Fim");
		}
	}

}
