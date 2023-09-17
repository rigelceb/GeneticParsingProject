import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class DNAParser {
    private ArrayList<List<String>> dnalist = new ArrayList<List<String>>();
    private List<String> original;

    public DNAParser(String pth) {
        try {
            original = Files.readAllLines(Path.of(pth));
            for(String s : original) {
                dnalist.add(Arrays.asList(s.split("\t")));
            }
            for(Iterator<List<String>> dnl = dnalist.iterator(); dnl.hasNext();) {
                List<String> ind = dnl.next();
                if(ind.get(0).startsWith("#")) {
                    dnl.remove();
                }
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void cleanFile() {
        for(Iterator<List<String>> cf = dnalist.iterator(); cf.hasNext();) {
            List<String> ls = cf.next();
            if(ls.get(0).startsWith("i")) {
                cf.remove();
            } else if(ls.get(3).contains("--")) {
                cf.remove();
            }
        }
    }

    // public ArrayList<List<String>> getDeletions() {
    //     ArrayList<List<String>> deletions = new ArrayList<List<String>>();
    //     for(Iterator<List<String>> gdd = dnalist.iterator(); gdd.hasNext();) {
    //         List<String> lst = gdd.next();
    //         if(lst.get(3).contains("-")) {
    //             deletions.add(lst);
    //         } 
    //     } return deletions;
    // }

    public ArrayList<List<String>> getDNA() {
        return dnalist;
    }
}