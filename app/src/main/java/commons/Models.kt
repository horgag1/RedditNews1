package commons

import commons.adapter.AdapterConstants
import commons.adapter.ViewType

/**
 * Created by gerhorgan on 13/12/2016.
 */


data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String

) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}