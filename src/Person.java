public class Person implements Guy{
    @Override
    public void eat(){
        System.out.println("Sounds");
    }

    @Override
    public void makeSound() {
        System.out.println("Hello");
    }
}
