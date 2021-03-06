package ru.noties.markwon.renderer.html;

import android.support.annotation.NonNull;
import android.text.style.StrikethroughSpan;

class StrikeProvider implements SpannableHtmlParser.SpanProvider {
    @Override
    public Object provide(@NonNull SpannableHtmlParser.Tag tag) {
        return new StrikethroughSpan();
    }
}
