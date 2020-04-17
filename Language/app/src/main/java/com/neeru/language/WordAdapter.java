package com.neeru.language;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorId;
    public WordAdapter(Activity context, ArrayList<Word> word,int colorId) {
        super(context, 0, word);
        mColorId = colorId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.miwok);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.english);
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_list_view);
        View textContainer = listItemView.findViewById(R.id.relativelayout);
        int color = ContextCompat.getColor(getContext(),mColorId);
        textContainer.setBackgroundColor(color);
        miwokTextView.setText(currentWord.getmMiwokTranslation());
        defaultTextView.setText(currentWord.getmDefaultTranslation());
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}