/*
Given a string, return the count of the number of times that a substring length 2 appears in the string
and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
*/
public int last2(String str) {
  int counter = 0;
  
  if (str.length()>=2)
  {
     String last = str.substring(str.length()-2);
  for (int i = 0; i <str.length()-2; i++)
  {
    if (str.substring(i, i+2).equals(last))
    {
      counter++;
    }
  } 
  }
  return counter;
}
