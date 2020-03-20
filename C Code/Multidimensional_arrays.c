/*
 * Multidimensional Arrays
 *
 * <type> name[size1][size2]...[sizeN];
 */

 int foo[1][2][3];
 // or maybe this one -
 char vowels[1][5] = {
     {'a', 'e', 'i', 'o', 'u'}
 };

 /* Two-dimensional Arrays
  * <type> arrayName [x][y]
  * [x] - number of rows
  * [y] - number of columns
  */

  // you really don't have to put in a [x] value really.

  char vowels[][5] = {
      {'A', 'E', 'I', 'O', 'U'},
      {'a', 'e', 'i', 'o', 'u'}
  };
  // you NEED to the [y]

  /*
   * Initializing Two-Dimensional Arrays
   */

   int a[3][4] = {
       {0, 1, 2, 3} , /* initializers for row indexed by 0 */
       {4, 5, 6, 7} , /* initializers for row indexed by 1 */
       {8, 9, 10, 11} /* intializers for row indexed by 2 */
   };

   // this can also be done like this int a[3][4] = {0,1,2,3,4,5,6,7,8,9,10,11};

   /*
    * Accessing Two-Dimensional Array Elements
    * int val = a[2][3];
    */
