package com.codermonklab.medicinalplants

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        datamod.add(MedData("1",
            "Thulasi",
            "madahaga kslsa nauyekan",
            "hgdedjhdf fefiueuif fef2hfo2hf f23jfh2i 2iohf2f 2fh2oifho2i 2fho2fih2oifh",
            "https://images.unsplash.com/photo-1522259629856-5cd0267d12ac?ixlib=rb-1.2.1&auto=format&fit=crop&w=888&q=80"))
        datamod.add(MedData("1",
            "Thakkali",
            "suamjd jhf lso",
            "2fjg2uiff2bf2if 2kfg23ufg f2k3fg2if98epo2d 2jfhoeyfqwne  iwehfywr7fifwef kwfhoyfgf",
            "https://images.unsplash.com/photo-1417533366444-43834ad6b3bb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=754&q=80"))
        datamod.add(MedData("1",
            "Malli chepp",
            "globallo piscaavosca",
            "hjfweuif wkfo;qouiwefb qkwujvifu8cvqmwrf qjrovuweryvbnwevj qlkwerjhvoieyfvenrv ",
            "https://images.unsplash.com/photo-1457530301326-d55420c9898a?ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"))
        datamod.add(MedData("1",
            "Vadalodakam",
            "marcado de msaftre",
            "jnqhcqvweutfq wkfqoiebqwefv ev p;qehv qerv qrouvqhr qrfvlrivuervih",
            "https://images.unsplash.com/photo-1522259629856-5cd0267d12ac?ixlib=rb-1.2.1&auto=format&fit=crop&w=888&q=80"))
        med_list_rv.layoutManager=StaggeredGridLayoutManager(2,VERTICAL)
        med_list_rv.adapter=ListAdapter(datamod)



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    companion object
    {
        val datamod= ArrayList<MedData>()

    }
}