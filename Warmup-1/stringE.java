/*
Return true if the given string contains between 1 and 3 'e' chars.
*/
public boolean stringE(String str) {
  int eCounter = 0;
  for (int i=0; i<str.length(); i++)
  {
    if (str.charAt(i) == 'e') eCounter++;
  }
  if (eCounter>=1 && eCounter <=3) return true;
  return false;
}
