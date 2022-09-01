package nested_classes.inner_class;

public class Car {
        String color;
        int doorCount;
        Engine engine;
        static int a;

        public Car(String color, int doorCount) {
            Engine e = new Engine(200);
            System.out.println(e.horsePower);
            this.color = color;
            this.doorCount = doorCount;
//            this.engine = this.new Engine(horsePower); // создается объект класса. Чтобы создать обектвнутреннего класса. Нужно создать внешний класс
        }
        public void setEngine (Engine engine) {

            this.engine = engine;
        }

        @Override
        public String toString() {
            return "My car: {" +
                    "color='" + color + '\'' +
                    ", doorCount=" + doorCount +
                    ", engine=" + engine +
                    '}';
        }
        public  class Engine {
            private int horsePower;
            // в этом классе нельзя делать статик переменные

            public Engine(int horsePower) {
                this.horsePower = horsePower;

            }

            @Override
            public String toString() {
                return "My engine: {" +
                        "horsePower=" + horsePower +
                        '}';
            }
        }
    }
    class Test {
        public static void main(String[] args) {

            Car car = new Car("black", 4);
            Car.Engine engine = car.new Engine(150);
            car.setEngine(engine);
            System.out.println(engine);
            System.out.println(car);

            Car.Engine engine2 = car.new Engine(150);
        }
}
