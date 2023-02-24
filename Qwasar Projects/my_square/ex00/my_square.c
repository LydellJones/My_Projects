#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main(int ac, char **av)
{
    int xcoord = 0, ycoord = 0;
    if (av[1] != NULL)
    {
        xcoord = atoi(av[1]);
    }
    if (av[2] != NULL)
    {
        ycoord = atoi(av[2]);
    }

    for (int y = 0; y < ycoord; y++)
    {
        for (int x = 0; x < xcoord; x++)
        {
            if ((x == 0 && y == 0)/*start*/ || (x == xcoord-1 && y == ycoord-1)/*end*/ || (x == 0 && y == ycoord-1)/*x start y end*/|| (y == 0 && x == xcoord-1)/*y start x end*/)
            {
                printf("o");
            }
            else
            {
                if ((x > 0 || x < xcoord) && (y == 0 || y == ycoord-1))
                {
                    printf("-");
                }
                else if ((y > 0 || y < ycoord) && (x == 0 || x == xcoord-1))
                {
                    printf("|");
                }
                else 
                {
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
    return 0;
}

