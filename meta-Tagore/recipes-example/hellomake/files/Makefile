CC = gcc
CFLAGS = -Wall -Werror.

all: hellomake evenodd primecheck

hellomake: hellomake.c
	$(CC) $(CFLAGS) hellomake.c -o hellomake

evenodd: evenodd.c
	$(CC) $(CFLAGS) evenodd.c -o evenodd

primecheck: primecheck.c
	$(CC) $(CFLAGS) primecheck.c -o primecheck

clean:
	rm -f hellomake evenodd primecheck

