public class Human extends Body implements Walkable{
    String position;

    // Перегрузим конструктор - создадим две версии. Теперь можно создавать разные версии объектов. Первый Human принимает
    // только имя, второй имя и должность
    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void walk() {
        System.out.println(name + " идет");
    }

    @Override
    public void parts(){                         // Переопределяем метод parts
        System.out.println(name + " имеет туловище, руки и ноги");
    }
}
