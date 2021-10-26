/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa.*/

package application;

import entities.Pessoa;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Locale + Scanner definition */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        /* Name request */
        System.out.print("Digite o nome: ");
        String name = scanner.nextLine();

        /* Birthdate request (Day, Month, Year) */
        System.out.println("Digite a data do seu nascimento: ");
        System.out.print("Dia: ");
        int day = scanner.nextInt();
        System.out.print("Mês: ");
        int month = scanner.nextInt();
        System.out.print("Ano: ");
        int year = scanner.nextInt();

        /* Height request */
        System.out.println("Digite a altura em metros: ");
        double height = scanner.nextDouble();

        /* Turning separated variables into a single LocalDate variable */
        LocalDate birthDate = LocalDate.of(year, month, day);

        /* Instantiate the object */
        Pessoa pessoa = new Pessoa(name, birthDate, height);

        /* Calculate the age using calculateAge method */
        int age = pessoa.calculateAge(birthDate);


        // Print the results using toString() method + calculated age
        System.out.println(pessoa);
        System.out.print("Idade: " + age + " anos");
    }
}
