public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancePlayer tim = new EnhancePlayer("Tim",200,"Sword");
        System.out.println("Initial health is " + tim.healthRemaining());

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagePrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagePrinted, printer.getPagesPrinted());

        pagePrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagePrinted, printer.getPagesPrinted());
    }

}