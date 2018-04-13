package bd.qvegie.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bd.qvegie.R;
import bd.qvegie.adapter.ProductsAdapterRV;

/**
 * Created by jacosrasel on 4/5/2018.
 */

public class SingleCatProduct extends Fragment {

    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_single_product,container,false);
        recyclerView=view.findViewById(R.id.rv_products);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ProductsAdapterRV());

        return view;
    }
}
