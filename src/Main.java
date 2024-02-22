public class Main {
    public static void main(String[] args) {

        // 2 задание
        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car();

        // First car
        firstCar.brand = "Subaru";
        firstCar.model = "Impreza";
        firstCar.year = 1997;

        // Second car
        secondCar.brand = "Lamborghini";
        secondCar.model = "Diablo";
        secondCar.year = 2002;

        // Third car
        thirdCar.brand = "Mercedes";
        thirdCar.model = "GLE500";
        thirdCar.year = 2017;

        // First car start and stop engine
        firstCar.stopEngine();
        firstCar.stopEngine();

        // First car start and stop engine
        secondCar.startEngine();
        secondCar.stopEngine();

        // First car start and stop engine
        thirdCar.startEngine();
        thirdCar.stopEngine();

        // 3 task Calculator
        // Addition
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.addition(4, 5));

        //isGreater
        System.out.println(myCalculator.isGreater(3.50, 5.50));

        // 4 task NumberManipulator
        NumberManipulator manipulator = new NumberManipulator();


        int number = 6;
        System.out.println("Initial number: " + number);

        int incrementedNumber = manipulator.incrementByTen(number);
        System.out.println("Number after increment: " + incrementedNumber);

        int decrementedNumber = manipulator.decrementByEleven(number);
        System.out.println("Number after decrement: " + decrementedNumber);
    }}