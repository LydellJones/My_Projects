CFLAGS = -Wall -Wextra -Werror
TARGET = my_ngram
OBJ = my_ngram.o
SRC = my_ngram.c


all : $(TARGET)

$(TARGET) : $(OBJ)
	gcc $(CFLAGS) -o $(TARGET) $(OBJ) 

$(OBJ) : $(SRC) my_ngram.h
	gcc $(CFLAGS) -c $(SRC)

clean:
	rm -f *.o

fclean: clean
	rm -f $(TARGET)

re: fclean all