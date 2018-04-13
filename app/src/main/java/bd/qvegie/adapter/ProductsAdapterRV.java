package bd.qvegie.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bd.qvegie.R;

/**
 * Created by rasel on 4/5/2018.
 */

public class ProductsAdapterRV extends RecyclerView.Adapter {


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_single_product, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class ProductsViewHolder extends RecyclerView.ViewHolder {
        public ProductsViewHolder(View itemView) {
            super(itemView);
        }
    }
}
