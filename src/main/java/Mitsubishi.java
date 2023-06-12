public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return this.getClass().getName() + " -> startEngine()";
    }


    @Override
    public String accelerate() {
        return this.getClass().getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return this.getClass().getName() + " -> brake()";
    }
}
