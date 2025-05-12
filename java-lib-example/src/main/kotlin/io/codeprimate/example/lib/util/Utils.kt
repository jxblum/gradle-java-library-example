package io.codeprimate.example.lib.util

/**
 * Abstract utility class.
 *
 * @author John Blum
 * @since 0.1.0
 */
@Suppress("unused")
class Utils {

    companion object {
        fun require(value: Any?): Any {
            return value ?: throw IllegalArgumentException("Object is required")
        }
    }
}
