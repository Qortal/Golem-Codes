include device/rockchip/rk3399/BoardConfig.mk

# Sensors
BOARD_SENSOR_ST := false
BOARD_SENSOR_MPU_PAD := true
BOARD_SENSOR_MPU_VR := false

BOARD_SENSOR_COMPASS_AK8963-64 := true

WITH_DEXPREOPT := true

TARGET_BOARD_PLATFORM_PRODUCT := tablet

ifeq ($(strip $(BUILD_WITH_GOOGLE_MARKET)), true)
ifeq ($(strip $(BUILD_WITH_GOOGLE_MARKET_ALL)), true)
BOARD_SYSTEMIMAGE_PARTITION_SIZE := 4294967296
else
BOARD_SYSTEMIMAGE_PARTITION_SIZE := 3221225472
endif
else
BOARD_SYSTEMIMAGE_PARTITION_SIZE := 1610612736
endif
