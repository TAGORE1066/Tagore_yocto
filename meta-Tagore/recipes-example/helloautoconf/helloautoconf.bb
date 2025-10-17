DESCRIPTION = "receipe(.bb)filefor helloautoconf example"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}:"

SRC_URI = "file://configure.ac \
           file://Makefile.am \
           file://src/main.c \
           file://src/add.c \
           file://src/multiply.c \
           file://src/operations.h \
          "

S = "${WORKDIR}"



do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} \
        src/main.c src/add.c src/multiply.c \
        -I src -o helloautoconf
}


do_install() {
    install -d ${D}${bindir}
    install -m 0755 helloautoconf ${D}${bindir}/helloautoconf
}

