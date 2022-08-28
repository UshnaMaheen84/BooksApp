package com.example.booksapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BooksAdapter booksAdapter;
    ArrayList<dataModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        booksAdapter = new BooksAdapter(data, this);
        recyclerView.setAdapter(booksAdapter);

    }

    private void getData() {

        data.add(new dataModel("HIDE AND SEEK.pdf", R.drawable.hide_and_seek, "Hide And Seek", "Was it just another game of hide and seek? No. It was not. First she fell into a deep, dark hole in the ground and then they found a treasure. Did it end there? No! It did not. Read more about this thrilling adventure of Sally and friends in this illustrated kids’ book. The fun never ends when Sally’s around!"));
        data.add(new dataModel("GINGER THE GIRAFFE.pdf", R.drawable.ginger_the_giraffe, "Ginger The Giraffe", "Read this warm tale of camaraderie and affection set in the wild and beautiful Savannah in our illustrated kid's book. Ginger the giraffe uses her long neck to save the other animals from the blazing forest fire. Follow them in their jungle paths as they all meet with yet another adventure."));
        data.add(new dataModel("SUNNY MEADOWS WOODLAND SCHOOL.pdf", R.drawable.sunny_meadows_woodland_school, "Sunny Meadows Woodland School", "The class took a little train and went deep into the woods on their first school trip. But things didn’t go as planned and a whirlwind of adventure unfolds in this wonderful bed time story book."));
        data.add(new dataModel("TOOTH FAIRY.pdf", R.drawable.tooth_fairy, "The Tooth Fairies", "A wonderful story that weaves its magic in the child’s imagination, even while imparting an invaluable lesson in oral health and hygiene. This is a story that the children will return to time and again for a fun bedtime read."));
        data.add(new dataModel("JESSIE THE RABBIT.pdf", R.drawable.jessie_the_rabbit, "Jessie The Rabbit", "He sneaked into the rabbit hole at the slightest inkling of danger. He always wore an air of caution. He was the lily-livered bunny of the jungle. So they thought. Until one day a fire broke out and the tables were turned. The forest had found a brave heart to love. There’s more of this captivating story in this children’s story book. Enjoy!"));
        data.add(new dataModel("HECTOR THE HERMIT CRAB.pdf", R.drawable.hector_the_hermit_crab, "Hector The Hermit Crab", "When Jimmy and Tammy bring home an unusual pet, they thought all was fine. But then it struck them that their pet wasn’t happy at all. Find out what they did next in this wonderful tale of empathy and compassion. Read this children’s book about Hector the hermit crab and how he made it back to the ocean from the aquarium, thanks to two fine young gentlemen."));
        data.add(new dataModel("THE FLOWER GARDEN.pdf", R.drawable.the_flower_garden, "The Flower Garden", "Twins Rose and Violet have a birthday present unlike any other. Read this colorful and engaging good moral book for children."));
        data.add(new dataModel("A TRICK TRIKE.pdf", R.drawable.a_trick_trike, "A Trick Trike", "Little Ross was sad. He didn’t have a nice new tricycle like all the other children. All he had was an old hand-me-down trike. After sulking he decided to do something about it and made a “trick trike” that was the envy of the neighborhood."));
        data.add(new dataModel("THE HIKE.pdf", R.drawable.the_hike, "The Hike", "Mandy and grandpa went on a hike. But it was more than that. Together they explored the woods, learnt to be at peace with nature and talked their hearts out about things that mattered. It was a special bond between them and you’ve got to read this great illustrated children’s book to experience it. Happy Exploring!!"));
        data.add(new dataModel("THERE IS A MOUSE IN THE HOUSE.pdf", R.drawable.there_is_a_mouse_in_the_house, "There Is A Mouse In The House", "Gretchen loves to write. Find out how she perseveres and stays rooted to that to eventually find success. An inspiring children’s story that encourages young writers to pursue their craft without giving up."));
        data.add(new dataModel("BULLY BILL.pdf", R.drawable.bully_bill, "Bully Bill", "He thought he was the Lord of the Farm. He thought he was Boss. But his vanity was short lived and soon he learnt a lesson he’ll never forget. Follow this funny and thoughtful story of a certain farm we chanced upon in this bedtime storybook."));
        data.add(new dataModel("SAMATHA, THE GIRL SCIENTIST.pdf", R.drawable.samatha_the_girl_scientist, "Samantha, The Girl Scientist", "Curious Samantha enjoys asking questions and trying to find their answers. Read this illustrated children’s book and make science fun with Samantha."));
        data.add(new dataModel("SAMUEL, THE BOY SCIENTIST.pdf", R.drawable.samuel_the_boy_scientist, "Samuel, The Boy Scientist", "Read this great illustrated children’s book for a fun chemistry lesson with Samuel. He makes it look colorful, exciting and easy and that’s exactly how science should be."));
        data.add(new dataModel("MY NEW MATH TRICK.pdf", R.drawable.my_new_math_trick, "My New Math Trick", "This book is intended for any youngster (or maybe adult) who wants to overcome the challenge of the basic Times 9 Table or wants to be able to multiply two-digit numbers by 11 in their head. Yes, it takes a little practice but there are a couple of tricks to make it easier. Now, in 5 seconds, without the use of a calculator, or pencil and paper, what does 11 times 98 equal? The trick, using simple addition, is in this book. "));
        data.add(new dataModel("THE HOMELESS MONKEY.pdf", R.drawable.the_homeless_monkey, "The Homeless Monkey", "Springs, the nomadic monkey was travelling the world on a limited budget and a backpack. That’s all you need for an adventure and that’s exactly what came around. Walk and talk with Springs as you read this book."));
    }


}