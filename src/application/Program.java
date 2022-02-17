package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i +" data:");
			System.out.print("Individual or company? (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			Double income = sc.nextDouble();
			
			if(ch=='i') {
				
				System.out.print("Health expenditures: ");
				Double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, income, gastosSaude));
				
			} else {
				
				System.out.print("Number of employees: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, income, numFuncionarios));
				
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0;
		for(Person p : list) {
			double tax = p.tax();
			System.out.println(p.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", sum));
		
		sc.close();
	}

}
