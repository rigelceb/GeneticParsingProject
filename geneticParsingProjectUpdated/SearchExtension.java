import java.io.*;
import java.util.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
public class SearchExtension {
    DNAParser dna;
    ArrayList<List<String>> dnalist;
    public SearchExtension(DNAParser d, ArrayList<List<String>> l) {
        dna = d;
        dnalist = l;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the absolute filepath of your 23AndMe DNA file.");
        String path = scn.nextLine();
        DNAParser parser = new DNAParser(path);
        parser.cleanFile();
        System.out.println("Press ENTER to continue.");
        scn.nextLine();
            System.out.println("Enter the rsid of the gene you want to know more about.");
            String rsid = scn.nextLine();
            System.out.println(parser.getSNP(rsid));
            for(List<String> ls : parser.getDNA()) {
                if(rsid.equals(ls.get(0))) {
                    System.out.println("This gene has alleles: " + ls.get(3));
                } if(ls.get(3).contains("I")) {
                        System.out.println(rsid + " gene has an allele insertion");
                } if(ls.get(3).contains("D")) {
                        System.out.println(rsid + " gene has an allele deletion");
                }
            }
            System.out.println("What clinical significance parameter you like to search for in this gene? Paste the phrase exactly from the list above so that the program works properly.");
            String clinQuery = scn.nextLine().replaceAll(" ", "+");
                System.out.println("Would you like to see the results in the NCBI database? [Y/N]");
                if(scn.next().equals("Y")) {
                    if (Desktop.isDesktopSupported()) {
                        Desktop desk = Desktop.getDesktop();
                        try {
                            String url = "https://www.ncbi.nlm.nih.gov/search/all/?term=(" + rsid + "%5BReference+SNP+ID%5D)+AND+" + clinQuery + "%5BClinical+Significance%5D";
                            URI uri = new URI(url);
                            desk.browse(uri);
                        } catch (IOException excp) {
                           excp.printStackTrace();
                        } catch (URISyntaxException excp) {
                           excp.printStackTrace();
                        }
                        }
                    }
        System.out.println("Thank you for utilising my Search Extension program! To run again, enter the command in terminal.");
    }
}