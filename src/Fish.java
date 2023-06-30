public class Fish extends Body implements Walkable{

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " плывет");
    }

    @Override
    public void parts() {
        System.out.println(name + " имеет туловище и плавники");
    }
}
