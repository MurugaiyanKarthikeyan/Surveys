package com.ki.surveys.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.ki.surveys.R;
import com.ki.surveys.model.Survey;
import com.ki.surveys.utils.GlideUtil;

import java.util.ArrayList;


public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    ArrayList<Survey> mSurveyArrayList;

    public ViewPagerAdapter(Context context, ArrayList<Survey> surveyArrayList) {
        this.context = context;
        this.mSurveyArrayList = surveyArrayList;
    }

    @Override
    public int getCount() {
        return mSurveyArrayList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView title = view.findViewById(R.id.tx_title);
        TextView description = view.findViewById(R.id.tx_description);
        title.setText(mSurveyArrayList.get(position).getTitle());
        description.setText(mSurveyArrayList.get(position).getDescription());
        GlideUtil.loadImage(context, imageView, mSurveyArrayList.get(position).getCoverImageUrl()+"l", R.drawable.errorimage, null);
        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }


    public void setData(ArrayList<Survey> surveyArrayList) {
        this.mSurveyArrayList = surveyArrayList;
    }
}