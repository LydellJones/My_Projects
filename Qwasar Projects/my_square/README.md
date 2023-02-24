# my_square
# Welcome to My Square
***
## Task
A square needs to be made in Standard output using system arguments as parameters. 
Each corner of the square is marked with an 'o' and the other is marked is with - or | with an empty space inside

The challenge is making sure that the c program recognizes the x and y size and creates a square based off of the vector.

## Description
I used C to parse out system arguments and use them to create a square.

I used a nested for loop and branching conditional statements to create this

The outer for loop facilitates the newline and holds the y values

The Inner for loop facilitates the decision making between where to put each character and holds the x value

## Installation
Clone from the gitea repository in the provided. You'll need to use the gcc in order to compile the code into a file that use can execute
from the command prompt or shell that is in use.

You can download the code from qwasar's repository from https://git.us.qwasar.io/my_square_110992_ec1lta/my_square

## Usage
```
./my_project argument1 argument2
    
    argument1 = x <-- needs to be a number 0-9
    argument2 = y <-- needs to be a number 0-9

    Ex:
        ./a.out 5 5

            o---o
            |   |
            |   |
            |   |
            o---o

    argument1 is the width of the square
    
    argument2 is the height of the square

    if one argument is missing the default will be set to 0

    if both are missing both values will default to 0 and there will be no square.

```

### The Core Team


<span><i>Made at <a href='https://qwasar.io'>Qwasar SV -- Software Engineering School</a></i></span>
<span><img alt='Qwasar SV -- Software Engineering School's Logo' src='https://storage.googleapis.com/qwasar-public/qwasar-logo_50x50.png' width='20px'></span>
