package Solutions;

import java.util.Scanner;

public class Solutions
{
    // Base class Animal
    static class Animal
    {
        // Variables
        private int IDtag;
        private String species;

        // Input method to read user entry
        public void input()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter IDtag: ");
            IDtag = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter species: ");
            species = scanner.nextLine();
        } // End of input()

        // Output method to display user entry
        public void output()
        {
            System.out.println("IDtag: " + IDtag);
            System.out.println("Species: " + species);
        } // End of output()
    } // End of Animal class

    // Derived class Bird from Animal
    static class Bird extends Animal
    {
        // Variable
        private int colour;

        @Override
        public void input()
        {
            super.input(); // Call the base class input method
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter feather colour number: "
                             + "\n1-grey, "
                             + "\n2-white, "
                             + "\n3-black ");
            colour = scanner.nextInt();
        } // End of input()

        @Override
        public void output()
        {
            super.output(); // Call the base class output method
            System.out.print("Colour: ");
            switch (colour)
            {
                case 1:
                    System.out.println("grey");
                    break;
                case 2:
                    System.out.println("white");
                    break;
                case 3:
                    System.out.println("black");
                    break;
                default:
                    System.out.println("invalid");
            } // End of switch case
        } // End of output()
    } // End of Bird class

    // Derived class Reptile from Animal
    static class Reptile extends Animal
    {
        // Variable
        private double bloodTemp;

        @Override
        public void input()
        {
            super.input(); // Call the base class input method
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the blood temperature: ");
            bloodTemp = scanner.nextDouble();
        } // End of input()

        @Override
        public void output()
        {
            super.output(); // Call the base class output method
            System.out.println("Blood temperature: " + bloodTemp);
        } // End of output()
    } // End of Reptile class

    // Main method
    public static void main(String[] args)
    {
        // Instantiate two objects
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        // Input the values for the two objects
        System.out.println("Please enter the details for the bird:");
        brd.input();
        System.out.println("\nPlease enter the details for the reptile:");
        rept.input();

        // Output the values for the two objects
        System.out.println("\nBird details:");
        brd.output();
        System.out.println("\nReptile details:");
        rept.output();
    } // End of main()
} // End of Solutions class