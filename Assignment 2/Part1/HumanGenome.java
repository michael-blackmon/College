/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 2 PART 1
DUE 7/20/23
SUBMITTED 7/20/23
 */
public class HumanGenome {
    private String genomeName;
    private int numGenes, numChromosomes;
    private long numCells;

    public HumanGenome(){
        //default constructor
    }
    //defined constructor
    public HumanGenome(String genomeName,int numGenes, int numChromosomes, long numCells){
        this.genomeName = genomeName;
        this.numGenes = numGenes;
        this.numChromosomes = numChromosomes;
        this.numCells = numCells;
    }

    //Getters and setters declaration

    public String getGenomeName(){
        return genomeName;
    }

    public void setGenomeName(String genomeName){
        this.genomeName = genomeName;
    }

    public int getNumGenes(){
        return numGenes;
    }

    public void setNumGenes(int numGenes){
        this.numGenes = numGenes;
    }

    public int getNumChromosomes(){
        return numChromosomes;
    }

    public void setNumChromosomes(int numChromosomes){
        this.numChromosomes = numChromosomes;
    }

    public long getNumCells(){
        return numCells;
    }

    public void setNumCells(long numCells){
        this.numCells = numCells;
    }

    //Print method
    public void print(){
        System.out.printf("%s%s\n", "Genome Name: ", genomeName);
        System.out.printf("%s%d\n", "Number of Genes: ", numGenes);
        System.out.printf("%s%d\n", "Number of Cells: ", numCells);
        System.out.printf("%s%d\n", "Number of Chromosomes (in trillions): ", numChromosomes);
    }
}
