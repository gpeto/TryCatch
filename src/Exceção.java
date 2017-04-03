import java.io.IOException;
import java.util.Scanner;

public class Exceção {
static Scanner l = new Scanner(System.in);
	public static void main(String[] args) {
	//	int num;
		try{
			System.out.println("Digite um numero: ");
			int num = l.nextInt(); 
		}catch(Exception erro){
			System.out.println("O código apresenta um erro! \nO erro é: " + erro);
			//System.out.println(erro.printStackTrace());
		}finally{
			System.out.println("Fim");
		}
	}

}
