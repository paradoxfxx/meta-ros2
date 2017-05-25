# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ament/ament_tools/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "1c8233b633dee9bf72a5da8ef8871f45"
SRC_URI[sha256sum] = "7ba3029f9817f38521534372bd71df21b4ccc9af07fe02c02d8734e80e9228af"

S = "${WORKDIR}/ament_tools-${PV}"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	# Specify install commands here
        install -d ${D}/opt/ros2/src/ament/ament_tools
        cp -r ${S}/* ${D}/opt/ros2/src/ament/ament_tools
#        install -d /home/build/common/opt/ros2/src/ament/ament_tools
#        cp -r ${S}/* /home/build/common/opt/ros2/src/ament/ament_tools

}

FILES_${PN} += "/opt/ros2/src/ament/ament_tools"

BBCLASSEXTEND = "native"
