package features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.gerhorgan.reddit.R
import commons.adapter.ViewType
import commons.adapter.ViewTypeDelegateAdapter
import commons.extensions.inflate

/**
 * Created by gerhorgan on 13/12/2016.
 */


class  LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}