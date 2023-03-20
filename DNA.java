// DNA.java is a program that determines whether there is a protein in a strand of DNA.
public class DNA {

    public static void main(String[] args) {
        // dna testing strings
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;

        // length of DNA - used to check %
        int length = dna.length();
        System.out.println("Length: " + length);

        // find index of ATG (start codon)
        int startCodon = dna.indexOf("ATG");
        System.out.println("Start: " + startCodon);

        // find index of TGA (stop codon)
        int stopCodon = dna.indexOf("TGA");
        System.out.println("Stop: " + stopCodon);

        // protein length check
        if (length % 3 == 0) {
            // protein start/stop codon check
            if (startCodon != -1 && stopCodon != -1) {
                String protein = dna.substring(startCodon, stopCodon);
                System.out.println("Protein Detected: " + protein);
            }
        } else {
            System.out.println("No Protein Detected");
        }
    }
}
