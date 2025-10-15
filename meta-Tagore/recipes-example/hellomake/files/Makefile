CC ?= ${CC}
CFLAGS += -Wall
LDFLAGS ?=

PROGRAMS = hellomake evenodd primecheck

all: $(PROGRAMS)

hellomake: hellomake.c
	$(CC) $(CFLAGS) -o hellomake hellomake.c $(LDFLAGS)

evenodd: evenodd.c
	$(CC) $(CFLAGS) -o evenodd evenodd.c $(LDFLAGS)

primecheck: primecheck.c
	$(CC) $(CFLAGS) -o primecheck primecheck.c $(LDFLAGS)

clean:
	rm -f $(PROGRAMS)



