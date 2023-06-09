package lesson_1.task_2;

//для оптимизации имплементировать интерфейс Moveable
//public abstract class Car {
public abstract class Car implements Moveable{

    //заменить уровень доступа на private
    //public Engine engine;
    private Engine engine;
    private String color;
    private String name;

    //start можно вынести в отдельный интерфейс
    protected void start(){
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
