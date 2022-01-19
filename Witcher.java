package br.unirio.bs1.tp2.dojo2.teste3;
import java.util.Scanner;
public class Witcher implements Armored,Magical{
    private String name;
    private int level;
    private String weapon, hability,spell;
    private int shield, chosenWeapon, chooseHability;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String getName(){
        System.out.print("Digite o nome de seu Bruxo:");
        name = scanner.nextLine();
        return name;
    }
    @Override
    public int getLevel(){
        System.out.print("Digite o nível de seu Bruxo:");
        level = scanner.nextInt();
        return level;
    }
    @Override
    public String getWeapon(){
        System.out.println("Escolha uma arma:\n[1]-Espada de Prata\n[2]-Cajado Amaldiçoado");
        chosenWeapon = scanner.nextInt();

        while(chosenWeapon != 1 && chosenWeapon != 2){
            System.out.println("Dado Inválido");
            System.out.println("Escolha uma arma:\n[1]-Espada de Prata\n[2]-Cajado Amaldiçoado");
            chosenWeapon = scanner.nextInt();
        }
        if(chosenWeapon == 1){
            weapon = "Espada de Prata";
        }
        else
            weapon = "Cajado Amaldiçoado";

        return weapon;
    }
    @Override
    public String selectHability(){
        System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque Amaldiçoado\n[2]-Magia de Fogo");
        chooseHability = scanner.nextInt();

        while(chooseHability != 1 && chooseHability != 2){
            System.out.println("Dado Inválido.");
            System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque Amaldiçoado\n[2]-Magia de Fogo");
            chooseHability = scanner.nextInt();
        }

        if(chooseHability == 1){
            hability = "Ataque Amaldiçoado";
        }
        else
            hability = "Magia de Fogo";
        return hability;

    }
    @Override
    public String getSpells(){
        scanner.nextLine();
        System.out.print("Digite A magia que seu Bruxo usará (concede +1 de Ataque):");
        spell = scanner.nextLine();
        return spell;

    }
    @Override
    public int useShield(){
        System.out.print("O escudo concede +1 de Defesa, mas sem escudo concede +1 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
        shield = scanner.nextInt();

        while(shield != 1 && shield != 0){
            System.out.println("Dado Inválido!");
            System.out.print("O escudo concede +1 de Defesa, mas sem escudo concede +1 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
            shield = scanner.nextInt();
        }

        return shield;
    }
}
