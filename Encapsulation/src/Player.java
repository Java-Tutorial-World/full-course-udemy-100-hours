public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damaged){
        health = health - damaged;
        if (health <= 0){
            System.out.println("player knocked out of game");
        }
    }

    public  int healthRemaining(){
        return  health;
    }

    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        if (health > 100){
            System.out.println("Player restored to 100 percent");
            health = 100;
        }
    }
}
