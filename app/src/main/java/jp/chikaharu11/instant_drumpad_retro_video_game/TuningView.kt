package jp.chikaharu11.instant_drumpad_retro_video_game

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class TuningView(context : Context, attributeSet : AttributeSet): LinearLayout(context, attributeSet) {
    init {
        View.inflate(context, R.layout.tuning_list, this)
    }
}