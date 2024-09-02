a. What does assertArrayEquals method do?
- The assertArrayEquals method checks that two object arrays are equal or not.

b. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
- If the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality, an AssertionError is thrown.

c. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
- The assertArrayEquals method handles multi-dimensional arrays by comparing the elements of the arrays recursively.
- For example, in a two-dimensional array, it first checks that both arrays have the same number of rows. Then, for each row, it checks that both rows have the same number of columns and that the elements in the two rows are equal.