package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionarioTercerizado;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionarios? ");
		Integer qtde = sc.nextInt();
		List<Funcionario> lista = new ArrayList<>();
		
		for(int i = 0; i<qtde; i++) {
			System.out.println("o funcioonario é tercerizado? (y/n)");
			String selecionar = sc.next();
			
			System.out.println("Nome do funcionario: ");
			String nome = sc.next();
			
			System.out.println("Horas de trabalho: ");
			Integer hora = sc.nextInt();
			
			System.out.println("Valor por hora");
			Double valorPorHora = sc.nextDouble();
			
			if(selecionar.equals("y")) {
				System.out.println("Adicional: ");
				Double adicioinal = sc.nextDouble();
				Funcionario funcionario = new FuncionarioTercerizado(nome, hora, valorPorHora, adicioinal);
				lista.add(funcionario);
			}else {
				Funcionario funcionario = new Funcionario(nome, hora, valorPorHora);
				lista.add(funcionario);
			}
		}
		
		System.out.println("Pagamento: ");
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario);
			System.out.println("-------------");
		}
		
		sc.close();
		
	}

}
