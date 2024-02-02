package com.darkness.sparkwomen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LawsActivity extends AppCompatActivity {
ListView l1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);

        l1=findViewById(R.id.l1);
        ArrayList<person>arrayList = new ArrayList<>();

        arrayList.add(new person(R.drawable.first,"1","Woman must have all the emergency \n numbers with them and WhatsApp also if possible so that they can immediately tell to their family members and police. \n"));
        arrayList.add(new person(R.drawable.two,"2","Hold your bag as tightly as you can when you are taking public transport. You can use it to hit your predator."));
        arrayList.add(new person(R.drawable.three,"3","When you are walking on a road, keep your mobile phone handy but avoid using it. Being on the phone makes alert."));
        arrayList.add(new person(R.drawable.four,"4","When you are travelling in an auto alone, make sure you share the auto number with someone in your family even if it's during the day."));
        arrayList.add(new person(R.drawable.five,"5","Similarly, if you have booked a cab, always share your coordinates with someone."));
        arrayList.add(new person(R.drawable.six,"6","When in office, avoid going to isolated areas with no CCTV cameras."));
        arrayList.add(new person(R.drawable.seven,"7","If you have parked your car, always look underneath, especially at night or at a less-crowded area. Very Important"));
        arrayList.add(new person(R.drawable.eight,"8","Whenever you are posting anything on social media, make sure you don't do it in real-time. Because if you do, you're telling people on your social media about your whereabouts. Delay those posts by say, 20-30 minutes."));
        arrayList.add(new person(R.drawable.nine,"9","Always ensure you aren't posting anything on your social media with address or phone number on it."));
        arrayList.add(new person(R.drawable.ten,"10","Whenever you are giving out order for delivery at a grocery store, make sure you whisper your address or write it down somewhere and give it to the shopkeeper. Never announce it."));
        arrayList.add(new person(R.drawable.eleven,"11","Whenever you are getting your phone recharged, if it's at a store, don't loudly speak up your phone number."));
        arrayList.add(new person(R.drawable.twelve,"12","Always pour your own drinks at parties and don't ever take drinks from complete strangers or even friends."));
        arrayList.add(new person(R.drawable.thirteen,"13","If you feel someone is stalking you, try to find a crowded place and call someone for help."));
        arrayList.add(new person(R.drawable.forteen,"14","Self defence techniques are the first and foremost thing to which each and every woman must be aware of and get proper self-defence training for their safety."));
        arrayList.add(new person(R.drawable.fifteen,"15","Generally most of the women are gifted with sixth sense which they must use whenever they become in some problem. They should at once avoid any situation which they feel bad for them."));
        arrayList.add(new person(R.drawable.sixteen,"16","Escape and run is also a good way to reduce some risks of women whenever they become in problem. They should never go with any unknown person alone at some unknown places."));
        arrayList.add(new person(R.drawable.seventeen,"17","Women must understand and feel their physical power and use accordingly. They never feel themselves weak than men and take some self defence training."));
        arrayList.add(new person(R.drawable.eighteen,"18","They should be careful while communicating with someone on internet in the cyberspace."));

        lawadapter lawadapter=new lawadapter(this,R.layout.list_row,arrayList);

        l1.setAdapter(lawadapter);





        findViewById(R.id.backBtn).setOnClickListener(view -> {
            startActivity(new Intent(LawsActivity.this,MainActivity.class));
            LawsActivity.this.finish();
        });
    }
}