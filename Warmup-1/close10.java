/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
*/
public int close10(int a, int b) {
  int aDiff = Math.abs(10-a);
  int bDiff = Math.abs(10-b);
  if (aDiff>bDiff) return b;
  if (aDiff<bDiff) return a;
  return 0;
}
