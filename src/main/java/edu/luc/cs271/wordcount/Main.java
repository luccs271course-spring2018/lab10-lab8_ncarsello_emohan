ackage edu.luc.cs271.wordcount;

import java.util.*;
import java.util.Scanner;
import java.io.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {
    
        // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    String[] words = input.split(" ");
    //final Scanner input = new File(input.nextLine());
    //input = new Scanner(file);

    
  

    // DONE?TODO complete this main program
    // 1. create a WordCounter instance
    WordCounter wordy = new WordCounter (new HashMap<>());
    // 2. use this to count the words in the input
    wordy.countWords(input);
    // 3. determine the size of the resulting map
    Map<String,Integer> map2 = wordy.getCounts();
    int size = map2.size();
    // 4. create an ArrayList of that size and
    ArrayList sizes = new ArrayList(size);
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    for(Map.Entry<String,Integer> Entry: map2.entrySet());{
      sizes.add(input);
    }
    // 6. sort the ArrayList in descending order by count
    //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
    Map<String, List<String>> contacts = new TreeMap<String,  List<String>>();

    //ArrayList arrraylist = Arrays.sort(DescendingByCount);
    // 7. print the (up to) ten most frequent words in the text

    for(int i=0;i<words.length;i++)
{
     String s = nextLine[i];
     if(words_count.keySet().contains(s))
     {
          Integer count = words_count.get(s) + 1;
          words_count.put(s, count);
     }
     else
          words_count.put(s, 1);
}
    
    
    

  }
}

