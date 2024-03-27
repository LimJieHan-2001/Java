public class Gene {
    private String name;

    // Constructor with default name "Unknown"
    public Gene() {
        this.name = "Unknown";
    }

    // Constructor with parameterized name
    public Gene(String name) {
        this.name = name;
    }

    // Method to get the name of the gene
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Creating instances of Gene with default and specified names
        Gene gene1 = new Gene();
        Gene gene2 = new Gene("INPS");

        // Displaying gene names
        System.out.println("Gene 1 name: " + gene1.getName());
        System.out.println("Gene 2 name: " + gene2.getName());
    }
}
