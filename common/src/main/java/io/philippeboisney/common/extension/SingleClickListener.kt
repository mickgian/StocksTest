package io.philippeboisney.common.extension

import android.view.View
import java.util.concurrent.atomic.AtomicBoolean

class OnSingleClickListener(
    private val clickListener: View.OnClickListener,
    private val DEFAULT_DELAY_MS: Long = 750L
) : View.OnClickListener {
    private var canClick = AtomicBoolean(true)

    override fun onClick(v: View?) {
        if (canClick.getAndSet(false)) {
            v?.run {
                postDelayed({
                    canClick.set(true)
                }, DEFAULT_DELAY_MS)
                clickListener.onClick(v)
            }
        }
    }
}