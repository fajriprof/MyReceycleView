package com.example.myreceycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar = supportActionBar
        actionBar!!.title = "Detail Coffee"

        val tvName:TextView=findViewById(R.id.tv_varian)
        val tvDeskripsi:TextView=findViewById(R.id.tv_deskripsi)
        val imgKopi:ImageView=findViewById(R.id.img_kopi)
        val btnShare:Button=findViewById(R.id.btn_share)

        tvName.text= intent.getStringExtra(EXTRA_NAME)
        tvDeskripsi.text= intent.getStringExtra(EXTRA_DESKRIPSI)
        Glide.with(this).load(intent.getIntExtra(EXTRA_PHOTO,0)).apply(RequestOptions()).into(imgKopi)
        btnShare.setOnClickListener(this)


    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESKRIPSI = "extra_deskripsi"
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, intent.getStringExtra(EXTRA_DESKRIPSI))
                    type = "text/plain"
                }

                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)

            }
        }
    }


}