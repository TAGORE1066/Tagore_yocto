DESCRIPTION = "Three example programs built with Makefile"
LICENSE = "CLOSED"


SRC_URI = "file://hellomake.c \
           file://evenodd.c \
           file://primecheck.c \
           file://Makefile"

S = "${WORKDIR}"


do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hellomake ${D}${bindir}/hellomake
    install -m 0755 evenodd ${D}${bindir}/evenodd
    install -m 0755 primecheck ${D}${bindir}/primecheck
}

