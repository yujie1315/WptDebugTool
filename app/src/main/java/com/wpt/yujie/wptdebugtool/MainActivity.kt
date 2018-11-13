package com.wpt.yujie

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.wpt.yujie.wptdebugtool.R


class MainActivity : AppCompatActivity() {
    private  var startButton : Button? = null
    private  var myViewpager : ViewPager?  = null
    private  var writeItemView : View? = null
    private  var readItemView : View?  = null
    private  var myViewPagerList : ArrayList <View>?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startButton = findViewById (R.id.startServer)
        myViewpager = findViewById(R.id.main_ViewPager)
        writeItemView = LayoutInflater.from(this).inflate(R.layout.write_value_layout,null,false)
        readItemView = LayoutInflater.from(this).inflate(R.layout.read_value_layout,null,false)
        writeItemView?.let{myViewPagerList?.add(it)}
        readItemView?.let{myViewPagerList?.add(it)}
        //var myPagerAdapter : PagerAdapter = myViewPagerList?.let { myPagerAdapter(it) }//没改出来
        myViewpager?.setCurrentItem(0)

        //set listener
        startButton?.setOnClickListener{
            Toast.makeText(this,"连接DSP中。。。",Toast.LENGTH_SHORT).show()
            startButton?.setBackgroundColor(Color.GREEN)
        }
        // Example of a call to a native method
        // sample_text.text = stringFromJNI()
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // TODO Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
