public abstract class Sports {
    public abstract void Game();
    void describe() {
    System.out.println("we ar playing...");
    }
}

class Indoor extends Sports {
    @Override
    public void Game() {
    System.out.println("uno is fav game..");
    }
}

class Outdoor extends Sports {
    @Override
    public void Game() {
    System.out.println("cricket is fav game..");
    }
}

class Main {
    public static void main(String[] args) {
        Sports s1 = new Indoor();
        s1.describe();
        s1.Game();

        Sports s2 = new Outdoor();
        s2.Game();
    }
}
