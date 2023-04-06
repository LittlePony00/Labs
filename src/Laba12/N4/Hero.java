package N4;

import java.util.Arrays;

public abstract class Hero {

    protected String username;
    protected int level;

    public Hero(String username, int level) {
        this.setUsername(username);
        this.setLevel(level);
    }


    public void setUsername(String username){
        if (username.length() < 5) throw new IllegalArgumentException("Length of name should be more than 5");

        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setLevel(int level){
        if (level < 0) throw new IllegalArgumentException("Level should be a positive number");

        this.level = level;
    }

    protected abstract String action();

    public String toString() {
        return this.getClass().getSimpleName() + " " + this.username + " [" + this.level + " level] " + "is offline";
    }

    public static Hero createHero(String hero){
        Hero person = null;
        String[] parameters = hero.split(" ");
;
        String name = parameters[2];
        int[] arr = new int[parameters.length - 3];
        for (int i = 3; i < parameters.length; i++){
            arr[i-3] = Integer.parseInt(parameters[i]);
        }

        if (parameters[1].equalsIgnoreCase("elf")){
            person = new Elf(name, arr[0], arr[1]);

        }else if (parameters[1].equalsIgnoreCase("wizard")){
            person = new Wizard(name, arr[0], arr[1], arr[2]);

        }else if (parameters[1].equalsIgnoreCase("knight")){
            person = new Knight(name, arr[0], arr[1], arr[2]);
        }
        System.out.println(parameters[0] + " " + name + " [" + arr[0] + " level]" + " is online");

        return person;
    }
}
