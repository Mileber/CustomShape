package mileber.customshape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import static android.R.attr.bitmap;

/**
 * Created by Mileber on 2016/10/26.
 */

public class CustomView extends View{

    private Drawable drawable;
    private String title;
    private String subTitle;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs,R.styleable.CustomView,0,0);
        try{
            drawable = typedArray.getDrawable(R.styleable.CustomView_imageSrc);
            title = typedArray.getString(R.styleable.CustomView_titleText);
            subTitle = typedArray.getString(R.styleable.CustomView_subTitleText);
        }finally {
            typedArray.recycle();
        }
    }
}
