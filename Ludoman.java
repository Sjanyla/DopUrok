import java.util.List;
import java.util.Random;

public abstract class Ludoman extends Hero {

    public Ludoman(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.LUDOMAN);

    }

        @Override
        public void applySuperPower(Boss boss, Hero[] heroes) {
            System.out.println("===============LUDOMAN Super Ability");
            Random random = new Random();

            int firstDice = random.nextInt(6) + 1;
            int secondDice = random.nextInt(6) + 1;
            System.out.println("Doice1: "+ firstDice+" Dice 2: "+secondDice);

            if (firstDice == secondDice) {
                boss.setHealth(boss.getHealth() - (firstDice * secondDice));
                System.out.println("Ludoman hits the boss: "+(firstDice*secondDice));
            } else {
                int sum = firstDice + secondDice;
                for (Hero hero : heroes) {
                    hero.setHealth(hero.getHealth() - sum);
                    break;
                }
                System.out.println("Ludoman hits the ally: "+(firstDice+secondDice));
            }
        }

    }


