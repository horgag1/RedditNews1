
@file:JvmName("ExtensionsUtils")

package commons

/**
 * Created by gerhorgan on 12/12/2016.
 */

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}