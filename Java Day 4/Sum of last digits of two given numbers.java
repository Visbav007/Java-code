import java.io.*;
import java.util.*;
class UserMainCode
{
   public int AddLAstDigits( int input1, int input2){
   input1=Math.abs(input1);
   input2=Math.abs(input2);
   int num1 = 0,num2 = 0;
  num1=input1 % 10;
  num2 =input2 % 10;
  return (num1+num2);
}
}