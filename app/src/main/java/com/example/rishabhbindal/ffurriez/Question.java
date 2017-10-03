package com.example.rishabhbindal.ffurriez;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import jp.wasabeef.richeditor.RichEditor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cunoraz.tagview.Tag;
import com.cunoraz.tagview.TagView;


import java.util.ArrayList;

public class Question extends AppCompatActivity {

    private RichEditor mEditor;
    private TextView mPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Log.d("here", "done");

        TagView tagGroup = (TagView) findViewById(R.id.tag_group);
        ArrayList<Tag> tags = new ArrayList<Tag>() ;
        Tag tag = new Tag("Bindu !!") ;
        tags.add(tag);
        //You can add one tag
        tagGroup.addTag(tag);
        //You can add multiple tag via ArrayList
        tagGroup.addTags(tags);
        //Via string array
        tagGroup.addTags(tags);


        //set click listener
        tagGroup.setOnTagClickListener(new TagView.OnTagClickListener() {
            @Override
            public void onTagClick(Tag tag, int position) {
                Log.d("here", "maa chudale");
            }
        });

        //set delete listener
        tagGroup.setOnTagDeleteListener(new TagView.OnTagDeleteListener() {
            @Override
            public void onTagDeleted(final TagView view, final Tag tag, final int position) {
                Log.d("here", "Bhosdike");
            }
        });

//set long click listener
        tagGroup.setOnTagLongClickListener(new TagView.OnTagLongClickListener() {
            @Override
            public void onTagLongClick(Tag tag, int position) {
            }
        });
    }
}
