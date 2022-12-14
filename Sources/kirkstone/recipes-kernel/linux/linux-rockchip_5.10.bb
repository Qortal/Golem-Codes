# Copyright (C) 2021, Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc
require linux-rockchip.inc

inherit freeze-rev local-git

SRCREV = "bbe5dbfb385d9d8423957b4a5655e5b31f336dbb"
SRC_URI = " \
	git://github.com/radxa/kernel.git;protocol=https;branch=stable-5.10-rock5; \
	file://${THISDIR}/files/cgroups.cfg \
	file://${THISDIR}/files/0001-arm64-dts-rock-5b-add-chosen-node.patch \
	file://${THISDIR}/files/0002-arm64-rockchip_linux_defconfig-disable-rtl8852be.patch \
	file://${THISDIR}/files/0003-arm64-rockchip_linux_defconfig-disable-rtl8852bu.patch \
	file://${THISDIR}/files/0001-arm64-dts-radxa-nx5-add-chosen-node.patch \
"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_VERSION_SANITY_SKIP = "1"
LINUX_VERSION ?= "5.10"

SRC_URI:append = " ${@bb.utils.contains('IMAGE_FSTYPES', 'ext4', \
		   'file://${THISDIR}/files/ext4.cfg', \
		   '', \
		   d)}"
