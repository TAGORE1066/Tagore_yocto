DESCRIPTION = "Hello C++ example"
LICENSE = "CLOSED"
SRC_URI = "file://hello.cpp"
S = "${WORKDIR}"

do_compile() {
    ${CXX} ${CXXFLAGS} ${LDFLAGS} ${S}/hello.cpp -o hello
}

do_install() {
    install -d ${D}/usr/bin
    install -m 755 ${S}/hello ${D}/usr/bin
}

