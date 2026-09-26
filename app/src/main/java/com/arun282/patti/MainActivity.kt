package com.arun282.patti

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var coins = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(32,32,32,32) }
        val title = TextView(this).apply { text = "🃏 PATTI"; textSize = 30f; setPadding(0,0,0,24) }
        val balance = TextView(this).apply { text = "Virtual Coins: $coins"; textSize = 20f }
        val login = Button(this).apply { text = "Login / Register" }
        val play = Button(this).apply { text = "Play 3 Patti" }
        val buy = Button(this).apply { text = "Buy Virtual Coins" }
        val withdraw = Button(this).apply { text = "Withdraw Request (Message Only)" }
        root.addView(title); root.addView(balance); root.addView(login); root.addView(play); root.addView(buy); root.addView(withdraw)
        login.setOnClickListener { Toast.makeText(this,"Login screen coming in next build",Toast.LENGTH_SHORT).show() }
        play.setOnClickListener { Toast.makeText(this,"Online multiplayer room coming in next build",Toast.LENGTH_SHORT).show() }
        buy.setOnClickListener { Toast.makeText(this,"Virtual coin purchase flow",Toast.LENGTH_SHORT).show() }
        withdraw.setOnClickListener { Toast.makeText(this,"Request sent to Admin — no automatic money transfer",Toast.LENGTH_LONG).show() }
        setContentView(root)
    }
}
