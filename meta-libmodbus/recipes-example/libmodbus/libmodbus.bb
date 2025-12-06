DESCRIPTION = "Basic .bbfile for libmodbus"
LICENSE = "GPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/stephane/libmodbus.git;protocol=https"
SRCREV = "f9358460ee1f62bcac716ad0444b3bbe7628b204"

S = "${WORKDIR}/git"

DEPENDS += "autoconf-native automake-native libtool-native"

do_configure() {
    cd ${S}
    ./autogen.sh
    ./configure --prefix=/usr --host=${HOST_SYS}
}

do_compile() {
    make
}

do_install() {
    make install DESTDIR="${D}"
}

