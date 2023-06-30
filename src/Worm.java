public class Worm extends Body implements Walkable{

    public Worm(String name) {
         this.name = name;
    }

    @Override
    public void parts() {
        System.out.println(name + " имеет туловище");
    }

    @Override
    public void walk() {
      System.out.println(name + " ползет");
    }

    @Override           // Переопределяем метод eyes для того, чтобы не выводить глаза у червяка - делаем заглушку
    public void eyes(){

    }
}
