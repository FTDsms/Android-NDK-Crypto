LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE    := Crypto
LOCAL_SRC_FILES := Crypto.c

include $(BUILD_SHARED_LIBRARY)
