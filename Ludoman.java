import java.util.List;
import java.util.Random;

public abstract class Ludoman extends Hero {

    private Random random = new Random();

    public Ludoman(int health, int damage, String name, SuperAbility ability, Random random) {
        super(health, damage, name, SuperAbility);
        this.random = random;
    }

    public void useAbility(Boss boss, List<Hero> team) {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        System.out.println("Ludoman : " + ", Бросает кости: " + die1 + " && " + die2);
    }
        @Override
        public void applySuperPower(Boss boss, Hero[] heroes) {
            Random random = new Random();

            int firstDice = random.nextInt(6) + 1;
            int secondDice = random.nextInt(6) + 1;

            if (firstDice == secondDice) {
                boss.setHealth(boss.getHealth() - (firstDice * secondDice));
            } else {
                int sum = firstDice + secondDice;
                for (Hero hero : heroes) {
                    hero.setHealth(hero.getHealth() - sum);
                    break;
                }
            }
        }

    }


