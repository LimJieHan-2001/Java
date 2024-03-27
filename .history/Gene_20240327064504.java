public class Gene {
    private String name;

    // Constructor with default name "Unknown"
    public Gene() {
        this.name = "Unknown";
    }

    // Constructor with custom name
    public Gene(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Creating Gene objects with and without custom names
        Gene gene1 = new Gene();
        Gene gene2 = new Gene("BRCA1");

        // Displaying the names of genes
        System.out.println("Gene 1: " + gene1.getName());
        System.out.println("Gene 2: " + gene2.getName());
    }
}
