SUMMARY = "Simple C programs with CMake"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

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

