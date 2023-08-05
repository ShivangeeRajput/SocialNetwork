package com.example.socialnetwork

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        //initializing SearchView
//        val searchView: SearchView =findViewById(R.id.searchView)
//
//        // Set up the SearchView
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                filterApps(newText)
//                return true
//            }
//        })

        //initializing all cardviews
        val instagramCardView: CardView = findViewById(R.id.cvInsta)
        val facebookCardView: CardView = findViewById(R.id.cvface)
        val linkedinCardView: CardView = findViewById(R.id.cvlink)
        val twitterCardView: CardView = findViewById(R.id.cvtwit)
        val whatsappCardView: CardView=findViewById(R.id.cvwhat)
        val redditCardView: CardView=findViewById(R.id.cvreddit)
        val pinterestCardView: CardView=findViewById(R.id.cvpinterest)
        val snapchatCardView: CardView=findViewById(R.id.cvsnap)
        val tumblrCardView: CardView=findViewById(R.id.cvtumb)
        val telegramCardView: CardView=findViewById(R.id.cvtelegram)
        val tinderCardView: CardView=findViewById(R.id.cvtinder)
        val weverseCardView: CardView=findViewById(R.id.cvwever)
        val wechatCardView: CardView=findViewById(R.id.cvwechat)
        val sharechatCardView: CardView=findViewById(R.id.cvshare)
        val hoodCardView: CardView=findViewById(R.id.cvhood)
        val omegleCardView: CardView=findViewById(R.id.cvomeggle)
        val kooCardView: CardView=findViewById(R.id.cvkoo)
        val wattpadCardView: CardView=findViewById(R.id.cvwattapad)
        val netflixCardView: CardView=findViewById(R.id.cvnetflix)
        val discordCardView: CardView=findViewById(R.id.cvdiscord)
        val vimeoCardView: CardView=findViewById(R.id.cvvimeo)
        val xingCardView: CardView=findViewById(R.id.cvxing)
        val meweCardView: CardView=findViewById(R.id.cvmewe)
        val vkCardView: CardView=findViewById(R.id.cvvk)
        val meetupCardView: CardView=findViewById(R.id.cvmeetup)
        val flickrCardView: CardView=findViewById(R.id.cvflickr)
        val bloggerCardView: CardView=findViewById(R.id.cvblogger)
        val badooCardView :CardView=findViewById(R.id.cvbadoo)









        // Set click listeners for cardviews
        instagramCardView.setOnClickListener{
            val intent = Intent(this, instagram::class.java)
            startActivity(intent)
        }

        facebookCardView.setOnClickListener{
            val intent=Intent(this,faceb::class.java)
            startActivity(intent)
        }
        linkedinCardView.setOnClickListener{
            val intent=Intent(this,linkedin::class.java)
            startActivity(intent)
        }
        twitterCardView.setOnClickListener{
            val intent=Intent(this,twitter::class.java)
            startActivity(intent)
        }

        whatsappCardView.setOnClickListener{
            val intent=Intent(this,whatsapp::class.java)
            startActivity(intent)
        }
        redditCardView.setOnClickListener{
            val intent=Intent(this,reddit::class.java)
            startActivity(intent)
        }

       pinterestCardView.setOnClickListener{
            val intent=Intent(this,pinterest::class.java)
            startActivity(intent)
        }
        snapchatCardView.setOnClickListener{
            val intent=Intent(this,snapchat::class.java)
            startActivity(intent)
        }

        tumblrCardView.setOnClickListener{
            val intent=Intent(this,tumblr::class.java)
            startActivity(intent)
        }
        telegramCardView.setOnClickListener{
            val intent=Intent(this,telegram::class.java)
            startActivity(intent)
        }
        tinderCardView.setOnClickListener{
            val intent=Intent(this,tinder::class.java)
            startActivity(intent)
        }
        omegleCardView.setOnClickListener{
            val intent=Intent(this,omeggle::class.java)
            startActivity(intent)
        }
        weverseCardView.setOnClickListener{
            val intent=Intent(this,weverse::class.java)
            startActivity(intent)
        }
        wechatCardView.setOnClickListener{
            val intent=Intent(this,wechat::class.java)
            startActivity(intent)
        }
        sharechatCardView.setOnClickListener{
            val intent=Intent(this,sharechat::class.java)
            startActivity(intent)
        }
       hoodCardView.setOnClickListener{
            val intent=Intent(this,hood::class.java)
            startActivity(intent)
        }
        kooCardView.setOnClickListener{
            val intent=Intent(this,koo::class.java)
            startActivity(intent)
        }
        netflixCardView.setOnClickListener{
            val intent=Intent(this,netflix::class.java)
            startActivity(intent)
        }
        wattpadCardView.setOnClickListener{
            val intent=Intent(this,wattapad::class.java)
            startActivity(intent)
        }
        discordCardView.setOnClickListener{
            val intent=Intent(this,discord::class.java)
            startActivity(intent)
        }

       vimeoCardView.setOnClickListener{
            val intent=Intent(this,vimeo::class.java)
            startActivity(intent)
        }

        xingCardView.setOnClickListener{
            val intent=Intent(this,xing::class.java)
            startActivity(intent)
        }
       meweCardView.setOnClickListener{
            val intent=Intent(this,zili::class.java)
            startActivity(intent)
        }

        vkCardView.setOnClickListener{
            val intent=Intent(this,vk::class.java)
            startActivity(intent)
        }
        badooCardView.setOnClickListener{
            val intent=Intent(this,badoo::class.java)
            startActivity(intent)
        }
        bloggerCardView.setOnClickListener{
            val intent=Intent(this,blogger::class.java)
            startActivity(intent)
        }
        flickrCardView.setOnClickListener{
            val intent=Intent(this,flickr::class.java)
            startActivity(intent)
        }
        meetupCardView.setOnClickListener{
            val intent=Intent(this,meetup::class.java)
            startActivity(intent)
        }


    }



