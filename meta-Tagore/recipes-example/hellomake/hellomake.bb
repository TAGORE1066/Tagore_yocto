DESCRIPTION = "Three example programs built with Makefile"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRC_URI = "file://hellomake.c \
           file://evenodd.c \
           file://primecheck.c \
           file://Makefile"

S = "${WORKDIR}"

inherit base


do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hellomake ${D}${bindir}/hellomake
    install -m 0755 evenodd ${D}${bindir}/evenodd
    install -m 0755 primecheck ${D}${bindir}/primecheck
}

