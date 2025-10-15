SUMMARY = "Simple C programs with CMake"
LICENSE = "CLOSED"

SRC_URI = "file://helloc.c \
           file://addnumbers.c \
           file://greet.c \
           file://CMakeLists.txt"

S = "${WORKDIR}"

inherit cmake

# Optional: Install binaries
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/helloc ${D}${bindir}
    install -m 0755 ${B}/addnumbers ${D}${bindir}
    install -m 0755 ${B}/greet ${D}${bindir}
}

