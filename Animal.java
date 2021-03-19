class Animal {
    public static int numAnimals = 0;
    
    public Animal() {
        numAnimals += 1;
    }
    public void move() {
        System.out.println("Move from point A to point B generically.");
    }
    public void hunt() {
        System.out.println("Generically capture prey and eat it.");

    }
}