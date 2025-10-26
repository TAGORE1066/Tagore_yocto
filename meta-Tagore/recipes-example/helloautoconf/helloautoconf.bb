DESCRIPTION = "receipe(.bb)filefor helloautoconf example"
LICENSE = "CLOSED"


SRC_URI = "file://src/configure.ac \
           file://src/Makefile.am \
           file://src/main.c \
           file://src/add.c \
           file://src/multiply.c \
           file://src/operations.h \
          "

S = "${WORKDIR}"

do_compile() {
	cd ${S}
	${CC} ${CFLAGS} ${LDFLAGS}  src/main.c src/add.c src/multiply.c -o helloautoconf
}

do_install() {
    install -d ${D}/usr/bin
    install -m 777 ${S}/helloautoconf ${D}/usr/bin
}

