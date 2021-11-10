# Assignment 24

Some perfect squares have unique mathematical properties. For example, 36 is:

1. A perfect square 
2. The sum of the integers 1 to 8 (1+2+3+4+5+6+7+8 = 36)

A number having both of these properties, being a perfect square and equal to the sum of consecutive integers beginning with 1, is sometimes referred to as a "magic square."

1 and 36 are the first two magic squares and the next one after 36 is 1225:

1. 35\*35 = 1225
2. 1225 = sum of 1 to 49

## Specifications

* Only one class is needed (with a `main` method and the method `printMagicSquares`, no constructor needed), where the `printMagicSquares` method prints the first n magic squares (see the specifications for the method below).

```
    // pre: n > 0
    // post: the first n magic squares have been printed 
    //      (with squared number and integer sum indicated)
    //      Ex: 36 (1 to 8)
    public static void printMagicSquares(int n)
```

* You should only be checking positive integers, so have your program reject invalid inputs.

* Let the users keep using the program as many times as they would like.

### Hints

* You will probably need to use both a `while` and `for` loop in your `printMagicSquares` method.

* I have seen two ways to accomplish this. One method is slow and one is fast (for n = 6, slow method takes about 6.5 min and fast method takes 0.5 s).

* I would recommend using `long` instead of `int` if you want to test big numbers (max value of `int` is 2,147,483,647 and max value of `long` is 9,223,372,036,854,775,807).

### Sample Output

```
Print the first n magic squares: 4
1 (1 to 1)
36 (1 to 8)
1225 (1 to 49)
41616 (1 to 288)
```

```
Print the first n magic squares: 13
1 (1 to 1)
36 (1 to 8)
1225 (1 to 49)
41616 (1 to 288)
1413721 (1 to 1681)
48024900 (1 to 9800)
1631432881 (1 to 57121)
55420693056 (1 to 332928)
1882672131025 (1 to 1940449)
63955431761796 (1 to 11309768)
2172602007770041 (1 to 65918161)
73804512832419600 (1 to 384199200)
2507180834294496361 (1 to 2239277041)
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

