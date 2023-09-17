public class RunMeFirst {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to my program! Before running the file SearchExtension.java, you must take a few steps to ensure the program runs as directed.");
        System.out.println("In this program, your raw 23AndMe data will be taken from a .txt file on your computer and parsed.");
        System.out.println("Make sure to paste a full filepath into the parser.");
        System.out.println();
        // System.out.println("Before you that, the program requires you to download a terminal program called esearch. In order to do this, paste the command");
        // System.out.println("sh -c \"$(curl -fsSL https://ftp.ncbi.nlm.nih.gov/entrez/entrezdirect/install-edirect.sh)\"");
        // System.out.println("Or the command");
        // System.out.println("sh -c \"$(wget -q https://ftp.ncbi.nlm.nih.gov/entrez/entrezdirect/install-edirect.sh -O -)\"");
        // System.out.println();
        // System.out.println("After you have done that, enter the command");
        // System.out.println("echo \"export PATH=\\$HOME/edirect:\\$PATH\" >> $HOME/.bash_profile");
        // System.out.println("into your terminal to start the program for the current session.");
        // System.out.println();
        System.out.println("In order to search, you must run \"javac SearchExtension.java\"");
        System.out.println("And then, run \"java SearchExtension.java\" and enter your filepath and chromosomal genotype into the program when prompted.");
        System.out.println();
        System.out.println("This program gives you the option to look up genes you have mutations in with any clinical significance.");
        System.out.println("The types of clinical significance given by the NCBI are as follows:");
        System.out.println("- Benign\n- Likely benign\n- Uncertain significance\n- Likely pathogenic\n- Pathogenic\n- Likely pathogenic, low penetrance\n- Pathogenic, low penetrance\n- Likely risk allele\n- Established risk allele\n- drug response\n");
        System.out.println("Search these terms online to learn more about them.");
        System.out.println("");
        System.out.println("When you are ready to begin, compile and run SearchExtension.java to search for a specific genetic marker.");
    }
}