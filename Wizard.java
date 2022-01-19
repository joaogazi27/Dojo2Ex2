package br.unirio.bs1.tp2.dojo2.teste3;
import java.util.Scanner;
public class Wizard implements Magical{
    private String name;
    private int level,chosenWeapon,chooseHability;
    private String weapon, hability, spell;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String getName(){
        System.out.print("Digite o nome de seu Mago:");
        name = scanner.nextLine();
        return name;
    }
    @Override
    public int getLevel(){
        System.out.print("Digite o nível de seu Mago:");
        level = scanner.nextInt();
        return level;
    }
    @Override
    public String getWeapon(){
        System.out.println("Escolha uma arma:\n[1]-Varinha\n[2]-Cajado");
        chosenWeapon = scanner.nextInt();

        while(chosenWeapon != 1 && chosenWeapon != 2){
            System.out.println("Dado inválido!");
            System.out.println("Escolha uma arma:\n[1]-Varinha\n[2]-Cajado");
            chosenWeapon = scanner.nextInt();
        }

        if(chosenWeapon == 1){
            weapon = "Varinha";
        }
        else
            weapon = "Cajado";

        return weapon;
    }
    @Override
    public String selectHability(){
        System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque de Fogo\n[2]-Ataque de Gelo");
        chooseHability = scanner.nextInt();

        while(chooseHability != 1 && chooseHability != 2){
            System.out.println("Dado Inválido.");
            System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque de Fogo\n[2]-Ataque de Gelo");
            chooseHability = scanner.nextInt();
        }

        if(chooseHability == 1){
            hability = "Ataque de Fogo";
        }
        else
            hability = "Ataque de Gelo";

        return hability;

    }
    @Override
    public String getSpells(){
        scanner.nextLine();
        System.out.print("Digite A magia que seu Mago usará (Concede +2 de Ataque):");
        spell = scanner.nextLine();
        return spell;

    }
}
