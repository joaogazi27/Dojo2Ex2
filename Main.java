package br.unirio.bs1.tp2.dojo2.teste3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int typeSelected;
        Tanker berserker = new Tanker();
        Wizard wizard = new Wizard();
        Witcher witcher = new Witcher();

        System.out.println("Escola a classe do seu guerreiro:\n[1]-Berserker\n[2]-Mago\n[3]-Bruxo");
        typeSelected = scanner.nextInt();

        while(typeSelected != 1 && typeSelected != 2 && typeSelected !=3){
            System.out.println("Termo iválido!");
            System.out.println("Escola a classe do seu guerreiro:\n[1]-Berserker\n[2]-Mago\n[3]-Bruxo");
            typeSelected = scanner.nextInt();
        }

        if(typeSelected == 1){
        String berserkerName = berserker.getName();
        int berserkerLevel = berserker.getLevel();
        String berserkerWeapon = berserker.getWeapon();
        String berserkerHability = berserker.selectHability();
        int berserkerShield = berserker.useShield();

        System.out.println("Guerreiro criado com sucesso!\n");
        System.out.println("Nome: "+berserkerName);
        System.out.println("Level: "+berserkerLevel);
        System.out.println("Arma: "+berserkerWeapon);
        System.out.println("Habilidade Ultimate: "+berserkerHability);
        if(berserkerShield == 1){
            System.out.println("Escudo: Ativado");
        }
        else
            System.out.println("Escudo: Desativado");
        }
        else if(typeSelected == 2){
            String wizardName = wizard.getName();
            int wizardLevel = wizard.getLevel();
            String wizardWeapon = wizard.getWeapon();
            String wizardHability = wizard.selectHability();
            String wizardSpell = wizard.getSpells();

            System.out.println("Nome: "+wizardName);
            System.out.println("Level: "+wizardLevel);
            System.out.println("Arma: "+wizardWeapon);
            System.out.println("Habilidade Ultimate: "+wizardHability);
            System.out.println("Magia aprendida: "+wizardSpell);

        }
        else{
        String witcherName = witcher.getName();
        int witcherLevel = witcher.getLevel();
        String witcherWeapon = witcher.getWeapon();
        String witcherHability = witcher.selectHability();
        String witcherSpell = witcher.getSpells();
        int witcherShield = witcher.useShield();

        System.out.println("Nome: "+ witcherName);
        System.out.println("Level: "+witcherLevel);
        System.out.println("Arma: "+witcherWeapon);
        System.out.println("Habilidade Ultimate: "+witcherHability);
        System.out.println("Magia aprendida: "+witcherSpell);
        if(witcherShield == 1)
             System.out.println("Escudo: Ativado");
        else
            System.out.println("Escudo: Desativado");
        }
    }
}
