package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Computer computer = new Computer();

        System.out.println("Calulator 원 면적: " + calc.areaCircle(5));
        System.out.println("Computer 원 면적: " + computer.areaCircle(5));
    }
}
