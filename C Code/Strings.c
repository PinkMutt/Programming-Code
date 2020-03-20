/*
 * Strings
 */
#include<stdio.h>
#include<string.h>
int main(){

 /*
  * Defining strings
  */

  // defined using something called pointers, that will be discussed more later.
  char * name = "John Smith"; // this can only be read.
  // char name[] = "John Smith"; // defining it as a local character array allows it to be manipulated.

  // "[]" this notation tells the compiler to calculate the size of the array automatically.
 // char name[] = "John Smith";
 // char name[11] = "John Smith"; // The reason for there to by 11 indexes for the array is because
 // The compiler need an extra special character that that the compiler will read to indicate the
 // end of the string. This special character is equal to zero.
  int age = 27;
 /* prints out 'John Smith is 27 years old' */
 printf("%s is %d years old.\n", name, age);

 /*
  * String Length
  * strlen() - returns the length of the string.
  */
  char * name1 = "Nikhil";
  printf("%ld\n", strlen(name));

  /*
   * String comparison
   * strncmp(<string>, <string>, <n of characters to copy) - returns the number 0 if the strings
   * compared are equal, or a different number is they are different.
   */

   if(strncmp(name, "John", 4) == 0) {
       printf("Hello, John!\n");
   } else{
       printf("You are not John. Go away.\n");
   }

   /*
    * String Concatenation
    * strncat - appends first n character of src string to destination string where
    * n is min(n,length(src));
    */
    // This will only concatenate the 3 characters from the source.
    char dest[20] = "Hello";
    char src[20] = "World";
    // strncat(dest,src,3);
    // printf("%s\n",dest);
    // This would concatenate the "World", but we since dest was already changed it adds on as "HelloWorWOrld".
    strncat(dest,src,20);
    printf("%s\n",dest);
return 0;
}
