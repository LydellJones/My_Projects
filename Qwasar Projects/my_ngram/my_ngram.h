#include <stdio.h>
#include <stdlib.h>

#define MAX_ARRAY_SIZE 128

void printingNgram(int* a)//uses the 128 array to print all used ascii characters
{
    for (int i = 0; i < 128; i++) //looping through all ascii chars
    {
        if (a[i] != 0) //print the value at the current position
        {
            printf("%c:%d\n", (char)i, a[i]); //print the char and count
        }
    }
}

int * getNgram(int wordCount, char* words[]) //returns a integer array with 128 places for each time an char is used
{
    static int count[128] = {0}; //declare the amount of ascii chars there are
    int ascii = 0;  //this will hold an ascii value
    for (int i = 1; i < wordCount; i++) // loops through args
    {
        for (int a = 0; words[i][a] != '\0'; a++) //loops through the current argument
        {
            ascii = (int)words[i][a]; //ascii value will be the current char
            count[ascii] = count[ascii] + 1; //ascii value acts as index
        }
    }
    return count;
}
