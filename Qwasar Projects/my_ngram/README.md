# Welcome to My Ngram
***

## Task
The problem is to create a program that reads given arguments that are in string format and return
all the ascii characters that were used. The challenge is making sure that all the ascii characters
are accounted for.

## Description
An integer array of size 128 (representing all ascii characters that are mainly supported) was created for
the solution. For each character that the program runs through the character's ascii number is used
as an index for the array. The value at that index (which the default is 0) is incremented by one. At the
end of the arguments given the program will display all numbers in the array that are greater than 0.

## Installation
The source files Makefile, my_ngram.c, and my_ngram.h need to be in the directory, from there you need to use
*make* without any arguments to create the file. Once created you are free to use *make clean* to clean up the
object file generated. If you wish to uninstall the program type *make fclean* and that will uninstall the program
along with the object files if they exist.

!!CAUTION!! the deletion of object files are ambiguous and will REMOVE ALL OBJECT FILES within the current directory!!!

## Usage
```
make
./my_project "argument1" "argument2" "...."
```
Arguments must be surrounded by double quotes in order for the program to read the arguments.

### The Core Team


<span><i>Made at <a href='https://qwasar.io'>Qwasar SV -- Software Engineering School</a></i></span>
<span><img alt='Qwasar SV -- Software Engineering School's Logo' src='https://storage.googleapis.com/qwasar-public/qwasar-logo_50x50.png' width='20px'></span>
