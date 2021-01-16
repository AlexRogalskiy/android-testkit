package ir.acharkit.android.component.carousel.adapter;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import ir.acharkit.android.component.carousel.model.CarouselModel;
import ir.acharkit.android.util.helper.ViewHelper;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    12/7/17
 * Email:   alirezat775@gmail.com
 */

@Deprecated
public abstract class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.ViewHolder> {

    public static final int ADD = 0;
    public static final int REMOVE = 1;
    private boolean enableSlider = false;
    private List<CarouselModel> items = new ArrayList<>();

    @Deprecated
    private void imageOption(View view) {
        view.getLayoutParams().width = Math.round(ViewHelper.getScreenWidth());
        view.getLayoutParams().height = (int) Math.round(view.getLayoutParams().width * 0.70);
        view.requestLayout();
    }

    /**
     * @return list items
     */
    @Deprecated
    public List<CarouselModel> getItems() {
        return items;
    }

    /**
     * @return count of items in the list
     */
    @CallSuper
    @Override
    public int getItemCount() {
        return getItems().size();
    }

    /**
     * @param item      instance CarouselModel
     * @param operation action add or remove
     */
    @Deprecated
    public synchronized void operation(CarouselModel item, int operation) {
        switch (operation) {
            case ADD:
                add(item);
                break;
            case REMOVE:
                remove(item);
                break;
        }
    }

    @Deprecated
    public void addAll(List items) {
        this.items = items;
    }

    /**
     * add item to list and notifyDataSetChanged adapter
     *
     * @param item instance CarouselModel
     */
    @Deprecated
    private void add(CarouselModel item) {
        getItems().add(item);
        notifyDataSetChanged();
    }

    /**
     * remove item from list and notifyDataSetChanged adapter
     *
     * @param item instance CarouselModel
     */
    @Deprecated
    private void remove(CarouselModel item) {
        getItems().remove(item);
        notifyDataSetChanged();
    }

    @Deprecated
    private boolean isEnableSlider() {
        return enableSlider;
    }

    @Deprecated
    public void setEnableSlider(boolean enableSlider) {
        this.enableSlider = enableSlider;
    }

    @Deprecated
    public class ViewHolder extends RecyclerView.ViewHolder {

        @Deprecated
        public ViewHolder(View itemView) {
            super(itemView);
            if (isEnableSlider()) imageOption(itemView);
        }
    }
}
