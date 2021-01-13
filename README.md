# Universal SafetyNet Fix

This is a universal fix for SafetyNet on devices with hardware attestation and unlocked bootloaders.

MagiskHide is required if the device is rooted.

Only Android 10 or LineageOS 17.1 (arm64-v8a) are supported.

## How does it work?

An in-depth explanation, as well as source code, can be found in the [ROM commit](https://github.com/ProtonAOSP/android_system_security/commit/15633a3d29bf727b83083f2c49d906c16527d389).

## How to build binary(`system/bin/keystore`)?

1. Get LineageOS 17.1 source code
2. Run these:
```bash
cd /path/to/lineageos-checkout
repo sync --force-sync
. build/envsetup.sh
lunch lineage_arm64-eng  # Choose the architecture you like.
```
3. Patch `system/security/keystore/key_store_service.cpp` and `system/security/keystore/keystore_attestation_id.cpp`
4. Build: `mmma system/security`
5. If the build is successful, the binary is here: `$OUT/system/bin/keystore`

Tested on Ubuntu 20.04 (amd64) and Google Pixel 4 (StockROM, Android 10)

## Notice
The file `android-10-lineageos-17.1.patch` is based on [AOSP source code](https://android.googlesource.com/platform/system/security) and https://github.com/ProtonAOSP/android_system_security.
  Apache License, Version 2.0
  Copyright (c) 2008-2015, The Android Open Source Project
