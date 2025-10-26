DESCRIPTION = "Simple C programs with CMake"
LICENSE = "CLOSED"

SRC_URI = "file://helloc.c \
           file://addnumbers.c \
           file://greet.c \
           file://CMakeLists.txt"

S = "${WORKDIR}"

do_compile() {
	cd ${S}
	${CC} ${LDFLAGS} helloc.c -o helloc
	${CC} ${LDFLAGS} addnumbers.c -o addnumbers
	${CC} $LDFLAGS} greet.c -o greet
}

do_install() {
    install -d ${D}/usr/bin
    install -m 777 ${S}/helloc ${D}/usr/bin
    install -m 777 ${S}/addnumbers ${D}/usr/bin
    install -m 777 ${S}/greet ${D}/usr/bin
}

