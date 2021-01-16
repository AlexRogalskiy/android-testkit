package ir.acharkit.android.component.carousel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    12/22/17
 * Email:   alirezat775@gmail.com
 */

@Deprecated
public interface CarouselListener {
    /**
     * @param position current position
     */
    @Deprecated
    void onPositionChange(int position);

    /**
     * @param dx delta x
     * @param dy delta y
     */
    @Deprecated
    void onScroll(int dx, int dy);
}
