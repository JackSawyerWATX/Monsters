class Main {
    public static void main(String[] args) {
  
      Player player1 = new Player();
    System.out.println(player1.name);
    System.out.println(player1.skill);
    System.out.println(player1.health);
  
      Player player2 = new Player("Teddy", "Broadsword Slash", 100);
    System.out.println(player2.name);
    System.out.println(player2.skill);
    System.out.println(player2.health);
  
     // Creating Object of Monster 
       Monster monster = new Monster("Minotaur", "ARGGHH", 100);
     // Call the -- method from Monster
       //monster.Monster();
  
    for (int i = 1; i <= 5; i++) {
        player1.attack(monster);
      }
      
    }
  }