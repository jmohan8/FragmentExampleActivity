package com.example.fragmentexampleactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity

class FragmentExampleActivity : FragmentActivity(), ToolbarFragment.ToolbarListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_example)
    }

    override fun onButtonClick(fontsize: Int, text: String) {
        val textFragment = supportFragmentManager.findFragmentById(
                                             R.id.text_fragment) as TextFragment
        textFragment.changeTextProperties(fontsize,text)
    }
}