//    private fun filterApps(query: String?) {
//        // Convert the query to lowercase for case-insensitive matching
//        val lowercaseQuery = query?.toLowerCase()
//
//        // Filter the app CardViews based on the query
//        val allCardViews = listOf(
//            findViewById<CardView>(R.id.cvInsta),
//            findViewById<CardView>(R.id.cvface),
//            findViewById<CardView>(R.id.cvlink),
//            findViewById<CardView>(R.id.cvtwit),
//            findViewById<CardView>(R.id.cvbadoo),
//            findViewById<CardView>(R.id.cvhood),
//            findViewById<CardView>(R.id.cvkoo),
//            findViewById<CardView>(R.id.cvblogger),
//            findViewById<CardView>(R.id.cvdiscord),
//            findViewById<CardView>(R.id.cvflickr),
//            findViewById<CardView>(R.id.cvmeetup),
//            findViewById<CardView>(R.id.cvmewe),
//            findViewById<CardView>(R.id.cvnetflix),
//            findViewById<CardView>(R.id.cvomeggle),
//            findViewById<CardView>(R.id.cvpinterest),
//            findViewById<CardView>(R.id.cvreddit),
//            findViewById<CardView>(R.id.cvshare),
//            findViewById<CardView>(R.id.cvsnap),
//            findViewById<CardView>(R.id.cvtelegram),
//            findViewById<CardView>(R.id.cvtinder),
//            findViewById<CardView>(R.id.cvtumb),
//            findViewById<CardView>(R.id.cvvimeo),
//            findViewById<CardView>(R.id.cvvk),
//            findViewById<CardView>(R.id.cvwattapad),
//            findViewById<CardView>(R.id.cvwechat),
//            findViewById<CardView>(R.id.cvwever),
//            findViewById<CardView>(R.id.cvxing),
//
//
//
//            // Add the remaining CardViews here
//        )
//
//
//
//
//        allCardViews.forEach { cardView ->
//            // Get the app name from the CardView's tag (assuming it's set)
//            val appName = cardView.tag.toString()?.toLowerCase()
//
//            // Determine whether the CardView represents the searched app
//            val isMatch = appName?.contains(lowercaseQuery ?: "", ignoreCase = true) == true
//
//            // Set the visibility of the CardView based on whether it matches the query
//            cardView.visibility = if (isMatch) View.VISIBLE else View.GONE
//        }

    }






