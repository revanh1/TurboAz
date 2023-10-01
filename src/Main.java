public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("audi", 76000, 2022, 3.6);
        Cars car2 = new Cars("mercedes", 32000, 2016, 2.0);

        Cars[] cars = {car1, car2};

        for(Cars car: cars){
            System.out.println(car.carName);
        }

    }
}