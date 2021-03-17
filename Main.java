import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {

    ArrayList<String>  a = new ArrayList(); //default capacity 10
    a.add("sdcsvdjhvus");
    a.add("same");
    a.add("same");
    a.add("yuygyguduyc");
    a.add("yuygyguduyc");

/*
    // make a copy of an arraylist
    ArrayList<Integer> b = new ArrayList();
    for(int i = 0; i < a.size(); i++)
    {
      b.add(a.get(i));
    }
*/
    System.out.println(a);
    removeShorterStrings(a);
    System.out.println(a);
  
  }

    
public static double findLargest(ArrayList<Double>  a)
//search an ArrayList of Doubles and return the largest number found in the ArrayList.
{
  Collections.sort(a);
  System.out.println(a);
  int size = a.size();
  return a.get(size);
}

public static int indexOfLargest(ArrayList<Double>  a)
//Search an ArrayList of Doubles and return the index of the largest element found in the ArrayList.
{
  double max = Collections.max(a);
  int where = a.indexOf(max);
  return where;
}

public static int indexOfInt(ArrayList<Integer>  a, int target)
//Take an ArrayList of Integers and a value as two arguments to your method. Return the index of the first location of the value inside the ArrayList. If the ArrayList does not contain the value, return -1. So if the ArrayList contains { 3, 4, 5, 6, 5} and the value being searched for is 5, your method would return 2 because index 2 of the ArrayList is the first location where a 5 can be found. If the value being searched for is 7, your method would return a -1 because 7 is not present in this ArrayList.
{
  int where = a.indexOf(target);
  return where;
}


public static boolean hasSameElements(ArrayList<Integer>  a, ArrayList<Integer>  b)
//Compare two ArrayLists of Integers that are known to be of the same length. Return true if they have the same contents (irrespective of order). Return false otherwise.
{
  Collections.sort(a);
  Collections.sort(b);

  for(int i = 0; i < a.size(); i++)
  {
    if(a.get(i) != b.get(i))
    {
      return false;
    }
  }
  return true;
}


public static void removeEvenLength(ArrayList<String>  a)
//Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.
{
  Iterator<String> iter = a.iterator();
  while(iter.hasNext())
  {
    String str = iter.next();
    if(str.length()% 2 ==0)
    {
      iter.remove();
    }
  }
}


public static void removeDuplicates(ArrayList<Integer>  a)
//If two or more consecutive elements of an ArrayList are the same Integer, remove all but one occurrence. Do not disturb the relative positioning of the other elements. 
//Here is an example:  [ 5, 4, 4, 4, 3, 3, 2 ] → [ 5, 4, 3, 2 ]
//Here is another example: [ 5, 4, 5, 3, 3 ] → [ 5, 4, 5, 3 ]    
//Note that in the second example, the 5 is not removed because it is not consecutive.
{
  int i = 0;
  if(a.size()>1)
  {
    while(i < a.size() - 1)
    {
      
      if(a.get(i) == a.get(i+1))
      { 
        a.remove(i+1);
      }
      else 
      {
        i++; 
      }
    }
  }
}




public static void swapPairs(ArrayList<String>  a)
//Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"} your method should switch the first pair, "four", "score", the second pair, "and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}
//If there are an odd number of values in the list, the final element is not moved. For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"} It would again switch pairs of values, but the final value, "hamlet" would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}
{
  
 
  String c;
  String b;
  // make a new array  
  if(a.size() % 2 == 0)
  {
    for(int i = 0; i < a.size() - 1; i = i + 2)
  {
    c = a.get(i);
    b = a.get(i+1);
    a.set(i, b);
    a.set(i+1, c);


  }
  }
  else
  {
  for(int i = 0; i < a.size() - 2; i = i + 2)
  {
    c = a.get(i);
    b = a.get(i+1);
    a.set(i, b);
    a.set(i+1, c);
  }
  }
}

public static void doubleList(ArrayList<String>  a)
//Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string. For example, if the list stores the values {"how", "are", "you?"} before the method is called, it should store the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
{


  for(int i = 0; i < a.size(); i = i+2)
  {
    a.add(i+1, a.get(i));
  }
}


public static void removeShorterStrings(ArrayList<String>  a)
//Note: There are a lot of conditions to meet in this one and your testing should involve several cases to make sure you meet all the requirements.

//Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter string in the pair. For example, suppose that an ArrayList called list contains the following values: {"four", "score", "and", "seven", "years", "ago"} In the first pair, "four" and "score", the shorter string is "four". In the second pair, "and" and "seven", the shorter string is "and". In the third pair, "years" and "ago", the shorter string is "ago". Therefore, the call: removeShorterStrings(list); should remove these shorter strings, leaving the list as follows: "score", "seven", "years". If there is a tie (both strings have the same length), your method should remove the first string in the pair. If there is an odd number of strings in the list, the final value should be kept in the list
{
 

  //odd
  if(a.size() % 2 == 1)
  {
  for(int i = 0; i < a.size() - 2; i++)
  {
    String first = a.get(i);
    String second = a.get(i+1);
    if(first.length() > second.length())
    {
      a.remove(i+1);
    }
    else if(first.length() < second.length())
    {
      a.remove(i);
    }
    else
    {
      a.remove(i);
    }
    
  }
  }

  //even
  else if(a.size() % 2 == 0)
  {
  for(int i = 0; i < a.size() - 1; i++)
  {
    String first = a.get(i);
    String second = a.get(i+1);
    if(first.length() > second.length())
    {
      a.remove(i+1);
    }
    else if(first.length() < second.length())
    {
      a.remove(i);
    }
    else
    {
      a.remove(i);
    }
    
  }
  }


}


  
  

  //replace all occourances of character c with * in the string
  public static String censor(String s, char c)
  {
    //Option 1
    //return s.replace(c, '*');

    //Option 2
    String str = "";

    for(int i= 0; i< s.length(); i++)
    {
    if(s.charAt(i) == c)
    {
      str = str + "*";
    }
    else
    {
      str = str + s.charAt(i);
    }
  }
  return str;
  }
}