package example.simulator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import example.simulator.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    object Extras {
        const val MATCH = "EXTRA.MATCH"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}