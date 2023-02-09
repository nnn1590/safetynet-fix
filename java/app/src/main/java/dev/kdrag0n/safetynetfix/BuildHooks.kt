package dev.kdrag0n.safetynetfix

import android.os.Build

internal object BuildHooks {
    fun init() {
        Build::class.java.getDeclaredField("MODEL").let { field ->
            field.isAccessible = true
            field.set(null, "Pixel XL")
        }
        Build::class.java.getDeclaredField("DEVICE").let { field ->
            field.isAccessible = true
            field.set(null, "marlin")
        }
        Build::class.java.getDeclaredField("PRODUCT").let { field ->
            field.isAccessible = true
            field.set(null, "marlin")
        }
        Build::class.java.getDeclaredField("FINGERPRINT").let { field ->
            field.isAccessible = true
            field.set(null, "google/marlin/marlin:7.1.2/NJH47F/4146041:user/release-keys")
        }
        Build.VERSION::class.java.getDeclaredField("DEVICE_INITIAL_SDK_INT").let { field ->
            field.isAccessible = true
            field.set(null, Build.VERSION_CODES.N_MR1)
        }
    }
}
