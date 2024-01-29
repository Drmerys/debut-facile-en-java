package com.zerofiltre.parkingbot;

public class ParkingBot {


    /**
     * This is the main function of Java program
     * @param args This show data given in param when the program started
     */
    public static void main(String[] args) {
        sayHello(args[0]);
    }

    /**
     * Allow to welcome and show services for any users
     * @param args Show the user name
     */
    private static void sayHello(String args) {
        String welcomeMessage = "Bonjour " + args + ", Bienvenue au parking ZeroFiltre";
        String services = "Nous proposons les services suivant : Entretient, réparation etc.";
        String warning = "Dépechez-vous d'entrer car il n'y aura plus de place !!!";
        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
    }
}
