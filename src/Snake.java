public class Snake extends Body implements Walkable{

    public Snake(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " ползет");
    }

    @Override
    public void parts() {
        System.out.println(name + " имеет туловище");
    }
}
