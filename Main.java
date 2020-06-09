package com.company;

public class Main {
    public static void main(String[] args) {
        Machine firstMachine = new Engine(8, 16, "white");
        Machine secondMachine = new ProductionEngine(2, 6.8, "green");
        Machine thirdMachine = new Engine(45, 10, "red");
        HeatManager fourthMachine = new WrapperEngine(4, 18.0);
        HeatManager fifthMachine = new HeatEngine(19, 26.6);
        HeatManager sixthMachine = new HeatEngine (23, 33.33);
        Machine[] machines = {firstMachine, secondMachine, thirdMachine};
        for (int i = 0; i < machines.length; i++) {
            System.out.println((i + 1) + "-а машината .. ");
            System.out.println("Мощност: " + machines[i].getPower());
        }
        HeatManager[] heatManagers = {fourthMachine, fifthMachine, sixthMachine};
        for (int i = 0; i < heatManagers.length; i++) {
            System.out.println((i + 1) + "-а топлинна машина .. ");
            System.out.println("Макс. температура: " + heatManagers[i].getMaxTemp());
        }
    }
}
