package com.example.mycamera

import android.R
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var vid: VideoView? = null
    private val req = 0
    private val reqv = 0
    private var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById<ImageView>(R.id.imageView)
        vid = findViewById<VideoView>(R.id.videoView)
        vid.setVisibility(View.GONE)
    }

    fun ChooseIMG(view: View?) {
        val intentChooser = Intent()
        intentChooser.type = "image/*"
        intentChooser.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(intentChooser, 1)
    }

    fun take(view: View?) {
        val intent = Intent()
        intent.action = MediaStore.ACTION_IMAGE_CAPTURE
        startActivity(intent)
        startActivityForResult(intent, req)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val imageBitmap = data!!.extras!!["data"] as Bitmap?
        imageView!!.setImageBitmap(imageBitmap)
    }

    fun Video(view: View?) {
        vid!!.visibility = View.VISIBLE
        imageView!!.visibility = View.GONE
        val intente = Intent()
        intente.action = MediaStore.ACTION_VIDEO_CAPTURE
        if (intente.resolveActivity(packageManager) != null) {
            startActivityForResult(intente, reqv)
        }
    }
}