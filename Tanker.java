package br.unirio.bs1.tp2.dojo2.teste3;
import java.util.Scanner;
public class Tanker implements Armored{
    private String name;
    private int level, chooseHability, chooseWeapon;
    private String weapon, hability;
    private int shield;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String getName(){
        System.out.print("Digite o nome de seu Berserker:");
        name = scanner.nextLine();

        return name;
    }

    @Override
    public int getLevel(){
        System.out.print("Digite o nível de seu Berserker:");
        level = scanner.nextInt();

        return level;
    }

    @Override
    public String getWeapon(){
        System.out.println("Escolha uma arma:\n[1]-Espada Longa\n[2]-Espada Curta");
        chooseWeapon = scanner.nextInt();
        while(chooseWeapon != 1 && chooseWeapon != 2){
            System.out.println("Dado Inválido!");
            System.out.println("Escolha uma arma:\n[1]-Espada Longa\n[2]-Espada Curta");
            chooseWeapon = scanner.nextInt();
        }

        if(chooseWeapon == 1){
            weapon = "Espada Longa";
        }
        else
            weapon = "Espada Curta";

        return weapon;

    }

    @Override
    public String selectHability(){
        System.out.println("Escolha uma entre as habilidades:\n[1]-Defesa Ultimate\n[2]-Ataque Ultimate");
        chooseHability = scanner.nextInt();

        while(chooseHability != 1 && chooseHability != 2){
            System.out.println("Dado Inválido.");
            System.out.println("Escolha uma entre as habilidades:\n[1]-Defesa Ultimate\n[2]-Ataque Ultimate");
            chooseHability = scanner.nextInt();
        }

        if(chooseHability == 1){
            hability = "Defesa Ultimate";
        }
        else
            hability = "Ataque Ultimate";

        return hability;

    }

    @Override
    public int useShield(){
        System.out.print("O escudo concede +2 de Defesa, mas sem escudo concede +2 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
        shield = scanner.nextInt();

        while(shield != 1 && shield != 0){
            System.out.println("Dado Inválido!");
            System.out.print("O escudo concede +2 de Defesa, mas sem escudo concede +2 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
            shield = scanner.nextInt();
        }

        return shield;
    }
}
