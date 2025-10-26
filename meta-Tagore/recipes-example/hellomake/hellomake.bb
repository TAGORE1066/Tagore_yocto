DESCRIPTION = "Three example programs built with Makefile"
LICENSE = "CLOSED"


SRC_URI = "file://hellomake.c \
           file://evenodd.c \
           file://primecheck.c \
           file://Makefile"

S = "${WORKDIR}"


do_compile() {
	${CC} ${LDFLAGS} hellomake.c -o hellomake
	${CC} ${LDFLAGS} evenodd.c -o evenodd
	${CC} ${LDFLAGS} primecheck.c -o primecheck
}

do_install() {
    install -d ${D}${bindir}
    install -m 777 hellomake ${D}${bindir}/hellomake
    install -m 777 evenodd ${D}${bindir}/evenodd
    install -m 777 primecheck ${D}${bindir}/primecheck
}

