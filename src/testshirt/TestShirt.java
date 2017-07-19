/*
 * This program illustrates folowing scenario
 * There is a Shirt class , which contains private member variables and public methods
 * We should be able to set and get collar size, sleve length, cloth material information
 */
package testshirt;

public class TestShirt {                                                         // this is our main class, but its empty

    public static void main(String[] args) {                                   // main section

        Shirt[] knitter = new Shirt[3];                                    // Creating an object array knitter 
        knitter[0] = new Shirt();                                         //  Initializing knitter with default constructor
        knitter[1] = new Shirt(10, 20);                                  //   Initializing knitter with parameterised constructor
        knitter[2] = new Shirt(15, 35, "cotton");                       //   Initializing knitter with parameterised constructor

        for (Shirt index : knitter) {                                   // looping through each index of knitter
            index.getEverything();                                      // calling getEverything function
        }

    }

}

class Shirt {                                                           // This is our shrt class

    private int collarsize;                                             // private data member  to hold collar size for shirt
    private int slevelength;                                            // private data member  to hold sleve length for shirt
    private String material;                                            // private data member  to hold cloth material for shirt

    public Shirt() {                                                    // constructor with no arguments
        this.collarsize = 5;                                            // initializing collar size, sleve length and material
        this.slevelength = 12;
        this.material = "cotton";
    }

    public Shirt(int collarsize, int slevelength) {                    //  overriding constructot with 2 arguments
        this.collarsize = collarsize;                                  // initializing collar size, sleve length to whatever passed at object creation
        this.slevelength = slevelength;
        this.material = "cotton";                                      // initializing material
    }

    public Shirt(int collarsize, int slevelength, String material) {    // overriding constructor with three arguments
        this.collarsize = collarsize;                                   // initializing collar size, sleve length & material to whatever passed at object creation
        this.slevelength = slevelength;
        this.material = material;
    }

    public int getCollarsize() {                                        //Getter returns collar size
        return collarsize;
    }

    public int getSlevelength() {                                       //Getter returns sleve length
        return slevelength;
    }

    public String getMaterial() {                                       //Getter returns cloth material
        return material;
    }

    public void getEverything() {                                               // this public method is used to call all getter functions
        System.out.println(" Material     : " + this.getMaterial());            // prints material informaton
        System.out.println(" Collar size  : " + this.getCollarsize());          // prints collar size
        System.out.println(" Sleve length : " + this.getSlevelength());         // prints sleve length
        System.out.println(" ===============================");                 // prints a horizontal line marking the end of record
    }

    //while i am generating ' setters '  because asked  in question [ 1 (a) ], but as per program requriement we will not be using it 
    public void setCollarsize(int collarsize) {
        this.collarsize = collarsize;
    }

    public void setSlevelength(int slevelength) {
        this.slevelength = slevelength;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //while i am generating ' setters '  because asked in question [ 1 (a) ], but as per program requriement we will not be using it 
}
