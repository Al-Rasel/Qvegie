package bd.qvegie.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bd.qvegie.R;

/**
 * Created by jacosrasel on 4/5/2018.
 */

public class ProductsFragment extends Fragment {

    private int selectedCategory;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;


    public static Fragment newInstance(int cat) {
        ProductsFragment productsFragment = new ProductsFragment();

        productsFragment.selectedCategory = cat;
        return productsFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_products, container, false);


        findViews(view);
        return view;


    }


    private void findViews(View v) {
        mViewPager= v.findViewById(R.id.viewpager);
        mTabLayout=v.findViewById(R.id.sliding_tabs);

        mViewPager.setAdapter(new FragmentStatePagerAdapter(getActivity().getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return new SingleCatProduct();
            }

            @Override
            public int getCount() {
                return 4;
            }
        });




        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.getTabAt(0).setText("Vegetables");

        mTabLayout.getTabAt(1).setText("Fruits");

        mTabLayout.getTabAt(2).setText("Exotic");
        mTabLayout.getTabAt(3).setText("Packages");

        mViewPager.setCurrentItem(selectedCategory);


    }


}
