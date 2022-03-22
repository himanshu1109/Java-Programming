public class Pet {
    String name;
    String animal;
    int age;

    public Pet(String name, String animal, int age){
        this.name = name;
        this.animal = animal;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Pet p = new Pet("Tommy","Dog",10);
        System.out.println("Name is : " + p.name);
        System.out.println("Animal is : " + p.animal);
        System.out.println("Age is : " + p.age);
    }
}
