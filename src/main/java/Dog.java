public class Dog extends Pet {
    // Instance variable(s)
    private String breed;


    // Constructors
    public Dog(String a, int b, String c) {
        super(a,b);
        this.breed=c;
    }
    public Dog(String a, int b) {
        super(a,b);
        this.breed="Husky";

    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Ruff!");
    }

    // toString method
    public String toString() {
        String str = "Name: " + getName()+ ", Age: " + getAge() +"Breed:" + this.breed;
        return str;
    }

    // Getter
public String getBreed() { return this.breed; }

    // Setter
    public void setBreed(int classYear) {
        this.breed = breed;
    }
}