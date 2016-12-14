package commons

/**
 * Created by gerhorgan on 14/12/2016.
 */


import android.support.v4.app.Fragment
import rx.subscriptions.CompositeSubscription

open class RxBaseFragment() : Fragment() {

    protected var subscriptions = CompositeSubscription()

    override fun onResume() {
        super.onResume()
        subscriptions = CompositeSubscription()
    }

    override fun onPause() {
        super.onPause()
        if (!subscriptions.isUnsubscribed) {
            subscriptions.unsubscribe()
        }
        subscriptions.clear()
    }
}